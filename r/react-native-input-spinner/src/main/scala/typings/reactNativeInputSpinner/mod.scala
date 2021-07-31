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
    
    @scala.inline
    def apply(): ReactNativeInputSpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeInputSpinnerProps]
    }
    
    @scala.inline
    implicit class ReactNativeInputSpinnerPropsMutableBuilder[Self <: ReactNativeInputSpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setAppend(value: ReactElement): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setButtonFontFamily(value: String): Self = StObject.set(x, "buttonFontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonFontFamilyUndefined: Self = StObject.set(x, "buttonFontFamily", js.undefined)
      
      @scala.inline
      def setButtonFontSize(value: Double): Self = StObject.set(x, "buttonFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonFontSizeUndefined: Self = StObject.set(x, "buttonFontSize", js.undefined)
      
      @scala.inline
      def setButtonLeftDisabled(value: Boolean): Self = StObject.set(x, "buttonLeftDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLeftDisabledUndefined: Self = StObject.set(x, "buttonLeftDisabled", js.undefined)
      
      @scala.inline
      def setButtonLeftImage(value: ReactElement): Self = StObject.set(x, "buttonLeftImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLeftImageUndefined: Self = StObject.set(x, "buttonLeftImage", js.undefined)
      
      @scala.inline
      def setButtonLeftText(value: String): Self = StObject.set(x, "buttonLeftText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLeftTextUndefined: Self = StObject.set(x, "buttonLeftText", js.undefined)
      
      @scala.inline
      def setButtonPressLeftImage(value: ReactElement): Self = StObject.set(x, "buttonPressLeftImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPressLeftImageUndefined: Self = StObject.set(x, "buttonPressLeftImage", js.undefined)
      
      @scala.inline
      def setButtonPressRightImage(value: ReactElement): Self = StObject.set(x, "buttonPressRightImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPressRightImageUndefined: Self = StObject.set(x, "buttonPressRightImage", js.undefined)
      
      @scala.inline
      def setButtonPressStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonPressStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPressStyleNull: Self = StObject.set(x, "buttonPressStyle", null)
      
      @scala.inline
      def setButtonPressStyleUndefined: Self = StObject.set(x, "buttonPressStyle", js.undefined)
      
      @scala.inline
      def setButtonPressTextColor(value: String): Self = StObject.set(x, "buttonPressTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPressTextColorUndefined: Self = StObject.set(x, "buttonPressTextColor", js.undefined)
      
      @scala.inline
      def setButtonRightDisabled(value: Boolean): Self = StObject.set(x, "buttonRightDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonRightDisabledUndefined: Self = StObject.set(x, "buttonRightDisabled", js.undefined)
      
      @scala.inline
      def setButtonRightImage(value: ReactElement): Self = StObject.set(x, "buttonRightImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonRightImageUndefined: Self = StObject.set(x, "buttonRightImage", js.undefined)
      
      @scala.inline
      def setButtonRightText(value: String): Self = StObject.set(x, "buttonRightText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonRightTextUndefined: Self = StObject.set(x, "buttonRightText", js.undefined)
      
      @scala.inline
      def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setButtonTextColor(value: String): Self = StObject.set(x, "buttonTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextColorUndefined: Self = StObject.set(x, "buttonTextColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorLeft(value: String): Self = StObject.set(x, "colorLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorLeftUndefined: Self = StObject.set(x, "colorLeft", js.undefined)
      
      @scala.inline
      def setColorMax(value: String): Self = StObject.set(x, "colorMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMaxUndefined: Self = StObject.set(x, "colorMax", js.undefined)
      
      @scala.inline
      def setColorMin(value: String): Self = StObject.set(x, "colorMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMinUndefined: Self = StObject.set(x, "colorMin", js.undefined)
      
      @scala.inline
      def setColorPress(value: String): Self = StObject.set(x, "colorPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPressUndefined: Self = StObject.set(x, "colorPress", js.undefined)
      
      @scala.inline
      def setColorRight(value: String): Self = StObject.set(x, "colorRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRightUndefined: Self = StObject.set(x, "colorRight", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setInputStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* val */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDecrease(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onDecrease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDecreaseUndefined: Self = StObject.set(x, "onDecrease", js.undefined)
      
      @scala.inline
      def setOnIncrease(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onIncrease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIncreaseUndefined: Self = StObject.set(x, "onIncrease", js.undefined)
      
      @scala.inline
      def setOnMax(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onMax", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMaxUndefined: Self = StObject.set(x, "onMax", js.undefined)
      
      @scala.inline
      def setOnMin(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "onMin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMinUndefined: Self = StObject.set(x, "onMin", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPrepend(value: ReactElement): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      @scala.inline
      def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
      
      @scala.inline
      def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setType(value: int | float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
