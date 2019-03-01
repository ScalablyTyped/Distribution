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
    onMonthSelect: js.Function2[
      reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String, 
      scala.Unit
    ],
    onYearSelect: js.Function2[
      reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String, 
      scala.Unit
    ]
  ): Anon_CurrentMonth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("onMonthSelect")(onMonthSelect)
    __obj.updateDynamic("onYearSelect")(onYearSelect)
    __obj.asInstanceOf[Anon_CurrentMonth]
  }
}

