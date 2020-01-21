package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Merchant")
@js.native
class V1Merchant () extends js.Object {
  /**
    * Capabilities that are enabled for the merchant's Square account.
    * Capabilities that are not listed in this array are not enabled for the account.
    */
  var account_capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether the merchant account corresponds to a single-location account (LOCATION) or a business account
    * (BUSINESS). This value is almost always LOCATION.
    * See [V1MerchantAccountType](#type-v1merchantaccounttype) for possible values.
    */
  var account_type: js.UndefOr[String] = js.native
  /**
    * The address of the merchant's business.
    */
  var business_address: js.UndefOr[Address] = js.native
  /**
    * The name of the merchant's business.
    */
  var business_name: js.UndefOr[String] = js.native
  /**
    * The phone number of the merchant's business.
    */
  var business_phone: js.UndefOr[V1PhoneNumber] = js.native
  /**
    * The type of business operated by the merchant.
    * See [V1MerchantBusinessType](#type-v1merchantbusinesstype) for possible values.
    */
  var business_type: js.UndefOr[String] = js.native
  /**
    * The country associated with the merchant account, in ISO 3166-1-alpha-2 format.
    */
  var country_code: js.UndefOr[String] = js.native
  /**
    * The currency associated with the merchant account, in ISO 4217 format. For example, the currency code for US
    * dollars is USD.
    */
  var currency_code: js.UndefOr[String] = js.native
  /**
    * The email address associated with the merchant account.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The merchant account's unique identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The language associated with the merchant account, in BCP 47 format.
    */
  var language_code: js.UndefOr[String] = js.native
  /**
    * Additional information for a single-location account specified by its associated business account, if it has one.
    */
  var location_details: js.UndefOr[V1MerchantLocationDetails] = js.native
  /**
    * The URL of the merchant's online store.
    */
  var market_url: js.UndefOr[String] = js.native
  /**
    * The name associated with the merchant account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The merchant's shipping address.
    */
  var shipping_address: js.UndefOr[Address] = js.native
}

