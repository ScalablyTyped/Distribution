package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonGroupProps extends StObject {
  
  /**
    * Choose other button component such as TouchableOpacity
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ComponentType[js.Any]] = js.undefined
  
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify styling for buttons container
    */
  var buttonContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
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
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Method to update Button Group Index
    */
  def onPress(selectedIndex: Double): Unit
  
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
    * Display in vertical orientation
    *
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object ButtonGroupProps {
  
  inline def apply(buttons: js.Array[ElementObject | String], onPress: Double => Unit): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[ButtonGroupProps]
  }
  
  extension [Self <: ButtonGroupProps](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setButtonContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonContainerStyleNull: Self = StObject.set(x, "buttonContainerStyle", null)
    
    inline def setButtonContainerStyleUndefined: Self = StObject.set(x, "buttonContainerStyle", js.undefined)
    
    inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setButtons(value: js.Array[ElementObject | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: (ElementObject | String)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerBorderRadius(value: Double): Self = StObject.set(x, "containerBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setContainerBorderRadiusUndefined: Self = StObject.set(x, "containerBorderRadius", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDisabled(value: Boolean | js.Array[Double]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledSelectedStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledSelectedStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledSelectedStyleNull: Self = StObject.set(x, "disabledSelectedStyle", null)
    
    inline def setDisabledSelectedStyleUndefined: Self = StObject.set(x, "disabledSelectedStyle", js.undefined)
    
    inline def setDisabledSelectedTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledSelectedTextStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledSelectedTextStyleNull: Self = StObject.set(x, "disabledSelectedTextStyle", null)
    
    inline def setDisabledSelectedTextStyleUndefined: Self = StObject.set(x, "disabledSelectedTextStyle", js.undefined)
    
    inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    inline def setDisabledTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledTextStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledTextStyleNull: Self = StObject.set(x, "disabledTextStyle", null)
    
    inline def setDisabledTextStyleUndefined: Self = StObject.set(x, "disabledTextStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisabledVarargs(value: Double*): Self = StObject.set(x, "disabled", js.Array(value :_*))
    
    inline def setInnerBorderStyle(value: InnerBorderStyleProperty): Self = StObject.set(x, "innerBorderStyle", value.asInstanceOf[js.Any])
    
    inline def setInnerBorderStyleUndefined: Self = StObject.set(x, "innerBorderStyle", js.undefined)
    
    inline def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
    
    inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
    inline def setOnPress(value: Double => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
    
    inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    inline def setSelectMultiple(value: Boolean): Self = StObject.set(x, "selectMultiple", value.asInstanceOf[js.Any])
    
    inline def setSelectMultipleUndefined: Self = StObject.set(x, "selectMultiple", js.undefined)
    
    inline def setSelectedButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    inline def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexNull: Self = StObject.set(x, "selectedIndex", null)
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedIndexes(value: js.Array[Double]): Self = StObject.set(x, "selectedIndexes", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexesUndefined: Self = StObject.set(x, "selectedIndexes", js.undefined)
    
    inline def setSelectedIndexesVarargs(value: Double*): Self = StObject.set(x, "selectedIndexes", js.Array(value :_*))
    
    inline def setSelectedTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "selectedTextStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextStyleNull: Self = StObject.set(x, "selectedTextStyle", null)
    
    inline def setSelectedTextStyleUndefined: Self = StObject.set(x, "selectedTextStyle", js.undefined)
    
    inline def setSetOpacityTo(value: /* value */ Double => Unit): Self = StObject.set(x, "setOpacityTo", js.Any.fromFunction1(value))
    
    inline def setSetOpacityToUndefined: Self = StObject.set(x, "setOpacityTo", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
