package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait InputProps extends js.Object {
  /**
    * Styling for Input Component Container (optional)
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * 	Adds error message (optional)
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * 	props to be passed to the React Native Text component used to display the error message (optional)
    */
  var errorProps: js.UndefOr[TextProps] = js.undefined
  /**
    * 	Add styling to error message (optional)
    */
  var errorStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Renders component in place of the React Native `TextInput` (optional)
    */
  var inputComponent: js.UndefOr[ComponentClass[_, ComponentState]] = js.undefined
  /**
    * Styling for Input Component Container (optional)
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * 	Adds styling to input component (optional)
    */
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * 	Adds label (optional)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    *  props to be passed to the React Native Text component used to display the label (optional)
    */
  var labelProps: js.UndefOr[TextProps] = js.undefined
  /**
    * 	Add styling to label (optional)
    */
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Displays an icon to the left (optional)
    */
  var leftIcon: js.UndefOr[IconNode] = js.undefined
  /**
    * Styling for left Icon Component container
    */
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Displays an icon to the right (optional)
    */
  var rightIcon: js.UndefOr[IconNode] = js.undefined
  /**
    * Styling for the right icon container
    */
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Adds shaking effect to input component (optional)
    */
  var shake: js.UndefOr[js.Any] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    containerStyle: StyleProp[ViewStyle] = null,
    errorMessage: String = null,
    errorProps: TextProps = null,
    errorStyle: StyleProp[TextStyle] = null,
    inputComponent: ComponentClass[_, ComponentState] = null,
    inputContainerStyle: StyleProp[ViewStyle] = null,
    inputStyle: StyleProp[TextStyle] = null,
    label: String = null,
    labelProps: TextProps = null,
    labelStyle: StyleProp[TextStyle] = null,
    leftIcon: IconNode = null,
    leftIconContainerStyle: StyleProp[ViewStyle] = null,
    rightIcon: IconNode = null,
    rightIconContainerStyle: StyleProp[ViewStyle] = null,
    shake: js.Any = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (errorProps != null) __obj.updateDynamic("errorProps")(errorProps)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent)
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (shake != null) __obj.updateDynamic("shake")(shake)
    __obj.asInstanceOf[InputProps]
  }
}

