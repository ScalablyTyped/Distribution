package typings.smartystreetsJavascriptSdk.mod

import typings.smartystreetsJavascriptSdk.smartystreetsJavascriptSdkStrings.adminarea
import typings.smartystreetsJavascriptSdk.smartystreetsJavascriptSdkStrings.geocodes
import typings.smartystreetsJavascriptSdk.smartystreetsJavascriptSdkStrings.locality
import typings.smartystreetsJavascriptSdk.smartystreetsJavascriptSdkStrings.postalcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internationalAddressAutocomplete {
  
  @JSImport("smartystreets-javascript-sdk", "internationalAddressAutocomplete.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(search: String, country: String) = this()
    
    /**
      * Required. The ISO3 Alpha-3 country code where the desired address is located.
      * Only uppercase values are allowed.
      * See [supported country codes](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#supported-country-codes). Maximum length is 3 bytes.
      */
    var country: String = js.native
    
    /**
      * When using geolocation=geocodes, and latitude/longitude,
      * this field specifies the radius in MILES from the geocode point.
      */
    var distance: Double = js.native
    
    /**
      * Use the client's IP address to limit results to the surrounding area.
      *
      * The possible options are:
      * 1. adminarea - Limit results to the client's administrative area (state, province, etc.).
      * 2. locality - Limit results to the client's locality (city).
      * 3. postalcode - Limit results to the postal code where the client's IP address is registered.
      * 4. geocodes - Limit results to an area surrounding the lat/lon where the user's IP address is registered. See also distance.
      *
      * See [filtering](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#pro-filtering) for more information.
      */
    var geolocation: adminarea | locality | postalcode | geocodes = js.native
    
    /**
      * Limit the results to only the administrative area provided.
      * An administrative area is like a state in the United States, a province in Canada, or region in France.
      * Please use the correct postal name for the administrative area (e.g. use "NSW" instead of "New South Wales").
      *
      * See [filtering](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#pro-filtering) for more information.
      * @example 'NSW'
      */
    var includeOnlyAdministrativeArea: String = js.native
    
    /**
      * Limit the results to only the locality provided.
      * A locality is a significant population center (i.e. city, town, or village).
      *
      * See [filtering](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#pro-filtering) for more information.
      * @example 'Paris'
      */
    var includeOnlyLocality: String = js.native
    
    /**
      * Limit the results to only the postal code provided.
      * When this parameter is used, no include_only_administrative_area and/or include_only_locality parameters can be used.
      *
      * See [filtering](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#pro-filtering) for more information.
      * @example '29200'
      */
    var includeOnlyPostalCode: String = js.native
    
    /**
      * Limit the results to the surrounding area specified by latitude and longitude. See also distance
      *
      * Notes: This must be used with the longitude parameter.
      *
      * See [filtering](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#pro-filtering) for more information.
      * @example '-2.0234'
      */
    var latitude: String = js.native
    
    /**
      * Limit the results to the surrounding area specified by latitude and longitude. See also distance
      *
      * Notes: This must be used with the latitude parameter.
      *
      * See [filtering](https://www.smarty.com/docs/cloud/international-address-autocomplete-api#pro-filtering) for more information.
      * @example '44.0234'
      */
    var longitude: String = js.native
    
    /**
      * Maximum number of address suggestions to return; range [1, 10].
      */
    var maxResults: Double = js.native
    
    var result: js.Array[Suggestion] = js.native
    
    /**
      * Required. The part of the address that has already been typed. Maximum length is 128 bytes.
      */
    var search: String = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "internationalAddressAutocomplete.Suggestion")
  @js.native
  open class Suggestion protected () extends StObject {
    def this(responseData: Any) = this()
    
    var administrativeArea: String = js.native
    
    var countryIso3: Double = js.native
    
    var locality: String = js.native
    
    var postalCode: String = js.native
    
    var street: String = js.native
  }
}
