package typings
package rmcDashDateDashPickerLib.libIDatePickerPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[js.Any] = js.undefined
  var defaultDate: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var formatDay: js.UndefOr[js.Function2[/* day */ scala.Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var formatMonth: js.UndefOr[js.Function2[/* month */ scala.Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var maxDate: js.UndefOr[js.Any] = js.undefined
  var minDate: js.UndefOr[js.Any] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Any, scala.Unit]] = js.undefined
  /** web only */
  var onScrollChange: js.UndefOr[
    js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ scala.Double, scala.Unit]
  ] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ scala.Double, scala.Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var use12Hours: js.UndefOr[scala.Boolean] = js.undefined
}

