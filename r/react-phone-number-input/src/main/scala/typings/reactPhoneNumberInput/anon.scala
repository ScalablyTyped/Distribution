package typings.reactPhoneNumberInput

import typings.react.mod.ComponentClass
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.reactPhoneNumberInput.inputMod.InputComponent
import typings.reactPhoneNumberInput.mod.CountryOption
import typings.reactPhoneNumberInput.mod.Flag
import typings.reactPhoneNumberInput.mod.FlagProps
import typings.reactPhoneNumberInput.mod.Flags
import typings.reactPhoneNumberInput.mod.Locale
import typings.reactPhoneNumberInput.mod.LocaleProperty
import typings.reactPhoneNumberInput.mod.Value
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.national
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var metadata: js.UndefOr[typings.reactPhoneNumberInput.mod.Metadata] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: typings.reactPhoneNumberInput.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait AddInternationalOption extends StObject {
    
    var addInternationalOption: js.UndefOr[Boolean] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var countries: js.UndefOr[js.Array[typings.reactPhoneNumberInput.mod.Country]] = js.undefined
    
    var countryCallingCodeEditable: js.UndefOr[Boolean] = js.undefined
    
    var countryOptionsOrder: js.UndefOr[js.Array[CountryOption]] = js.undefined
    
    var countrySelectComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var countrySelectProps: js.UndefOr[js.Object] = js.undefined
    
    var defaultCountry: js.UndefOr[typings.reactPhoneNumberInput.mod.Country] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var flagComponent: js.UndefOr[Flag] = js.undefined
    
    var flagUrl: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[Flags] = js.undefined
    
    var focusInputOnCountrySelection: js.UndefOr[Boolean] = js.undefined
    
    var initialValueFormat: js.UndefOr[national] = js.undefined
    
    var inputComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var international: js.UndefOr[Boolean] = js.undefined
    
    var internationalIcon: js.UndefOr[ElementType[Any]] = js.undefined
    
    var labels: js.UndefOr[typings.reactPhoneNumberInput.mod.Labels] = js.undefined
    
    var limitMaxLength: js.UndefOr[Boolean] = js.undefined
    
    var locales: js.UndefOr[LocaleProperty] = js.undefined
    
    var numberInputProps: js.UndefOr[js.Object] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement, Element], Unit]] = js.undefined
    
    var onCountryChange: js.UndefOr[
        js.Function1[/* country */ js.UndefOr[typings.reactPhoneNumberInput.mod.Country], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement, Element], Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var smartCaret: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object AddInternationalOption {
    
    inline def apply(): AddInternationalOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddInternationalOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddInternationalOption] (val x: Self) extends AnyVal {
      
      inline def setAddInternationalOption(value: Boolean): Self = StObject.set(x, "addInternationalOption", value.asInstanceOf[js.Any])
      
      inline def setAddInternationalOptionUndefined: Self = StObject.set(x, "addInternationalOption", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerComponent(value: ElementType[Any]): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
      
      inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
      
      inline def setCountries(value: js.Array[typings.reactPhoneNumberInput.mod.Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setCountriesVarargs(value: typings.reactPhoneNumberInput.mod.Country*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setCountryCallingCodeEditable(value: Boolean): Self = StObject.set(x, "countryCallingCodeEditable", value.asInstanceOf[js.Any])
      
      inline def setCountryCallingCodeEditableUndefined: Self = StObject.set(x, "countryCallingCodeEditable", js.undefined)
      
      inline def setCountryOptionsOrder(value: js.Array[CountryOption]): Self = StObject.set(x, "countryOptionsOrder", value.asInstanceOf[js.Any])
      
      inline def setCountryOptionsOrderUndefined: Self = StObject.set(x, "countryOptionsOrder", js.undefined)
      
      inline def setCountryOptionsOrderVarargs(value: CountryOption*): Self = StObject.set(x, "countryOptionsOrder", js.Array(value*))
      
      inline def setCountrySelectComponent(value: ElementType[Any]): Self = StObject.set(x, "countrySelectComponent", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectComponentUndefined: Self = StObject.set(x, "countrySelectComponent", js.undefined)
      
      inline def setCountrySelectProps(value: js.Object): Self = StObject.set(x, "countrySelectProps", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectPropsUndefined: Self = StObject.set(x, "countrySelectProps", js.undefined)
      
      inline def setDefaultCountry(value: typings.reactPhoneNumberInput.mod.Country): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlagComponent(value: /* props */ FlagProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "flagComponent", js.Any.fromFunction1(value))
      
      inline def setFlagComponentUndefined: Self = StObject.set(x, "flagComponent", js.undefined)
      
      inline def setFlagUrl(value: String): Self = StObject.set(x, "flagUrl", value.asInstanceOf[js.Any])
      
      inline def setFlagUrlUndefined: Self = StObject.set(x, "flagUrl", js.undefined)
      
      inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFocusInputOnCountrySelection(value: Boolean): Self = StObject.set(x, "focusInputOnCountrySelection", value.asInstanceOf[js.Any])
      
      inline def setFocusInputOnCountrySelectionUndefined: Self = StObject.set(x, "focusInputOnCountrySelection", js.undefined)
      
      inline def setInitialValueFormat(value: national): Self = StObject.set(x, "initialValueFormat", value.asInstanceOf[js.Any])
      
      inline def setInitialValueFormatUndefined: Self = StObject.set(x, "initialValueFormat", js.undefined)
      
      inline def setInputComponent(value: ElementType[Any]): Self = StObject.set(x, "inputComponent", value.asInstanceOf[js.Any])
      
      inline def setInputComponentUndefined: Self = StObject.set(x, "inputComponent", js.undefined)
      
      inline def setInternational(value: Boolean): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
      
      inline def setInternationalIcon(value: ElementType[Any]): Self = StObject.set(x, "internationalIcon", value.asInstanceOf[js.Any])
      
      inline def setInternationalIconUndefined: Self = StObject.set(x, "internationalIcon", js.undefined)
      
      inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
      
      inline def setLabels(value: typings.reactPhoneNumberInput.mod.Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLimitMaxLength(value: Boolean): Self = StObject.set(x, "limitMaxLength", value.asInstanceOf[js.Any])
      
      inline def setLimitMaxLengthUndefined: Self = StObject.set(x, "limitMaxLength", js.undefined)
      
      inline def setLocales(value: LocaleProperty): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setNumberInputProps(value: js.Object): Self = StObject.set(x, "numberInputProps", value.asInstanceOf[js.Any])
      
      inline def setNumberInputPropsUndefined: Self = StObject.set(x, "numberInputProps", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCountryChange(value: /* country */ js.UndefOr[typings.reactPhoneNumberInput.mod.Country] => Unit): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOnCountryChangeUndefined: Self = StObject.set(x, "onCountryChange", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSmartCaret(value: Boolean): Self = StObject.set(x, "smartCaret", value.asInstanceOf[js.Any])
      
      inline def setSmartCaretUndefined: Self = StObject.set(x, "smartCaret", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Country[InputComponentProps] extends StObject {
    
    var country: js.UndefOr[typings.reactPhoneNumberInput.mod.Country] = js.undefined
    
    var defaultCountry: js.UndefOr[typings.reactPhoneNumberInput.mod.Country] = js.undefined
    
    var inputComponent: js.UndefOr[InputComponent[InputComponentProps]] = js.undefined
    
    var international: js.UndefOr[Boolean] = js.undefined
    
    var useNationalFormatForDefaultCountryValue: js.UndefOr[Boolean] = js.undefined
    
    var withCountryCallingCode: js.UndefOr[Boolean] = js.undefined
  }
  object Country {
    
    inline def apply[InputComponentProps](): Country[InputComponentProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Country[InputComponentProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Country[?], InputComponentProps] (val x: Self & Country[InputComponentProps]) extends AnyVal {
      
      inline def setCountry(value: typings.reactPhoneNumberInput.mod.Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDefaultCountry(value: typings.reactPhoneNumberInput.mod.Country): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setInputComponent(
        value: InputComponentProps => typings.react.mod.global.JSX.Element | (ComponentClass[InputComponentProps, Any])
      ): Self = StObject.set(x, "inputComponent", js.Any.fromFunction1(value))
      
      inline def setInputComponentUndefined: Self = StObject.set(x, "inputComponent", js.undefined)
      
      inline def setInternational(value: Boolean): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
      
      inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
      
      inline def setUseNationalFormatForDefaultCountryValue(value: Boolean): Self = StObject.set(x, "useNationalFormatForDefaultCountryValue", value.asInstanceOf[js.Any])
      
      inline def setUseNationalFormatForDefaultCountryValueUndefined: Self = StObject.set(x, "useNationalFormatForDefaultCountryValue", js.undefined)
      
      inline def setWithCountryCallingCode(value: Boolean): Self = StObject.set(x, "withCountryCallingCode", value.asInstanceOf[js.Any])
      
      inline def setWithCountryCallingCodeUndefined: Self = StObject.set(x, "withCountryCallingCode", js.undefined)
    }
  }
  
  trait Labels extends StObject {
    
    var labels: typings.reactPhoneNumberInput.mod.Labels
    
    var metadata: typings.reactPhoneNumberInput.mod.Metadata
  }
  object Labels {
    
    inline def apply(
      labels: typings.reactPhoneNumberInput.mod.Labels,
      metadata: typings.reactPhoneNumberInput.mod.Metadata
    ): Labels = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      inline def setLabels(value: typings.reactPhoneNumberInput.mod.Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: typings.reactPhoneNumberInput.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var metadata: typings.reactPhoneNumberInput.mod.Metadata
  }
  object Metadata {
    
    inline def apply(metadata: typings.reactPhoneNumberInput.mod.Metadata): Metadata = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: typings.reactPhoneNumberInput.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnChange extends StObject {
    
    def onChange(): Unit = js.native
    def onChange(value: Value): Unit = js.native
    
    var value: js.UndefOr[Value] = js.native
  }
  
  trait OnChangeText extends StObject {
    
    def onChangeText(value: Value): Unit
    
    var value: Value
  }
  object OnChangeText {
    
    inline def apply(onChangeText: Value => Unit, value: Value): OnChangeText = {
      val __obj = js.Dynamic.literal(onChangeText = js.Any.fromFunction1(onChangeText), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangeText] (val x: Self) extends AnyVal {
      
      inline def setOnChangeText(value: Value => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmartCaret extends StObject {
    
    var smartCaret: js.UndefOr[Boolean] = js.undefined
  }
  object SmartCaret {
    
    inline def apply(): SmartCaret = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartCaret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmartCaret] (val x: Self) extends AnyVal {
      
      inline def setSmartCaret(value: Boolean): Self = StObject.set(x, "smartCaret", value.asInstanceOf[js.Any])
      
      inline def setSmartCaretUndefined: Self = StObject.set(x, "smartCaret", js.undefined)
    }
  }
}
