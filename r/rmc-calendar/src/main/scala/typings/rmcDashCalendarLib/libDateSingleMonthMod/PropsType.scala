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

