package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarIOS extends SearchBarPlatform {
  /**
    * Props passed to cancel button
    */
  var cancelButtonProps: js.UndefOr[
    stdLib.Partial[reactDashNativeLib.reactDashNativeMod.TouchableOpacityProps] with reactDashNativeDashElementsLib.Anon_ButtonDisabledStyle
  ] = js.undefined
  /**
    * title of cancel button on iOS.  Default: 'Cancel'.
    */
  var cancelButtonTitle: js.UndefOr[java.lang.String] = js.undefined
}

object SearchBarIOS {
  @scala.inline
  def apply(
    cancelButtonProps: stdLib.Partial[reactDashNativeLib.reactDashNativeMod.TouchableOpacityProps] with reactDashNativeDashElementsLib.Anon_ButtonDisabledStyle = null,
    cancelButtonTitle: java.lang.String = null,
    clearIcon: IconNode = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inputContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inputStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    leftIconContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    loadingProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.Any = null,
    onBlur: js.Function0[scala.Unit] = null,
    onCancel: js.Function0[scala.Unit] = null,
    onChangeText: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    onClear: js.Function0[scala.Unit] = null,
    onFocus: js.Function0[scala.Unit] = null,
    rightIconContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    searchIcon: IconNode = null,
    showLoading: js.UndefOr[scala.Boolean] = js.undefined
  ): SearchBarIOS = {
    val __obj = js.Dynamic.literal()
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps)
    if (cancelButtonTitle != null) __obj.updateDynamic("cancelButtonTitle")(cancelButtonTitle)
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (loadingProps != null) __obj.updateDynamic("loadingProps")(loadingProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText)
    if (onClear != null) __obj.updateDynamic("onClear")(onClear)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (searchIcon != null) __obj.updateDynamic("searchIcon")(searchIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoading)) __obj.updateDynamic("showLoading")(showLoading)
    __obj.asInstanceOf[SearchBarIOS]
  }
}

