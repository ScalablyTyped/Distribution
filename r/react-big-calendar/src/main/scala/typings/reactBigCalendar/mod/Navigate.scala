package typings.reactBigCalendar.mod

import typings.reactBigCalendar.reactBigCalendarStrings.DATE
import typings.reactBigCalendar.reactBigCalendarStrings.NEXT
import typings.reactBigCalendar.reactBigCalendarStrings.PREV
import typings.reactBigCalendar.reactBigCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigate extends js.Object {
  var DATE: typings.reactBigCalendar.reactBigCalendarStrings.DATE = js.native
  var NEXT: typings.reactBigCalendar.reactBigCalendarStrings.NEXT = js.native
  var PREVIOUS: PREV = js.native
  var TODAY: typings.reactBigCalendar.reactBigCalendarStrings.TODAY = js.native
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigate]
  }
  @scala.inline
  implicit class NavigateOps[Self <: Navigate] (val x: Self) extends AnyVal {
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
    def setDATE(value: DATE): Self = this.set("DATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNEXT(value: NEXT): Self = this.set("NEXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPREVIOUS(value: PREV): Self = this.set("PREVIOUS", value.asInstanceOf[js.Any])
    @scala.inline
    def setTODAY(value: TODAY): Self = this.set("TODAY", value.asInstanceOf[js.Any])
  }
  
}

