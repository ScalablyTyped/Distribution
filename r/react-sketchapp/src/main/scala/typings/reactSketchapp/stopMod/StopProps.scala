package typings.reactSketchapp.stopMod

import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
  var stopColor: js.UndefOr[String] = js.native
  var stopOpacity: js.UndefOr[NumberProp] = js.native
}

object StopProps {
  @scala.inline
  def apply(): StopProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopProps]
  }
  @scala.inline
  implicit class StopPropsOps[Self <: StopProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setStopColor(value: String): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    @scala.inline
    def setStopOpacity(value: NumberProp): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
  }
  
}

