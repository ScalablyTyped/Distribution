package typings.shopifyPrime.addressMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends ShopifyObject {
  /**
    * The mailing address.
    */
  var address1: js.UndefOr[String] = js.undefined
  /**
    * An additional field for the mailing address.
    */
  var address2: js.UndefOr[String] = js.undefined
  /**
    * The city.
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * The company.
    */
  var company: js.UndefOr[String] = js.undefined
  /**
    * The country.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The two-letter country code corresponding to the country.
    */
  var country_code: js.UndefOr[String] = js.undefined
  /**
    * The normalized country name.
    */
  var country_name: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether this address is the default address.
    */
  var default: js.UndefOr[Boolean] = js.undefined
  /**
    * The first name.
    */
  var first_name: js.UndefOr[String] = js.undefined
  /**
    * The last name.
    */
  var last_name: js.UndefOr[String] = js.undefined
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The phone number.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The province or state name
    */
  var province: js.UndefOr[String] = js.undefined
  /**
    * The two-letter province or state code.
    */
  var province_code: js.UndefOr[String] = js.undefined
  /**
    * The ZIP or postal code.
    */
  var zip: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    address1: String = null,
    address2: String = null,
    admin_graphql_api_id: String = null,
    city: String = null,
    company: String = null,
    country: String = null,
    country_code: String = null,
    country_name: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    first_name: String = null,
    id: Int | Double = null,
    last_name: String = null,
    name: String = null,
    phone: String = null,
    province: String = null,
    province_code: String = null,
    zip: String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (address1 != null) __obj.updateDynamic("address1")(address1.asInstanceOf[js.Any])
    if (address2 != null) __obj.updateDynamic("address2")(address2.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (country_code != null) __obj.updateDynamic("country_code")(country_code.asInstanceOf[js.Any])
    if (country_name != null) __obj.updateDynamic("country_name")(country_name.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (province != null) __obj.updateDynamic("province")(province.asInstanceOf[js.Any])
    if (province_code != null) __obj.updateDynamic("province_code")(province_code.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

