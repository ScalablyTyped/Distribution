package typings.reactPhoneNumberInput

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.react.mod.ComponentClass
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.anon.Country
import typings.reactPhoneNumberInput.anon.OnChange
import typings.reactPhoneNumberInput.anon.SmartCaret
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.mod.Value
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.onChange
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.value
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("react-phone-number-input/input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-phone-number-input/input", JSImport.Default)
  @js.native
  val default: PhoneInputComponentType[DefaultInputComponentProps] = js.native
  
  inline def formatPhoneNumber(value: Value): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatPhoneNumberIntl(value: Value): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumberIntl")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCountries(): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")().asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any]).asInstanceOf[CountryCallingCode]
  
  inline def isPossiblePhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCallingCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCallingCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type FeatureProps[InputComponentProps] = FeaturePropsWithoutSmartCaret[InputComponentProps] & SmartCaret
  
  type FeaturePropsWithoutSmartCaret[InputComponentProps] = (Omit[InputComponentProps, value | onChange]) & Country[InputComponentProps]
  
  type InputComponent[InputComponentProps] = js.Function1[
    /* props */ InputComponentProps, 
    Element | (ComponentClass[InputComponentProps, Any])
  ]
  
  type PhoneInputComponentType[InputComponentProps] = js.Function1[/* props */ Props[InputComponentProps], Element]
  
  type Props[InputComponentProps] = PropsWithoutSmartCaret[InputComponentProps] & SmartCaret
  
  type PropsWithoutSmartCaret[InputComponentProps] = FeaturePropsWithoutSmartCaret[InputComponentProps] & OnChange
}
