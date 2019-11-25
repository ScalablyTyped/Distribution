package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DATE
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.NEXT
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.PREV
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DATE
  var NEXT: typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.NEXT
  var PREVIOUS: PREV
  var TODAY: typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigate]
  }
}

