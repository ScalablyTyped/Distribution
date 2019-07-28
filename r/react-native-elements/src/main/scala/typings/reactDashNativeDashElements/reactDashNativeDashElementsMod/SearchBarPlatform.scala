package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarPlatform extends SearchBarBase {
  /**
    * Callback fired when the cancel button is pressed
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SearchBarPlatform {
  @scala.inline
  def apply(
    clearIcon: IconNode = null,
    containerStyle: StyleProp[ViewStyle] = null,
    inputContainerStyle: StyleProp[ViewStyle] = null,
    inputStyle: StyleProp[TextStyle] = null,
    leftIconContainerStyle: StyleProp[ViewStyle] = null,
    loadingProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.Any = null,
    onBlur: () => Unit = null,
    onCancel: () => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onClear: () => Unit = null,
    onFocus: () => Unit = null,
    rightIconContainerStyle: StyleProp[ViewStyle] = null,
    searchIcon: IconNode = null,
    showLoading: js.UndefOr[Boolean] = js.undefined
  ): SearchBarPlatform = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (loadingProps != null) __obj.updateDynamic("loadingProps")(loadingProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (searchIcon != null) __obj.updateDynamic("searchIcon")(searchIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoading)) __obj.updateDynamic("showLoading")(showLoading)
    __obj.asInstanceOf[SearchBarPlatform]
  }
}

