package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.DATE
  var NEXT: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.NEXT
  var PREVIOUS: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.PREV
  var TODAY: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(
    DATE: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.DATE,
    NEXT: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.NEXT,
    PREVIOUS: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.PREV,
    TODAY: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.TODAY
  ): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE, NEXT = NEXT, PREVIOUS = PREVIOUS, TODAY = TODAY)
  
    __obj.asInstanceOf[Navigate]
  }
}

