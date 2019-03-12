package typings
package rmcDashCalendarLib.libDateSingleMonthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var getDateExtra: js.UndefOr[
    js.Function1[/* date */ stdLib.Date, rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.ExtraData]
  ] = js.undefined
  var locale: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale
  var monthData: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData
  var onCellClick: js.UndefOr[
    js.Function2[
      /* data */ rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.CellData, 
      /* monthData */ rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData, 
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
    locale: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale,
    monthData: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData,
    getDateExtra: /* date */ stdLib.Date => rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.ExtraData = null,
    onCellClick: (/* data */ rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.CellData, /* monthData */ rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData) => scala.Unit = null,
    rowSize: rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale, monthData = monthData)
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

