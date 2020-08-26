package typings.reactBlockies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdenticonProps extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
  var seed: String = js.native
  var size: js.UndefOr[Double] = js.native
  var spotColor: js.UndefOr[String] = js.native
}

object IdenticonProps {
  @scala.inline
  def apply(seed: String): IdenticonProps = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdenticonProps]
  }
  @scala.inline
  implicit class IdenticonPropsOps[Self <: IdenticonProps] (val x: Self) extends AnyVal {
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
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpotColor(value: String): Self = this.set("spotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotColor: Self = this.set("spotColor", js.undefined)
  }
  
}

