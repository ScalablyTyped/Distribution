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
    val __obj = js.Dynamic.literal(DATE = DATE, NEXT = NEXT, PREVIOUS = PREVIOUS, TODAY = TODAY)
  
    __obj.asInstanceOf[Navigate]
  }
}

