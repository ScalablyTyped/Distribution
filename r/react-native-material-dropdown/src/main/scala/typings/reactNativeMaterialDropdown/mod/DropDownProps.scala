package typings.reactNativeMaterialDropdown.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialDropdown.anon.PartialDropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DropDownPropsOps[Self <: DropDownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: DropDownData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DropDownData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteRTLLayout(value: Boolean): Self = this.set("absoluteRTLLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteRTLLayout: Self = this.set("absoluteRTLLayout", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBaseColor(value: String): Self = this.set("baseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseColor: Self = this.set("baseColor", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledItemColor(value: String): Self = this.set("disabledItemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledItemColor: Self = this.set("disabledItemColor", js.undefined)
    @scala.inline
    def setDropdownMargins(value: DropDownMargins): Self = this.set("dropdownMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMargins: Self = this.set("dropdownMargins", js.undefined)
    @scala.inline
    def setDropdownOffset(value: DropDownOffset): Self = this.set("dropdownOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownOffset: Self = this.set("dropdownOffset", js.undefined)
    @scala.inline
    def setDropdownPosition(value: Double): Self = this.set("dropdownPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownPosition: Self = this.set("dropdownPosition", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setHitSlop(value: DropDownInsets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    @scala.inline
    def setInputContainerStyleNull: Self = this.set("inputContainerStyle", null)
    @scala.inline
    def setItemColor(value: String): Self = this.set("itemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemColor: Self = this.set("itemColor", js.undefined)
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    @scala.inline
    def setItemPadding(value: Double): Self = this.set("itemPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemPadding: Self = this.set("itemPadding", js.undefined)
    @scala.inline
    def setItemTextStyle(value: StyleProp[TextStyle]): Self = this.set("itemTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTextStyle: Self = this.set("itemTextStyle", js.undefined)
    @scala.inline
    def setItemTextStyleNull: Self = this.set("itemTextStyle", null)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = this.set("labelExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLabelExtractor: Self = this.set("labelExtractor", js.undefined)
    @scala.inline
    def setLabelFontSize(value: Double): Self = this.set("labelFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFontSize: Self = this.set("labelFontSize", js.undefined)
    @scala.inline
    def setLabelTextStyle(value: StyleProp[TextStyle]): Self = this.set("labelTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextStyle: Self = this.set("labelTextStyle", js.undefined)
    @scala.inline
    def setLabelTextStyleNull: Self = this.set("labelTextStyle", null)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): Self = this.set("onChangeText", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
    @scala.inline
    def setPickerStyle(value: StyleProp[ViewStyle]): Self = this.set("pickerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerStyle: Self = this.set("pickerStyle", js.undefined)
    @scala.inline
    def setPickerStyleNull: Self = this.set("pickerStyle", null)
    @scala.inline
    def setPropsExtractor(value: (/* item */ DropDownData, /* index */ Double) => PartialDropDownProps): Self = this.set("propsExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deletePropsExtractor: Self = this.set("propsExtractor", js.undefined)
    @scala.inline
    def setRenderAccessory(value: () => Element): Self = this.set("renderAccessory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderAccessory: Self = this.set("renderAccessory", js.undefined)
    @scala.inline
    def setRenderBase(value: /* props */ RenderBaseProps => Element): Self = this.set("renderBase", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderBase: Self = this.set("renderBase", js.undefined)
    @scala.inline
    def setRippleCentered(value: Boolean): Self = this.set("rippleCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleCentered: Self = this.set("rippleCentered", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setRippleDuration(value: Double): Self = this.set("rippleDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleDuration: Self = this.set("rippleDuration", js.undefined)
    @scala.inline
    def setRippleInsets(value: DropDownInsets): Self = this.set("rippleInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleInsets: Self = this.set("rippleInsets", js.undefined)
    @scala.inline
    def setRippleOpacity(value: Double): Self = this.set("rippleOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleOpacity: Self = this.set("rippleOpacity", js.undefined)
    @scala.inline
    def setRippleSequential(value: Boolean): Self = this.set("rippleSequential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleSequential: Self = this.set("rippleSequential", js.undefined)
    @scala.inline
    def setSelectedItemColor(value: String): Self = this.set("selectedItemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemColor: Self = this.set("selectedItemColor", js.undefined)
    @scala.inline
    def setShadeOpacity(value: Double): Self = this.set("shadeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadeOpacity: Self = this.set("shadeOpacity", js.undefined)
    @scala.inline
    def setSupportedOrientationsVarargs(value: String*): Self = this.set("supportedOrientations", js.Array(value :_*))
    @scala.inline
    def setSupportedOrientations(value: js.Array[String]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = this.set("valueExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValueExtractor: Self = this.set("valueExtractor", js.undefined)
  }
  
}

