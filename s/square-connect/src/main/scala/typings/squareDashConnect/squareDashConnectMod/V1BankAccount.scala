package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1BankAccount")
@js.native
class V1BankAccount () extends js.Object {
  /**
    * The last few digits of the bank account number.
    */
  var account_number_suffix: js.UndefOr[String] = js.native
  /**
    * The name of the bank that manages the account.
    */
  var bank_name: js.UndefOr[String] = js.native
  /**
    * The currency code of the currency associated with the bank account, in ISO 4217 format.
    * For example, the currency code for US dollars is USD.
    */
  var currency_code: js.UndefOr[String] = js.native
  /**
    * The bank account's Square-issued ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The Square-issued ID of the merchant associated with the bank account.
    */
  var merchant_id: js.UndefOr[String] = js.native
  /**
    * The name associated with the bank account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The bank account's routing number.
    */
  var routing_number: js.UndefOr[String] = js.native
  /**
    * The bank account's type (for example, savings or checking).
    * See [V1BankAccountType](#type-v1bankaccounttype) for possible values.
    */
  var `type`: js.UndefOr[String] = js.native
}

