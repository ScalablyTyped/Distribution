package typings.reactNavigationStack.vendorTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNavigationStack.anon.TintColorString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackHeaderLeftButtonProps extends js.Object {
  /**
    * Accessibility label for the button for screen readers.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether label font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Function which returns a React Element to display custom image in header's back button.
    */
  var backImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.undefined
  /**
    * Whether it's possible to navigate back in stack.
    */
  var canGoBack: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the button is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Label text for the button. Usually the title of the previous screen.
    * By default, this is only shown on iOS.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Style object for the label.
    */
  var labelStyle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
  ] = js.undefined
  /**
    * Whether the label text is visible.
    * Defaults to `true` on iOS and `false` on Android.
    */
  var labelVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback to trigger when the size of the label changes.
    */
  var onLabelLayout: js.UndefOr[js.Function1[/* e */ LayoutChangeEvent, Unit]] = js.undefined
  /**
    * Callback to call when the button is pressed.
    * By default, this triggers `goBack`.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var pressColorAndroid: js.UndefOr[String] = js.undefined
  /**
    * Layout of the screen.
    */
  var screenLayout: js.UndefOr[Layout] = js.undefined
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.undefined
  /**
    * Layout of the title element in the header.
    */
  var titleLayout: js.UndefOr[Layout] = js.undefined
  /**
    * Label text to show when there isn't enough space for the full label.
    */
  var truncatedLabel: js.UndefOr[String] = js.undefined
}

object StackHeaderLeftButtonProps {
  @scala.inline
  def apply(
    accessibilityLabel: String = null,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    backImage: /* props */ TintColorString => ReactNode = null,
    canGoBack: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelStyle: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any = null,
    labelVisible: js.UndefOr[Boolean] = js.undefined,
    onLabelLayout: /* e */ LayoutChangeEvent => Unit = null,
    onPress: () => Unit = null,
    pressColorAndroid: String = null,
    screenLayout: Layout = null,
    tintColor: String = null,
    titleLayout: Layout = null,
    truncatedLabel: String = null
  ): StackHeaderLeftButtonProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.get.asInstanceOf[js.Any])
    if (backImage != null) __obj.updateDynamic("backImage")(js.Any.fromFunction1(backImage))
    if (!js.isUndefined(canGoBack)) __obj.updateDynamic("canGoBack")(canGoBack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelVisible)) __obj.updateDynamic("labelVisible")(labelVisible.get.asInstanceOf[js.Any])
    if (onLabelLayout != null) __obj.updateDynamic("onLabelLayout")(js.Any.fromFunction1(onLabelLayout))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid.asInstanceOf[js.Any])
    if (screenLayout != null) __obj.updateDynamic("screenLayout")(screenLayout.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (titleLayout != null) __obj.updateDynamic("titleLayout")(titleLayout.asInstanceOf[js.Any])
    if (truncatedLabel != null) __obj.updateDynamic("truncatedLabel")(truncatedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderLeftButtonProps]
  }
}

