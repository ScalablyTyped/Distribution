package typings.reactNativeElements

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ElementObject
import typings.reactNativeElements.mod.InnerBorderStyleProperty
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ButtonGroupProps>> */
trait RecursivePartialPartialBu extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ComponentType[_]]]] = js.undefined
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var buttonStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var buttons: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[ElementObject | String]]]] = js.undefined
  var containerBorderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | js.Array[Double]]]] = js.undefined
  var disabledSelectedStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var disabledSelectedTextStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var disabledTextStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var innerBorderStyle: js.UndefOr[RecursivePartial[js.UndefOr[InnerBorderStyleProperty]]] = js.undefined
  var lastBorderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle | ViewStyle]]]] = js.undefined
  var onHideUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]]]] = js.undefined
  var onShowUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var selectMultiple: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var selectedButtonStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var selectedIndex: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var selectedIndexes: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[Double]]]] = js.undefined
  var selectedTextStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var setOpacityTo: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.undefined
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
}

object RecursivePartialPartialBu {
  @scala.inline
  def apply(
    Component: RecursivePartial[js.UndefOr[ComponentType[_]]] = null,
    activeOpacity: RecursivePartial[js.UndefOr[Double]] = null,
    buttonStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    buttons: RecursivePartial[js.UndefOr[js.Array[ElementObject | String]]] = null,
    containerBorderRadius: RecursivePartial[js.UndefOr[Double]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    disabled: RecursivePartial[js.UndefOr[Boolean | js.Array[Double]]] = null,
    disabledSelectedStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    disabledSelectedTextStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    disabledStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    disabledTextStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    innerBorderStyle: RecursivePartial[js.UndefOr[InnerBorderStyleProperty]] = null,
    lastBorderStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle | ViewStyle]]] = null,
    onHideUnderlay: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onPress: RecursivePartial[js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]]] = null,
    onShowUnderlay: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    selectMultiple: RecursivePartial[js.UndefOr[Boolean]] = null,
    selectedButtonStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    selectedIndex: RecursivePartial[js.UndefOr[Double]] = null,
    selectedIndexes: RecursivePartial[js.UndefOr[js.Array[Double]]] = null,
    selectedTextStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    setOpacityTo: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]] = null,
    textStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    underlayColor: RecursivePartial[js.UndefOr[String]] = null
  ): RecursivePartialPartialBu = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (containerBorderRadius != null) __obj.updateDynamic("containerBorderRadius")(containerBorderRadius.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledSelectedStyle != null) __obj.updateDynamic("disabledSelectedStyle")(disabledSelectedStyle.asInstanceOf[js.Any])
    if (disabledSelectedTextStyle != null) __obj.updateDynamic("disabledSelectedTextStyle")(disabledSelectedTextStyle.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (disabledTextStyle != null) __obj.updateDynamic("disabledTextStyle")(disabledTextStyle.asInstanceOf[js.Any])
    if (innerBorderStyle != null) __obj.updateDynamic("innerBorderStyle")(innerBorderStyle.asInstanceOf[js.Any])
    if (lastBorderStyle != null) __obj.updateDynamic("lastBorderStyle")(lastBorderStyle.asInstanceOf[js.Any])
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(onHideUnderlay.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress.asInstanceOf[js.Any])
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(onShowUnderlay.asInstanceOf[js.Any])
    if (selectMultiple != null) __obj.updateDynamic("selectMultiple")(selectMultiple.asInstanceOf[js.Any])
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedIndexes != null) __obj.updateDynamic("selectedIndexes")(selectedIndexes.asInstanceOf[js.Any])
    if (selectedTextStyle != null) __obj.updateDynamic("selectedTextStyle")(selectedTextStyle.asInstanceOf[js.Any])
    if (setOpacityTo != null) __obj.updateDynamic("setOpacityTo")(setOpacityTo.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialBu]
  }
}

