package typings.reactPhoneNumberInput

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.MetadataJson
import typings.libphonenumberJs.typesMod.PhoneNumber
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.reactPhoneNumberInput.anon.Labels
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.mod.Metadata
import typings.reactPhoneNumberInput.mod.State
import typings.reactPhoneNumberInput.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("react-phone-number-input/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-phone-number-input/core", JSImport.Default)
  @js.native
  open class default protected () extends Component[Props[DefaultInputComponentProps], State[Props[DefaultInputComponentProps]], Any] {
    def this(props: Props[DefaultInputComponentProps]) = this()
    def this(props: Props[DefaultInputComponentProps], context: Any) = this()
  }
  @JSImport("react-phone-number-input/core", JSImport.Default)
  @js.native
  val default: PhoneInputWithCountrySelectType[DefaultInputComponentProps] = js.native
  
  inline def formatPhoneNumber(value: Value, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumber")(value.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatPhoneNumberIntl(value: Value, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumberIntl")(value.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(metadata: MetadataJson): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode, metadata: MetadataJson): CountryCallingCode = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CountryCallingCode]
  
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCountry, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCountry, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parsePhoneNumber(text: String, defaultCountry: DefaultCallingCode, metadata: MetadataJson): js.UndefOr[PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PhoneNumber]]
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): js.UndefOr[PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PhoneNumber]]
  inline def parsePhoneNumber(text: String, metadata: MetadataJson): js.UndefOr[PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PhoneNumber]]
  
  type PhoneInputWithCountrySelectType[InputComponentProps] = ComponentClass[Props[InputComponentProps], State[Props[InputComponentProps]]]
  
  type Props[InputComponentProps] = typings.reactPhoneNumberInput.mod.Props[InputComponentProps] & Labels
}
