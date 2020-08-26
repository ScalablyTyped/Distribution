package typings.reactSvgMorph.mod

import typings.reactSvgMorph.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorphTransitionProps extends js.Object {
  var children: From = js.native
  var height: js.UndefOr[Double] = js.native
  var propgress: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object MorphTransitionProps {
  @scala.inline
  def apply(children: From): MorphTransitionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphTransitionProps]
  }
  @scala.inline
  implicit class MorphTransitionPropsOps[Self <: MorphTransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: From): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPropgress(value: Double): Self = this.set("propgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropgress: Self = this.set("propgress", js.undefined)
    @scala.inline
    def setRotation(value: String): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

