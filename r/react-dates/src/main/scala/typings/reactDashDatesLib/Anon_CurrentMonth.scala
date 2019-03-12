package typings
package reactDashDatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentMonth extends js.Object {
  var month: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj
  def onMonthSelect(
    currentMonth: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj,
    newMonthVal: java.lang.String
  ): scala.Unit
  def onYearSelect(
    currentMonth: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj,
    newYearVal: java.lang.String
  ): scala.Unit
}

object Anon_CurrentMonth {
  @scala.inline
  def apply(
    month: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj,
    onMonthSelect: (reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, java.lang.String) => scala.Unit,
    onYearSelect: (reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, java.lang.String) => scala.Unit
  ): Anon_CurrentMonth = {
    val __obj = js.Dynamic.literal(month = month, onMonthSelect = js.Any.fromFunction2(onMonthSelect), onYearSelect = js.Any.fromFunction2(onYearSelect))
  
    __obj.asInstanceOf[Anon_CurrentMonth]
  }
}

