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

