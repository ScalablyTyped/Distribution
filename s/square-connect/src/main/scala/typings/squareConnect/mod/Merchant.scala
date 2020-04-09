package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Merchant")
@js.native
class Merchant () extends js.Object {
  /**
    * The business name of the merchant.
    */
  var business_name: js.UndefOr[String] = js.native
  /**
    * The country code associated with the merchant account, in ISO 3166-1-alpha-2 format.
    * See [Country](#type-country) for possible values.
    */
  var country: String = js.native
  /**
    * The currency associated with the merchant account, in ISO 4217 format. See [Currency](#type-currency) for possible values
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The Square-issued ID of the merchant.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The language code associated with the merchant account, in BCP 47 format.
    */
  var language_code: js.UndefOr[String] = js.native
  /**
    * The merchant status, active or inactive. See [MerchantStatus](#type-merchantstatus) for possible values
    */
  var status: js.UndefOr[String] = js.native
}

