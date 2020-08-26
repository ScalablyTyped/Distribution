package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'displayTime'> */
@js.native
trait PickImpldisplayTime extends js.Object {
  var displayTime: Double = js.native
}

object PickImpldisplayTime {
  @scala.inline
  def apply(displayTime: Double): PickImpldisplayTime = {
    val __obj = js.Dynamic.literal(displayTime = displayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisplayTime]
  }
  @scala.inline
  implicit class PickImpldisplayTimeOps[Self <: PickImpldisplayTime] (val x: Self) extends AnyVal {
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
    def setDisplayTime(value: Double): Self = this.set("displayTime", value.asInstanceOf[js.Any])
  }
  
}

