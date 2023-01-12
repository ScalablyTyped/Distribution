package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usZipcode {
  
  @JSImport("smartystreets-javascript-sdk", "usZipcode.Lookup")
  @js.native
  open class Lookup () extends StObject {
    def this(/** The city name */
    city: String) = this()
    def this(/** The city name */
    city: String, /** State name or two-letter abbreviation */
    state: String) = this()
    def this(/** The city name */
    city: Unit, /** State name or two-letter abbreviation */
    state: String) = this()
    def this(
      /** The city name */
    city: String,
      /** State name or two-letter abbreviation */
    state: String,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String
    ) = this()
    def this(
      /** The city name */
    city: String,
      /** State name or two-letter abbreviation */
    state: Unit,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String
    ) = this()
    def this(
      /** The city name */
    city: Unit,
      /** State name or two-letter abbreviation */
    state: String,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String
    ) = this()
    def this(
      /** The city name */
    city: Unit,
      /** State name or two-letter abbreviation */
    state: Unit,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String
    ) = this()
    def this(
      /** The city name */
    city: String,
      /** State name or two-letter abbreviation */
    state: String,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: String,
      /** State name or two-letter abbreviation */
    state: String,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: Unit,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: String,
      /** State name or two-letter abbreviation */
    state: Unit,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: String,
      /** State name or two-letter abbreviation */
    state: Unit,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: Unit,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: Unit,
      /** State name or two-letter abbreviation */
    state: String,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: Unit,
      /** State name or two-letter abbreviation */
    state: String,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: Unit,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: Unit,
      /** State name or two-letter abbreviation */
    state: Unit,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: String,
      inputId: String
    ) = this()
    def this(
      /** The city name */
    city: Unit,
      /** State name or two-letter abbreviation */
    state: Unit,
      /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    zipCode: Unit,
      inputId: String
    ) = this()
    
    /** The city name */
    var city: String = js.native
    
    /** A unique identifier for this address used in your application; this field will be copied into the output. */
    var inputId: String = js.native
    
    var result: js.Array[Result] = js.native
    
    /** State name or two-letter abbreviation */
    var state: String = js.native
    
    /** The ZIP Code. See the [paragraphs](https://smartystreets.com/docs/cloud/us-zipcode-api#zip-code-inputs) below this table for a few relevant details. */
    var zipCode: String = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usZipcode.Result")
  @js.native
  open class Result protected () extends StObject {
    def this(responseData: Any) = this()
    
    /** A [list of cities](https://smartystreets.com/docs/cloud/us-zipcode-api#cities) and their states that match the input */
    var cities: js.Array[City] = js.native
    
    /** The positional index, or ordering, of the input that is associated with this result */
    var inputIndex: String = js.native
    
    /**
      * For a lookup with no matches, [reason explains why the lookup failed](https://smartystreets.com/docs/cloud/us-zipcode-api#statuses)
      * - **blank** - Blank lookup (you must provide a ZIP Code and/or City/State combination).
      * - **invalid_state** - Invalid State name or abbreviation.
      * - **invalid_city** - Invalid City for the given State.
      * - **invalid_zipcode** - Invalid ZIP Code.
      * - **conflict** - Conflicting ZIP Code/City/State information.
      */
    var reason: String = js.native
    
    /** For a lookup with no matches, [status classifies the kind of failure](https://smartystreets.com/docs/cloud/us-zipcode-api#statuses) and always comes with a reason */
    var status: String = js.native
    
    var valid: Boolean = js.native
    
    /** A [list of ZIP Codes](https://smartystreets.com/docs/cloud/us-zipcode-api#zipcodes) that match the input */
    var zipcodes: js.Array[ZipCode] = js.native
  }
  
  trait City extends StObject {
    
    /** The name of the city */
    var city: String
    
    /** A boolean value indicating whether or not the city name is an approved USPS mailing name */
    var mailableCity: String
    
    /** The state name */
    var state: String
    
    /** The official, two-letter state abbreviation */
    var stateAbbreviation: String
  }
  object City {
    
    inline def apply(city: String, mailableCity: String, state: String, stateAbbreviation: String): City = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], mailableCity = mailableCity.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any])
      __obj.asInstanceOf[City]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: City] (val x: Self) extends AnyVal {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setMailableCity(value: String): Self = StObject.set(x, "mailableCity", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAbbreviation(value: String): Self = StObject.set(x, "stateAbbreviation", value.asInstanceOf[js.Any])
    }
  }
  
  trait County extends StObject {
    
    var countyFips: Any
    
    var countyName: String
    
    var state: String
    
    var stateAbbreviation: String
  }
  object County {
    
    inline def apply(countyFips: Any, countyName: String, state: String, stateAbbreviation: String): County = {
      val __obj = js.Dynamic.literal(countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any])
      __obj.asInstanceOf[County]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: County] (val x: Self) extends AnyVal {
      
      inline def setCountyFips(value: Any): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
      
      inline def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAbbreviation(value: String): Self = StObject.set(x, "stateAbbreviation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZipCode extends StObject {
    
    /**
      * The county FIPS codes, county names, state abbreviations, and states, that share the same zip code.
      *
      * Note: The county names listed here pertain to the 5-digit ZIP Code, not necessarily the city.
      * @example
      * Input: zipcode=42223
      * Output: [
      * 	{
      * 		"county_fips":"21047",
      * 		"county_name":"Christian",
      * 		"state_abbreviation":"KY",
      * 		"state":"Kentucky"
      * 	},
      * 	{
      * 		"county_fips":"47125",
      * 		"county_name":"Montgomery",
      * 		"state_abbreviation":"TN",
      * 		"state":"Tennessee"
      * 	}
      * ]
      */
    var alternateCounties: js.Array[County]
    
    /** [The county FIPS code](https://smartystreets.com/articles/county-fips-codes) */
    var countyFips: Any
    
    /**
      * The name of the [county in which the ZIP Code is located](https://smartystreets.com/articles/county-by-zip-code)
      *
      * Note: The county name listed here pertains to the 5-digit ZIP Code, not necessarily the city.
      */
    var countyName: String
    
    /** A string containing the default city name for this ZIP Code */
    var defaultCity: String
    
    /** The approximate latitude geo-coordinate */
    var latitude: Double
    
    /** The approximate longitude geo-coordinate */
    var longitude: Double
    
    /**
      * Indicates the precision of the latitude and longitude values.
      * - **None** — Coordinates not known. Reasons could include: address is invalid, military address (APO or FPO), lat/lon coordinates not available.
      * - **Zip5** — Accurate to a 5-digit ZIP Code level (least precise)
      * - **Zip6** — Accurate to a 6-digit ZIP Code level
      * - **Zip7** — Accurate to a 7-digit ZIP Code level
      * - **Zip8** — Accurate to an 8-digit ZIP Code level
      * - **Zip9** — Accurate to a [9-digit ZIP Code](https://smartystreets.com/articles/zip-4-code) level (most precise but NOT [rooftop level](https://smartystreets.com/docs/geocoding-accuracy))
      */
    var precision: String
    
    /** The state name */
    var state: String
    
    /** The official, two-letter state abbreviation */
    var stateAbbreviation: String
    
    /** The 5-digit ZIP Code */
    var zipcode: String
    
    /**
      * The type of ZIP Code. Possible values:
      * - **S** - Standard (regular ZIP Code)
      * - **M** - Military (APO/FPO military ZIP Code. Also includes DPO - Diplomatic addresses)
      * - **P** - P.O. Box (serves only post-office boxes)
      * - **U** - Unique (belongs primarily to a firm
      */
    var zipcodeType: String
  }
  object ZipCode {
    
    inline def apply(
      alternateCounties: js.Array[County],
      countyFips: Any,
      countyName: String,
      defaultCity: String,
      latitude: Double,
      longitude: Double,
      precision: String,
      state: String,
      stateAbbreviation: String,
      zipcode: String,
      zipcodeType: String
    ): ZipCode = {
      val __obj = js.Dynamic.literal(alternateCounties = alternateCounties.asInstanceOf[js.Any], countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], defaultCity = defaultCity.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any], zipcodeType = zipcodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZipCode] (val x: Self) extends AnyVal {
      
      inline def setAlternateCounties(value: js.Array[County]): Self = StObject.set(x, "alternateCounties", value.asInstanceOf[js.Any])
      
      inline def setAlternateCountiesVarargs(value: County*): Self = StObject.set(x, "alternateCounties", js.Array(value*))
      
      inline def setCountyFips(value: Any): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
      
      inline def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
      
      inline def setDefaultCity(value: String): Self = StObject.set(x, "defaultCity", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAbbreviation(value: String): Self = StObject.set(x, "stateAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
      
      inline def setZipcodeType(value: String): Self = StObject.set(x, "zipcodeType", value.asInstanceOf[js.Any])
    }
  }
}
