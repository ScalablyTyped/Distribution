package typings.reactPhoneNumberInput

import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.react.mod.Component
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.mod.PhoneInputWithCountrySelectType
import typings.reactPhoneNumberInput.mod.Props
import typings.reactPhoneNumberInput.mod.State
import typings.reactPhoneNumberInput.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMod {
  
  @JSImport("react-phone-number-input/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-phone-number-input/min", JSImport.Default)
  @js.native
  open class default protected () extends Component[Props[DefaultInputComponentProps], State[Props[DefaultInputComponentProps]], Any] {
    def this(props: Props[DefaultInputComponentProps]) = this()
    def this(props: Props[DefaultInputComponentProps], context: Any) = this()
  }
  @JSImport("react-phone-number-input/min", JSImport.Default)
  @js.native
  val default: PhoneInputWithCountrySelectType[DefaultInputComponentProps] = js.native
  
  inline def formatPhoneNumber(value: Value): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatPhoneNumberIntl(value: Value): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPhoneNumberIntl")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCountries(): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")().asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any]).asInstanceOf[CountryCallingCode]
  
  inline def isPossiblePhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCountry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCountry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
