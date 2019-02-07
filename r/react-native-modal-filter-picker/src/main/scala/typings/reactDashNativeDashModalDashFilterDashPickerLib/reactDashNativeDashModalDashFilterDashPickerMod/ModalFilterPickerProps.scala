package typings
package reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFilterPickerProps[T /* <: ModalFilterPickerOption */] extends js.Object {
  var androidUnderlineColor: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var cancelButtonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var cancelButtonText: js.UndefOr[java.lang.String] = js.undefined
  var cancelButtonTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var cancelContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var filterTextInputContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var filterTextInputStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[
    reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerLibStrings.never | reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerLibStrings.always | reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerLibStrings.handle
  ] = js.undefined
  var listContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var listViewProps: js.UndefOr[stdLib.Partial[reactDashNativeLib.reactDashNativeMod.ListViewProps]] = js.undefined
  var modal: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ModalProps] = js.undefined
  var noResultsText: js.UndefOr[java.lang.String] = js.undefined
  var optionTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var options: js.Array[T]
  // styling props
  var overlayStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.KeyboardAvoidingView]
  ] = js.undefined
  var placeholderText: js.UndefOr[java.lang.String] = js.undefined
  var placeholderTextColor: js.UndefOr[java.lang.String] = js.undefined
  var renderCancelButton: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var renderList: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var renderOption: js.UndefOr[
    js.Function2[
      /* option */ T, 
      /* isSelected */ scala.Boolean, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var selectedOption: js.UndefOr[java.lang.String] = js.undefined
  var showFilter: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  def onCancel(): scala.Unit
  def onSelect(key: java.lang.String): scala.Unit
}

