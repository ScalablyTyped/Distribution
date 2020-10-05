package typings.reactBigCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveOptions extends js.Object {
  var action: NavigateAction = js.native
  var date: Date = js.native
  var today: Date = js.native
}

object MoveOptions {
  @scala.inline
  def apply(action: NavigateAction, date: Date, today: Date): MoveOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOptions]
  }
  @scala.inline
  implicit class MoveOptionsOps[Self <: MoveOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: NavigateAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setToday(value: Date): Self = this.set("today", value.asInstanceOf[js.Any])
  }
  
}

