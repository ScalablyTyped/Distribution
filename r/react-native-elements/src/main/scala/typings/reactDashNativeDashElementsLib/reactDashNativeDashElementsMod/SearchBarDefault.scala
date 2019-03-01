package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarDefault extends SearchBarBase {
  /**
    * Change theme to light theme
    *
    * @default false
    */
  var lightTheme: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[scala.Boolean] = js.undefined
}

object SearchBarDefault {
  @scala.inline
  def apply(
    clearIcon: IconNode = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inputContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inputStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    leftIconContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    lightTheme: js.UndefOr[scala.Boolean] = js.undefined,
    loadingProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.Any = null,
    onBlur: js.Function0[scala.Unit] = null,
    onChangeText: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    onClear: js.Function0[scala.Unit] = null,
    onFocus: js.Function0[scala.Unit] = null,
    rightIconContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    searchIcon: IconNode = null,
    showLoading: js.UndefOr[scala.Boolean] = js.undefined
  ): SearchBarDefault = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(lightTheme)) __obj.updateDynamic("lightTheme")(lightTheme)
    if (loadingProps != null) __obj.updateDynamic("loadingProps")(loadingProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText)
    if (onClear != null) __obj.updateDynamic("onClear")(onClear)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (searchIcon != null) __obj.updateDynamic("searchIcon")(searchIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoading)) __obj.updateDynamic("showLoading")(showLoading)
    __obj.asInstanceOf[SearchBarDefault]
  }
}

