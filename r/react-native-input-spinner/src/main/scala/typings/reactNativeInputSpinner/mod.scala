package typings.reactNativeInputSpinner

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.float
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-input-spinner", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactNativeInputSpinnerProps, js.Object, js.Any]
  
  type InputSpinner = Component[ReactNativeInputSpinnerProps, js.Object, js.Any]
  
  trait ReactNativeInputSpinnerProps extends StObject {
    
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var append: js.UndefOr[ReactElement] = js.undefined
    
    var arrows: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var buttonFontFamily: js.UndefOr[String] = js.undefined
    
    var buttonFontSize: js.UndefOr[Double] = js.undefined
    
    var buttonLeftDisabled: js.UndefOr[Boolean] = js.undefined
    
    var buttonLeftImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonLeftText: js.UndefOr[String] = js.undefined
    
    var buttonPressLeftImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonPressRightImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonPressStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonPressTextColor: js.UndefOr[String] = js.undefined
    
    var buttonRightDisabled: js.UndefOr[Boolean] = js.undefined
    
    var buttonRightImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonRightText: js.UndefOr[String] = js.undefined
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonTextColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var colorLeft: js.UndefOr[String] = js.undefined
    
    var colorMax: js.UndefOr[String] = js.undefined
    
    var colorMin: js.UndefOr[String] = js.undefined
    
    var colorPress: js.UndefOr[String] = js.undefined
    
    var colorRight: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var initialValue: js.UndefOr[Double] = js.undefined
    
    var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var max: js.UndefOr[String | Double] = js.undefined
    
    var min: js.UndefOr[String | Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    var onDecrease: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
    
    var onIncrease: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
    
    var onMax: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
    
    var onMin: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var prepend: js.UndefOr[ReactElement] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var showBorder: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[String | Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[int | float] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ReactNativeInputSpinnerProps {
    
    inline def apply(): ReactNativeInputSpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeInputSpinnerProps]
    }
    
    extension [Self <: ReactNativeInputSpinnerProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setAppend(value: ReactElement): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setButtonFontFamily(value: String): Self = StObject.set(x, "buttonFontFamily", value.asInstanceOf[js.Any])
      
      inline def setButtonFontFamilyUndefined: Self = StObject.set(x, "buttonFontFamily", js.undefined)
      
      inline def setButtonFontSize(value: Double): Self = StObject.set(x, "buttonFontSize", value.asInstanceOf[js.Any])
      
      inline def setButtonFontSizeUndefined: Self = StObject.set(x, "buttonFontSize", js.undefined)
      
      inline def setButtonLeftDisabled(value: Boolean): Self = StObject.set(x, "buttonLeftDisabled", value.asInstanceOf[js.Any])
      
      inline def setButtonLeftDisabledUndefined: Self = StObject.set(x, "buttonLeftDisabled", js.undefined)
      
      inline def setButtonLeftImage(value: ReactElement): Self = StObject.set(x, "buttonLeftImage", value.asInstanceOf[js.Any])
      
      inline def setButtonLeftImageUndefined: Self = StObject.set(x, "buttonLeftImage", js.undefined)
      
      inline def setButtonLeftText(value: String): Self = StObject.set(x, "buttonLeftText", value.asInstanceOf[js.Any])
      
      inline def setButtonLeftTextUndefined: Self = StObject.set(x, "buttonLeftText", js.undefined)
      
      inline def setButtonPressLeftImage(value: ReactElement): Self = StObject.set(x, "buttonPressLeftImage", value.asInstanceOf[js.Any])
      
      inline def setButtonPressLeftImageUndefined: Self = StObject.set(x, "buttonPressLeftImage", js.undefined)
      
      inline def setButtonPressRightImage(value: ReactElement): Self = StObject.set(x, "buttonPressRightImage", value.asInstanceOf[js.Any])
      
      inline def setButtonPressRightImageUndefined: Self = StObject.set(x, "buttonPressRightImage", js.undefined)
      
      inline def setButtonPressStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonPressStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonPressStyleNull: Self = StObject.set(x, "buttonPressStyle", null)
      
      inline def setButtonPressStyleUndefined: Self = StObject.set(x, "buttonPressStyle", js.undefined)
      
      inline def setButtonPressTextColor(value: String): Self = StObject.set(x, "buttonPressTextColor", value.asInstanceOf[js.Any])
      
      inline def setButtonPressTextColorUndefined: Self = StObject.set(x, "buttonPressTextColor", js.undefined)
      
      inline def setButtonRightDisabled(value: Boolean): Self = StObject.set(x, "buttonRightDisabled", value.asInstanceOf[js.Any])
      
      inline def setButtonRightDisabledUndefined: Self = StObject.set(x, "buttonRightDisabled", js.undefined)
      
      inline def setButtonRightImage(value: ReactElement): Self = StObject.set(x, "buttonRightImage", value.asInstanceOf[js.Any])
      
      inline def setButtonRightImageUndefined: Self = StObject.set(x, "buttonRightImage", js.undefined)
      
      inline def setButtonRightText(value: String): Self = StObject.set(x, "buttonRightText", value.asInstanceOf[js.Any])
      
      inline def setButtonRightTextUndefined: Self = StObject.set(x, "buttonRightText", js.undefined)
      
      inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setButtonTextColor(value: String): Self = StObject.set(x, "buttonTextColor", value.asInstanceOf[js.Any])
      
      inline def setButtonTextColorUndefined: Self = StObject.set(x, "buttonTextColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorLeft(value: String): Self = StObject.set(x, "colorLeft", value.asInstanceOf[js.Any])
      
      inline def setColorLeftUndefined: Self = StObject.set(x, "colorLeft", js.undefined)
      
      inline def setColorMax(value: String): Self = StObject.set(x, "colorMax", value.asInstanceOf[js.Any])
      
      inline def setColorMaxUndefined: Self = StObject.set(x, "colorMax", js.undefined)
      
      inline def setColorMin(value: String): Self = StObject.set(x, "colorMin", value.asInstanceOf[js.Any])
      
      inline def setColorMinUndefined: Self = StObject.set(x, "colorMin", js.undefined)
      
      inline def setColorPress(value: String): Self = StObject.set(x, "colorPress", value.asInstanceOf[js.Any])
      
      inline def setColorPressUndefined: Self = StObject.set(x, "colorPress", js.undefined)
      
      inline def setColorRight(value: String): Self = StObject.set(x, "colorRight", value.asInstanceOf[js.Any])
      
      inline def setColorRightUndefined: Self = StObject.set(x, "colorRight", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInputStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: /* val */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDecrease(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onDecrease", js.Any.fromFunction1(value))
      
      inline def setOnDecreaseUndefined: Self = StObject.set(x, "onDecrease", js.undefined)
      
      inline def setOnIncrease(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onIncrease", js.Any.fromFunction1(value))
      
      inline def setOnIncreaseUndefined: Self = StObject.set(x, "onIncrease", js.undefined)
      
      inline def setOnMax(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onMax", js.Any.fromFunction1(value))
      
      inline def setOnMaxUndefined: Self = StObject.set(x, "onMax", js.undefined)
      
      inline def setOnMin(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onMin", js.Any.fromFunction1(value))
      
      inline def setOnMinUndefined: Self = StObject.set(x, "onMin", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrepend(value: ReactElement): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
      
      inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
      
      inline def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setType(value: int | float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
