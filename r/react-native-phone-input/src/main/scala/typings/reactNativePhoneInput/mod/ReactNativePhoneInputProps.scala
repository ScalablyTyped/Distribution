package typings.reactNativePhoneInput.mod

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactNativePhoneInputProps[TextComponentType /* <: ComponentType[js.Object] */] extends js.Object {
  
  /**
    * Allow user input 0 after country code
    */
  var allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom styles for country picker button
    */
  var buttonTextStyle: js.UndefOr[TextStyle] = js.native
  
  /**
    * Cancel word
    */
  var cancelText: js.UndefOr[String] = js.native
  
  /**
    * Confirm word
    */
  var confirmText: js.UndefOr[String] = js.native
  
  /**
    * Custom countries list
    */
  var countriesList: js.UndefOr[js.Array[CountriesListItem]] = js.native
  
  /**
    * If true, disable all interaction of this component
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom styles for flag image eg. {{width: 50, height: 30, borderWidth:0}}
    */
  var flagStyle: js.UndefOr[ViewStyle] = js.native
  
  /**
    * Initial selected country
    */
  var initialCountry: js.UndefOr[String] = js.native
  
  /**
    * Distance between flag and phone number
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Function to be invoked when phone number is changed
    */
  var onChangePhoneNumber: js.UndefOr[js.Function1[/* number */ String, Unit]] = js.native
  
  /**
    * Function to be invoked when cancelling country picker selection
    */
  var onPressCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function to be invoked when confirming country picker selection
    */
  var onPressConfirm: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function to be invoked when press on flag image
    */
  var onPressFlag: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function to be invoked when country picker is selected
    */
  var onSelectCountry: js.UndefOr[js.Function1[/* iso2 */ String, Unit]] = js.native
  
  /**
    * Set background color of country picker
    */
  var pickerBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Set button color of country picker
    */
  var pickerButtonColor: js.UndefOr[String] = js.native
  
  /**
    * Custom styles for text in country picker eg. {{fontSize: 14}}
    */
  var pickerItemStyle: js.UndefOr[ViewStyle] = js.native
  
  /**
    * Custom styles to be applied if supplied
    */
  var style: js.UndefOr[ViewStyle] = js.native
  
  /**
    * The input component to use
    */
  var textComponent: js.UndefOr[TextComponentType] = js.native
  
  /**
    * Properties for phone number text input eg. {{placeholder: 'Telephone number'}}
    */
  var textProps: js.UndefOr[ComponentProps[TextComponentType]] = js.native
  
  /**
    * Custom styles for phone number text input eg. {{fontSize: 14}}
    */
  var textStyle: js.UndefOr[TextStyle] = js.native
  
  /**
    * Initial phone number
    */
  var value: js.UndefOr[String] = js.native
}
object ReactNativePhoneInputProps {
  
  @scala.inline
  def apply[TextComponentType /* <: ComponentType[js.Object] */](): ReactNativePhoneInputProps[TextComponentType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativePhoneInputProps[TextComponentType]]
  }
  
  @scala.inline
  implicit class ReactNativePhoneInputPropsOps[Self <: ReactNativePhoneInputProps[_], TextComponentType /* <: ComponentType[js.Object] */] (val x: Self with ReactNativePhoneInputProps[TextComponentType]) extends AnyVal {
    
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
    def setAllowZeroAfterCountryCode(value: Boolean): Self = this.set("allowZeroAfterCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowZeroAfterCountryCode: Self = this.set("allowZeroAfterCountryCode", js.undefined)
    
    @scala.inline
    def setButtonTextStyle(value: TextStyle): Self = this.set("buttonTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonTextStyle: Self = this.set("buttonTextStyle", js.undefined)
    
    @scala.inline
    def setButtonTextStyleNull: Self = this.set("buttonTextStyle", null)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    
    @scala.inline
    def setCountriesListVarargs(value: CountriesListItem*): Self = this.set("countriesList", js.Array(value :_*))
    
    @scala.inline
    def setCountriesList(value: js.Array[CountriesListItem]): Self = this.set("countriesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountriesList: Self = this.set("countriesList", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFlagStyle(value: ViewStyle): Self = this.set("flagStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlagStyle: Self = this.set("flagStyle", js.undefined)
    
    @scala.inline
    def setFlagStyleNull: Self = this.set("flagStyle", null)
    
    @scala.inline
    def setInitialCountry(value: String): Self = this.set("initialCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialCountry: Self = this.set("initialCountry", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnChangePhoneNumber(value: /* number */ String => Unit): Self = this.set("onChangePhoneNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangePhoneNumber: Self = this.set("onChangePhoneNumber", js.undefined)
    
    @scala.inline
    def setOnPressCancel(value: () => Unit): Self = this.set("onPressCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPressCancel: Self = this.set("onPressCancel", js.undefined)
    
    @scala.inline
    def setOnPressConfirm(value: () => Unit): Self = this.set("onPressConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPressConfirm: Self = this.set("onPressConfirm", js.undefined)
    
    @scala.inline
    def setOnPressFlag(value: () => Unit): Self = this.set("onPressFlag", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPressFlag: Self = this.set("onPressFlag", js.undefined)
    
    @scala.inline
    def setOnSelectCountry(value: /* iso2 */ String => Unit): Self = this.set("onSelectCountry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectCountry: Self = this.set("onSelectCountry", js.undefined)
    
    @scala.inline
    def setPickerBackgroundColor(value: String): Self = this.set("pickerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerBackgroundColor: Self = this.set("pickerBackgroundColor", js.undefined)
    
    @scala.inline
    def setPickerButtonColor(value: String): Self = this.set("pickerButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerButtonColor: Self = this.set("pickerButtonColor", js.undefined)
    
    @scala.inline
    def setPickerItemStyle(value: ViewStyle): Self = this.set("pickerItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerItemStyle: Self = this.set("pickerItemStyle", js.undefined)
    
    @scala.inline
    def setPickerItemStyleNull: Self = this.set("pickerItemStyle", null)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTextComponent(value: TextComponentType): Self = this.set("textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComponent: Self = this.set("textComponent", js.undefined)
    
    @scala.inline
    def setTextProps(value: ComponentProps[TextComponentType]): Self = this.set("textProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextProps: Self = this.set("textProps", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
