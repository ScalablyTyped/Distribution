package typings.rmcDashCalendar.esDateSingleMonthMod

import typings.rmcDashCalendar.esDateDataTypesMod.ModelsNs.CellData
import typings.rmcDashCalendar.esDateDataTypesMod.ModelsNs.ExtraData
import typings.rmcDashCalendar.esDateDataTypesMod.ModelsNs.Locale
import typings.rmcDashCalendar.esDateDataTypesMod.ModelsNs.MonthData
import typings.rmcDashCalendar.rmcDashCalendarStrings.normal
import typings.rmcDashCalendar.rmcDashCalendarStrings.xl
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var getDateExtra: js.UndefOr[js.Function1[/* date */ Date, ExtraData]] = js.undefined
  var locale: Locale
  var monthData: MonthData
  var onCellClick: js.UndefOr[js.Function2[/* data */ CellData, /* monthData */ MonthData, Unit]] = js.undefined
  var rowSize: js.UndefOr[normal | xl] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    locale: Locale,
    monthData: MonthData,
    getDateExtra: /* date */ Date => ExtraData = null,
    onCellClick: (/* data */ CellData, /* monthData */ MonthData) => Unit = null,
    rowSize: normal | xl = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale, monthData = monthData)
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

