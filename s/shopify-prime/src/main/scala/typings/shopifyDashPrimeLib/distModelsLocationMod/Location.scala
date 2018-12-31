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

