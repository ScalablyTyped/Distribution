package typings.reactNativeMaterialDropdown

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialDropdown.anon.PartialDropDownProps
import typings.reactNativeMaterialDropdown.anon.PartialDropDownPropsAbsoluteRTLLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-dropdown", "Dropdown")
  @js.native
  open class Dropdown protected ()
    extends PureComponent[DropDownProps, js.Object, Any] {
    def this(props: DropDownProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DropDownProps, context: Any) = this()
  }
  
  trait DropDownData extends StObject {
    
    /** Label to be shown */
    var label: js.UndefOr[String] = js.undefined
    
    /** Props for this item */
    var props: js.UndefOr[PartialDropDownPropsAbsoluteRTLLayout] = js.undefined
    
    /** Value of item */
    var value: String
  }
  object DropDownData {
    
    inline def apply(value: String): DropDownData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownData]
    }
    
    extension [Self <: DropDownData](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProps(value: PartialDropDownPropsAbsoluteRTLLayout): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropDownInsets extends StObject {
    
    /** Bottom */
    var bottom: Double
    
    /** Left */
    var left: Double
    
    /** Right */
    var right: Double
    
    /** Top */
    var top: Double
  }
  object DropDownInsets {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): DropDownInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownInsets]
    }
    
    extension [Self <: DropDownInsets](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropDownMargins extends StObject {
    
    /** Maximum value */
    var max: Double
    
    /** Minimum value */
    var min: Double
  }
  object DropDownMargins {
    
    inline def apply(max: Double, min: Double): DropDownMargins = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownMargins]
    }
    
    extension [Self <: DropDownMargins](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropDownOffset extends StObject {
    
    /** Left offset */
    var left: Double
    
    /** Top offset */
    var top: Double
  }
  object DropDownOffset {
    
    inline def apply(left: Double, top: Double): DropDownOffset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownOffset]
    }
    
    extension [Self <: DropDownOffset](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropDownProps
    extends StObject
       with TouchableWithoutFeedbackProps {
    
    /** Enable RTL layout */
    var absoluteRTLLayout: js.UndefOr[Boolean] = js.undefined
    
    /** Animation duration (default: 225) */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /** Set base color (default: rgba(0, 0, 0, .38)) */
    var baseColor: js.UndefOr[String] = js.undefined
    
    /** Set container styles */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /** Dropdown data items */
    var data: js.Array[DropDownData]
    
    /** Set disabled item color */
    var disabledItemColor: js.UndefOr[String] = js.undefined
    
    /** Provide Dropdown margins */
    var dropdownMargins: js.UndefOr[DropDownMargins] = js.undefined
    
    /** Provide Dropdown top-left position */
    var dropdownOffset: js.UndefOr[DropDownOffset] = js.undefined
    
    /** Provide dropdown position (dynamic if undefined) */
    var dropdownPosition: js.UndefOr[Double] = js.undefined
    
    /** Set font size of dropdown items (default: 16) */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /** Hitslop insets (default: { top: 6, right: 4, bottom: 6, left: 4 }) */
    @JSName("hitSlop")
    var hitSlop_DropDownProps: js.UndefOr[DropDownInsets] = js.undefined
    
    /** Set input container styles */
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /** Set Item color (default: rgba(0, 0, 0, .54)) */
    var itemColor: js.UndefOr[String] = js.undefined
    
    /** Set Item count (default: 4) */
    var itemCount: js.UndefOr[Double] = js.undefined
    
    /** Set Item padding (default: 8) */
    var itemPadding: js.UndefOr[Double] = js.undefined
    
    /** Set Item text style. */
    var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /** Label to be shown for dropdown */
    var label: js.UndefOr[String] = js.undefined
    
    /** Label extractor function. Extract label from item. */
    var labelExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.undefined
    
    /** Set font size of label (default: 12) */
    var labelFontSize: js.UndefOr[Double] = js.undefined
    
    /** Set the label styles */
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /** Event: When focus lost from dropdown */
    @JSName("onBlur")
    var onBlur_DropDownProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Event: When change selected item */
    var onChangeText: js.UndefOr[
        js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData], Unit]
      ] = js.undefined
    
    /** Event: When dropdown opens */
    @JSName("onFocus")
    var onFocus_DropDownProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Set overlay styles */
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /** Set picker styles */
    var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /** Props extractor function. Extract props from item. */
    var propsExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, PartialDropDownProps]] = js.undefined
    
    /** Render text field accessory */
    var renderAccessory: js.UndefOr[js.Function0[Element]] = js.undefined
    
    /** Render base component */
    var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, Element]] = js.undefined
    
    /** Whether ripple be centered or not (default: false) */
    var rippleCentered: js.UndefOr[Boolean] = js.undefined
    
    /** Provide Ripple color */
    var rippleColor: js.UndefOr[String] = js.undefined
    
    /** Ripple duration (defailt: 400) */
    var rippleDuration: js.UndefOr[Double] = js.undefined
    
    /** Ripple insets  */
    var rippleInsets: js.UndefOr[DropDownInsets] = js.undefined
    
    /** Ripple opacity (default: 0.54) */
    var rippleOpacity: js.UndefOr[Double] = js.undefined
    
    /** Whether ripple rendered in sequential order (default: false)  */
    var rippleSequential: js.UndefOr[Boolean] = js.undefined
    
    /** Set selected item color */
    var selectedItemColor: js.UndefOr[String] = js.undefined
    
    /** Shade opacity (default: 0.12) */
    var shadeOpacity: js.UndefOr[Double] = js.undefined
    
    /** Specify which orientations are supported. (default: ['portrait', 'portrait-upside-down', 'landscape', 'landscape-left', 'landscape-right']) */
    var supportedOrientations: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set Text color (default: rgba(0, 0, 0, .87)) */
    var textColor: js.UndefOr[String] = js.undefined
    
    /** Use native driver (default: false) */
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    /** Selected value */
    var value: js.UndefOr[String | Double] = js.undefined
    
    /** Value extractor function. Extract value from item. */
    var valueExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.undefined
  }
  object DropDownProps {
    
    inline def apply(data: js.Array[DropDownData]): DropDownProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownProps]
    }
    
    extension [Self <: DropDownProps](x: Self) {
      
      inline def setAbsoluteRTLLayout(value: Boolean): Self = StObject.set(x, "absoluteRTLLayout", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteRTLLayoutUndefined: Self = StObject.set(x, "absoluteRTLLayout", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setData(value: js.Array[DropDownData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: DropDownData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDisabledItemColor(value: String): Self = StObject.set(x, "disabledItemColor", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemColorUndefined: Self = StObject.set(x, "disabledItemColor", js.undefined)
      
      inline def setDropdownMargins(value: DropDownMargins): Self = StObject.set(x, "dropdownMargins", value.asInstanceOf[js.Any])
      
      inline def setDropdownMarginsUndefined: Self = StObject.set(x, "dropdownMargins", js.undefined)
      
      inline def setDropdownOffset(value: DropDownOffset): Self = StObject.set(x, "dropdownOffset", value.asInstanceOf[js.Any])
      
      inline def setDropdownOffsetUndefined: Self = StObject.set(x, "dropdownOffset", js.undefined)
      
      inline def setDropdownPosition(value: Double): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
      
      inline def setDropdownPositionUndefined: Self = StObject.set(x, "dropdownPosition", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHitSlop(value: DropDownInsets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      inline def setItemTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemTextStyle", value.asInstanceOf[js.Any])
      
      inline def setItemTextStyleNull: Self = StObject.set(x, "itemTextStyle", null)
      
      inline def setItemTextStyleUndefined: Self = StObject.set(x, "itemTextStyle", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "labelExtractor", js.Any.fromFunction2(value))
      
      inline def setLabelExtractorUndefined: Self = StObject.set(x, "labelExtractor", js.undefined)
      
      inline def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      inline def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction3(value))
      
      inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
      
      inline def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
      
      inline def setPropsExtractor(value: (/* item */ DropDownData, /* index */ Double) => PartialDropDownProps): Self = StObject.set(x, "propsExtractor", js.Any.fromFunction2(value))
      
      inline def setPropsExtractorUndefined: Self = StObject.set(x, "propsExtractor", js.undefined)
      
      inline def setRenderAccessory(value: () => Element): Self = StObject.set(x, "renderAccessory", js.Any.fromFunction0(value))
      
      inline def setRenderAccessoryUndefined: Self = StObject.set(x, "renderAccessory", js.undefined)
      
      inline def setRenderBase(value: /* props */ RenderBaseProps => Element): Self = StObject.set(x, "renderBase", js.Any.fromFunction1(value))
      
      inline def setRenderBaseUndefined: Self = StObject.set(x, "renderBase", js.undefined)
      
      inline def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      inline def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      inline def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      inline def setRippleInsets(value: DropDownInsets): Self = StObject.set(x, "rippleInsets", value.asInstanceOf[js.Any])
      
      inline def setRippleInsetsUndefined: Self = StObject.set(x, "rippleInsets", js.undefined)
      
      inline def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      inline def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      inline def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      inline def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      inline def setSelectedItemColor(value: String): Self = StObject.set(x, "selectedItemColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemColorUndefined: Self = StObject.set(x, "selectedItemColor", js.undefined)
      
      inline def setShadeOpacity(value: Double): Self = StObject.set(x, "shadeOpacity", value.asInstanceOf[js.Any])
      
      inline def setShadeOpacityUndefined: Self = StObject.set(x, "shadeOpacity", js.undefined)
      
      inline def setSupportedOrientations(value: js.Array[String]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      inline def setSupportedOrientationsVarargs(value: String*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "valueExtractor", js.Any.fromFunction2(value))
      
      inline def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RenderBaseProps
    extends StObject
       with DropDownProps {
    
    /** Title of dropdown */
    var title: String
  }
  object RenderBaseProps {
    
    inline def apply(data: js.Array[DropDownData], title: String): RenderBaseProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderBaseProps]
    }
    
    extension [Self <: RenderBaseProps](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
