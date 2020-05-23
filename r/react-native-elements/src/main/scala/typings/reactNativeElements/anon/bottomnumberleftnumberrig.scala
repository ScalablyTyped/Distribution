package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.error
import typings.reactNativeElements.reactNativeElementsStrings.primary
import typings.reactNativeElements.reactNativeElementsStrings.success
import typings.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  bottom ? :number,   left ? :number,   right ? :number,   top ? :number,   hidden ? :boolean,   containerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} & react-native-elements.react-native-elements.BadgeProps */
trait bottomnumberleftnumberrig extends js.Object {
  /**
    * Custom component to replace the badge component
    *
    * @default View (if onPress then TouchableOpacity)
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Additional styling for badge (background) view component
    */
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * Style for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Function called when pressed on the badge
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  /**
    * Determines color of the indicator
    *
    * @default primary
    */
  var status: js.UndefOr[primary | success | warning | error] = js.undefined
  /**
    * Style for the text in the badge
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  /**
    * Text value to be displayed by badge
    *
    * @default null
    */
  var value: js.UndefOr[ReactNode] = js.undefined
}

object bottomnumberleftnumberrig {
  @scala.inline
  def apply(
    Component: ComponentClass[js.Object, ComponentState] = null,
    badgeStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    bottom: js.UndefOr[Double] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    onPress: () => Unit = null,
    right: js.UndefOr[Double] = js.undefined,
    status: primary | success | warning | error = null,
    textStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    value: ReactNode = null
  ): bottomnumberleftnumberrig = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeStyle)) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[bottomnumberleftnumberrig]
  }
}

