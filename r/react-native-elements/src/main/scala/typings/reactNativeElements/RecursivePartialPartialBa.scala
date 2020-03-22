package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.error
import typings.reactNativeElements.reactNativeElementsStrings.primary
import typings.reactNativeElements.reactNativeElementsStrings.success
import typings.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BadgeProps>> */
trait RecursivePartialPartialBa extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]] = js.undefined
  var badgeStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var status: js.UndefOr[RecursivePartial[js.UndefOr[primary | success | warning | error]]] = js.undefined
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var value: js.UndefOr[RecursivePartial[js.UndefOr[ReactNode]]] = js.undefined
}

object RecursivePartialPartialBa {
  @scala.inline
  def apply(
    Component: RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]] = null,
    badgeStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    onPress: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    status: RecursivePartial[js.UndefOr[primary | success | warning | error]] = null,
    textStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    value: RecursivePartial[js.UndefOr[ReactNode]] = null
  ): RecursivePartialPartialBa = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialBa]
  }
}

