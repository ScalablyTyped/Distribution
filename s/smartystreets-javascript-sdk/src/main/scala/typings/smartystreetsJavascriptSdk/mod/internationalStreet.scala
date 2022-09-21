package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internationalStreet {
  
  @JSImport("smartystreets-javascript-sdk", "internationalStreet.Candidate")
  @js.native
  open class Candidate protected () extends StObject {
    def this(reponseData: Any) = this()
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address1: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address10: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address11: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address12: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address2: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address3: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address4: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address5: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address6: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address7: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address8: String = js.native
    
    /**
      * If **address_precision** = **DeliveryPoint** or **Premise**, these fields will contain the correctly formatted address for mailing in the relevant country, split into individual address
      * lines. (**Note**: These fields may contain values that are not referenced in the address components.)
      *
      * If **address_precision** ≠ **DeliveryPoint** or **Premise**, the address fields may contain standardized address information or even the original input data.
      */
    var address9: String = js.native
    
    /** See "[Analysis](https://smartystreets.com/docs/cloud/international-street-api#analysis)" table. Contains information about the validation and the precision of the output address. */
    var analysis: Any = js.native
    
    /** See "[Components](https://smartystreets.com/docs/cloud/international-street-api#components)" table. Contains the various basic elements of the address. */
    var components: Any = js.native
    
    /** See "[Metadata](https://smartystreets.com/docs/cloud/international-street-api#metadata)" table. Contains ancillary data about each address. */
    var metadata: Any = js.native
    
    /** The name of the recipient, firm, or company at this address. The output will be identical to the input. */
    var organization: String = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "internationalStreet.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(country: String, freeform: String) = this()
    
    /**
      * The first address line
      * @example Calle Proc. San Sebastián, 15
      */
    var address1: String = js.native
    
    /** The second address line (if any) */
    var address2: String = js.native
    
    /** The third address line (if any) */
    var address3: String = js.native
    
    /** The fourth address line (if any) */
    var address4: String = js.native
    
    /**
      * The state or province name or abbreviation
      * @example Alberta or AB
      */
    var administrativeArea: String = js.native
    
    /**
      * (required) This must be entered with every address. Country Name or [ISO classification (ISO-3, ISO-2 or ISO-N)](https://www.iso.org/obp/ui/#search/code/). Address validation will fail if
      * this is missing.
      * @example Brazil, BRA, BR, or 076
      */
    var country: String = js.native
    
    val ensureEnoughInfo: Boolean = js.native
    
    val ensureValidData: Boolean = js.native
    
    /**
      * The entire address in a single field (without the country). If freeform is specified, all other address input fields (except country) will be ignored.
      * @example Via Santa Maria di Costantinopoli, 72 46030-Tabellano MN
      */
    var freeform: String = js.native
    
    /** Set to true to enable geocoding (disabled by default). See the [examples section](https://smartystreets.com/docs/cloud/international-street-api#withgeocode) for, well, an example. */
    var geocode: String = js.native
    
    /**
      * A unique identifier generated by you for this address for use within your application; this field will be copied into the output.
      * @example 123456
      */
    var inputId: String = js.native
    
    /**
      * When not set, the output language will match the language of the input values. When set to native, the results will always be in the language of the output country. When set to latin,
      * the results will always be provided using a Latin character set. The following character sets can be transliterated, into either native or Latin characters: Cyrillic, Hellenic, Hebrew,
      * Kanji, Simplified Chinese, Arabic, Thai, Hangul.
      */
    var language: String = js.native
    
    /**
      * The city name
      * @example Paris
      */
    var locality: String = js.native
    
    /**
      * The name of the recipient, firm, or company at this address
      * @example Robert Smith OR The Clean Oil Company
      */
    var organization: String = js.native
    
    /**
      * The postal code
      * @example 90210-2301
      */
    var postalCode: String = js.native
    
    var result: js.Array[Candidate] = js.native
  }
}
