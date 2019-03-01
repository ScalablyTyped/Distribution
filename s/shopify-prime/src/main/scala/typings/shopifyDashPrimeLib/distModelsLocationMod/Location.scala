package typings
package shopifyDashPrimeLib.distModelsLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The first line of the address.
    */
  var address1: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The second line of the address.
    */
  var address2: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The city the location is in.
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The country the location is in.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The two-letter code (ISO 3166-1 alpha-2 format) corresponding to country the location is in.
    */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time (ISO 8601 format) when the location was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this is a fulfillment service location. If true, then the location is a fulfillment service location.
    * If false, then the location was created by the merchant and isn't tied to a fulfillment service.
    */
  var legacy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the location.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The phone number of the location. This value can contain special characters like - and +.
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The province the location is in.
    */
  var province: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The two-letter code corresponding to province or state the location is in.
    */
  var province_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time (ISO 8601 format) when the location was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The zip or postal code.
    */
  var zip: js.UndefOr[java.lang.String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    address1: java.lang.String = null,
    address2: java.lang.String = null,
    admin_graphql_api_id: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    country_code: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    legacy: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    province: java.lang.String = null,
    province_code: java.lang.String = null,
    updated_at: java.lang.String = null,
    zip: java.lang.String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (address1 != null) __obj.updateDynamic("address1")(address1)
    if (address2 != null) __obj.updateDynamic("address2")(address2)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (legacy != null) __obj.updateDynamic("legacy")(legacy)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (province != null) __obj.updateDynamic("province")(province)
    if (province_code != null) __obj.updateDynamic("province_code")(province_code)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (zip != null) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[Location]
  }
}

