package typings.reactWidgets.calendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default: "navigate back"
    */
  var moveBack: js.UndefOr[String] = js.native
  /**
    * Title and screen reader text for the right arrow button.
    * @default: "navigate forward"
    */
  var moveForward: js.UndefOr[String] = js.native
}

object CalendarMessages {
  @scala.inline
  def apply(): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarMessages]
  }
  @scala.inline
  implicit class CalendarMessagesOps[Self <: CalendarMessages] (val x: Self) extends AnyVal {
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
    def setMoveBack(value: String): Self = this.set("moveBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveBack: Self = this.set("moveBack", js.undefined)
    @scala.inline
    def setMoveForward(value: String): Self = this.set("moveForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveForward: Self = this.set("moveForward", js.undefined)
  }
  
}

