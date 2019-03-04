package typings
package reactDashNativeDashMaterialDashDesignDashSearchbarLib.reactDashNativeDashMaterialDashDesignDashSearchbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarProps extends js.Object {
  var alwaysShowBackButton: js.UndefOr[scala.Boolean] = js.undefined
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  var height: scala.Double
  var iconBackName: js.UndefOr[java.lang.String] = js.undefined
  var iconCloseName: js.UndefOr[java.lang.String] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var iconPadding: js.UndefOr[scala.Double] = js.undefined
  var iconSearchName: js.UndefOr[java.lang.String] = js.undefined
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  var inputProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextInputProps] = js.undefined
  var inputStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  var onBackPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEndEditing: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSearchChange: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var placeholderColor: js.UndefOr[java.lang.String] = js.undefined
  var returnKeyType: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ReturnKeyType | reactDashNativeLib.reactDashNativeMod.ReturnKeyTypeAndroid | reactDashNativeLib.reactDashNativeMod.ReturnKeyTypeIOS
  ] = js.undefined
  var textStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
}

object SearchBarProps {
  @scala.inline
  def apply(
    height: scala.Double,
    alwaysShowBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    iconBackName: java.lang.String = null,
    iconCloseName: java.lang.String = null,
    iconColor: java.lang.String = null,
    iconPadding: scala.Int | scala.Double = null,
    iconSearchName: java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    inputProps: reactDashNativeLib.reactDashNativeMod.TextInputProps = null,
    inputStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    onBackPress: js.Function0[scala.Unit] = null,
    onBlur: js.Function0[scala.Unit] = null,
    onClose: js.Function0[scala.Unit] = null,
    onEndEditing: js.Function0[scala.Unit] = null,
    onFocus: js.Function0[scala.Unit] = null,
    onSearchChange: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    onSubmitEditing: js.Function0[scala.Unit] = null,
    padding: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    placeholderColor: java.lang.String = null,
    returnKeyType: reactDashNativeLib.reactDashNativeMod.ReturnKeyType | reactDashNativeLib.reactDashNativeMod.ReturnKeyTypeAndroid | reactDashNativeLib.reactDashNativeMod.ReturnKeyTypeIOS = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null
  ): SearchBarProps = {
    val __obj = js.Dynamic.literal(height = height)
    if (!js.isUndefined(alwaysShowBackButton)) __obj.updateDynamic("alwaysShowBackButton")(alwaysShowBackButton)
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (iconBackName != null) __obj.updateDynamic("iconBackName")(iconBackName)
    if (iconCloseName != null) __obj.updateDynamic("iconCloseName")(iconCloseName)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (iconPadding != null) __obj.updateDynamic("iconPadding")(iconPadding.asInstanceOf[js.Any])
    if (iconSearchName != null) __obj.updateDynamic("iconSearchName")(iconSearchName)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (onBackPress != null) __obj.updateDynamic("onBackPress")(onBackPress)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(onEndEditing)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(onSearchChange)
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(onSubmitEditing)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor)
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[SearchBarProps]
  }
}

