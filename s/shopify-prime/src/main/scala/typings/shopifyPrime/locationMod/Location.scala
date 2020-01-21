package typings.shopifyPrime.locationMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends ShopifyObject {
  /**
    * The first line of the address.
    */
  var address1: js.UndefOr[String] = js.undefined
  /**
    * The second line of the address.
    */
  var address2: js.UndefOr[String] = js.undefined
  /**
    * The city the location is in.
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * The country the location is in.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The two-letter code (ISO 3166-1 alpha-2 format) corresponding to country the location is in.
    */
  var country_code: js.UndefOr[String] = js.undefined
  /**
    * The date and time (ISO 8601 format) when the location was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * Whether this is a fulfillment service location. If true, then the location is a fulfillment service location.
    * If false, then the location was created by the merchant and isn't tied to a fulfillment service.
    */
  var legacy: js.UndefOr[String] = js.undefined
  /**
    * The name of the location.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The phone number of the location. This value can contain special characters like - and +.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The province the location is in.
    */
  var province: js.UndefOr[String] = js.undefined
  /**
    * The two-letter code corresponding to province or state the location is in.
    */
  var province_code: js.UndefOr[String] = js.undefined
  /**
    * The date and time (ISO 8601 format) when the location was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * The zip or postal code.
    */
  var zip: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    address1: String = null,
    address2: String = null,
    admin_graphql_api_id: String = null,
    city: String = null,
    country: String = null,
    country_code: String = null,
    created_at: String = null,
    id: Int | Double = null,
    legacy: String = null,
    name: String = null,
    phone: String = null,
    province: String = null,
    province_code: String = null,
    updated_at: String = null,
    zip: String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (address1 != null) __obj.updateDynamic("address1")(address1.asInstanceOf[js.Any])
    if (address2 != null) __obj.updateDynamic("address2")(address2.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (country_code != null) __obj.updateDynamic("country_code")(country_code.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (legacy != null) __obj.updateDynamic("legacy")(legacy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (province != null) __obj.updateDynamic("province")(province.asInstanceOf[js.Any])
    if (province_code != null) __obj.updateDynamic("province_code")(province_code.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

