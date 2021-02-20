package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Address")
@js.native
class Address () extends StObject {
  
  /**
    * The first line of the address. Fields that start with `address_line` provide the address's most specific
    * details, like street number, street name, and building name. They do *not* provide less specific details like
    * city, state/province, or country (these details are provided in other fields).
    */
  var address_line_1: js.UndefOr[String] = js.native
  
  /**
    * The second line of the address, if any.
    */
  var address_line_2: js.UndefOr[String] = js.native
  
  /**
    * The third line of the address, if any.
    */
  var address_line_3: js.UndefOr[String] = js.native
  
  /**
    * A civil entity within the address's country. In the US, this is the state.
    */
  var administrative_district_level_1: js.UndefOr[String] = js.native
  
  /**
    * A civil entity within the address's `administrative_district_level_1`. In the US, this is the county.
    */
  var administrative_district_level_2: js.UndefOr[String] = js.native
  
  /**
    * A civil entity within the address's `administrative_district_level_2`, if any.
    */
  var administrative_district_level_3: js.UndefOr[String] = js.native
  
  /**
    * The address's country, in ISO 3166-1-alpha-2 format. See [Country](#type-country) for possible values
    */
  var country: js.UndefOr[CountryType] = js.native
  
  /**
    * Optional first name when it's representing recipient.
    */
  var first_name: js.UndefOr[String] = js.native
  
  /**
    * Optional last name when it's representing recipient.
    */
  var last_name: js.UndefOr[String] = js.native
  
  /**
    * The city or town of the address.
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * Optional organization name when it's representing recipient.
    */
  var organization: js.UndefOr[String] = js.native
  
  /**
    * The address's postal code.
    */
  var postal_code: js.UndefOr[String] = js.native
  
  /**
    * A civil region within the address's `locality`, if any.
    */
  var sublocality: js.UndefOr[String] = js.native
  
  /**
    * A civil region within the address's `sublocality`, if any.
    */
  var sublocality_2: js.UndefOr[String] = js.native
  
  /**
    * A civil region within the address's `sublocality_2`, if any.
    */
  var sublocality_3: js.UndefOr[String] = js.native
}
