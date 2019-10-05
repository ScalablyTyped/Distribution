package typings.rmcDashCalendar.libDatePickerPropsMod

import typings.rmcDashCalendar.libDateDataTypesMod.Models.ExtraData
import typings.rmcDashCalendar.libDateDataTypesMod.Models.Locale
import typings.rmcDashCalendar.rmcDashCalendarStrings.normal
import typings.rmcDashCalendar.rmcDashCalendarStrings.one
import typings.rmcDashCalendar.rmcDashCalendarStrings.range
import typings.rmcDashCalendar.rmcDashCalendarStrings.xl
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** 默认日期，default: today */
  var defaultDate: js.UndefOr[Date] = js.undefined
  /** 选择值 */
  var endDate: js.UndefOr[Date] = js.undefined
  /** 日期扩展数据 */
  var getDateExtra: js.UndefOr[js.Function1[/* date */ Date, ExtraData]] = js.undefined
  /** 无限滚动优化（大范围选择），default: false */
  var infiniteOpt: js.UndefOr[Boolean] = js.undefined
  /** 初始化月个数，default: 6 */
  var initalMonths: js.UndefOr[Double] = js.undefined
  /** 本地化 */
  var locale: js.UndefOr[Locale] = js.undefined
  /** 最大日期 */
  var maxDate: js.UndefOr[Date] = js.undefined
  /** 最小日期 */
  var minDate: js.UndefOr[Date] = js.undefined
  /** 日期点击回调 */
  var onCellClick: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* clientHight */ Double, Unit]] = js.undefined
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[Date], Unit]] = js.undefined
  /** (web only) 样式前缀 */
  var prefixCls: js.UndefOr[String] = js.undefined
  /** 行大小 */
  var rowSize: js.UndefOr[normal | xl] = js.undefined
  /** 选择值 */
  var startDate: js.UndefOr[Date] = js.undefined
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[one | range] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    defaultDate: Date = null,
    endDate: Date = null,
    getDateExtra: /* date */ Date => ExtraData = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: Int | Double = null,
    locale: Locale = null,
    maxDate: Date = null,
    minDate: Date = null,
    onCellClick: /* date */ Date => Unit = null,
    onLayout: /* clientHight */ Double => Unit = null,
    onSelectHasDisableDate: /* date */ js.Array[Date] => Unit = null,
    prefixCls: String = null,
    rowSize: normal | xl = null,
    startDate: Date = null,
    `type`: one | range = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt)
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction1(onCellClick))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1(onSelectHasDisableDate))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

