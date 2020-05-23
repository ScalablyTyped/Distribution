package typings.reactNativeElements.anon

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ElementObject
import typings.reactNativeElements.mod.InnerBorderStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.ButtonGroupProps> */
trait PartialButtonGroupProps extends js.Object {
  var Component: js.UndefOr[ComponentType[_]] = js.undefined
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttons: js.UndefOr[js.Array[ElementObject | String]] = js.undefined
  var containerBorderRadius: js.UndefOr[Double] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabled: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  var disabledSelectedStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabledSelectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabledTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var innerBorderStyle: js.UndefOr[InnerBorderStyleProperty] = js.undefined
  var lastBorderStyle: js.UndefOr[StyleProp[TextStyle | ViewStyle]] = js.undefined
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]] = js.undefined
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectMultiple: js.UndefOr[Boolean] = js.undefined
  var selectedButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var selectedIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  var selectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object PartialButtonGroupProps {
  @scala.inline
  def apply(
    Component: ComponentType[_] = null,
    activeOpacity: js.UndefOr[Double] = js.undefined,
    buttonStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    buttons: js.Array[ElementObject | String] = null,
    containerBorderRadius: js.UndefOr[Double] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disabled: Boolean | js.Array[Double] = null,
    disabledSelectedStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disabledSelectedTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    disabledStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disabledTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    innerBorderStyle: InnerBorderStyleProperty = null,
    lastBorderStyle: js.UndefOr[Null | (StyleProp[TextStyle | ViewStyle])] = js.undefined,
    onHideUnderlay: () => Unit = null,
    onPress: /* selectedIndex */ Double => Unit = null,
    onShowUnderlay: () => Unit = null,
    selectMultiple: js.UndefOr[Boolean] = js.undefined,
    selectedButtonStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    selectedIndexes: js.Array[Double] = null,
    selectedTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    setOpacityTo: /* value */ Double => Unit = null,
    textStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    underlayColor: String = null
  ): PartialButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonStyle)) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(containerBorderRadius)) __obj.updateDynamic("containerBorderRadius")(containerBorderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledSelectedStyle)) __obj.updateDynamic("disabledSelectedStyle")(disabledSelectedStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledSelectedTextStyle)) __obj.updateDynamic("disabledSelectedTextStyle")(disabledSelectedTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledStyle)) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledTextStyle)) __obj.updateDynamic("disabledTextStyle")(disabledTextStyle.asInstanceOf[js.Any])
    if (innerBorderStyle != null) __obj.updateDynamic("innerBorderStyle")(innerBorderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(lastBorderStyle)) __obj.updateDynamic("lastBorderStyle")(lastBorderStyle.asInstanceOf[js.Any])
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(js.Any.fromFunction0(onHideUnderlay))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(js.Any.fromFunction0(onShowUnderlay))
    if (!js.isUndefined(selectMultiple)) __obj.updateDynamic("selectMultiple")(selectMultiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedButtonStyle)) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (selectedIndexes != null) __obj.updateDynamic("selectedIndexes")(selectedIndexes.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedTextStyle)) __obj.updateDynamic("selectedTextStyle")(selectedTextStyle.asInstanceOf[js.Any])
    if (setOpacityTo != null) __obj.updateDynamic("setOpacityTo")(js.Any.fromFunction1(setOpacityTo))
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialButtonGroupProps]
  }
}

