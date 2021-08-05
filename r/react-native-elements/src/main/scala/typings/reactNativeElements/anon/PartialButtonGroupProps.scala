package typings.reactNativeElements.anon

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ElementObject
import typings.reactNativeElements.mod.InnerBorderStyleProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.ButtonGroupProps> */
trait PartialButtonGroupProps extends StObject {
  
  var Component: js.UndefOr[ComponentType[js.Any]] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var buttonContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
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
  
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]] = js.undefined
  
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var selectMultiple: js.UndefOr[Boolean] = js.undefined
  
  var selectedButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double | Null] = js.undefined
  
  var selectedIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var selectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var underlayColor: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object PartialButtonGroupProps {
  
  inline def apply(): PartialButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonGroupProps]
  }
  
  extension [Self <: PartialButtonGroupProps](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setButtonContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonContainerStyleNull: Self = StObject.set(x, "buttonContainerStyle", null)
    
    inline def setButtonContainerStyleUndefined: Self = StObject.set(x, "buttonContainerStyle", js.undefined)
    
    inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setButtons(value: js.Array[ElementObject | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
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
    
    inline def setOnPress(value: /* selectedIndex */ Double => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
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
