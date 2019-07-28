package typings.reactDashDates

import typings.reactDashDates.reactDashDatesMod.momentPropTypesNs.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentMonth extends js.Object {
  var month: momentObj
  def onMonthSelect(currentMonth: momentObj, newMonthVal: String): Unit
  def onYearSelect(currentMonth: momentObj, newYearVal: String): Unit
}

object Anon_CurrentMonth {
  @scala.inline
  def apply(
    month: momentObj,
    onMonthSelect: (momentObj, String) => Unit,
    onYearSelect: (momentObj, String) => Unit
  ): Anon_CurrentMonth = {
    val __obj = js.Dynamic.literal(month = month, onMonthSelect = js.Any.fromFunction2(onMonthSelect), onYearSelect = js.Any.fromFunction2(onYearSelect))
  
    __obj.asInstanceOf[Anon_CurrentMonth]
  }
}

