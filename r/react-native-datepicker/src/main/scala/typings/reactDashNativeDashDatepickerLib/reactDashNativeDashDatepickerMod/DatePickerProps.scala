package typings
package reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var TouchableComponent: js.UndefOr[reactLib.reactMod.Component[js.Object, js.Object, _]] = js.undefined
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  var androidMode: js.UndefOr[
    reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.default | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.calendar | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.spinner
  ] = js.undefined
  var cancelBtnTestID: js.UndefOr[java.lang.String] = js.undefined
  var cancelBtnText: js.UndefOr[java.lang.String] = js.undefined
  var confirmBtnTestID: js.UndefOr[java.lang.String] = js.undefined
  var confirmBtnText: js.UndefOr[java.lang.String] = js.undefined
  var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.undefined
  var date: js.UndefOr[java.lang.String | stdLib.Date | momentLib.momentMod.momentNs.Moment] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var getDateStr: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hideText: js.UndefOr[scala.Boolean] = js.undefined
  var iconComponent: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var iconSource: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  var is24Hour: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var minDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var minuteInterval: js.UndefOr[scala.Double] = js.undefined
  var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ js.Any, scala.Boolean]] = js.undefined
  var mode: js.UndefOr[
    reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.date | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.datetime | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.time
  ] = js.undefined
  var onCloseModal: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDateChange: js.UndefOr[js.Function2[/* dateStr */ java.lang.String, /* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onOpenModal: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressMask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.StyleProp[_]] = js.undefined
  var testID: js.UndefOr[java.lang.String] = js.undefined
  var timeZoneOffsetInMinutes: js.UndefOr[scala.Double] = js.undefined
}

