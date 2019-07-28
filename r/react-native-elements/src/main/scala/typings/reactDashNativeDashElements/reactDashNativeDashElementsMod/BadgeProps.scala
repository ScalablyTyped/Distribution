package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.error
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.primary
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.success
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
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
  /**
    * Style for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Function called when pressed on the badge
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  /**
    * Text value to be displayed by badge
    *
    * @default null
    */
  var value: js.UndefOr[ReactNode] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    Component: ComponentClass[js.Object, ComponentState] = null,
    badgeStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    onPress: () => Unit = null,
    status: primary | success | warning | error = null,
    textStyle: StyleProp[TextStyle] = null,
    value: ReactNode = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

