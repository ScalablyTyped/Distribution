package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usAutocomplete {
  
  @JSImport("smartystreets-javascript-sdk", "usAutocomplete.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(prefix: String) = this()
    
    /**
      * Exclude the following cities from the results.
      *
      * See [filtering](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-filtering) for more information.
      */
    var cityFilter: js.Array[String] = js.native
    
    /**
      * Whether to prefer address suggestions in the user's city and state, based on their IP address. (If the request to the Autocomplete API goes through a proxy, you will need to set an
      * [X-Forwarded-For](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For) header specifying the user's IP address.)
      */
    var geolocate: Boolean = js.native
    
    /**
      * If the geolocate field is set to true then setting this field to city causes the geolocated results that bubble up to the top of the response to be from the city/state corresponding to the
      * sender's IP address. Setting this field to state causes results from the sender's entire state to be preferred.
      */
    var geolocatePrecision: String = js.native
    
    /**
      * Maximum number of address suggestions, range [1, 10].
      * @default 10
      */
    var maxSuggestions: Double = js.native
    
    /**
      * A list of cities/states to prefer at the top of the results.
      *
      * See [preferencing](https://smartystreets.com/docs/cloud/us-autocomplete-basic-api#preference) for more information.
      */
    var prefer: js.Array[String] = js.native
    
    /**
      * Specifies the percentage of address suggestions that should be from preferred cities/states. Expressed as a decimal value, range [0, 1] (input out of bounds is adjusted).
      *
      * See [preferencing](https://smartystreets.com/docs/cloud/us-autocomplete-basic-api#preference) for more information.
      * @default 0.333333333
      */
    var preferRatio: Double = js.native
    
    /**
      * Required. The part of the address that has already been typed. Maximum length is 128 bytes.
      */
    var prefix: String = js.native
    
    var result: js.Array[Suggestion] = js.native
    
    /**
      * Exclude the following states from the results.
      *
      * See [filtering](https://smartystreets.com/docs/cloud/us-autocomplete-pro-api#pro-filtering) for more information.
      * @example ['SD', 'ND', 'MT']
      */
    var stateFilter: js.Array[String] = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usAutocomplete.Suggestion")
  @js.native
  open class Suggestion protected () extends StObject {
    def this(responseData: Any) = this()
    
    var city: String = js.native
    
    var state: String = js.native
    
    var streetLine: String = js.native
    
    var text: String = js.native
  }
}
