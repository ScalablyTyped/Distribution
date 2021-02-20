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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-dropdown", "Dropdown")
  @js.native
  class Dropdown protected ()
    extends PureComponent[DropDownProps, js.Object, js.Any] {
    def this(props: DropDownProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DropDownProps, context: js.Any) = this()
  }
  
  @js.native
  trait DropDownData extends StObject {
    
    /** Label to be shown */
    var label: js.UndefOr[String] = js.native
    
    /** Props for this item */
    var props: js.UndefOr[PartialDropDownPropsAbsoluteRTLLayout] = js.native
    
    /** Value of item */
    var value: String = js.native
  }
  object DropDownData {
    
    @scala.inline
    def apply(value: String): DropDownData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownData]
    }
    
    @scala.inline
    implicit class DropDownDataMutableBuilder[Self <: DropDownData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setProps(value: PartialDropDownPropsAbsoluteRTLLayout): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropDownInsets extends StObject {
    
    /** Bottom */
    var bottom: Double = js.native
    
    /** Left */
    var left: Double = js.native
    
    /** Right */
    var right: Double = js.native
    
    /** Top */
    var top: Double = js.native
  }
  object DropDownInsets {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): DropDownInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownInsets]
    }
    
    @scala.inline
    implicit class DropDownInsetsMutableBuilder[Self <: DropDownInsets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropDownMargins extends StObject {
    
    /** Maximum value */
    var max: Double = js.native
    
    /** Minimum value */
    var min: Double = js.native
  }
  object DropDownMargins {
    
    @scala.inline
    def apply(max: Double, min: Double): DropDownMargins = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownMargins]
    }
    
    @scala.inline
    implicit class DropDownMarginsMutableBuilder[Self <: DropDownMargins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropDownOffset extends StObject {
    
    /** Left offset */
    var left: Double = js.native
    
    /** Top offset */
    var top: Double = js.native
  }
  object DropDownOffset {
    
    @scala.inline
    def apply(left: Double, top: Double): DropDownOffset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownOffset]
    }
    
    @scala.inline
    implicit class DropDownOffsetMutableBuilder[Self <: DropDownOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropDownProps extends TouchableWithoutFeedbackProps {
    
    /** Enable RTL layout */
    var absoluteRTLLayout: js.UndefOr[Boolean] = js.native
    
    /** Animation duration (default: 225) */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /** Set base color (default: rgba(0, 0, 0, .38)) */
    var baseColor: js.UndefOr[String] = js.native
    
    /** Set container styles */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /** Dropdown data items */
    var data: js.Array[DropDownData] = js.native
    
    /** Set disabled item color */
    var disabledItemColor: js.UndefOr[String] = js.native
    
    /** Component disabled or not. (default: false) */
    @JSName("disabled")
    var disabled_DropDownProps: js.UndefOr[Boolean] = js.native
    
    /** Provide Dropdown margins */
    var dropdownMargins: js.UndefOr[DropDownMargins] = js.native
    
    /** Provide Dropdown top-left position */
    var dropdownOffset: js.UndefOr[DropDownOffset] = js.native
    
    /** Provide dropdown position (dynamic if undefined) */
    var dropdownPosition: js.UndefOr[Double] = js.native
    
    /** Set font size of dropdown items (default: 16) */
    var fontSize: js.UndefOr[Double] = js.native
    
    /** Hitslop insets (default: { top: 6, right: 4, bottom: 6, left: 4 }) */
    @JSName("hitSlop")
    var hitSlop_DropDownProps: js.UndefOr[DropDownInsets] = js.native
    
    /** Set input container styles */
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /** Set Item color (default: rgba(0, 0, 0, .54)) */
    var itemColor: js.UndefOr[String] = js.native
    
    /** Set Item count (default: 4) */
    var itemCount: js.UndefOr[Double] = js.native
    
    /** Set Item padding (default: 8) */
    var itemPadding: js.UndefOr[Double] = js.native
    
    /** Set Item text style. */
    var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    /** Label to be shown for dropdown */
    var label: js.UndefOr[String] = js.native
    
    /** Label extractor function. Extract label from item. */
    var labelExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.native
    
    /** Set font size of label (default: 12) */
    var labelFontSize: js.UndefOr[Double] = js.native
    
    /** Set the label styles */
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    /** Event: When focus lost from dropdown */
    @JSName("onBlur")
    var onBlur_DropDownProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Event: When change selected item */
    var onChangeText: js.UndefOr[
        js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData], Unit]
      ] = js.native
    
    /** Event: When dropdown opens */
    @JSName("onFocus")
    var onFocus_DropDownProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Set overlay styles */
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /** Set picker styles */
    var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /** Props extractor function. Extract props from item. */
    var propsExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, PartialDropDownProps]] = js.native
    
    /** Render text field accessory */
    var renderAccessory: js.UndefOr[js.Function0[Element]] = js.native
    
    /** Render base component */
    var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, Element]] = js.native
    
    /** Whether ripple be centered or not (default: false) */
    var rippleCentered: js.UndefOr[Boolean] = js.native
    
    /** Provide Ripple color */
    var rippleColor: js.UndefOr[String] = js.native
    
    /** Ripple duration (defailt: 400) */
    var rippleDuration: js.UndefOr[Double] = js.native
    
    /** Ripple insets  */
    var rippleInsets: js.UndefOr[DropDownInsets] = js.native
    
    /** Ripple opacity (default: 0.54) */
    var rippleOpacity: js.UndefOr[Double] = js.native
    
    /** Whether ripple rendered in sequential order (default: false)  */
    var rippleSequential: js.UndefOr[Boolean] = js.native
    
    /** Set selected item color */
    var selectedItemColor: js.UndefOr[String] = js.native
    
    /** Shade opacity (default: 0.12) */
    var shadeOpacity: js.UndefOr[Double] = js.native
    
    /** Specify which orientations are supported. (default: ['portrait', 'portrait-upside-down', 'landscape', 'landscape-left', 'landscape-right']) */
    var supportedOrientations: js.UndefOr[js.Array[String]] = js.native
    
    /** Set Text color (default: rgba(0, 0, 0, .87)) */
    var textColor: js.UndefOr[String] = js.native
    
    /** Use native driver (default: false) */
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    /** Selected value */
    var value: js.UndefOr[String | Double] = js.native
    
    /** Value extractor function. Extract value from item. */
    var valueExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.native
  }
  object DropDownProps {
    
    @scala.inline
    def apply(data: js.Array[DropDownData]): DropDownProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownProps]
    }
    
    @scala.inline
    implicit class DropDownPropsMutableBuilder[Self <: DropDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteRTLLayout(value: Boolean): Self = StObject.set(x, "absoluteRTLLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteRTLLayoutUndefined: Self = StObject.set(x, "absoluteRTLLayout", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[DropDownData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: DropDownData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemColor(value: String): Self = StObject.set(x, "disabledItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemColorUndefined: Self = StObject.set(x, "disabledItemColor", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownMargins(value: DropDownMargins): Self = StObject.set(x, "dropdownMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMarginsUndefined: Self = StObject.set(x, "dropdownMargins", js.undefined)
      
      @scala.inline
      def setDropdownOffset(value: DropDownOffset): Self = StObject.set(x, "dropdownOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownOffsetUndefined: Self = StObject.set(x, "dropdownOffset", js.undefined)
      
      @scala.inline
      def setDropdownPosition(value: Double): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPositionUndefined: Self = StObject.set(x, "dropdownPosition", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHitSlop(value: DropDownInsets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      @scala.inline
      def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      @scala.inline
      def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      @scala.inline
      def setItemTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTextStyleNull: Self = StObject.set(x, "itemTextStyle", null)
      
      @scala.inline
      def setItemTextStyleUndefined: Self = StObject.set(x, "itemTextStyle", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "labelExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLabelExtractorUndefined: Self = StObject.set(x, "labelExtractor", js.undefined)
      
      @scala.inline
      def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      @scala.inline
      def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
      
      @scala.inline
      def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
      
      @scala.inline
      def setPropsExtractor(value: (/* item */ DropDownData, /* index */ Double) => PartialDropDownProps): Self = StObject.set(x, "propsExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropsExtractorUndefined: Self = StObject.set(x, "propsExtractor", js.undefined)
      
      @scala.inline
      def setRenderAccessory(value: () => Element): Self = StObject.set(x, "renderAccessory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderAccessoryUndefined: Self = StObject.set(x, "renderAccessory", js.undefined)
      
      @scala.inline
      def setRenderBase(value: /* props */ RenderBaseProps => Element): Self = StObject.set(x, "renderBase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBaseUndefined: Self = StObject.set(x, "renderBase", js.undefined)
      
      @scala.inline
      def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      @scala.inline
      def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      @scala.inline
      def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      @scala.inline
      def setRippleInsets(value: DropDownInsets): Self = StObject.set(x, "rippleInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleInsetsUndefined: Self = StObject.set(x, "rippleInsets", js.undefined)
      
      @scala.inline
      def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      @scala.inline
      def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      @scala.inline
      def setSelectedItemColor(value: String): Self = StObject.set(x, "selectedItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemColorUndefined: Self = StObject.set(x, "selectedItemColor", js.undefined)
      
      @scala.inline
      def setShadeOpacity(value: Double): Self = StObject.set(x, "shadeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadeOpacityUndefined: Self = StObject.set(x, "shadeOpacity", js.undefined)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[String]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: String*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "valueExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RenderBaseProps extends DropDownProps {
    
    /** Title of dropdown */
    var title: String = js.native
  }
  object RenderBaseProps {
    
    @scala.inline
    def apply(data: js.Array[DropDownData], title: String): RenderBaseProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderBaseProps]
    }
    
    @scala.inline
    implicit class RenderBasePropsMutableBuilder[Self <: RenderBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
