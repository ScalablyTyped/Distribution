package typings
package rmcDashCalendarLib.libDatePickerPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** 默认日期，default: today */
  var defaultDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 选择值 */
  var endDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 日期扩展数据 */
  var getDateExtra: js.UndefOr[
    js.Function1[/* date */ stdLib.Date, rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.ExtraData]
  ] = js.undefined
  /** 无限滚动优化（大范围选择），default: false */
  var infiniteOpt: js.UndefOr[scala.Boolean] = js.undefined
  /** 初始化月个数，default: 6 */
  var initalMonths: js.UndefOr[scala.Double] = js.undefined
  /** 本地化 */
  var locale: js.UndefOr[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale] = js.undefined
  /** 最大日期 */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 最小日期 */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 日期点击回调 */
  var onCellClick: js.UndefOr[js.Function1[/* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* clientHight */ scala.Double, scala.Unit]] = js.undefined
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[stdLib.Date], scala.Unit]] = js.undefined
  /** (web only) 样式前缀 */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** 行大小 */
  var rowSize: js.UndefOr[
    rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl
  ] = js.undefined
  /** 选择值 */
  var startDate: js.UndefOr[stdLib.Date] = js.undefined
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[
    rmcDashCalendarLib.rmcDashCalendarLibStrings.one | rmcDashCalendarLib.rmcDashCalendarLibStrings.range
  ] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    defaultDate: stdLib.Date = null,
    endDate: stdLib.Date = null,
    getDateExtra: js.Function1[/* date */ stdLib.Date, rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.ExtraData] = null,
    infiniteOpt: js.UndefOr[scala.Boolean] = js.undefined,
    initalMonths: scala.Int | scala.Double = null,
    locale: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    onCellClick: js.Function1[/* date */ stdLib.Date, scala.Unit] = null,
    onLayout: js.Function1[/* clientHight */ scala.Double, scala.Unit] = null,
    onSelectHasDisableDate: js.Function1[/* date */ js.Array[stdLib.Date], scala.Unit] = null,
    prefixCls: java.lang.String = null,
    rowSize: rmcDashCalendarLib.rmcDashCalendarLibStrings.normal | rmcDashCalendarLib.rmcDashCalendarLibStrings.xl = null,
    startDate: stdLib.Date = null,
    `type`: rmcDashCalendarLib.rmcDashCalendarLibStrings.one | rmcDashCalendarLib.rmcDashCalendarLibStrings.range = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(getDateExtra)
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt)
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(onSelectHasDisableDate)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

