package typings.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBigCalendar.reactBigCalendarStrings.PREV
  - typings.reactBigCalendar.reactBigCalendarStrings.NEXT
  - typings.reactBigCalendar.reactBigCalendarStrings.TODAY
  - typings.reactBigCalendar.reactBigCalendarStrings.DATE
*/
trait NavigateAction extends js.Object

object NavigateAction {
  @scala.inline
  def DATE: typings.reactBigCalendar.reactBigCalendarStrings.DATE = this.cast("DATE")
  @scala.inline
  def NEXT: typings.reactBigCalendar.reactBigCalendarStrings.NEXT = this.cast("NEXT")
  @scala.inline
  def PREV: typings.reactBigCalendar.reactBigCalendarStrings.PREV = this.cast("PREV")
  @scala.inline
  def TODAY: typings.reactBigCalendar.reactBigCalendarStrings.TODAY = this.cast("TODAY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

