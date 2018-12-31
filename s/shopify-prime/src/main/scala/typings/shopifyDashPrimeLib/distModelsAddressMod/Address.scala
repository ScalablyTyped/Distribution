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

