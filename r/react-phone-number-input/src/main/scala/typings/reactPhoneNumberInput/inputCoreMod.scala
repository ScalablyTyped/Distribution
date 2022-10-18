package typings.reactPhoneNumberInput

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.MetadataJson
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.mod.Metadata
import typings.reactPhoneNumberInput.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputCoreMod {
  
  @JSImport("react-phone-number-input/input-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-phone-number-input/input-core", JSImport.Default)
  @js.native
  val default: PhoneInputComponentType[DefaultInputComponentProps] = js.native
  
  inline def formatPhoneNumber(value: Value, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumber")(value.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatPhoneNumberIntl(value: Value, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumberIntl")(value.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(metadata: MetadataJson): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode, metadata: MetadataJson): CountryCallingCode = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CountryCallingCode]
  
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCallingCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCallingCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type PhoneInputComponentType[InputComponentProps] = js.Function1[/* props */ Props[InputComponentProps], Element]
  
  type Props[InputComponentProps] = typings.reactPhoneNumberInput.inputMod.Props[InputComponentProps] & typings.reactPhoneNumberInput.anon.Metadata
}
