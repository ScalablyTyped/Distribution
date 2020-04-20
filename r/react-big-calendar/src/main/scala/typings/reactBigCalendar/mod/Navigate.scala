package typings.reactBigCalendar.mod

import typings.reactBigCalendar.reactBigCalendarStrings.DATE
import typings.reactBigCalendar.reactBigCalendarStrings.NEXT
import typings.reactBigCalendar.reactBigCalendarStrings.PREV
import typings.reactBigCalendar.reactBigCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: typings.reactBigCalendar.reactBigCalendarStrings.DATE
  var NEXT: typings.reactBigCalendar.reactBigCalendarStrings.NEXT
  var PREVIOUS: PREV
  var TODAY: typings.reactBigCalendar.reactBigCalendarStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigate]
  }
}

