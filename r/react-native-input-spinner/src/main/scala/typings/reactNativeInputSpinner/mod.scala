package typings.reactNativeInputSpinner

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.clean
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.modern
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.paper
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.round
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-input-spinner", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactNativeInputSpinnerProps, js.Object, Any]
  
  type InputSpinner = Component[ReactNativeInputSpinnerProps, js.Object, Any]
  
  trait ReactNativeInputSpinnerProps extends StObject {
    
    var accelerationDelay: js.UndefOr[Double] = js.undefined
    
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var append: js.UndefOr[ReactElement] = js.undefined
    
    var arrows: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var buttonFontFamily: js.UndefOr[String] = js.undefined
    
    var buttonFontSize: js.UndefOr[Double] = js.undefined
    
    var buttonLeftDisabled: js.UndefOr[Boolean] = js.undefined
    
    var buttonLeftImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonLeftText: js.UndefOr[String] = js.undefined
    
    var buttonPressLeftImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonPressRightImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonPressStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonPressTextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonRightDisabled: js.UndefOr[Boolean] = js.undefined
    
    var buttonRightImage: js.UndefOr[ReactElement] = js.undefined
    
    var buttonRightText: js.UndefOr[String] = js.undefined
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var buttonTextColor: js.UndefOr[String] = js.undefined
    
    var buttonTextProps: js.UndefOr[TextProps] = js.undefined
    
    var buttonTextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var colorAsBackground: js.UndefOr[Boolean] = js.undefined
    
    var colorLeft: js.UndefOr[String] = js.undefined
    
    var colorMax: js.UndefOr[String] = js.undefined
    
    var colorMin: js.UndefOr[String] = js.undefined
    
    var colorPress: js.UndefOr[String] = js.undefined
    
    var colorRight: js.UndefOr[String] = js.undefined
    
    var containerProps: js.UndefOr[js.Object] = js.undefined
    
    var continuity: js.UndefOr[Boolean] = js.undefined
    
    var decimalSeparator: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var emptied: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var initialValue: js.UndefOr[String | Double] = js.undefined
    
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var leftButtonProps: js.UndefOr[js.Object] = js.undefined
    
    var longStep: js.UndefOr[String | Double] = js.undefined
    
    var max: js.UndefOr[String | Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[String | Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onDecrease: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onIncrease: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onMax: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onMin: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placeholderTextColor: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var prepend: js.UndefOr[ReactElement] = js.undefined
    
    var returnKeyLabel: js.UndefOr[String] = js.undefined
    
    var returnKeyType: js.UndefOr[String] = js.undefined
    
    var rightButtonProps: js.UndefOr[js.Object] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var selectionColor: js.UndefOr[String] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var showBorder: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[clean | modern | paper | round | square] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[String | Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typingTime: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ReactNativeInputSpinnerProps {
    
    inline def apply(): ReactNativeInputSpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeInputSpinnerProps]
    }
    
    extension [Self <: ReactNativeInputSpinnerProps](x: Self) {
      
      inline def setAccelerationDelay(value: Double): Self = StObject.set(x, "accelerationDelay", value.asInstanceOf[js.Any])
      
      inline def setAccelerationDelayUndefined: Self = StObject.set(x, "accelerationDelay", js.undefined)
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setAppend(value: ReactElement): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
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
      
      inline def setButtonPressTextStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonPressTextStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonPressTextStyleNull: Self = StObject.set(x, "buttonPressTextStyle", null)
      
      inline def setButtonPressTextStyleUndefined: Self = StObject.set(x, "buttonPressTextStyle", js.undefined)
      
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
      
      inline def setButtonTextProps(value: TextProps): Self = StObject.set(x, "buttonTextProps", value.asInstanceOf[js.Any])
      
      inline def setButtonTextPropsUndefined: Self = StObject.set(x, "buttonTextProps", js.undefined)
      
      inline def setButtonTextStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonTextStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonTextStyleNull: Self = StObject.set(x, "buttonTextStyle", null)
      
      inline def setButtonTextStyleUndefined: Self = StObject.set(x, "buttonTextStyle", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorAsBackground(value: Boolean): Self = StObject.set(x, "colorAsBackground", value.asInstanceOf[js.Any])
      
      inline def setColorAsBackgroundUndefined: Self = StObject.set(x, "colorAsBackground", js.undefined)
      
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
      
      inline def setContainerProps(value: js.Object): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setContinuity(value: Boolean): Self = StObject.set(x, "continuity", value.asInstanceOf[js.Any])
      
      inline def setContinuityUndefined: Self = StObject.set(x, "continuity", js.undefined)
      
      inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEmptied(value: Boolean): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      inline def setEmptiedUndefined: Self = StObject.set(x, "emptied", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialValue(value: String | Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLeftButtonProps(value: js.Object): Self = StObject.set(x, "leftButtonProps", value.asInstanceOf[js.Any])
      
      inline def setLeftButtonPropsUndefined: Self = StObject.set(x, "leftButtonProps", js.undefined)
      
      inline def setLongStep(value: String | Double): Self = StObject.set(x, "longStep", value.asInstanceOf[js.Any])
      
      inline def setLongStepUndefined: Self = StObject.set(x, "longStep", js.undefined)
      
      inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnBlur(value: /* repeated */ Any => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDecrease(value: /* repeated */ Any => Any): Self = StObject.set(x, "onDecrease", js.Any.fromFunction1(value))
      
      inline def setOnDecreaseUndefined: Self = StObject.set(x, "onDecrease", js.undefined)
      
      inline def setOnFocus(value: /* repeated */ Any => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnIncrease(value: /* repeated */ Any => Any): Self = StObject.set(x, "onIncrease", js.Any.fromFunction1(value))
      
      inline def setOnIncreaseUndefined: Self = StObject.set(x, "onIncrease", js.undefined)
      
      inline def setOnKeyPress(value: /* repeated */ Any => Any): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnLongPress(value: /* repeated */ Any => Any): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMax(value: /* repeated */ Any => Any): Self = StObject.set(x, "onMax", js.Any.fromFunction1(value))
      
      inline def setOnMaxUndefined: Self = StObject.set(x, "onMax", js.undefined)
      
      inline def setOnMin(value: /* repeated */ Any => Any): Self = StObject.set(x, "onMin", js.Any.fromFunction1(value))
      
      inline def setOnMinUndefined: Self = StObject.set(x, "onMin", js.undefined)
      
      inline def setOnSubmit(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColor(value: String): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrepend(value: ReactElement): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setReturnKeyLabel(value: String): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
      
      inline def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
      
      inline def setReturnKeyType(value: String): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
      
      inline def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
      
      inline def setRightButtonProps(value: js.Object): Self = StObject.set(x, "rightButtonProps", value.asInstanceOf[js.Any])
      
      inline def setRightButtonPropsUndefined: Self = StObject.set(x, "rightButtonProps", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setSelectTextOnFocus(value: Boolean): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
      
      inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
      
      inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
      
      inline def setSkin(value: clean | modern | paper | round | square): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypingTime(value: Double): Self = StObject.set(x, "typingTime", value.asInstanceOf[js.Any])
      
      inline def setTypingTimeUndefined: Self = StObject.set(x, "typingTime", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
