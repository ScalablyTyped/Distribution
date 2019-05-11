package typings
package rmcDashCalendarLib.esDateSingleMonthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var getDateExtra: js.UndefOr[
    js.Function1[/* date */ stdLib.Date, rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.ExtraData]
  ] = js.undefined
  var locale: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.Locale
  var monthData: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData
  var onCellClick: js.UndefOr[
    js.Function2[
      /* data */ rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.CellData, 
      /* monthData */ rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData, 
      scala.Unit
    ]
  ] = js.undefined
  var rowSize: js.UndefOr[
    rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl
  ] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    locale: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.Locale,
    monthData: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData,
    getDateExtra: /* date */ stdLib.Date => rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.ExtraData = null,
    onCellClick: (/* data */ rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.CellData, /* monthData */ rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData) => scala.Unit = null,
    rowSize: rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale, monthData = monthData)
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

