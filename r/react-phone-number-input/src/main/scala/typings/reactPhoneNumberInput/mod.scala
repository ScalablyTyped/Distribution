package typings.reactPhoneNumberInput

import org.scalablytyped.runtime.StringDictionary
import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.E164Number
import typings.libphonenumberJs.typesMod.MetadataJson
import typings.libphonenumberJs.typesMod.PhoneNumber
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.anon.AddInternationalOption
import typings.reactPhoneNumberInput.anon.OnChange
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.onChange
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.value
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-phone-number-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-phone-number-input", JSImport.Default)
  @js.native
  open class default protected () extends Component[Props[DefaultInputComponentProps], State[Props[DefaultInputComponentProps]], Any] {
    def this(props: Props[DefaultInputComponentProps]) = this()
    def this(props: Props[DefaultInputComponentProps], context: Any) = this()
  }
  @JSImport("react-phone-number-input", JSImport.Default)
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
  
  inline def parsePhoneNumber(text: String): js.UndefOr[PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PhoneNumber]]
  inline def parsePhoneNumber(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PhoneNumber]]
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode): js.UndefOr[PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PhoneNumber]]
  
  type Country = CountryCode
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.XX
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.Highsurrogatesd83cLowsurrogatesdf10
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.Verticalline
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.DotDotDot
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.Horizontalellipsis
    - typings.reactPhoneNumberInput.mod.Country
  */
  type CountryOption = _CountryOption | Country
  
  type DefaultInputComponentProps = StringDictionary[Any]
  
  type EmbeddedFlag = js.Function1[/* props */ EmbeddedFlagProps, Element]
  
  trait EmbeddedFlagProps extends StObject {
    
    var title: String
  }
  object EmbeddedFlagProps {
    
    inline def apply(title: String): EmbeddedFlagProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbeddedFlagProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmbeddedFlagProps] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type FeatureProps[InputComponentProps] = (Omit[InputComponentProps, value | onChange]) & AddInternationalOption
  
  type Flag = js.Function1[/* props */ FlagProps, Element]
  
  trait FlagProps extends StObject {
    
    var country: Country
    
    var countryName: String
    
    var flagUrl: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[Flags] = js.undefined
  }
  object FlagProps {
    
    inline def apply(country: Country, countryName: String): FlagProps = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagProps] (val x: Self) extends AnyVal {
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
      
      inline def setFlagUrl(value: String): Self = StObject.set(x, "flagUrl", value.asInstanceOf[js.Any])
      
      inline def setFlagUrlUndefined: Self = StObject.set(x, "flagUrl", js.undefined)
      
      inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<react-phone-number-input.react-phone-number-input.Country, react-phone-number-input.react-phone-number-input.EmbeddedFlag>> */
  trait Flags extends StObject {
    
    var AC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AX: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var AZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BB: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BJ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BQ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var BZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CV: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CX: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var CZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var DE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var DJ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var DK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var DM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var DO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var DZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var EC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var EE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var EG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var EH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ER: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ES: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ET: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var FI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var FJ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var FK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var FM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var FO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var FR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GB: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GP: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GQ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var GY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var HK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var HN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var HR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var HT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var HU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ID: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IQ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var IT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var JE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var JM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var JO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var JP: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KP: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var KZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LB: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LV: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var LY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ME: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ML: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MP: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MQ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MV: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MX: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var MZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NP: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var NZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var OM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var PY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var QA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var RE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var RO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var RS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var RU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var RW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SB: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SJ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ST: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SV: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SX: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var SZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TD: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TH: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TJ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TL: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TO: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TR: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TV: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TW: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var TZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var UA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var UG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var US: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var UY: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var UZ: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VC: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VG: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VI: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VN: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var VU: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var WF: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var WS: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var XK: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var YE: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var YT: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ZA: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ZM: js.UndefOr[EmbeddedFlag] = js.undefined
    
    var ZW: js.UndefOr[EmbeddedFlag] = js.undefined
  }
  object Flags {
    
    inline def apply(): Flags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      inline def setAC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AC", js.Any.fromFunction1(value))
      
      inline def setACUndefined: Self = StObject.set(x, "AC", js.undefined)
      
      inline def setAD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AD", js.Any.fromFunction1(value))
      
      inline def setADUndefined: Self = StObject.set(x, "AD", js.undefined)
      
      inline def setAE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AE", js.Any.fromFunction1(value))
      
      inline def setAEUndefined: Self = StObject.set(x, "AE", js.undefined)
      
      inline def setAF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AF", js.Any.fromFunction1(value))
      
      inline def setAFUndefined: Self = StObject.set(x, "AF", js.undefined)
      
      inline def setAG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AG", js.Any.fromFunction1(value))
      
      inline def setAGUndefined: Self = StObject.set(x, "AG", js.undefined)
      
      inline def setAI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AI", js.Any.fromFunction1(value))
      
      inline def setAIUndefined: Self = StObject.set(x, "AI", js.undefined)
      
      inline def setAL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AL", js.Any.fromFunction1(value))
      
      inline def setALUndefined: Self = StObject.set(x, "AL", js.undefined)
      
      inline def setAM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AM", js.Any.fromFunction1(value))
      
      inline def setAMUndefined: Self = StObject.set(x, "AM", js.undefined)
      
      inline def setAO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AO", js.Any.fromFunction1(value))
      
      inline def setAOUndefined: Self = StObject.set(x, "AO", js.undefined)
      
      inline def setAR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AR", js.Any.fromFunction1(value))
      
      inline def setARUndefined: Self = StObject.set(x, "AR", js.undefined)
      
      inline def setAS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AS", js.Any.fromFunction1(value))
      
      inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
      
      inline def setAT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AT", js.Any.fromFunction1(value))
      
      inline def setATUndefined: Self = StObject.set(x, "AT", js.undefined)
      
      inline def setAU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AU", js.Any.fromFunction1(value))
      
      inline def setAUUndefined: Self = StObject.set(x, "AU", js.undefined)
      
      inline def setAW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AW", js.Any.fromFunction1(value))
      
      inline def setAWUndefined: Self = StObject.set(x, "AW", js.undefined)
      
      inline def setAX(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AX", js.Any.fromFunction1(value))
      
      inline def setAXUndefined: Self = StObject.set(x, "AX", js.undefined)
      
      inline def setAZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "AZ", js.Any.fromFunction1(value))
      
      inline def setAZUndefined: Self = StObject.set(x, "AZ", js.undefined)
      
      inline def setBA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BA", js.Any.fromFunction1(value))
      
      inline def setBAUndefined: Self = StObject.set(x, "BA", js.undefined)
      
      inline def setBB(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BB", js.Any.fromFunction1(value))
      
      inline def setBBUndefined: Self = StObject.set(x, "BB", js.undefined)
      
      inline def setBD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BD", js.Any.fromFunction1(value))
      
      inline def setBDUndefined: Self = StObject.set(x, "BD", js.undefined)
      
      inline def setBE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BE", js.Any.fromFunction1(value))
      
      inline def setBEUndefined: Self = StObject.set(x, "BE", js.undefined)
      
      inline def setBF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BF", js.Any.fromFunction1(value))
      
      inline def setBFUndefined: Self = StObject.set(x, "BF", js.undefined)
      
      inline def setBG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BG", js.Any.fromFunction1(value))
      
      inline def setBGUndefined: Self = StObject.set(x, "BG", js.undefined)
      
      inline def setBH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BH", js.Any.fromFunction1(value))
      
      inline def setBHUndefined: Self = StObject.set(x, "BH", js.undefined)
      
      inline def setBI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BI", js.Any.fromFunction1(value))
      
      inline def setBIUndefined: Self = StObject.set(x, "BI", js.undefined)
      
      inline def setBJ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BJ", js.Any.fromFunction1(value))
      
      inline def setBJUndefined: Self = StObject.set(x, "BJ", js.undefined)
      
      inline def setBL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BL", js.Any.fromFunction1(value))
      
      inline def setBLUndefined: Self = StObject.set(x, "BL", js.undefined)
      
      inline def setBM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BM", js.Any.fromFunction1(value))
      
      inline def setBMUndefined: Self = StObject.set(x, "BM", js.undefined)
      
      inline def setBN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BN", js.Any.fromFunction1(value))
      
      inline def setBNUndefined: Self = StObject.set(x, "BN", js.undefined)
      
      inline def setBO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BO", js.Any.fromFunction1(value))
      
      inline def setBOUndefined: Self = StObject.set(x, "BO", js.undefined)
      
      inline def setBQ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BQ", js.Any.fromFunction1(value))
      
      inline def setBQUndefined: Self = StObject.set(x, "BQ", js.undefined)
      
      inline def setBR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BR", js.Any.fromFunction1(value))
      
      inline def setBRUndefined: Self = StObject.set(x, "BR", js.undefined)
      
      inline def setBS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BS", js.Any.fromFunction1(value))
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BT", js.Any.fromFunction1(value))
      
      inline def setBTUndefined: Self = StObject.set(x, "BT", js.undefined)
      
      inline def setBW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BW", js.Any.fromFunction1(value))
      
      inline def setBWUndefined: Self = StObject.set(x, "BW", js.undefined)
      
      inline def setBY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BY", js.Any.fromFunction1(value))
      
      inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
      
      inline def setBZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "BZ", js.Any.fromFunction1(value))
      
      inline def setBZUndefined: Self = StObject.set(x, "BZ", js.undefined)
      
      inline def setCA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CA", js.Any.fromFunction1(value))
      
      inline def setCAUndefined: Self = StObject.set(x, "CA", js.undefined)
      
      inline def setCC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CC", js.Any.fromFunction1(value))
      
      inline def setCCUndefined: Self = StObject.set(x, "CC", js.undefined)
      
      inline def setCD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CD", js.Any.fromFunction1(value))
      
      inline def setCDUndefined: Self = StObject.set(x, "CD", js.undefined)
      
      inline def setCF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CF", js.Any.fromFunction1(value))
      
      inline def setCFUndefined: Self = StObject.set(x, "CF", js.undefined)
      
      inline def setCG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CG", js.Any.fromFunction1(value))
      
      inline def setCGUndefined: Self = StObject.set(x, "CG", js.undefined)
      
      inline def setCH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CH", js.Any.fromFunction1(value))
      
      inline def setCHUndefined: Self = StObject.set(x, "CH", js.undefined)
      
      inline def setCI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CI", js.Any.fromFunction1(value))
      
      inline def setCIUndefined: Self = StObject.set(x, "CI", js.undefined)
      
      inline def setCK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CK", js.Any.fromFunction1(value))
      
      inline def setCKUndefined: Self = StObject.set(x, "CK", js.undefined)
      
      inline def setCL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CL", js.Any.fromFunction1(value))
      
      inline def setCLUndefined: Self = StObject.set(x, "CL", js.undefined)
      
      inline def setCM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CM", js.Any.fromFunction1(value))
      
      inline def setCMUndefined: Self = StObject.set(x, "CM", js.undefined)
      
      inline def setCN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CN", js.Any.fromFunction1(value))
      
      inline def setCNUndefined: Self = StObject.set(x, "CN", js.undefined)
      
      inline def setCO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CO", js.Any.fromFunction1(value))
      
      inline def setCOUndefined: Self = StObject.set(x, "CO", js.undefined)
      
      inline def setCR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CR", js.Any.fromFunction1(value))
      
      inline def setCRUndefined: Self = StObject.set(x, "CR", js.undefined)
      
      inline def setCU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CU", js.Any.fromFunction1(value))
      
      inline def setCUUndefined: Self = StObject.set(x, "CU", js.undefined)
      
      inline def setCV(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CV", js.Any.fromFunction1(value))
      
      inline def setCVUndefined: Self = StObject.set(x, "CV", js.undefined)
      
      inline def setCW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CW", js.Any.fromFunction1(value))
      
      inline def setCWUndefined: Self = StObject.set(x, "CW", js.undefined)
      
      inline def setCX(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CX", js.Any.fromFunction1(value))
      
      inline def setCXUndefined: Self = StObject.set(x, "CX", js.undefined)
      
      inline def setCY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CY", js.Any.fromFunction1(value))
      
      inline def setCYUndefined: Self = StObject.set(x, "CY", js.undefined)
      
      inline def setCZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "CZ", js.Any.fromFunction1(value))
      
      inline def setCZUndefined: Self = StObject.set(x, "CZ", js.undefined)
      
      inline def setDE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "DE", js.Any.fromFunction1(value))
      
      inline def setDEUndefined: Self = StObject.set(x, "DE", js.undefined)
      
      inline def setDJ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "DJ", js.Any.fromFunction1(value))
      
      inline def setDJUndefined: Self = StObject.set(x, "DJ", js.undefined)
      
      inline def setDK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "DK", js.Any.fromFunction1(value))
      
      inline def setDKUndefined: Self = StObject.set(x, "DK", js.undefined)
      
      inline def setDM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "DM", js.Any.fromFunction1(value))
      
      inline def setDMUndefined: Self = StObject.set(x, "DM", js.undefined)
      
      inline def setDO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "DO", js.Any.fromFunction1(value))
      
      inline def setDOUndefined: Self = StObject.set(x, "DO", js.undefined)
      
      inline def setDZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "DZ", js.Any.fromFunction1(value))
      
      inline def setDZUndefined: Self = StObject.set(x, "DZ", js.undefined)
      
      inline def setEC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "EC", js.Any.fromFunction1(value))
      
      inline def setECUndefined: Self = StObject.set(x, "EC", js.undefined)
      
      inline def setEE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "EE", js.Any.fromFunction1(value))
      
      inline def setEEUndefined: Self = StObject.set(x, "EE", js.undefined)
      
      inline def setEG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "EG", js.Any.fromFunction1(value))
      
      inline def setEGUndefined: Self = StObject.set(x, "EG", js.undefined)
      
      inline def setEH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "EH", js.Any.fromFunction1(value))
      
      inline def setEHUndefined: Self = StObject.set(x, "EH", js.undefined)
      
      inline def setER(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ER", js.Any.fromFunction1(value))
      
      inline def setERUndefined: Self = StObject.set(x, "ER", js.undefined)
      
      inline def setES(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ES", js.Any.fromFunction1(value))
      
      inline def setESUndefined: Self = StObject.set(x, "ES", js.undefined)
      
      inline def setET(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ET", js.Any.fromFunction1(value))
      
      inline def setETUndefined: Self = StObject.set(x, "ET", js.undefined)
      
      inline def setFI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "FI", js.Any.fromFunction1(value))
      
      inline def setFIUndefined: Self = StObject.set(x, "FI", js.undefined)
      
      inline def setFJ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "FJ", js.Any.fromFunction1(value))
      
      inline def setFJUndefined: Self = StObject.set(x, "FJ", js.undefined)
      
      inline def setFK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "FK", js.Any.fromFunction1(value))
      
      inline def setFKUndefined: Self = StObject.set(x, "FK", js.undefined)
      
      inline def setFM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "FM", js.Any.fromFunction1(value))
      
      inline def setFMUndefined: Self = StObject.set(x, "FM", js.undefined)
      
      inline def setFO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "FO", js.Any.fromFunction1(value))
      
      inline def setFOUndefined: Self = StObject.set(x, "FO", js.undefined)
      
      inline def setFR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "FR", js.Any.fromFunction1(value))
      
      inline def setFRUndefined: Self = StObject.set(x, "FR", js.undefined)
      
      inline def setGA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GA", js.Any.fromFunction1(value))
      
      inline def setGAUndefined: Self = StObject.set(x, "GA", js.undefined)
      
      inline def setGB(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GB", js.Any.fromFunction1(value))
      
      inline def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
      
      inline def setGD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GD", js.Any.fromFunction1(value))
      
      inline def setGDUndefined: Self = StObject.set(x, "GD", js.undefined)
      
      inline def setGE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GE", js.Any.fromFunction1(value))
      
      inline def setGEUndefined: Self = StObject.set(x, "GE", js.undefined)
      
      inline def setGF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GF", js.Any.fromFunction1(value))
      
      inline def setGFUndefined: Self = StObject.set(x, "GF", js.undefined)
      
      inline def setGG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GG", js.Any.fromFunction1(value))
      
      inline def setGGUndefined: Self = StObject.set(x, "GG", js.undefined)
      
      inline def setGH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GH", js.Any.fromFunction1(value))
      
      inline def setGHUndefined: Self = StObject.set(x, "GH", js.undefined)
      
      inline def setGI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GI", js.Any.fromFunction1(value))
      
      inline def setGIUndefined: Self = StObject.set(x, "GI", js.undefined)
      
      inline def setGL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GL", js.Any.fromFunction1(value))
      
      inline def setGLUndefined: Self = StObject.set(x, "GL", js.undefined)
      
      inline def setGM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GM", js.Any.fromFunction1(value))
      
      inline def setGMUndefined: Self = StObject.set(x, "GM", js.undefined)
      
      inline def setGN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GN", js.Any.fromFunction1(value))
      
      inline def setGNUndefined: Self = StObject.set(x, "GN", js.undefined)
      
      inline def setGP(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GP", js.Any.fromFunction1(value))
      
      inline def setGPUndefined: Self = StObject.set(x, "GP", js.undefined)
      
      inline def setGQ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GQ", js.Any.fromFunction1(value))
      
      inline def setGQUndefined: Self = StObject.set(x, "GQ", js.undefined)
      
      inline def setGR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GR", js.Any.fromFunction1(value))
      
      inline def setGRUndefined: Self = StObject.set(x, "GR", js.undefined)
      
      inline def setGT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GT", js.Any.fromFunction1(value))
      
      inline def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
      
      inline def setGU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GU", js.Any.fromFunction1(value))
      
      inline def setGUUndefined: Self = StObject.set(x, "GU", js.undefined)
      
      inline def setGW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GW", js.Any.fromFunction1(value))
      
      inline def setGWUndefined: Self = StObject.set(x, "GW", js.undefined)
      
      inline def setGY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "GY", js.Any.fromFunction1(value))
      
      inline def setGYUndefined: Self = StObject.set(x, "GY", js.undefined)
      
      inline def setHK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "HK", js.Any.fromFunction1(value))
      
      inline def setHKUndefined: Self = StObject.set(x, "HK", js.undefined)
      
      inline def setHN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "HN", js.Any.fromFunction1(value))
      
      inline def setHNUndefined: Self = StObject.set(x, "HN", js.undefined)
      
      inline def setHR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "HR", js.Any.fromFunction1(value))
      
      inline def setHRUndefined: Self = StObject.set(x, "HR", js.undefined)
      
      inline def setHT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "HT", js.Any.fromFunction1(value))
      
      inline def setHTUndefined: Self = StObject.set(x, "HT", js.undefined)
      
      inline def setHU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "HU", js.Any.fromFunction1(value))
      
      inline def setHUUndefined: Self = StObject.set(x, "HU", js.undefined)
      
      inline def setID(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ID", js.Any.fromFunction1(value))
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setIE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IE", js.Any.fromFunction1(value))
      
      inline def setIEUndefined: Self = StObject.set(x, "IE", js.undefined)
      
      inline def setIL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IL", js.Any.fromFunction1(value))
      
      inline def setILUndefined: Self = StObject.set(x, "IL", js.undefined)
      
      inline def setIM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IM", js.Any.fromFunction1(value))
      
      inline def setIMUndefined: Self = StObject.set(x, "IM", js.undefined)
      
      inline def setIN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IN", js.Any.fromFunction1(value))
      
      inline def setINUndefined: Self = StObject.set(x, "IN", js.undefined)
      
      inline def setIO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IO", js.Any.fromFunction1(value))
      
      inline def setIOUndefined: Self = StObject.set(x, "IO", js.undefined)
      
      inline def setIQ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IQ", js.Any.fromFunction1(value))
      
      inline def setIQUndefined: Self = StObject.set(x, "IQ", js.undefined)
      
      inline def setIR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IR", js.Any.fromFunction1(value))
      
      inline def setIRUndefined: Self = StObject.set(x, "IR", js.undefined)
      
      inline def setIS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IS", js.Any.fromFunction1(value))
      
      inline def setISUndefined: Self = StObject.set(x, "IS", js.undefined)
      
      inline def setIT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "IT", js.Any.fromFunction1(value))
      
      inline def setITUndefined: Self = StObject.set(x, "IT", js.undefined)
      
      inline def setJE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "JE", js.Any.fromFunction1(value))
      
      inline def setJEUndefined: Self = StObject.set(x, "JE", js.undefined)
      
      inline def setJM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "JM", js.Any.fromFunction1(value))
      
      inline def setJMUndefined: Self = StObject.set(x, "JM", js.undefined)
      
      inline def setJO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "JO", js.Any.fromFunction1(value))
      
      inline def setJOUndefined: Self = StObject.set(x, "JO", js.undefined)
      
      inline def setJP(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "JP", js.Any.fromFunction1(value))
      
      inline def setJPUndefined: Self = StObject.set(x, "JP", js.undefined)
      
      inline def setKE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KE", js.Any.fromFunction1(value))
      
      inline def setKEUndefined: Self = StObject.set(x, "KE", js.undefined)
      
      inline def setKG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KG", js.Any.fromFunction1(value))
      
      inline def setKGUndefined: Self = StObject.set(x, "KG", js.undefined)
      
      inline def setKH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KH", js.Any.fromFunction1(value))
      
      inline def setKHUndefined: Self = StObject.set(x, "KH", js.undefined)
      
      inline def setKI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KI", js.Any.fromFunction1(value))
      
      inline def setKIUndefined: Self = StObject.set(x, "KI", js.undefined)
      
      inline def setKM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KM", js.Any.fromFunction1(value))
      
      inline def setKMUndefined: Self = StObject.set(x, "KM", js.undefined)
      
      inline def setKN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KN", js.Any.fromFunction1(value))
      
      inline def setKNUndefined: Self = StObject.set(x, "KN", js.undefined)
      
      inline def setKP(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KP", js.Any.fromFunction1(value))
      
      inline def setKPUndefined: Self = StObject.set(x, "KP", js.undefined)
      
      inline def setKR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KR", js.Any.fromFunction1(value))
      
      inline def setKRUndefined: Self = StObject.set(x, "KR", js.undefined)
      
      inline def setKW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KW", js.Any.fromFunction1(value))
      
      inline def setKWUndefined: Self = StObject.set(x, "KW", js.undefined)
      
      inline def setKY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KY", js.Any.fromFunction1(value))
      
      inline def setKYUndefined: Self = StObject.set(x, "KY", js.undefined)
      
      inline def setKZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "KZ", js.Any.fromFunction1(value))
      
      inline def setKZUndefined: Self = StObject.set(x, "KZ", js.undefined)
      
      inline def setLA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LA", js.Any.fromFunction1(value))
      
      inline def setLAUndefined: Self = StObject.set(x, "LA", js.undefined)
      
      inline def setLB(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LB", js.Any.fromFunction1(value))
      
      inline def setLBUndefined: Self = StObject.set(x, "LB", js.undefined)
      
      inline def setLC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LC", js.Any.fromFunction1(value))
      
      inline def setLCUndefined: Self = StObject.set(x, "LC", js.undefined)
      
      inline def setLI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LI", js.Any.fromFunction1(value))
      
      inline def setLIUndefined: Self = StObject.set(x, "LI", js.undefined)
      
      inline def setLK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LK", js.Any.fromFunction1(value))
      
      inline def setLKUndefined: Self = StObject.set(x, "LK", js.undefined)
      
      inline def setLR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LR", js.Any.fromFunction1(value))
      
      inline def setLRUndefined: Self = StObject.set(x, "LR", js.undefined)
      
      inline def setLS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LS", js.Any.fromFunction1(value))
      
      inline def setLSUndefined: Self = StObject.set(x, "LS", js.undefined)
      
      inline def setLT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LT", js.Any.fromFunction1(value))
      
      inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
      
      inline def setLU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LU", js.Any.fromFunction1(value))
      
      inline def setLUUndefined: Self = StObject.set(x, "LU", js.undefined)
      
      inline def setLV(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LV", js.Any.fromFunction1(value))
      
      inline def setLVUndefined: Self = StObject.set(x, "LV", js.undefined)
      
      inline def setLY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "LY", js.Any.fromFunction1(value))
      
      inline def setLYUndefined: Self = StObject.set(x, "LY", js.undefined)
      
      inline def setMA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MA", js.Any.fromFunction1(value))
      
      inline def setMAUndefined: Self = StObject.set(x, "MA", js.undefined)
      
      inline def setMC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MC", js.Any.fromFunction1(value))
      
      inline def setMCUndefined: Self = StObject.set(x, "MC", js.undefined)
      
      inline def setMD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MD", js.Any.fromFunction1(value))
      
      inline def setMDUndefined: Self = StObject.set(x, "MD", js.undefined)
      
      inline def setME(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ME", js.Any.fromFunction1(value))
      
      inline def setMEUndefined: Self = StObject.set(x, "ME", js.undefined)
      
      inline def setMF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MF", js.Any.fromFunction1(value))
      
      inline def setMFUndefined: Self = StObject.set(x, "MF", js.undefined)
      
      inline def setMG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MG", js.Any.fromFunction1(value))
      
      inline def setMGUndefined: Self = StObject.set(x, "MG", js.undefined)
      
      inline def setMH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MH", js.Any.fromFunction1(value))
      
      inline def setMHUndefined: Self = StObject.set(x, "MH", js.undefined)
      
      inline def setMK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MK", js.Any.fromFunction1(value))
      
      inline def setMKUndefined: Self = StObject.set(x, "MK", js.undefined)
      
      inline def setML(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ML", js.Any.fromFunction1(value))
      
      inline def setMLUndefined: Self = StObject.set(x, "ML", js.undefined)
      
      inline def setMM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MM", js.Any.fromFunction1(value))
      
      inline def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
      
      inline def setMN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MN", js.Any.fromFunction1(value))
      
      inline def setMNUndefined: Self = StObject.set(x, "MN", js.undefined)
      
      inline def setMO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MO", js.Any.fromFunction1(value))
      
      inline def setMOUndefined: Self = StObject.set(x, "MO", js.undefined)
      
      inline def setMP(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MP", js.Any.fromFunction1(value))
      
      inline def setMPUndefined: Self = StObject.set(x, "MP", js.undefined)
      
      inline def setMQ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MQ", js.Any.fromFunction1(value))
      
      inline def setMQUndefined: Self = StObject.set(x, "MQ", js.undefined)
      
      inline def setMR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MR", js.Any.fromFunction1(value))
      
      inline def setMRUndefined: Self = StObject.set(x, "MR", js.undefined)
      
      inline def setMS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MS", js.Any.fromFunction1(value))
      
      inline def setMSUndefined: Self = StObject.set(x, "MS", js.undefined)
      
      inline def setMT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MT", js.Any.fromFunction1(value))
      
      inline def setMTUndefined: Self = StObject.set(x, "MT", js.undefined)
      
      inline def setMU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MU", js.Any.fromFunction1(value))
      
      inline def setMUUndefined: Self = StObject.set(x, "MU", js.undefined)
      
      inline def setMV(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MV", js.Any.fromFunction1(value))
      
      inline def setMVUndefined: Self = StObject.set(x, "MV", js.undefined)
      
      inline def setMW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MW", js.Any.fromFunction1(value))
      
      inline def setMWUndefined: Self = StObject.set(x, "MW", js.undefined)
      
      inline def setMX(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MX", js.Any.fromFunction1(value))
      
      inline def setMXUndefined: Self = StObject.set(x, "MX", js.undefined)
      
      inline def setMY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MY", js.Any.fromFunction1(value))
      
      inline def setMYUndefined: Self = StObject.set(x, "MY", js.undefined)
      
      inline def setMZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "MZ", js.Any.fromFunction1(value))
      
      inline def setMZUndefined: Self = StObject.set(x, "MZ", js.undefined)
      
      inline def setNA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NA", js.Any.fromFunction1(value))
      
      inline def setNAUndefined: Self = StObject.set(x, "NA", js.undefined)
      
      inline def setNC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NC", js.Any.fromFunction1(value))
      
      inline def setNCUndefined: Self = StObject.set(x, "NC", js.undefined)
      
      inline def setNE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NE", js.Any.fromFunction1(value))
      
      inline def setNEUndefined: Self = StObject.set(x, "NE", js.undefined)
      
      inline def setNF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NF", js.Any.fromFunction1(value))
      
      inline def setNFUndefined: Self = StObject.set(x, "NF", js.undefined)
      
      inline def setNG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NG", js.Any.fromFunction1(value))
      
      inline def setNGUndefined: Self = StObject.set(x, "NG", js.undefined)
      
      inline def setNI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NI", js.Any.fromFunction1(value))
      
      inline def setNIUndefined: Self = StObject.set(x, "NI", js.undefined)
      
      inline def setNL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NL", js.Any.fromFunction1(value))
      
      inline def setNLUndefined: Self = StObject.set(x, "NL", js.undefined)
      
      inline def setNO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NO", js.Any.fromFunction1(value))
      
      inline def setNOUndefined: Self = StObject.set(x, "NO", js.undefined)
      
      inline def setNP(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NP", js.Any.fromFunction1(value))
      
      inline def setNPUndefined: Self = StObject.set(x, "NP", js.undefined)
      
      inline def setNR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NR", js.Any.fromFunction1(value))
      
      inline def setNRUndefined: Self = StObject.set(x, "NR", js.undefined)
      
      inline def setNU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NU", js.Any.fromFunction1(value))
      
      inline def setNUUndefined: Self = StObject.set(x, "NU", js.undefined)
      
      inline def setNZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "NZ", js.Any.fromFunction1(value))
      
      inline def setNZUndefined: Self = StObject.set(x, "NZ", js.undefined)
      
      inline def setOM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "OM", js.Any.fromFunction1(value))
      
      inline def setOMUndefined: Self = StObject.set(x, "OM", js.undefined)
      
      inline def setPA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PA", js.Any.fromFunction1(value))
      
      inline def setPAUndefined: Self = StObject.set(x, "PA", js.undefined)
      
      inline def setPE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PE", js.Any.fromFunction1(value))
      
      inline def setPEUndefined: Self = StObject.set(x, "PE", js.undefined)
      
      inline def setPF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PF", js.Any.fromFunction1(value))
      
      inline def setPFUndefined: Self = StObject.set(x, "PF", js.undefined)
      
      inline def setPG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PG", js.Any.fromFunction1(value))
      
      inline def setPGUndefined: Self = StObject.set(x, "PG", js.undefined)
      
      inline def setPH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PH", js.Any.fromFunction1(value))
      
      inline def setPHUndefined: Self = StObject.set(x, "PH", js.undefined)
      
      inline def setPK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PK", js.Any.fromFunction1(value))
      
      inline def setPKUndefined: Self = StObject.set(x, "PK", js.undefined)
      
      inline def setPL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PL", js.Any.fromFunction1(value))
      
      inline def setPLUndefined: Self = StObject.set(x, "PL", js.undefined)
      
      inline def setPM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PM", js.Any.fromFunction1(value))
      
      inline def setPMUndefined: Self = StObject.set(x, "PM", js.undefined)
      
      inline def setPR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PR", js.Any.fromFunction1(value))
      
      inline def setPRUndefined: Self = StObject.set(x, "PR", js.undefined)
      
      inline def setPS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PS", js.Any.fromFunction1(value))
      
      inline def setPSUndefined: Self = StObject.set(x, "PS", js.undefined)
      
      inline def setPT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PT", js.Any.fromFunction1(value))
      
      inline def setPTUndefined: Self = StObject.set(x, "PT", js.undefined)
      
      inline def setPW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PW", js.Any.fromFunction1(value))
      
      inline def setPWUndefined: Self = StObject.set(x, "PW", js.undefined)
      
      inline def setPY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "PY", js.Any.fromFunction1(value))
      
      inline def setPYUndefined: Self = StObject.set(x, "PY", js.undefined)
      
      inline def setQA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "QA", js.Any.fromFunction1(value))
      
      inline def setQAUndefined: Self = StObject.set(x, "QA", js.undefined)
      
      inline def setRE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "RE", js.Any.fromFunction1(value))
      
      inline def setREUndefined: Self = StObject.set(x, "RE", js.undefined)
      
      inline def setRO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "RO", js.Any.fromFunction1(value))
      
      inline def setROUndefined: Self = StObject.set(x, "RO", js.undefined)
      
      inline def setRS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "RS", js.Any.fromFunction1(value))
      
      inline def setRSUndefined: Self = StObject.set(x, "RS", js.undefined)
      
      inline def setRU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "RU", js.Any.fromFunction1(value))
      
      inline def setRUUndefined: Self = StObject.set(x, "RU", js.undefined)
      
      inline def setRW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "RW", js.Any.fromFunction1(value))
      
      inline def setRWUndefined: Self = StObject.set(x, "RW", js.undefined)
      
      inline def setSA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SA", js.Any.fromFunction1(value))
      
      inline def setSAUndefined: Self = StObject.set(x, "SA", js.undefined)
      
      inline def setSB(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SB", js.Any.fromFunction1(value))
      
      inline def setSBUndefined: Self = StObject.set(x, "SB", js.undefined)
      
      inline def setSC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SC", js.Any.fromFunction1(value))
      
      inline def setSCUndefined: Self = StObject.set(x, "SC", js.undefined)
      
      inline def setSD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SD", js.Any.fromFunction1(value))
      
      inline def setSDUndefined: Self = StObject.set(x, "SD", js.undefined)
      
      inline def setSE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SE", js.Any.fromFunction1(value))
      
      inline def setSEUndefined: Self = StObject.set(x, "SE", js.undefined)
      
      inline def setSG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SG", js.Any.fromFunction1(value))
      
      inline def setSGUndefined: Self = StObject.set(x, "SG", js.undefined)
      
      inline def setSH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SH", js.Any.fromFunction1(value))
      
      inline def setSHUndefined: Self = StObject.set(x, "SH", js.undefined)
      
      inline def setSI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SI", js.Any.fromFunction1(value))
      
      inline def setSIUndefined: Self = StObject.set(x, "SI", js.undefined)
      
      inline def setSJ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SJ", js.Any.fromFunction1(value))
      
      inline def setSJUndefined: Self = StObject.set(x, "SJ", js.undefined)
      
      inline def setSK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SK", js.Any.fromFunction1(value))
      
      inline def setSKUndefined: Self = StObject.set(x, "SK", js.undefined)
      
      inline def setSL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SL", js.Any.fromFunction1(value))
      
      inline def setSLUndefined: Self = StObject.set(x, "SL", js.undefined)
      
      inline def setSM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SM", js.Any.fromFunction1(value))
      
      inline def setSMUndefined: Self = StObject.set(x, "SM", js.undefined)
      
      inline def setSN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SN", js.Any.fromFunction1(value))
      
      inline def setSNUndefined: Self = StObject.set(x, "SN", js.undefined)
      
      inline def setSO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SO", js.Any.fromFunction1(value))
      
      inline def setSOUndefined: Self = StObject.set(x, "SO", js.undefined)
      
      inline def setSR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SR", js.Any.fromFunction1(value))
      
      inline def setSRUndefined: Self = StObject.set(x, "SR", js.undefined)
      
      inline def setSS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SS", js.Any.fromFunction1(value))
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setST(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ST", js.Any.fromFunction1(value))
      
      inline def setSTUndefined: Self = StObject.set(x, "ST", js.undefined)
      
      inline def setSV(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SV", js.Any.fromFunction1(value))
      
      inline def setSVUndefined: Self = StObject.set(x, "SV", js.undefined)
      
      inline def setSX(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SX", js.Any.fromFunction1(value))
      
      inline def setSXUndefined: Self = StObject.set(x, "SX", js.undefined)
      
      inline def setSY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SY", js.Any.fromFunction1(value))
      
      inline def setSYUndefined: Self = StObject.set(x, "SY", js.undefined)
      
      inline def setSZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "SZ", js.Any.fromFunction1(value))
      
      inline def setSZUndefined: Self = StObject.set(x, "SZ", js.undefined)
      
      inline def setTA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TA", js.Any.fromFunction1(value))
      
      inline def setTAUndefined: Self = StObject.set(x, "TA", js.undefined)
      
      inline def setTC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TC", js.Any.fromFunction1(value))
      
      inline def setTCUndefined: Self = StObject.set(x, "TC", js.undefined)
      
      inline def setTD(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TD", js.Any.fromFunction1(value))
      
      inline def setTDUndefined: Self = StObject.set(x, "TD", js.undefined)
      
      inline def setTG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TG", js.Any.fromFunction1(value))
      
      inline def setTGUndefined: Self = StObject.set(x, "TG", js.undefined)
      
      inline def setTH(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TH", js.Any.fromFunction1(value))
      
      inline def setTHUndefined: Self = StObject.set(x, "TH", js.undefined)
      
      inline def setTJ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TJ", js.Any.fromFunction1(value))
      
      inline def setTJUndefined: Self = StObject.set(x, "TJ", js.undefined)
      
      inline def setTK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TK", js.Any.fromFunction1(value))
      
      inline def setTKUndefined: Self = StObject.set(x, "TK", js.undefined)
      
      inline def setTL(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TL", js.Any.fromFunction1(value))
      
      inline def setTLUndefined: Self = StObject.set(x, "TL", js.undefined)
      
      inline def setTM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TM", js.Any.fromFunction1(value))
      
      inline def setTMUndefined: Self = StObject.set(x, "TM", js.undefined)
      
      inline def setTN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TN", js.Any.fromFunction1(value))
      
      inline def setTNUndefined: Self = StObject.set(x, "TN", js.undefined)
      
      inline def setTO(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TO", js.Any.fromFunction1(value))
      
      inline def setTOUndefined: Self = StObject.set(x, "TO", js.undefined)
      
      inline def setTR(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TR", js.Any.fromFunction1(value))
      
      inline def setTRUndefined: Self = StObject.set(x, "TR", js.undefined)
      
      inline def setTT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TT", js.Any.fromFunction1(value))
      
      inline def setTTUndefined: Self = StObject.set(x, "TT", js.undefined)
      
      inline def setTV(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TV", js.Any.fromFunction1(value))
      
      inline def setTVUndefined: Self = StObject.set(x, "TV", js.undefined)
      
      inline def setTW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TW", js.Any.fromFunction1(value))
      
      inline def setTWUndefined: Self = StObject.set(x, "TW", js.undefined)
      
      inline def setTZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "TZ", js.Any.fromFunction1(value))
      
      inline def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
      
      inline def setUA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "UA", js.Any.fromFunction1(value))
      
      inline def setUAUndefined: Self = StObject.set(x, "UA", js.undefined)
      
      inline def setUG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "UG", js.Any.fromFunction1(value))
      
      inline def setUGUndefined: Self = StObject.set(x, "UG", js.undefined)
      
      inline def setUS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "US", js.Any.fromFunction1(value))
      
      inline def setUSUndefined: Self = StObject.set(x, "US", js.undefined)
      
      inline def setUY(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "UY", js.Any.fromFunction1(value))
      
      inline def setUYUndefined: Self = StObject.set(x, "UY", js.undefined)
      
      inline def setUZ(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "UZ", js.Any.fromFunction1(value))
      
      inline def setUZUndefined: Self = StObject.set(x, "UZ", js.undefined)
      
      inline def setVA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VA", js.Any.fromFunction1(value))
      
      inline def setVAUndefined: Self = StObject.set(x, "VA", js.undefined)
      
      inline def setVC(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VC", js.Any.fromFunction1(value))
      
      inline def setVCUndefined: Self = StObject.set(x, "VC", js.undefined)
      
      inline def setVE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VE", js.Any.fromFunction1(value))
      
      inline def setVEUndefined: Self = StObject.set(x, "VE", js.undefined)
      
      inline def setVG(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VG", js.Any.fromFunction1(value))
      
      inline def setVGUndefined: Self = StObject.set(x, "VG", js.undefined)
      
      inline def setVI(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VI", js.Any.fromFunction1(value))
      
      inline def setVIUndefined: Self = StObject.set(x, "VI", js.undefined)
      
      inline def setVN(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VN", js.Any.fromFunction1(value))
      
      inline def setVNUndefined: Self = StObject.set(x, "VN", js.undefined)
      
      inline def setVU(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "VU", js.Any.fromFunction1(value))
      
      inline def setVUUndefined: Self = StObject.set(x, "VU", js.undefined)
      
      inline def setWF(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "WF", js.Any.fromFunction1(value))
      
      inline def setWFUndefined: Self = StObject.set(x, "WF", js.undefined)
      
      inline def setWS(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "WS", js.Any.fromFunction1(value))
      
      inline def setWSUndefined: Self = StObject.set(x, "WS", js.undefined)
      
      inline def setXK(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "XK", js.Any.fromFunction1(value))
      
      inline def setXKUndefined: Self = StObject.set(x, "XK", js.undefined)
      
      inline def setYE(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "YE", js.Any.fromFunction1(value))
      
      inline def setYEUndefined: Self = StObject.set(x, "YE", js.undefined)
      
      inline def setYT(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "YT", js.Any.fromFunction1(value))
      
      inline def setYTUndefined: Self = StObject.set(x, "YT", js.undefined)
      
      inline def setZA(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ZA", js.Any.fromFunction1(value))
      
      inline def setZAUndefined: Self = StObject.set(x, "ZA", js.undefined)
      
      inline def setZM(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ZM", js.Any.fromFunction1(value))
      
      inline def setZMUndefined: Self = StObject.set(x, "ZM", js.undefined)
      
      inline def setZW(value: /* props */ EmbeddedFlagProps => Element): Self = StObject.set(x, "ZW", js.Any.fromFunction1(value))
      
      inline def setZWUndefined: Self = StObject.set(x, "ZW", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPhoneNumberInput.mod.Country
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.ZZ
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.ext
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.country
    - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.phone
  */
  type LabelKey = _LabelKey | Country
  
  /* Inlined std.Partial<std.Record<react-phone-number-input.react-phone-number-input.LabelKey, string>> */
  trait Labels extends StObject {
    
    var AC: js.UndefOr[String] = js.undefined
    
    var AD: js.UndefOr[String] = js.undefined
    
    var AE: js.UndefOr[String] = js.undefined
    
    var AF: js.UndefOr[String] = js.undefined
    
    var AG: js.UndefOr[String] = js.undefined
    
    var AI: js.UndefOr[String] = js.undefined
    
    var AL: js.UndefOr[String] = js.undefined
    
    var AM: js.UndefOr[String] = js.undefined
    
    var AO: js.UndefOr[String] = js.undefined
    
    var AR: js.UndefOr[String] = js.undefined
    
    var AS: js.UndefOr[String] = js.undefined
    
    var AT: js.UndefOr[String] = js.undefined
    
    var AU: js.UndefOr[String] = js.undefined
    
    var AW: js.UndefOr[String] = js.undefined
    
    var AX: js.UndefOr[String] = js.undefined
    
    var AZ: js.UndefOr[String] = js.undefined
    
    var BA: js.UndefOr[String] = js.undefined
    
    var BB: js.UndefOr[String] = js.undefined
    
    var BD: js.UndefOr[String] = js.undefined
    
    var BE: js.UndefOr[String] = js.undefined
    
    var BF: js.UndefOr[String] = js.undefined
    
    var BG: js.UndefOr[String] = js.undefined
    
    var BH: js.UndefOr[String] = js.undefined
    
    var BI: js.UndefOr[String] = js.undefined
    
    var BJ: js.UndefOr[String] = js.undefined
    
    var BL: js.UndefOr[String] = js.undefined
    
    var BM: js.UndefOr[String] = js.undefined
    
    var BN: js.UndefOr[String] = js.undefined
    
    var BO: js.UndefOr[String] = js.undefined
    
    var BQ: js.UndefOr[String] = js.undefined
    
    var BR: js.UndefOr[String] = js.undefined
    
    var BS: js.UndefOr[String] = js.undefined
    
    var BT: js.UndefOr[String] = js.undefined
    
    var BW: js.UndefOr[String] = js.undefined
    
    var BY: js.UndefOr[String] = js.undefined
    
    var BZ: js.UndefOr[String] = js.undefined
    
    var CA: js.UndefOr[String] = js.undefined
    
    var CC: js.UndefOr[String] = js.undefined
    
    var CD: js.UndefOr[String] = js.undefined
    
    var CF: js.UndefOr[String] = js.undefined
    
    var CG: js.UndefOr[String] = js.undefined
    
    var CH: js.UndefOr[String] = js.undefined
    
    var CI: js.UndefOr[String] = js.undefined
    
    var CK: js.UndefOr[String] = js.undefined
    
    var CL: js.UndefOr[String] = js.undefined
    
    var CM: js.UndefOr[String] = js.undefined
    
    var CN: js.UndefOr[String] = js.undefined
    
    var CO: js.UndefOr[String] = js.undefined
    
    var CR: js.UndefOr[String] = js.undefined
    
    var CU: js.UndefOr[String] = js.undefined
    
    var CV: js.UndefOr[String] = js.undefined
    
    var CW: js.UndefOr[String] = js.undefined
    
    var CX: js.UndefOr[String] = js.undefined
    
    var CY: js.UndefOr[String] = js.undefined
    
    var CZ: js.UndefOr[String] = js.undefined
    
    var DE: js.UndefOr[String] = js.undefined
    
    var DJ: js.UndefOr[String] = js.undefined
    
    var DK: js.UndefOr[String] = js.undefined
    
    var DM: js.UndefOr[String] = js.undefined
    
    var DO: js.UndefOr[String] = js.undefined
    
    var DZ: js.UndefOr[String] = js.undefined
    
    var EC: js.UndefOr[String] = js.undefined
    
    var EE: js.UndefOr[String] = js.undefined
    
    var EG: js.UndefOr[String] = js.undefined
    
    var EH: js.UndefOr[String] = js.undefined
    
    var ER: js.UndefOr[String] = js.undefined
    
    var ES: js.UndefOr[String] = js.undefined
    
    var ET: js.UndefOr[String] = js.undefined
    
    var FI: js.UndefOr[String] = js.undefined
    
    var FJ: js.UndefOr[String] = js.undefined
    
    var FK: js.UndefOr[String] = js.undefined
    
    var FM: js.UndefOr[String] = js.undefined
    
    var FO: js.UndefOr[String] = js.undefined
    
    var FR: js.UndefOr[String] = js.undefined
    
    var GA: js.UndefOr[String] = js.undefined
    
    var GB: js.UndefOr[String] = js.undefined
    
    var GD: js.UndefOr[String] = js.undefined
    
    var GE: js.UndefOr[String] = js.undefined
    
    var GF: js.UndefOr[String] = js.undefined
    
    var GG: js.UndefOr[String] = js.undefined
    
    var GH: js.UndefOr[String] = js.undefined
    
    var GI: js.UndefOr[String] = js.undefined
    
    var GL: js.UndefOr[String] = js.undefined
    
    var GM: js.UndefOr[String] = js.undefined
    
    var GN: js.UndefOr[String] = js.undefined
    
    var GP: js.UndefOr[String] = js.undefined
    
    var GQ: js.UndefOr[String] = js.undefined
    
    var GR: js.UndefOr[String] = js.undefined
    
    var GT: js.UndefOr[String] = js.undefined
    
    var GU: js.UndefOr[String] = js.undefined
    
    var GW: js.UndefOr[String] = js.undefined
    
    var GY: js.UndefOr[String] = js.undefined
    
    var HK: js.UndefOr[String] = js.undefined
    
    var HN: js.UndefOr[String] = js.undefined
    
    var HR: js.UndefOr[String] = js.undefined
    
    var HT: js.UndefOr[String] = js.undefined
    
    var HU: js.UndefOr[String] = js.undefined
    
    var ID: js.UndefOr[String] = js.undefined
    
    var IE: js.UndefOr[String] = js.undefined
    
    var IL: js.UndefOr[String] = js.undefined
    
    var IM: js.UndefOr[String] = js.undefined
    
    var IN: js.UndefOr[String] = js.undefined
    
    var IO: js.UndefOr[String] = js.undefined
    
    var IQ: js.UndefOr[String] = js.undefined
    
    var IR: js.UndefOr[String] = js.undefined
    
    var IS: js.UndefOr[String] = js.undefined
    
    var IT: js.UndefOr[String] = js.undefined
    
    var JE: js.UndefOr[String] = js.undefined
    
    var JM: js.UndefOr[String] = js.undefined
    
    var JO: js.UndefOr[String] = js.undefined
    
    var JP: js.UndefOr[String] = js.undefined
    
    var KE: js.UndefOr[String] = js.undefined
    
    var KG: js.UndefOr[String] = js.undefined
    
    var KH: js.UndefOr[String] = js.undefined
    
    var KI: js.UndefOr[String] = js.undefined
    
    var KM: js.UndefOr[String] = js.undefined
    
    var KN: js.UndefOr[String] = js.undefined
    
    var KP: js.UndefOr[String] = js.undefined
    
    var KR: js.UndefOr[String] = js.undefined
    
    var KW: js.UndefOr[String] = js.undefined
    
    var KY: js.UndefOr[String] = js.undefined
    
    var KZ: js.UndefOr[String] = js.undefined
    
    var LA: js.UndefOr[String] = js.undefined
    
    var LB: js.UndefOr[String] = js.undefined
    
    var LC: js.UndefOr[String] = js.undefined
    
    var LI: js.UndefOr[String] = js.undefined
    
    var LK: js.UndefOr[String] = js.undefined
    
    var LR: js.UndefOr[String] = js.undefined
    
    var LS: js.UndefOr[String] = js.undefined
    
    var LT: js.UndefOr[String] = js.undefined
    
    var LU: js.UndefOr[String] = js.undefined
    
    var LV: js.UndefOr[String] = js.undefined
    
    var LY: js.UndefOr[String] = js.undefined
    
    var MA: js.UndefOr[String] = js.undefined
    
    var MC: js.UndefOr[String] = js.undefined
    
    var MD: js.UndefOr[String] = js.undefined
    
    var ME: js.UndefOr[String] = js.undefined
    
    var MF: js.UndefOr[String] = js.undefined
    
    var MG: js.UndefOr[String] = js.undefined
    
    var MH: js.UndefOr[String] = js.undefined
    
    var MK: js.UndefOr[String] = js.undefined
    
    var ML: js.UndefOr[String] = js.undefined
    
    var MM: js.UndefOr[String] = js.undefined
    
    var MN: js.UndefOr[String] = js.undefined
    
    var MO: js.UndefOr[String] = js.undefined
    
    var MP: js.UndefOr[String] = js.undefined
    
    var MQ: js.UndefOr[String] = js.undefined
    
    var MR: js.UndefOr[String] = js.undefined
    
    var MS: js.UndefOr[String] = js.undefined
    
    var MT: js.UndefOr[String] = js.undefined
    
    var MU: js.UndefOr[String] = js.undefined
    
    var MV: js.UndefOr[String] = js.undefined
    
    var MW: js.UndefOr[String] = js.undefined
    
    var MX: js.UndefOr[String] = js.undefined
    
    var MY: js.UndefOr[String] = js.undefined
    
    var MZ: js.UndefOr[String] = js.undefined
    
    var NA: js.UndefOr[String] = js.undefined
    
    var NC: js.UndefOr[String] = js.undefined
    
    var NE: js.UndefOr[String] = js.undefined
    
    var NF: js.UndefOr[String] = js.undefined
    
    var NG: js.UndefOr[String] = js.undefined
    
    var NI: js.UndefOr[String] = js.undefined
    
    var NL: js.UndefOr[String] = js.undefined
    
    var NO: js.UndefOr[String] = js.undefined
    
    var NP: js.UndefOr[String] = js.undefined
    
    var NR: js.UndefOr[String] = js.undefined
    
    var NU: js.UndefOr[String] = js.undefined
    
    var NZ: js.UndefOr[String] = js.undefined
    
    var OM: js.UndefOr[String] = js.undefined
    
    var PA: js.UndefOr[String] = js.undefined
    
    var PE: js.UndefOr[String] = js.undefined
    
    var PF: js.UndefOr[String] = js.undefined
    
    var PG: js.UndefOr[String] = js.undefined
    
    var PH: js.UndefOr[String] = js.undefined
    
    var PK: js.UndefOr[String] = js.undefined
    
    var PL: js.UndefOr[String] = js.undefined
    
    var PM: js.UndefOr[String] = js.undefined
    
    var PR: js.UndefOr[String] = js.undefined
    
    var PS: js.UndefOr[String] = js.undefined
    
    var PT: js.UndefOr[String] = js.undefined
    
    var PW: js.UndefOr[String] = js.undefined
    
    var PY: js.UndefOr[String] = js.undefined
    
    var QA: js.UndefOr[String] = js.undefined
    
    var RE: js.UndefOr[String] = js.undefined
    
    var RO: js.UndefOr[String] = js.undefined
    
    var RS: js.UndefOr[String] = js.undefined
    
    var RU: js.UndefOr[String] = js.undefined
    
    var RW: js.UndefOr[String] = js.undefined
    
    var SA: js.UndefOr[String] = js.undefined
    
    var SB: js.UndefOr[String] = js.undefined
    
    var SC: js.UndefOr[String] = js.undefined
    
    var SD: js.UndefOr[String] = js.undefined
    
    var SE: js.UndefOr[String] = js.undefined
    
    var SG: js.UndefOr[String] = js.undefined
    
    var SH: js.UndefOr[String] = js.undefined
    
    var SI: js.UndefOr[String] = js.undefined
    
    var SJ: js.UndefOr[String] = js.undefined
    
    var SK: js.UndefOr[String] = js.undefined
    
    var SL: js.UndefOr[String] = js.undefined
    
    var SM: js.UndefOr[String] = js.undefined
    
    var SN: js.UndefOr[String] = js.undefined
    
    var SO: js.UndefOr[String] = js.undefined
    
    var SR: js.UndefOr[String] = js.undefined
    
    var SS: js.UndefOr[String] = js.undefined
    
    var ST: js.UndefOr[String] = js.undefined
    
    var SV: js.UndefOr[String] = js.undefined
    
    var SX: js.UndefOr[String] = js.undefined
    
    var SY: js.UndefOr[String] = js.undefined
    
    var SZ: js.UndefOr[String] = js.undefined
    
    var TA: js.UndefOr[String] = js.undefined
    
    var TC: js.UndefOr[String] = js.undefined
    
    var TD: js.UndefOr[String] = js.undefined
    
    var TG: js.UndefOr[String] = js.undefined
    
    var TH: js.UndefOr[String] = js.undefined
    
    var TJ: js.UndefOr[String] = js.undefined
    
    var TK: js.UndefOr[String] = js.undefined
    
    var TL: js.UndefOr[String] = js.undefined
    
    var TM: js.UndefOr[String] = js.undefined
    
    var TN: js.UndefOr[String] = js.undefined
    
    var TO: js.UndefOr[String] = js.undefined
    
    var TR: js.UndefOr[String] = js.undefined
    
    var TT: js.UndefOr[String] = js.undefined
    
    var TV: js.UndefOr[String] = js.undefined
    
    var TW: js.UndefOr[String] = js.undefined
    
    var TZ: js.UndefOr[String] = js.undefined
    
    var UA: js.UndefOr[String] = js.undefined
    
    var UG: js.UndefOr[String] = js.undefined
    
    var US: js.UndefOr[String] = js.undefined
    
    var UY: js.UndefOr[String] = js.undefined
    
    var UZ: js.UndefOr[String] = js.undefined
    
    var VA: js.UndefOr[String] = js.undefined
    
    var VC: js.UndefOr[String] = js.undefined
    
    var VE: js.UndefOr[String] = js.undefined
    
    var VG: js.UndefOr[String] = js.undefined
    
    var VI: js.UndefOr[String] = js.undefined
    
    var VN: js.UndefOr[String] = js.undefined
    
    var VU: js.UndefOr[String] = js.undefined
    
    var WF: js.UndefOr[String] = js.undefined
    
    var WS: js.UndefOr[String] = js.undefined
    
    var XK: js.UndefOr[String] = js.undefined
    
    var YE: js.UndefOr[String] = js.undefined
    
    var YT: js.UndefOr[String] = js.undefined
    
    var ZA: js.UndefOr[String] = js.undefined
    
    var ZM: js.UndefOr[String] = js.undefined
    
    var ZW: js.UndefOr[String] = js.undefined
    
    var ZZ: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
  }
  object Labels {
    
    inline def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      inline def setAC(value: String): Self = StObject.set(x, "AC", value.asInstanceOf[js.Any])
      
      inline def setACUndefined: Self = StObject.set(x, "AC", js.undefined)
      
      inline def setAD(value: String): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setADUndefined: Self = StObject.set(x, "AD", js.undefined)
      
      inline def setAE(value: String): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAEUndefined: Self = StObject.set(x, "AE", js.undefined)
      
      inline def setAF(value: String): Self = StObject.set(x, "AF", value.asInstanceOf[js.Any])
      
      inline def setAFUndefined: Self = StObject.set(x, "AF", js.undefined)
      
      inline def setAG(value: String): Self = StObject.set(x, "AG", value.asInstanceOf[js.Any])
      
      inline def setAGUndefined: Self = StObject.set(x, "AG", js.undefined)
      
      inline def setAI(value: String): Self = StObject.set(x, "AI", value.asInstanceOf[js.Any])
      
      inline def setAIUndefined: Self = StObject.set(x, "AI", js.undefined)
      
      inline def setAL(value: String): Self = StObject.set(x, "AL", value.asInstanceOf[js.Any])
      
      inline def setALUndefined: Self = StObject.set(x, "AL", js.undefined)
      
      inline def setAM(value: String): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setAMUndefined: Self = StObject.set(x, "AM", js.undefined)
      
      inline def setAO(value: String): Self = StObject.set(x, "AO", value.asInstanceOf[js.Any])
      
      inline def setAOUndefined: Self = StObject.set(x, "AO", js.undefined)
      
      inline def setAR(value: String): Self = StObject.set(x, "AR", value.asInstanceOf[js.Any])
      
      inline def setARUndefined: Self = StObject.set(x, "AR", js.undefined)
      
      inline def setAS(value: String): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
      
      inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
      
      inline def setAT(value: String): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      inline def setATUndefined: Self = StObject.set(x, "AT", js.undefined)
      
      inline def setAU(value: String): Self = StObject.set(x, "AU", value.asInstanceOf[js.Any])
      
      inline def setAUUndefined: Self = StObject.set(x, "AU", js.undefined)
      
      inline def setAW(value: String): Self = StObject.set(x, "AW", value.asInstanceOf[js.Any])
      
      inline def setAWUndefined: Self = StObject.set(x, "AW", js.undefined)
      
      inline def setAX(value: String): Self = StObject.set(x, "AX", value.asInstanceOf[js.Any])
      
      inline def setAXUndefined: Self = StObject.set(x, "AX", js.undefined)
      
      inline def setAZ(value: String): Self = StObject.set(x, "AZ", value.asInstanceOf[js.Any])
      
      inline def setAZUndefined: Self = StObject.set(x, "AZ", js.undefined)
      
      inline def setBA(value: String): Self = StObject.set(x, "BA", value.asInstanceOf[js.Any])
      
      inline def setBAUndefined: Self = StObject.set(x, "BA", js.undefined)
      
      inline def setBB(value: String): Self = StObject.set(x, "BB", value.asInstanceOf[js.Any])
      
      inline def setBBUndefined: Self = StObject.set(x, "BB", js.undefined)
      
      inline def setBD(value: String): Self = StObject.set(x, "BD", value.asInstanceOf[js.Any])
      
      inline def setBDUndefined: Self = StObject.set(x, "BD", js.undefined)
      
      inline def setBE(value: String): Self = StObject.set(x, "BE", value.asInstanceOf[js.Any])
      
      inline def setBEUndefined: Self = StObject.set(x, "BE", js.undefined)
      
      inline def setBF(value: String): Self = StObject.set(x, "BF", value.asInstanceOf[js.Any])
      
      inline def setBFUndefined: Self = StObject.set(x, "BF", js.undefined)
      
      inline def setBG(value: String): Self = StObject.set(x, "BG", value.asInstanceOf[js.Any])
      
      inline def setBGUndefined: Self = StObject.set(x, "BG", js.undefined)
      
      inline def setBH(value: String): Self = StObject.set(x, "BH", value.asInstanceOf[js.Any])
      
      inline def setBHUndefined: Self = StObject.set(x, "BH", js.undefined)
      
      inline def setBI(value: String): Self = StObject.set(x, "BI", value.asInstanceOf[js.Any])
      
      inline def setBIUndefined: Self = StObject.set(x, "BI", js.undefined)
      
      inline def setBJ(value: String): Self = StObject.set(x, "BJ", value.asInstanceOf[js.Any])
      
      inline def setBJUndefined: Self = StObject.set(x, "BJ", js.undefined)
      
      inline def setBL(value: String): Self = StObject.set(x, "BL", value.asInstanceOf[js.Any])
      
      inline def setBLUndefined: Self = StObject.set(x, "BL", js.undefined)
      
      inline def setBM(value: String): Self = StObject.set(x, "BM", value.asInstanceOf[js.Any])
      
      inline def setBMUndefined: Self = StObject.set(x, "BM", js.undefined)
      
      inline def setBN(value: String): Self = StObject.set(x, "BN", value.asInstanceOf[js.Any])
      
      inline def setBNUndefined: Self = StObject.set(x, "BN", js.undefined)
      
      inline def setBO(value: String): Self = StObject.set(x, "BO", value.asInstanceOf[js.Any])
      
      inline def setBOUndefined: Self = StObject.set(x, "BO", js.undefined)
      
      inline def setBQ(value: String): Self = StObject.set(x, "BQ", value.asInstanceOf[js.Any])
      
      inline def setBQUndefined: Self = StObject.set(x, "BQ", js.undefined)
      
      inline def setBR(value: String): Self = StObject.set(x, "BR", value.asInstanceOf[js.Any])
      
      inline def setBRUndefined: Self = StObject.set(x, "BR", js.undefined)
      
      inline def setBS(value: String): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBT(value: String): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      inline def setBTUndefined: Self = StObject.set(x, "BT", js.undefined)
      
      inline def setBW(value: String): Self = StObject.set(x, "BW", value.asInstanceOf[js.Any])
      
      inline def setBWUndefined: Self = StObject.set(x, "BW", js.undefined)
      
      inline def setBY(value: String): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
      
      inline def setBZ(value: String): Self = StObject.set(x, "BZ", value.asInstanceOf[js.Any])
      
      inline def setBZUndefined: Self = StObject.set(x, "BZ", js.undefined)
      
      inline def setCA(value: String): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
      
      inline def setCAUndefined: Self = StObject.set(x, "CA", js.undefined)
      
      inline def setCC(value: String): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      inline def setCCUndefined: Self = StObject.set(x, "CC", js.undefined)
      
      inline def setCD(value: String): Self = StObject.set(x, "CD", value.asInstanceOf[js.Any])
      
      inline def setCDUndefined: Self = StObject.set(x, "CD", js.undefined)
      
      inline def setCF(value: String): Self = StObject.set(x, "CF", value.asInstanceOf[js.Any])
      
      inline def setCFUndefined: Self = StObject.set(x, "CF", js.undefined)
      
      inline def setCG(value: String): Self = StObject.set(x, "CG", value.asInstanceOf[js.Any])
      
      inline def setCGUndefined: Self = StObject.set(x, "CG", js.undefined)
      
      inline def setCH(value: String): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCHUndefined: Self = StObject.set(x, "CH", js.undefined)
      
      inline def setCI(value: String): Self = StObject.set(x, "CI", value.asInstanceOf[js.Any])
      
      inline def setCIUndefined: Self = StObject.set(x, "CI", js.undefined)
      
      inline def setCK(value: String): Self = StObject.set(x, "CK", value.asInstanceOf[js.Any])
      
      inline def setCKUndefined: Self = StObject.set(x, "CK", js.undefined)
      
      inline def setCL(value: String): Self = StObject.set(x, "CL", value.asInstanceOf[js.Any])
      
      inline def setCLUndefined: Self = StObject.set(x, "CL", js.undefined)
      
      inline def setCM(value: String): Self = StObject.set(x, "CM", value.asInstanceOf[js.Any])
      
      inline def setCMUndefined: Self = StObject.set(x, "CM", js.undefined)
      
      inline def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
      
      inline def setCNUndefined: Self = StObject.set(x, "CN", js.undefined)
      
      inline def setCO(value: String): Self = StObject.set(x, "CO", value.asInstanceOf[js.Any])
      
      inline def setCOUndefined: Self = StObject.set(x, "CO", js.undefined)
      
      inline def setCR(value: String): Self = StObject.set(x, "CR", value.asInstanceOf[js.Any])
      
      inline def setCRUndefined: Self = StObject.set(x, "CR", js.undefined)
      
      inline def setCU(value: String): Self = StObject.set(x, "CU", value.asInstanceOf[js.Any])
      
      inline def setCUUndefined: Self = StObject.set(x, "CU", js.undefined)
      
      inline def setCV(value: String): Self = StObject.set(x, "CV", value.asInstanceOf[js.Any])
      
      inline def setCVUndefined: Self = StObject.set(x, "CV", js.undefined)
      
      inline def setCW(value: String): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      inline def setCWUndefined: Self = StObject.set(x, "CW", js.undefined)
      
      inline def setCX(value: String): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
      
      inline def setCXUndefined: Self = StObject.set(x, "CX", js.undefined)
      
      inline def setCY(value: String): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
      
      inline def setCYUndefined: Self = StObject.set(x, "CY", js.undefined)
      
      inline def setCZ(value: String): Self = StObject.set(x, "CZ", value.asInstanceOf[js.Any])
      
      inline def setCZUndefined: Self = StObject.set(x, "CZ", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDE(value: String): Self = StObject.set(x, "DE", value.asInstanceOf[js.Any])
      
      inline def setDEUndefined: Self = StObject.set(x, "DE", js.undefined)
      
      inline def setDJ(value: String): Self = StObject.set(x, "DJ", value.asInstanceOf[js.Any])
      
      inline def setDJUndefined: Self = StObject.set(x, "DJ", js.undefined)
      
      inline def setDK(value: String): Self = StObject.set(x, "DK", value.asInstanceOf[js.Any])
      
      inline def setDKUndefined: Self = StObject.set(x, "DK", js.undefined)
      
      inline def setDM(value: String): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      inline def setDMUndefined: Self = StObject.set(x, "DM", js.undefined)
      
      inline def setDO(value: String): Self = StObject.set(x, "DO", value.asInstanceOf[js.Any])
      
      inline def setDOUndefined: Self = StObject.set(x, "DO", js.undefined)
      
      inline def setDZ(value: String): Self = StObject.set(x, "DZ", value.asInstanceOf[js.Any])
      
      inline def setDZUndefined: Self = StObject.set(x, "DZ", js.undefined)
      
      inline def setEC(value: String): Self = StObject.set(x, "EC", value.asInstanceOf[js.Any])
      
      inline def setECUndefined: Self = StObject.set(x, "EC", js.undefined)
      
      inline def setEE(value: String): Self = StObject.set(x, "EE", value.asInstanceOf[js.Any])
      
      inline def setEEUndefined: Self = StObject.set(x, "EE", js.undefined)
      
      inline def setEG(value: String): Self = StObject.set(x, "EG", value.asInstanceOf[js.Any])
      
      inline def setEGUndefined: Self = StObject.set(x, "EG", js.undefined)
      
      inline def setEH(value: String): Self = StObject.set(x, "EH", value.asInstanceOf[js.Any])
      
      inline def setEHUndefined: Self = StObject.set(x, "EH", js.undefined)
      
      inline def setER(value: String): Self = StObject.set(x, "ER", value.asInstanceOf[js.Any])
      
      inline def setERUndefined: Self = StObject.set(x, "ER", js.undefined)
      
      inline def setES(value: String): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setESUndefined: Self = StObject.set(x, "ES", js.undefined)
      
      inline def setET(value: String): Self = StObject.set(x, "ET", value.asInstanceOf[js.Any])
      
      inline def setETUndefined: Self = StObject.set(x, "ET", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFI(value: String): Self = StObject.set(x, "FI", value.asInstanceOf[js.Any])
      
      inline def setFIUndefined: Self = StObject.set(x, "FI", js.undefined)
      
      inline def setFJ(value: String): Self = StObject.set(x, "FJ", value.asInstanceOf[js.Any])
      
      inline def setFJUndefined: Self = StObject.set(x, "FJ", js.undefined)
      
      inline def setFK(value: String): Self = StObject.set(x, "FK", value.asInstanceOf[js.Any])
      
      inline def setFKUndefined: Self = StObject.set(x, "FK", js.undefined)
      
      inline def setFM(value: String): Self = StObject.set(x, "FM", value.asInstanceOf[js.Any])
      
      inline def setFMUndefined: Self = StObject.set(x, "FM", js.undefined)
      
      inline def setFO(value: String): Self = StObject.set(x, "FO", value.asInstanceOf[js.Any])
      
      inline def setFOUndefined: Self = StObject.set(x, "FO", js.undefined)
      
      inline def setFR(value: String): Self = StObject.set(x, "FR", value.asInstanceOf[js.Any])
      
      inline def setFRUndefined: Self = StObject.set(x, "FR", js.undefined)
      
      inline def setGA(value: String): Self = StObject.set(x, "GA", value.asInstanceOf[js.Any])
      
      inline def setGAUndefined: Self = StObject.set(x, "GA", js.undefined)
      
      inline def setGB(value: String): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      inline def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
      
      inline def setGD(value: String): Self = StObject.set(x, "GD", value.asInstanceOf[js.Any])
      
      inline def setGDUndefined: Self = StObject.set(x, "GD", js.undefined)
      
      inline def setGE(value: String): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      inline def setGEUndefined: Self = StObject.set(x, "GE", js.undefined)
      
      inline def setGF(value: String): Self = StObject.set(x, "GF", value.asInstanceOf[js.Any])
      
      inline def setGFUndefined: Self = StObject.set(x, "GF", js.undefined)
      
      inline def setGG(value: String): Self = StObject.set(x, "GG", value.asInstanceOf[js.Any])
      
      inline def setGGUndefined: Self = StObject.set(x, "GG", js.undefined)
      
      inline def setGH(value: String): Self = StObject.set(x, "GH", value.asInstanceOf[js.Any])
      
      inline def setGHUndefined: Self = StObject.set(x, "GH", js.undefined)
      
      inline def setGI(value: String): Self = StObject.set(x, "GI", value.asInstanceOf[js.Any])
      
      inline def setGIUndefined: Self = StObject.set(x, "GI", js.undefined)
      
      inline def setGL(value: String): Self = StObject.set(x, "GL", value.asInstanceOf[js.Any])
      
      inline def setGLUndefined: Self = StObject.set(x, "GL", js.undefined)
      
      inline def setGM(value: String): Self = StObject.set(x, "GM", value.asInstanceOf[js.Any])
      
      inline def setGMUndefined: Self = StObject.set(x, "GM", js.undefined)
      
      inline def setGN(value: String): Self = StObject.set(x, "GN", value.asInstanceOf[js.Any])
      
      inline def setGNUndefined: Self = StObject.set(x, "GN", js.undefined)
      
      inline def setGP(value: String): Self = StObject.set(x, "GP", value.asInstanceOf[js.Any])
      
      inline def setGPUndefined: Self = StObject.set(x, "GP", js.undefined)
      
      inline def setGQ(value: String): Self = StObject.set(x, "GQ", value.asInstanceOf[js.Any])
      
      inline def setGQUndefined: Self = StObject.set(x, "GQ", js.undefined)
      
      inline def setGR(value: String): Self = StObject.set(x, "GR", value.asInstanceOf[js.Any])
      
      inline def setGRUndefined: Self = StObject.set(x, "GR", js.undefined)
      
      inline def setGT(value: String): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      inline def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
      
      inline def setGU(value: String): Self = StObject.set(x, "GU", value.asInstanceOf[js.Any])
      
      inline def setGUUndefined: Self = StObject.set(x, "GU", js.undefined)
      
      inline def setGW(value: String): Self = StObject.set(x, "GW", value.asInstanceOf[js.Any])
      
      inline def setGWUndefined: Self = StObject.set(x, "GW", js.undefined)
      
      inline def setGY(value: String): Self = StObject.set(x, "GY", value.asInstanceOf[js.Any])
      
      inline def setGYUndefined: Self = StObject.set(x, "GY", js.undefined)
      
      inline def setHK(value: String): Self = StObject.set(x, "HK", value.asInstanceOf[js.Any])
      
      inline def setHKUndefined: Self = StObject.set(x, "HK", js.undefined)
      
      inline def setHN(value: String): Self = StObject.set(x, "HN", value.asInstanceOf[js.Any])
      
      inline def setHNUndefined: Self = StObject.set(x, "HN", js.undefined)
      
      inline def setHR(value: String): Self = StObject.set(x, "HR", value.asInstanceOf[js.Any])
      
      inline def setHRUndefined: Self = StObject.set(x, "HR", js.undefined)
      
      inline def setHT(value: String): Self = StObject.set(x, "HT", value.asInstanceOf[js.Any])
      
      inline def setHTUndefined: Self = StObject.set(x, "HT", js.undefined)
      
      inline def setHU(value: String): Self = StObject.set(x, "HU", value.asInstanceOf[js.Any])
      
      inline def setHUUndefined: Self = StObject.set(x, "HU", js.undefined)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setIE(value: String): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      inline def setIEUndefined: Self = StObject.set(x, "IE", js.undefined)
      
      inline def setIL(value: String): Self = StObject.set(x, "IL", value.asInstanceOf[js.Any])
      
      inline def setILUndefined: Self = StObject.set(x, "IL", js.undefined)
      
      inline def setIM(value: String): Self = StObject.set(x, "IM", value.asInstanceOf[js.Any])
      
      inline def setIMUndefined: Self = StObject.set(x, "IM", js.undefined)
      
      inline def setIN(value: String): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
      
      inline def setINUndefined: Self = StObject.set(x, "IN", js.undefined)
      
      inline def setIO(value: String): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
      
      inline def setIOUndefined: Self = StObject.set(x, "IO", js.undefined)
      
      inline def setIQ(value: String): Self = StObject.set(x, "IQ", value.asInstanceOf[js.Any])
      
      inline def setIQUndefined: Self = StObject.set(x, "IQ", js.undefined)
      
      inline def setIR(value: String): Self = StObject.set(x, "IR", value.asInstanceOf[js.Any])
      
      inline def setIRUndefined: Self = StObject.set(x, "IR", js.undefined)
      
      inline def setIS(value: String): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setISUndefined: Self = StObject.set(x, "IS", js.undefined)
      
      inline def setIT(value: String): Self = StObject.set(x, "IT", value.asInstanceOf[js.Any])
      
      inline def setITUndefined: Self = StObject.set(x, "IT", js.undefined)
      
      inline def setJE(value: String): Self = StObject.set(x, "JE", value.asInstanceOf[js.Any])
      
      inline def setJEUndefined: Self = StObject.set(x, "JE", js.undefined)
      
      inline def setJM(value: String): Self = StObject.set(x, "JM", value.asInstanceOf[js.Any])
      
      inline def setJMUndefined: Self = StObject.set(x, "JM", js.undefined)
      
      inline def setJO(value: String): Self = StObject.set(x, "JO", value.asInstanceOf[js.Any])
      
      inline def setJOUndefined: Self = StObject.set(x, "JO", js.undefined)
      
      inline def setJP(value: String): Self = StObject.set(x, "JP", value.asInstanceOf[js.Any])
      
      inline def setJPUndefined: Self = StObject.set(x, "JP", js.undefined)
      
      inline def setKE(value: String): Self = StObject.set(x, "KE", value.asInstanceOf[js.Any])
      
      inline def setKEUndefined: Self = StObject.set(x, "KE", js.undefined)
      
      inline def setKG(value: String): Self = StObject.set(x, "KG", value.asInstanceOf[js.Any])
      
      inline def setKGUndefined: Self = StObject.set(x, "KG", js.undefined)
      
      inline def setKH(value: String): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
      
      inline def setKHUndefined: Self = StObject.set(x, "KH", js.undefined)
      
      inline def setKI(value: String): Self = StObject.set(x, "KI", value.asInstanceOf[js.Any])
      
      inline def setKIUndefined: Self = StObject.set(x, "KI", js.undefined)
      
      inline def setKM(value: String): Self = StObject.set(x, "KM", value.asInstanceOf[js.Any])
      
      inline def setKMUndefined: Self = StObject.set(x, "KM", js.undefined)
      
      inline def setKN(value: String): Self = StObject.set(x, "KN", value.asInstanceOf[js.Any])
      
      inline def setKNUndefined: Self = StObject.set(x, "KN", js.undefined)
      
      inline def setKP(value: String): Self = StObject.set(x, "KP", value.asInstanceOf[js.Any])
      
      inline def setKPUndefined: Self = StObject.set(x, "KP", js.undefined)
      
      inline def setKR(value: String): Self = StObject.set(x, "KR", value.asInstanceOf[js.Any])
      
      inline def setKRUndefined: Self = StObject.set(x, "KR", js.undefined)
      
      inline def setKW(value: String): Self = StObject.set(x, "KW", value.asInstanceOf[js.Any])
      
      inline def setKWUndefined: Self = StObject.set(x, "KW", js.undefined)
      
      inline def setKY(value: String): Self = StObject.set(x, "KY", value.asInstanceOf[js.Any])
      
      inline def setKYUndefined: Self = StObject.set(x, "KY", js.undefined)
      
      inline def setKZ(value: String): Self = StObject.set(x, "KZ", value.asInstanceOf[js.Any])
      
      inline def setKZUndefined: Self = StObject.set(x, "KZ", js.undefined)
      
      inline def setLA(value: String): Self = StObject.set(x, "LA", value.asInstanceOf[js.Any])
      
      inline def setLAUndefined: Self = StObject.set(x, "LA", js.undefined)
      
      inline def setLB(value: String): Self = StObject.set(x, "LB", value.asInstanceOf[js.Any])
      
      inline def setLBUndefined: Self = StObject.set(x, "LB", js.undefined)
      
      inline def setLC(value: String): Self = StObject.set(x, "LC", value.asInstanceOf[js.Any])
      
      inline def setLCUndefined: Self = StObject.set(x, "LC", js.undefined)
      
      inline def setLI(value: String): Self = StObject.set(x, "LI", value.asInstanceOf[js.Any])
      
      inline def setLIUndefined: Self = StObject.set(x, "LI", js.undefined)
      
      inline def setLK(value: String): Self = StObject.set(x, "LK", value.asInstanceOf[js.Any])
      
      inline def setLKUndefined: Self = StObject.set(x, "LK", js.undefined)
      
      inline def setLR(value: String): Self = StObject.set(x, "LR", value.asInstanceOf[js.Any])
      
      inline def setLRUndefined: Self = StObject.set(x, "LR", js.undefined)
      
      inline def setLS(value: String): Self = StObject.set(x, "LS", value.asInstanceOf[js.Any])
      
      inline def setLSUndefined: Self = StObject.set(x, "LS", js.undefined)
      
      inline def setLT(value: String): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
      
      inline def setLU(value: String): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      inline def setLUUndefined: Self = StObject.set(x, "LU", js.undefined)
      
      inline def setLV(value: String): Self = StObject.set(x, "LV", value.asInstanceOf[js.Any])
      
      inline def setLVUndefined: Self = StObject.set(x, "LV", js.undefined)
      
      inline def setLY(value: String): Self = StObject.set(x, "LY", value.asInstanceOf[js.Any])
      
      inline def setLYUndefined: Self = StObject.set(x, "LY", js.undefined)
      
      inline def setMA(value: String): Self = StObject.set(x, "MA", value.asInstanceOf[js.Any])
      
      inline def setMAUndefined: Self = StObject.set(x, "MA", js.undefined)
      
      inline def setMC(value: String): Self = StObject.set(x, "MC", value.asInstanceOf[js.Any])
      
      inline def setMCUndefined: Self = StObject.set(x, "MC", js.undefined)
      
      inline def setMD(value: String): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setMDUndefined: Self = StObject.set(x, "MD", js.undefined)
      
      inline def setME(value: String): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
      
      inline def setMEUndefined: Self = StObject.set(x, "ME", js.undefined)
      
      inline def setMF(value: String): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      inline def setMFUndefined: Self = StObject.set(x, "MF", js.undefined)
      
      inline def setMG(value: String): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      inline def setMGUndefined: Self = StObject.set(x, "MG", js.undefined)
      
      inline def setMH(value: String): Self = StObject.set(x, "MH", value.asInstanceOf[js.Any])
      
      inline def setMHUndefined: Self = StObject.set(x, "MH", js.undefined)
      
      inline def setMK(value: String): Self = StObject.set(x, "MK", value.asInstanceOf[js.Any])
      
      inline def setMKUndefined: Self = StObject.set(x, "MK", js.undefined)
      
      inline def setML(value: String): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
      
      inline def setMLUndefined: Self = StObject.set(x, "ML", js.undefined)
      
      inline def setMM(value: String): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      inline def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
      
      inline def setMN(value: String): Self = StObject.set(x, "MN", value.asInstanceOf[js.Any])
      
      inline def setMNUndefined: Self = StObject.set(x, "MN", js.undefined)
      
      inline def setMO(value: String): Self = StObject.set(x, "MO", value.asInstanceOf[js.Any])
      
      inline def setMOUndefined: Self = StObject.set(x, "MO", js.undefined)
      
      inline def setMP(value: String): Self = StObject.set(x, "MP", value.asInstanceOf[js.Any])
      
      inline def setMPUndefined: Self = StObject.set(x, "MP", js.undefined)
      
      inline def setMQ(value: String): Self = StObject.set(x, "MQ", value.asInstanceOf[js.Any])
      
      inline def setMQUndefined: Self = StObject.set(x, "MQ", js.undefined)
      
      inline def setMR(value: String): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      inline def setMRUndefined: Self = StObject.set(x, "MR", js.undefined)
      
      inline def setMS(value: String): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      inline def setMSUndefined: Self = StObject.set(x, "MS", js.undefined)
      
      inline def setMT(value: String): Self = StObject.set(x, "MT", value.asInstanceOf[js.Any])
      
      inline def setMTUndefined: Self = StObject.set(x, "MT", js.undefined)
      
      inline def setMU(value: String): Self = StObject.set(x, "MU", value.asInstanceOf[js.Any])
      
      inline def setMUUndefined: Self = StObject.set(x, "MU", js.undefined)
      
      inline def setMV(value: String): Self = StObject.set(x, "MV", value.asInstanceOf[js.Any])
      
      inline def setMVUndefined: Self = StObject.set(x, "MV", js.undefined)
      
      inline def setMW(value: String): Self = StObject.set(x, "MW", value.asInstanceOf[js.Any])
      
      inline def setMWUndefined: Self = StObject.set(x, "MW", js.undefined)
      
      inline def setMX(value: String): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      inline def setMXUndefined: Self = StObject.set(x, "MX", js.undefined)
      
      inline def setMY(value: String): Self = StObject.set(x, "MY", value.asInstanceOf[js.Any])
      
      inline def setMYUndefined: Self = StObject.set(x, "MY", js.undefined)
      
      inline def setMZ(value: String): Self = StObject.set(x, "MZ", value.asInstanceOf[js.Any])
      
      inline def setMZUndefined: Self = StObject.set(x, "MZ", js.undefined)
      
      inline def setNA(value: String): Self = StObject.set(x, "NA", value.asInstanceOf[js.Any])
      
      inline def setNAUndefined: Self = StObject.set(x, "NA", js.undefined)
      
      inline def setNC(value: String): Self = StObject.set(x, "NC", value.asInstanceOf[js.Any])
      
      inline def setNCUndefined: Self = StObject.set(x, "NC", js.undefined)
      
      inline def setNE(value: String): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      inline def setNEUndefined: Self = StObject.set(x, "NE", js.undefined)
      
      inline def setNF(value: String): Self = StObject.set(x, "NF", value.asInstanceOf[js.Any])
      
      inline def setNFUndefined: Self = StObject.set(x, "NF", js.undefined)
      
      inline def setNG(value: String): Self = StObject.set(x, "NG", value.asInstanceOf[js.Any])
      
      inline def setNGUndefined: Self = StObject.set(x, "NG", js.undefined)
      
      inline def setNI(value: String): Self = StObject.set(x, "NI", value.asInstanceOf[js.Any])
      
      inline def setNIUndefined: Self = StObject.set(x, "NI", js.undefined)
      
      inline def setNL(value: String): Self = StObject.set(x, "NL", value.asInstanceOf[js.Any])
      
      inline def setNLUndefined: Self = StObject.set(x, "NL", js.undefined)
      
      inline def setNO(value: String): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      inline def setNOUndefined: Self = StObject.set(x, "NO", js.undefined)
      
      inline def setNP(value: String): Self = StObject.set(x, "NP", value.asInstanceOf[js.Any])
      
      inline def setNPUndefined: Self = StObject.set(x, "NP", js.undefined)
      
      inline def setNR(value: String): Self = StObject.set(x, "NR", value.asInstanceOf[js.Any])
      
      inline def setNRUndefined: Self = StObject.set(x, "NR", js.undefined)
      
      inline def setNU(value: String): Self = StObject.set(x, "NU", value.asInstanceOf[js.Any])
      
      inline def setNUUndefined: Self = StObject.set(x, "NU", js.undefined)
      
      inline def setNZ(value: String): Self = StObject.set(x, "NZ", value.asInstanceOf[js.Any])
      
      inline def setNZUndefined: Self = StObject.set(x, "NZ", js.undefined)
      
      inline def setOM(value: String): Self = StObject.set(x, "OM", value.asInstanceOf[js.Any])
      
      inline def setOMUndefined: Self = StObject.set(x, "OM", js.undefined)
      
      inline def setPA(value: String): Self = StObject.set(x, "PA", value.asInstanceOf[js.Any])
      
      inline def setPAUndefined: Self = StObject.set(x, "PA", js.undefined)
      
      inline def setPE(value: String): Self = StObject.set(x, "PE", value.asInstanceOf[js.Any])
      
      inline def setPEUndefined: Self = StObject.set(x, "PE", js.undefined)
      
      inline def setPF(value: String): Self = StObject.set(x, "PF", value.asInstanceOf[js.Any])
      
      inline def setPFUndefined: Self = StObject.set(x, "PF", js.undefined)
      
      inline def setPG(value: String): Self = StObject.set(x, "PG", value.asInstanceOf[js.Any])
      
      inline def setPGUndefined: Self = StObject.set(x, "PG", js.undefined)
      
      inline def setPH(value: String): Self = StObject.set(x, "PH", value.asInstanceOf[js.Any])
      
      inline def setPHUndefined: Self = StObject.set(x, "PH", js.undefined)
      
      inline def setPK(value: String): Self = StObject.set(x, "PK", value.asInstanceOf[js.Any])
      
      inline def setPKUndefined: Self = StObject.set(x, "PK", js.undefined)
      
      inline def setPL(value: String): Self = StObject.set(x, "PL", value.asInstanceOf[js.Any])
      
      inline def setPLUndefined: Self = StObject.set(x, "PL", js.undefined)
      
      inline def setPM(value: String): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setPMUndefined: Self = StObject.set(x, "PM", js.undefined)
      
      inline def setPR(value: String): Self = StObject.set(x, "PR", value.asInstanceOf[js.Any])
      
      inline def setPRUndefined: Self = StObject.set(x, "PR", js.undefined)
      
      inline def setPS(value: String): Self = StObject.set(x, "PS", value.asInstanceOf[js.Any])
      
      inline def setPSUndefined: Self = StObject.set(x, "PS", js.undefined)
      
      inline def setPT(value: String): Self = StObject.set(x, "PT", value.asInstanceOf[js.Any])
      
      inline def setPTUndefined: Self = StObject.set(x, "PT", js.undefined)
      
      inline def setPW(value: String): Self = StObject.set(x, "PW", value.asInstanceOf[js.Any])
      
      inline def setPWUndefined: Self = StObject.set(x, "PW", js.undefined)
      
      inline def setPY(value: String): Self = StObject.set(x, "PY", value.asInstanceOf[js.Any])
      
      inline def setPYUndefined: Self = StObject.set(x, "PY", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setQA(value: String): Self = StObject.set(x, "QA", value.asInstanceOf[js.Any])
      
      inline def setQAUndefined: Self = StObject.set(x, "QA", js.undefined)
      
      inline def setRE(value: String): Self = StObject.set(x, "RE", value.asInstanceOf[js.Any])
      
      inline def setREUndefined: Self = StObject.set(x, "RE", js.undefined)
      
      inline def setRO(value: String): Self = StObject.set(x, "RO", value.asInstanceOf[js.Any])
      
      inline def setROUndefined: Self = StObject.set(x, "RO", js.undefined)
      
      inline def setRS(value: String): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      inline def setRSUndefined: Self = StObject.set(x, "RS", js.undefined)
      
      inline def setRU(value: String): Self = StObject.set(x, "RU", value.asInstanceOf[js.Any])
      
      inline def setRUUndefined: Self = StObject.set(x, "RU", js.undefined)
      
      inline def setRW(value: String): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
      
      inline def setRWUndefined: Self = StObject.set(x, "RW", js.undefined)
      
      inline def setSA(value: String): Self = StObject.set(x, "SA", value.asInstanceOf[js.Any])
      
      inline def setSAUndefined: Self = StObject.set(x, "SA", js.undefined)
      
      inline def setSB(value: String): Self = StObject.set(x, "SB", value.asInstanceOf[js.Any])
      
      inline def setSBUndefined: Self = StObject.set(x, "SB", js.undefined)
      
      inline def setSC(value: String): Self = StObject.set(x, "SC", value.asInstanceOf[js.Any])
      
      inline def setSCUndefined: Self = StObject.set(x, "SC", js.undefined)
      
      inline def setSD(value: String): Self = StObject.set(x, "SD", value.asInstanceOf[js.Any])
      
      inline def setSDUndefined: Self = StObject.set(x, "SD", js.undefined)
      
      inline def setSE(value: String): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      inline def setSEUndefined: Self = StObject.set(x, "SE", js.undefined)
      
      inline def setSG(value: String): Self = StObject.set(x, "SG", value.asInstanceOf[js.Any])
      
      inline def setSGUndefined: Self = StObject.set(x, "SG", js.undefined)
      
      inline def setSH(value: String): Self = StObject.set(x, "SH", value.asInstanceOf[js.Any])
      
      inline def setSHUndefined: Self = StObject.set(x, "SH", js.undefined)
      
      inline def setSI(value: String): Self = StObject.set(x, "SI", value.asInstanceOf[js.Any])
      
      inline def setSIUndefined: Self = StObject.set(x, "SI", js.undefined)
      
      inline def setSJ(value: String): Self = StObject.set(x, "SJ", value.asInstanceOf[js.Any])
      
      inline def setSJUndefined: Self = StObject.set(x, "SJ", js.undefined)
      
      inline def setSK(value: String): Self = StObject.set(x, "SK", value.asInstanceOf[js.Any])
      
      inline def setSKUndefined: Self = StObject.set(x, "SK", js.undefined)
      
      inline def setSL(value: String): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
      
      inline def setSLUndefined: Self = StObject.set(x, "SL", js.undefined)
      
      inline def setSM(value: String): Self = StObject.set(x, "SM", value.asInstanceOf[js.Any])
      
      inline def setSMUndefined: Self = StObject.set(x, "SM", js.undefined)
      
      inline def setSN(value: String): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
      
      inline def setSNUndefined: Self = StObject.set(x, "SN", js.undefined)
      
      inline def setSO(value: String): Self = StObject.set(x, "SO", value.asInstanceOf[js.Any])
      
      inline def setSOUndefined: Self = StObject.set(x, "SO", js.undefined)
      
      inline def setSR(value: String): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
      
      inline def setSRUndefined: Self = StObject.set(x, "SR", js.undefined)
      
      inline def setSS(value: String): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setSTUndefined: Self = StObject.set(x, "ST", js.undefined)
      
      inline def setSV(value: String): Self = StObject.set(x, "SV", value.asInstanceOf[js.Any])
      
      inline def setSVUndefined: Self = StObject.set(x, "SV", js.undefined)
      
      inline def setSX(value: String): Self = StObject.set(x, "SX", value.asInstanceOf[js.Any])
      
      inline def setSXUndefined: Self = StObject.set(x, "SX", js.undefined)
      
      inline def setSY(value: String): Self = StObject.set(x, "SY", value.asInstanceOf[js.Any])
      
      inline def setSYUndefined: Self = StObject.set(x, "SY", js.undefined)
      
      inline def setSZ(value: String): Self = StObject.set(x, "SZ", value.asInstanceOf[js.Any])
      
      inline def setSZUndefined: Self = StObject.set(x, "SZ", js.undefined)
      
      inline def setTA(value: String): Self = StObject.set(x, "TA", value.asInstanceOf[js.Any])
      
      inline def setTAUndefined: Self = StObject.set(x, "TA", js.undefined)
      
      inline def setTC(value: String): Self = StObject.set(x, "TC", value.asInstanceOf[js.Any])
      
      inline def setTCUndefined: Self = StObject.set(x, "TC", js.undefined)
      
      inline def setTD(value: String): Self = StObject.set(x, "TD", value.asInstanceOf[js.Any])
      
      inline def setTDUndefined: Self = StObject.set(x, "TD", js.undefined)
      
      inline def setTG(value: String): Self = StObject.set(x, "TG", value.asInstanceOf[js.Any])
      
      inline def setTGUndefined: Self = StObject.set(x, "TG", js.undefined)
      
      inline def setTH(value: String): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      inline def setTHUndefined: Self = StObject.set(x, "TH", js.undefined)
      
      inline def setTJ(value: String): Self = StObject.set(x, "TJ", value.asInstanceOf[js.Any])
      
      inline def setTJUndefined: Self = StObject.set(x, "TJ", js.undefined)
      
      inline def setTK(value: String): Self = StObject.set(x, "TK", value.asInstanceOf[js.Any])
      
      inline def setTKUndefined: Self = StObject.set(x, "TK", js.undefined)
      
      inline def setTL(value: String): Self = StObject.set(x, "TL", value.asInstanceOf[js.Any])
      
      inline def setTLUndefined: Self = StObject.set(x, "TL", js.undefined)
      
      inline def setTM(value: String): Self = StObject.set(x, "TM", value.asInstanceOf[js.Any])
      
      inline def setTMUndefined: Self = StObject.set(x, "TM", js.undefined)
      
      inline def setTN(value: String): Self = StObject.set(x, "TN", value.asInstanceOf[js.Any])
      
      inline def setTNUndefined: Self = StObject.set(x, "TN", js.undefined)
      
      inline def setTO(value: String): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTOUndefined: Self = StObject.set(x, "TO", js.undefined)
      
      inline def setTR(value: String): Self = StObject.set(x, "TR", value.asInstanceOf[js.Any])
      
      inline def setTRUndefined: Self = StObject.set(x, "TR", js.undefined)
      
      inline def setTT(value: String): Self = StObject.set(x, "TT", value.asInstanceOf[js.Any])
      
      inline def setTTUndefined: Self = StObject.set(x, "TT", js.undefined)
      
      inline def setTV(value: String): Self = StObject.set(x, "TV", value.asInstanceOf[js.Any])
      
      inline def setTVUndefined: Self = StObject.set(x, "TV", js.undefined)
      
      inline def setTW(value: String): Self = StObject.set(x, "TW", value.asInstanceOf[js.Any])
      
      inline def setTWUndefined: Self = StObject.set(x, "TW", js.undefined)
      
      inline def setTZ(value: String): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
      
      inline def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
      
      inline def setUA(value: String): Self = StObject.set(x, "UA", value.asInstanceOf[js.Any])
      
      inline def setUAUndefined: Self = StObject.set(x, "UA", js.undefined)
      
      inline def setUG(value: String): Self = StObject.set(x, "UG", value.asInstanceOf[js.Any])
      
      inline def setUGUndefined: Self = StObject.set(x, "UG", js.undefined)
      
      inline def setUS(value: String): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
      
      inline def setUSUndefined: Self = StObject.set(x, "US", js.undefined)
      
      inline def setUY(value: String): Self = StObject.set(x, "UY", value.asInstanceOf[js.Any])
      
      inline def setUYUndefined: Self = StObject.set(x, "UY", js.undefined)
      
      inline def setUZ(value: String): Self = StObject.set(x, "UZ", value.asInstanceOf[js.Any])
      
      inline def setUZUndefined: Self = StObject.set(x, "UZ", js.undefined)
      
      inline def setVA(value: String): Self = StObject.set(x, "VA", value.asInstanceOf[js.Any])
      
      inline def setVAUndefined: Self = StObject.set(x, "VA", js.undefined)
      
      inline def setVC(value: String): Self = StObject.set(x, "VC", value.asInstanceOf[js.Any])
      
      inline def setVCUndefined: Self = StObject.set(x, "VC", js.undefined)
      
      inline def setVE(value: String): Self = StObject.set(x, "VE", value.asInstanceOf[js.Any])
      
      inline def setVEUndefined: Self = StObject.set(x, "VE", js.undefined)
      
      inline def setVG(value: String): Self = StObject.set(x, "VG", value.asInstanceOf[js.Any])
      
      inline def setVGUndefined: Self = StObject.set(x, "VG", js.undefined)
      
      inline def setVI(value: String): Self = StObject.set(x, "VI", value.asInstanceOf[js.Any])
      
      inline def setVIUndefined: Self = StObject.set(x, "VI", js.undefined)
      
      inline def setVN(value: String): Self = StObject.set(x, "VN", value.asInstanceOf[js.Any])
      
      inline def setVNUndefined: Self = StObject.set(x, "VN", js.undefined)
      
      inline def setVU(value: String): Self = StObject.set(x, "VU", value.asInstanceOf[js.Any])
      
      inline def setVUUndefined: Self = StObject.set(x, "VU", js.undefined)
      
      inline def setWF(value: String): Self = StObject.set(x, "WF", value.asInstanceOf[js.Any])
      
      inline def setWFUndefined: Self = StObject.set(x, "WF", js.undefined)
      
      inline def setWS(value: String): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      inline def setWSUndefined: Self = StObject.set(x, "WS", js.undefined)
      
      inline def setXK(value: String): Self = StObject.set(x, "XK", value.asInstanceOf[js.Any])
      
      inline def setXKUndefined: Self = StObject.set(x, "XK", js.undefined)
      
      inline def setYE(value: String): Self = StObject.set(x, "YE", value.asInstanceOf[js.Any])
      
      inline def setYEUndefined: Self = StObject.set(x, "YE", js.undefined)
      
      inline def setYT(value: String): Self = StObject.set(x, "YT", value.asInstanceOf[js.Any])
      
      inline def setYTUndefined: Self = StObject.set(x, "YT", js.undefined)
      
      inline def setZA(value: String): Self = StObject.set(x, "ZA", value.asInstanceOf[js.Any])
      
      inline def setZAUndefined: Self = StObject.set(x, "ZA", js.undefined)
      
      inline def setZM(value: String): Self = StObject.set(x, "ZM", value.asInstanceOf[js.Any])
      
      inline def setZMUndefined: Self = StObject.set(x, "ZM", js.undefined)
      
      inline def setZW(value: String): Self = StObject.set(x, "ZW", value.asInstanceOf[js.Any])
      
      inline def setZWUndefined: Self = StObject.set(x, "ZW", js.undefined)
      
      inline def setZZ(value: String): Self = StObject.set(x, "ZZ", value.asInstanceOf[js.Any])
      
      inline def setZZUndefined: Self = StObject.set(x, "ZZ", js.undefined)
    }
  }
  
  type Locale = String
  
  type LocaleProperty = Locale | js.Array[Locale]
  
  type Metadata = MetadataJson
  
  type PhoneInputWithCountrySelectType[InputComponentProps] = ComponentClass[Props[InputComponentProps], State[Props[InputComponentProps]]]
  
  type Props[InputComponentProps] = FeatureProps[InputComponentProps] & OnChange
  
  trait State[Props] extends StObject {
    
    var countries: js.UndefOr[js.Array[Country]] = js.undefined
    
    var country: js.UndefOr[Country] = js.undefined
    
    // `forceRerender` is a "dummy" object that is set to `{}`
    // in order to force a rerender of the component.
    var forceRerender: js.UndefOr[js.Object] = js.undefined
    
    var hasUserSelectedACountry: js.UndefOr[Boolean] = js.undefined
    
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    // `phoneDigits` are the parsed phone number digits,
    // including a leading `+`, if present.
    // Examples of `phoneDigits`:
    // * `undefined`
    // * "+78005553535"
    // * "88005553535"
    var phoneDigits: js.UndefOr[String] = js.undefined
    
    // `props` are stored in state in order to be able to compare
    // new `props` with the "previous" ones in `state.props`
    // in `PhoneInputWithCountry.getDerivedStateFromProps()`.
    var props: Props
    
    var value: js.UndefOr[Value] = js.undefined
  }
  object State {
    
    inline def apply[Props](props: Props): State[Props] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[Props]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State[?], Props] (val x: Self & State[Props]) extends AnyVal {
      
      inline def setCountries(value: js.Array[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setCountriesVarargs(value: Country*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setForceRerender(value: js.Object): Self = StObject.set(x, "forceRerender", value.asInstanceOf[js.Any])
      
      inline def setForceRerenderUndefined: Self = StObject.set(x, "forceRerender", js.undefined)
      
      inline def setHasUserSelectedACountry(value: Boolean): Self = StObject.set(x, "hasUserSelectedACountry", value.asInstanceOf[js.Any])
      
      inline def setHasUserSelectedACountryUndefined: Self = StObject.set(x, "hasUserSelectedACountry", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setPhoneDigits(value: String): Self = StObject.set(x, "phoneDigits", value.asInstanceOf[js.Any])
      
      inline def setPhoneDigitsUndefined: Self = StObject.set(x, "phoneDigits", js.undefined)
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Value = E164Number
  
  trait _CountryOption extends StObject
  
  trait _LabelKey extends StObject
}
