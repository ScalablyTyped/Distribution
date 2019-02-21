package typings
package reactDashDayDashPickerLib.typesPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerInputProps extends js.Object {
  var classNames: js.UndefOr[reactDashDayDashPickerLib.typesCommonMod.InputClassNames] = js.undefined
  var clickUnselectsDay: js.UndefOr[scala.Boolean] = js.undefined
  // Not sure React.ComponentClass<any> is the right type for _propTypes2.default.any
  var component: js.UndefOr[js.Any] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var format: java.lang.String | js.Array[java.lang.String]
  var formatDate: js.UndefOr[
    js.Function3[
      /* date */ stdLib.Date, 
      /* format */ java.lang.String, 
      /* locale */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var hideOnDayClick: js.UndefOr[scala.Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Object] = js.undefined
  var keepFocus: js.UndefOr[scala.Boolean] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onDayChange: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* DayModifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* dayPickerInput */ reactDashDayDashPickerLib.typesDayPickerInputMod.DayPickerInput, 
      scala.Unit
    ]
  ] = js.undefined
  var onDayPickerHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDayPickerShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var overlayComponent: js.UndefOr[js.Any] = js.undefined
  var parseDate: js.UndefOr[
    js.Function3[
      /* str */ java.lang.String, 
      /* format */ java.lang.String, 
      /* locale */ java.lang.String, 
      stdLib.Date | scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var showOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
}

