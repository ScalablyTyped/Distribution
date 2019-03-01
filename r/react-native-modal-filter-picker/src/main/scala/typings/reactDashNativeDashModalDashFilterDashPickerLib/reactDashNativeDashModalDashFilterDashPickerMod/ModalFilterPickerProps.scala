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

object ModalFilterPickerProps {
  @scala.inline
  def apply[T /* <: ModalFilterPickerOption */](
    onCancel: js.Function0[scala.Unit],
    onSelect: js.Function1[java.lang.String, scala.Unit],
    options: js.Array[T],
    androidUnderlineColor: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    cancelButtonStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    cancelButtonText: java.lang.String = null,
    cancelButtonTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    cancelContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    filterTextInputContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    filterTextInputStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    keyboardShouldPersistTaps: reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerLibStrings.never | reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerLibStrings.always | reactDashNativeDashModalDashFilterDashPickerLib.reactDashNativeDashModalDashFilterDashPickerLibStrings.handle = null,
    listContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    listViewProps: stdLib.Partial[reactDashNativeLib.reactDashNativeMod.ListViewProps] = null,
    modal: reactDashNativeLib.reactDashNativeMod.ModalProps = null,
    noResultsText: java.lang.String = null,
    optionTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    overlayStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.KeyboardAvoidingView] = null,
    placeholderText: java.lang.String = null,
    placeholderTextColor: java.lang.String = null,
    renderCancelButton: js.Function0[reactLib.reactMod.Global.JSXNs.Element] = null,
    renderList: js.Function0[reactLib.reactMod.Global.JSXNs.Element] = null,
    renderOption: js.Function2[
      /* option */ T, 
      /* isSelected */ scala.Boolean, 
      reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    selectedOption: java.lang.String = null,
    showFilter: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalFilterPickerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel)
    __obj.updateDynamic("onSelect")(onSelect)
    __obj.updateDynamic("options")(options)
    if (androidUnderlineColor != null) __obj.updateDynamic("androidUnderlineColor")(androidUnderlineColor)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (cancelButtonStyle != null) __obj.updateDynamic("cancelButtonStyle")(cancelButtonStyle.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText)
    if (cancelButtonTextStyle != null) __obj.updateDynamic("cancelButtonTextStyle")(cancelButtonTextStyle.asInstanceOf[js.Any])
    if (cancelContainerStyle != null) __obj.updateDynamic("cancelContainerStyle")(cancelContainerStyle.asInstanceOf[js.Any])
    if (filterTextInputContainerStyle != null) __obj.updateDynamic("filterTextInputContainerStyle")(filterTextInputContainerStyle.asInstanceOf[js.Any])
    if (filterTextInputStyle != null) __obj.updateDynamic("filterTextInputStyle")(filterTextInputStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (listContainerStyle != null) __obj.updateDynamic("listContainerStyle")(listContainerStyle.asInstanceOf[js.Any])
    if (listViewProps != null) __obj.updateDynamic("listViewProps")(listViewProps)
    if (modal != null) __obj.updateDynamic("modal")(modal)
    if (noResultsText != null) __obj.updateDynamic("noResultsText")(noResultsText)
    if (optionTextStyle != null) __obj.updateDynamic("optionTextStyle")(optionTextStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText)
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor)
    if (renderCancelButton != null) __obj.updateDynamic("renderCancelButton")(renderCancelButton)
    if (renderList != null) __obj.updateDynamic("renderList")(renderList)
    if (renderOption != null) __obj.updateDynamic("renderOption")(renderOption)
    if (selectedOption != null) __obj.updateDynamic("selectedOption")(selectedOption)
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ModalFilterPickerProps[T]]
  }
}

