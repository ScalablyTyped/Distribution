package typings
package shopifyDashPrimeLib.distModelsAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The mailing address.
    */
  var address1: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An additional field for the mailing address.
    */
  var address2: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The city.
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The company.
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The country.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The two-letter country code corresponding to the country.
    */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The normalized country name.
    */
  var country_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether this address is the default address.
    */
  var default: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The first name.
    */
  var first_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The last name.
    */
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The phone number.
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The province or state name
    */
  var province: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The two-letter province or state code.
    */
  var province_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ZIP or postal code.
    */
  var zip: js.UndefOr[java.lang.String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    address1: java.lang.String = null,
    address2: java.lang.String = null,
    admin_graphql_api_id: java.lang.String = null,
    city: java.lang.String = null,
    company: java.lang.String = null,
    country: java.lang.String = null,
    country_code: java.lang.String = null,
    country_name: java.lang.String = null,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    first_name: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    last_name: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    province: java.lang.String = null,
    province_code: java.lang.String = null,
    zip: java.lang.String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (address1 != null) __obj.updateDynamic("address1")(address1)
    if (address2 != null) __obj.updateDynamic("address2")(address2)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (city != null) __obj.updateDynamic("city")(city)
    if (company != null) __obj.updateDynamic("company")(company)
    if (country != null) __obj.updateDynamic("country")(country)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (country_name != null) __obj.updateDynamic("country_name")(country_name)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (province != null) __obj.updateDynamic("province")(province)
    if (province_code != null) __obj.updateDynamic("province_code")(province_code)
    if (zip != null) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[Address]
  }
}

