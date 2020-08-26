package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopProps extends js.Object {
  var offset: js.UndefOr[NumberProp] = js.native
  var stopColor: js.UndefOr[Color] = js.native
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
    def setOffset(value: NumberProp): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setStopColorVarargs(value: Double*): Self = this.set("stopColor", js.Array(value :_*))
    @scala.inline
    def setStopColor(value: Color): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    @scala.inline
    def setStopOpacity(value: NumberProp): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
  }
  
}

