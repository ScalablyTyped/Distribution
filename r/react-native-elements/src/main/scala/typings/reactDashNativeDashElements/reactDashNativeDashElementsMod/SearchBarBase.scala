package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait SearchBarBase extends js.Object {
  /**
    * Override the clear Icon props or use a custom component. Use null or false to hide the icon.
    */
  var clearIcon: js.UndefOr[IconNode] = js.undefined
  /**
    * Styling for the searchbar container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Optional styling for the TextInput's container
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * TextInput styling
    */
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Container style for the left icon
    */
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Optional props to pass to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.Any
  ] = js.undefined
  /**
    * Callback fired when the input is blurred via the keyboard
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Method to fire when text is changed
    */
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  /**
    * Callback fired when the clear button is pressed
    */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired when the input is focused
    */
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Container style for the right icon
    */
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Override the search Icon props or use a custom component. Use null or false to hide the icon.
    */
  var searchIcon: js.UndefOr[IconNode] = js.undefined
  /**
    * If to show the loading indicator
    *
    * @default false
    */
  var showLoading: js.UndefOr[Boolean] = js.undefined
}

object SearchBarBase {
  @scala.inline
  def apply(
    clearIcon: IconNode = null,
    containerStyle: StyleProp[ViewStyle] = null,
    inputContainerStyle: StyleProp[ViewStyle] = null,
    inputStyle: StyleProp[TextStyle] = null,
    leftIconContainerStyle: StyleProp[ViewStyle] = null,
    loadingProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.Any = null,
    onBlur: () => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onClear: () => Unit = null,
    onFocus: () => Unit = null,
    rightIconContainerStyle: StyleProp[ViewStyle] = null,
    searchIcon: IconNode = null,
    showLoading: js.UndefOr[Boolean] = js.undefined
  ): SearchBarBase = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (loadingProps != null) __obj.updateDynamic("loadingProps")(loadingProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (searchIcon != null) __obj.updateDynamic("searchIcon")(searchIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoading)) __obj.updateDynamic("showLoading")(showLoading)
    __obj.asInstanceOf[SearchBarBase]
  }
}

