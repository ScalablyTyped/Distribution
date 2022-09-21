package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usAutocompletePro {
  
  @JSImport("smartystreets-javascript-sdk", "usAutocompletePro.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(/**
      * The part of the address that has already been typed. Maximum length is 128 bytes.
      */
    search: String) = this()
    
    /**
      * Exclude the following states from the results. When this parameter is used, no other include_ parameters may be used.
      *
      * Note: The prefer_geolocation parameter MUST be set to none if the customer's current location is in a state specified in this parameter; otherwise the customer will see addresses from
      * their current location.
      *
      * See [filtering](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-filtering) for more information.
      * @example ['SD', 'ND', 'MT']
      */
    var excludeStates: js.Array[String] = js.native
    
    /**
      * Limit the results to only those cities and states listed, as well as those in include_only_states.
      *
      * See [filtering](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-filtering) for more information.
      * @example ['DENVER,AURORA,CO', 'OMAHA,NE']
      */
    var includeOnlyCities: js.Array[String] = js.native
    
    /**
      * Limit the results to only those states listed, as well as those listed in include_only_cities.
      *
      * See [filtering](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-filtering) for more information.
      * @example ['UT', 'ID', 'MT'] or ['CONTIGUOUS'] or ['ALLSTATES']
      */
    var includeOnlyStates: js.Array[String] = js.native
    
    /**
      * Limit the results to only those ZIP Codes listed. When this parameter is used, no other _cities, _states parameters can be used.
      *
      * Note: When using this parameter, the prefer_geolocation parameter MUST be set to none.
      *
      * See [filtering](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-filtering) for more information.
      * @example ['90210', '06504']
      */
    var includeOnlyZIPCodes: js.Array[String] = js.native
    
    /**
      * Maximum number of address suggestions to return; range [1, 10].
      */
    var maxResults: Double = js.native
    
    /**
      * Display suggestions with the listed cities and states at the top of the suggestion list, as well as those listed in prefer_states. Example: DENVER,AURORA,CO;OMAHA,NE
      *
      * See [preferencing](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-preference) for more information.
      */
    var preferCities: js.Array[String] = js.native
    
    /**
      * If omitted or set to city, it uses the sender's IP address to determine location, then automatically adds the city and state to the prefer_cities value. This parameter takes precedence
      * over other _include or _exclude parameters meaning that if it is not set to none, you may see addresses from the customer's area when you may not desire it.
      *
      * Acceptable values are: empty string (which defaults to city), none, or city.
      *
      * Notes:
      * 1. If any _zip_codes parameters are used, this parameter MUST be set to none)
      * 2. If the request to the Autocomplete Pro API goes through a proxy, you will need to set an [X-Forwarded-For](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For)
      * header specifying the user's IP address.
      */
    var preferGeolocation: String = js.native
    
    /**
      * Specifies the percentage of address suggestions that should be preferred and will appear at the top of the suggestion list. Expressed as an integer value, range [0, 100]. See
      * [preferencing](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-preference) for more information.
      */
    var preferRatio: Double = js.native
    
    /**
      * Display suggestions with the listed states at the top of the suggestion list, as well as those listed in prefer_cities. Examples: UT;ID;MT
      *
      * See [preferencing](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-preference) for more information.
      */
    var preferStates: js.Array[String] = js.native
    
    /**
      * Display suggestions with the listed ZIP Codes at the top of the suggestion list. When this parameter is used, no other _cities or _states parameters can be used.
      *
      * Note: When using this parameter, the prefer_geolocation parameter MUST be set to none.
      *
      * See [preferencing](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-preference) for more information.
      */
    var preferZIPCodes: js.Array[String] = js.native
    
    var result: js.Array[Suggestion] = js.native
    
    /**
      * Required. The part of the address that has already been typed. Maximum length is 128 bytes.
      */
    var search: String = js.native
    
    /**
      * Used by UI components to request a list of secondaries (up to 100) for the specified address. See
      * [Secondary Number Expansion](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-secondary-expansion) for usage information.
      */
    var selected: String = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usAutocompletePro.Suggestion")
  @js.native
  open class Suggestion protected () extends StObject {
    def this(responseData: Any) = this()
    
    var city: String = js.native
    
    var entries: Double = js.native
    
    var secondary: String = js.native
    
    var state: String = js.native
    
    var streetLine: String = js.native
    
    var zipcode: String = js.native
  }
}
