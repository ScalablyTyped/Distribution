package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /**
    * Choose other button component such as TouchableOpacity
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * inherited styling	specify styling for button
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Array of buttons for component, if returning a component, must be an object with { element: componentName }
    */
  var buttons: js.Array[ElementObject | String]
  /**
    * Border radius for the container
    */
  var containerBorderRadius: js.UndefOr[Double] = js.undefined
  /**
    * Specify styling for main button container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Controls if buttons are disabled
    *
    * Setting `true` makes all of them disabled, while using an array only makes those indices disabled
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  /**
    * Styling for each selected button when disabled
    */
  var disabledSelectedStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Styling for the text of each selected button when disabled
    */
  var disabledSelectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Styling for each button when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Styling for the text of each button when disabled
    */
  var disabledTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * inherited styling	object { width, color }	update the styling of the interior border of the list of buttons
    */
  var innerBorderStyle: js.UndefOr[InnerBorderStyleProperty] = js.undefined
  /**
    * Styling for the final border edge
    */
  var lastBorderStyle: js.UndefOr[StyleProp[TextStyle | ViewStyle]] = js.undefined
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Allows the user to select multiple items
    *
    * @default false
    */
  var selectMultiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify styling selected button
    *
    * @default 'white'
    */
  var selectedButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Current selected index of array of buttons
    */
  var selectedIndex: js.UndefOr[Double | Null] = js.undefined
  /**
    * The indexes that are selected. Used with 'selectMultiple'
    *
    * @default []
    */
  var selectedIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Specify specific styling for text in the selected state
    */
  var selectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Animate the touchable to a new opacity.
    */
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Specify specific styling for text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white'
    */
  var underlayColor: js.UndefOr[String] = js.undefined
  /**
    * Method to update Button Group Index
    */
  def onPress(selectedIndex: Double): Unit
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    buttons: js.Array[ElementObject | String],
    onPress: Double => Unit,
    Component: ComponentType[_] = null,
    activeOpacity: Int | Double = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    containerBorderRadius: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: Boolean | js.Array[Double] = null,
    disabledSelectedStyle: StyleProp[ViewStyle] = null,
    disabledSelectedTextStyle: StyleProp[TextStyle] = null,
    disabledStyle: StyleProp[ViewStyle] = null,
    disabledTextStyle: StyleProp[TextStyle] = null,
    innerBorderStyle: InnerBorderStyleProperty = null,
    lastBorderStyle: StyleProp[TextStyle | ViewStyle] = null,
    onHideUnderlay: () => Unit = null,
    onShowUnderlay: () => Unit = null,
    selectMultiple: js.UndefOr[Boolean] = js.undefined,
    selectedButtonStyle: StyleProp[ViewStyle] = null,
    selectedIndex: Int | Double = null,
    selectedIndexes: js.Array[Double] = null,
    selectedTextStyle: StyleProp[TextStyle] = null,
    setOpacityTo: /* value */ Double => Unit = null,
    textStyle: StyleProp[TextStyle] = null,
    underlayColor: String = null
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerBorderRadius != null) __obj.updateDynamic("containerBorderRadius")(containerBorderRadius.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledSelectedStyle != null) __obj.updateDynamic("disabledSelectedStyle")(disabledSelectedStyle.asInstanceOf[js.Any])
    if (disabledSelectedTextStyle != null) __obj.updateDynamic("disabledSelectedTextStyle")(disabledSelectedTextStyle.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (disabledTextStyle != null) __obj.updateDynamic("disabledTextStyle")(disabledTextStyle.asInstanceOf[js.Any])
    if (innerBorderStyle != null) __obj.updateDynamic("innerBorderStyle")(innerBorderStyle.asInstanceOf[js.Any])
    if (lastBorderStyle != null) __obj.updateDynamic("lastBorderStyle")(lastBorderStyle.asInstanceOf[js.Any])
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(js.Any.fromFunction0(onHideUnderlay))
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(js.Any.fromFunction0(onShowUnderlay))
    if (!js.isUndefined(selectMultiple)) __obj.updateDynamic("selectMultiple")(selectMultiple.asInstanceOf[js.Any])
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedIndexes != null) __obj.updateDynamic("selectedIndexes")(selectedIndexes.asInstanceOf[js.Any])
    if (selectedTextStyle != null) __obj.updateDynamic("selectedTextStyle")(selectedTextStyle.asInstanceOf[js.Any])
    if (setOpacityTo != null) __obj.updateDynamic("setOpacityTo")(js.Any.fromFunction1(setOpacityTo))
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

