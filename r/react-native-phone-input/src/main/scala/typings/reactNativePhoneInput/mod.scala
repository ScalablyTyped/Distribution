package typings.reactNativePhoneInput

import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.StyleProp
import typings.reactNativePhoneInput.anon.TypeofTextInput
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-phone-input", JSImport.Default)
  @js.native
  open class default[TextComponentType /* <: ComponentType[js.Object] */] () extends ReactNativePhoneInput[TextComponentType]
  
  trait CountriesListItem extends StObject {
    
    var areaCodes: js.Array[String] | Null
    
    var dialCode: String
    
    var iso2: String
    
    var name: String
    
    var priority: Double
  }
  object CountriesListItem {
    
    inline def apply(dialCode: String, iso2: String, name: String, priority: Double): CountriesListItem = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], areaCodes = null)
      __obj.asInstanceOf[CountriesListItem]
    }
    
    extension [Self <: CountriesListItem](x: Self) {
      
      inline def setAreaCodes(value: js.Array[String]): Self = StObject.set(x, "areaCodes", value.asInstanceOf[js.Any])
      
      inline def setAreaCodesNull: Self = StObject.set(x, "areaCodes", null)
      
      inline def setAreaCodesVarargs(value: String*): Self = StObject.set(x, "areaCodes", js.Array(value*))
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickerData extends StObject {
    
    var dialCode: String
    
    var image: ImageRequireSource
    
    var iso2: String
    
    var key: Double
    
    var label: String
  }
  object PickerData {
    
    inline def apply(dialCode: String, image: ImageRequireSource, iso2: String, key: Double, label: String): PickerData = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerData]
    }
    
    extension [Self <: PickerData](x: Self) {
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ImageRequireSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactNativePhoneInput[TextComponentType /* <: ComponentType[js.Object] */]
    extends Component[ReactNativePhoneInputProps[TextComponentType], js.Object, Any] {
    
    /**
      * Blur the phone input
      */
    def blur(): Unit = js.native
    
    /**
      * Focus the phone input
      */
    def focus(): Unit = js.native
    
    /**
      * Return country object in country picker
      */
    def getAllCountries(): CountriesListItem = js.native
    
    /**
      * Return country dial code of current phone number
      */
    def getCountryCode(): String = js.native
    
    /**
      * Return flag image
      */
    def getFlag(iso2: String): ImageRequireSource = js.native
    
    /**
      * Return country iso code of current phone number
      */
    def getISOCode(): String = js.native
    
    /**
      * Return true type of current phone number
      */
    def getNumberType(): String = js.native
    
    /**
      * Return country object with flag image
      */
    def getPickerData(): PickerData = js.native
    
    /**
      * Return current phone number
      */
    def getValue(): String = js.native
    
    /**
      * Return true if current phone number is valid
      */
    def isValidNumber(): Boolean = js.native
    
    var picker: js.UndefOr[Ref[ThisType[ReactNativePhoneInput[TypeofTextInput]]]] = js.native
    
    /**
      * Set phone input to specific country
      */
    def selectCountry(iso2: String): Unit = js.native
  }
  
  trait ReactNativePhoneInputProps[TextComponentType /* <: ComponentType[js.Object] */] extends StObject {
    
    /**
      * Allow user input 0 after country code
      */
    var allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom styles for country picker button
      */
    var buttonTextStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Cancel word
      */
    var cancelText: js.UndefOr[String] = js.undefined
    
    /**
      * Confirm word
      */
    var confirmText: js.UndefOr[String] = js.undefined
    
    /**
      * Custom countries list
      */
    var countriesList: js.UndefOr[js.Array[CountriesListItem]] = js.undefined
    
    /**
      * If true, disable all interaction of this component
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom styles for flag image eg. {{width: 50, height: 30, borderWidth:0}}
      */
    var flagStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Initial selected country
      */
    var initialCountry: js.UndefOr[String] = js.undefined
    
    /**
      * Distance between flag and phone number
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to be invoked when phone number is changed
      */
    var onChangePhoneNumber: js.UndefOr[js.Function1[/* number */ String, Unit]] = js.undefined
    
    /**
      * Function to be invoked when cancelling country picker selection
      */
    var onPressCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Function to be invoked when confirming country picker selection
      */
    var onPressConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Function to be invoked when press on flag image
      */
    var onPressFlag: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Function to be invoked when country picker is selected
      */
    var onSelectCountry: js.UndefOr[js.Function1[/* iso2 */ String, Unit]] = js.undefined
    
    /**
      * Set background color of country picker
      */
    var pickerBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Set button color of country picker
      */
    var pickerButtonColor: js.UndefOr[String] = js.undefined
    
    /**
      * Custom styles for text in country picker eg. {{fontSize: 14}}
      */
    var pickerItemStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Custom styles to be applied if supplied
      */
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * The input component to use
      */
    var textComponent: js.UndefOr[TextComponentType] = js.undefined
    
    /**
      * Properties for phone number text input eg. {{placeholder: 'Telephone number'}}
      */
    var textProps: js.UndefOr[ComponentProps[TextComponentType]] = js.undefined
    
    /**
      * Custom styles for phone number text input eg. {{fontSize: 14}}
      */
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Initial phone number
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ReactNativePhoneInputProps {
    
    inline def apply[TextComponentType /* <: ComponentType[js.Object] */](): ReactNativePhoneInputProps[TextComponentType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativePhoneInputProps[TextComponentType]]
    }
    
    extension [Self <: ReactNativePhoneInputProps[?], TextComponentType /* <: ComponentType[js.Object] */](x: Self & ReactNativePhoneInputProps[TextComponentType]) {
      
      inline def setAllowZeroAfterCountryCode(value: Boolean): Self = StObject.set(x, "allowZeroAfterCountryCode", value.asInstanceOf[js.Any])
      
      inline def setAllowZeroAfterCountryCodeUndefined: Self = StObject.set(x, "allowZeroAfterCountryCode", js.undefined)
      
      inline def setButtonTextStyle(value: TextStyle): Self = StObject.set(x, "buttonTextStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonTextStyleNull: Self = StObject.set(x, "buttonTextStyle", null)
      
      inline def setButtonTextStyleUndefined: Self = StObject.set(x, "buttonTextStyle", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      inline def setCountriesList(value: js.Array[CountriesListItem]): Self = StObject.set(x, "countriesList", value.asInstanceOf[js.Any])
      
      inline def setCountriesListUndefined: Self = StObject.set(x, "countriesList", js.undefined)
      
      inline def setCountriesListVarargs(value: CountriesListItem*): Self = StObject.set(x, "countriesList", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlagStyle(value: ViewStyle): Self = StObject.set(x, "flagStyle", value.asInstanceOf[js.Any])
      
      inline def setFlagStyleNull: Self = StObject.set(x, "flagStyle", null)
      
      inline def setFlagStyleUndefined: Self = StObject.set(x, "flagStyle", js.undefined)
      
      inline def setInitialCountry(value: String): Self = StObject.set(x, "initialCountry", value.asInstanceOf[js.Any])
      
      inline def setInitialCountryUndefined: Self = StObject.set(x, "initialCountry", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnChangePhoneNumber(value: /* number */ String => Unit): Self = StObject.set(x, "onChangePhoneNumber", js.Any.fromFunction1(value))
      
      inline def setOnChangePhoneNumberUndefined: Self = StObject.set(x, "onChangePhoneNumber", js.undefined)
      
      inline def setOnPressCancel(value: () => Unit): Self = StObject.set(x, "onPressCancel", js.Any.fromFunction0(value))
      
      inline def setOnPressCancelUndefined: Self = StObject.set(x, "onPressCancel", js.undefined)
      
      inline def setOnPressConfirm(value: () => Unit): Self = StObject.set(x, "onPressConfirm", js.Any.fromFunction0(value))
      
      inline def setOnPressConfirmUndefined: Self = StObject.set(x, "onPressConfirm", js.undefined)
      
      inline def setOnPressFlag(value: () => Unit): Self = StObject.set(x, "onPressFlag", js.Any.fromFunction0(value))
      
      inline def setOnPressFlagUndefined: Self = StObject.set(x, "onPressFlag", js.undefined)
      
      inline def setOnSelectCountry(value: /* iso2 */ String => Unit): Self = StObject.set(x, "onSelectCountry", js.Any.fromFunction1(value))
      
      inline def setOnSelectCountryUndefined: Self = StObject.set(x, "onSelectCountry", js.undefined)
      
      inline def setPickerBackgroundColor(value: String): Self = StObject.set(x, "pickerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setPickerBackgroundColorUndefined: Self = StObject.set(x, "pickerBackgroundColor", js.undefined)
      
      inline def setPickerButtonColor(value: String): Self = StObject.set(x, "pickerButtonColor", value.asInstanceOf[js.Any])
      
      inline def setPickerButtonColorUndefined: Self = StObject.set(x, "pickerButtonColor", js.undefined)
      
      inline def setPickerItemStyle(value: ViewStyle): Self = StObject.set(x, "pickerItemStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerItemStyleNull: Self = StObject.set(x, "pickerItemStyle", null)
      
      inline def setPickerItemStyleUndefined: Self = StObject.set(x, "pickerItemStyle", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextComponent(value: TextComponentType): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      inline def setTextProps(value: ComponentProps[TextComponentType]): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
      
      inline def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TextStyle = StyleProp[typings.reactNative.mod.TextStyle]
  
  type ViewStyle = StyleProp[typings.reactNative.mod.ViewStyle]
}
