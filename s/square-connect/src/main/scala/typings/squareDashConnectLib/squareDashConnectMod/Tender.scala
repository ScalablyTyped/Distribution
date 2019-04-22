package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Tender")
@js.native
class Tender () extends js.Object {
  /**
    * Additional recipients (other than the merchant) receiving a portion of this tender.
    * For example, fees assessed on the purchase by a third party integration.
    */
  var additional_recipients: js.UndefOr[js.Array[AdditionalRecipient]] = js.native
  /**
    * The amount of the tender.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * The details of the card tender. This value is present only if the value of `type` is `CARD`.
    */
  var card_details: js.UndefOr[TenderCardDetails] = js.native
  /**
    * The details of the cash tender. This value is present only if the value of `type` is `CASH`.
    */
  var cash_details: js.UndefOr[TenderCashDetails] = js.native
  /**
    * The time when the tender was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * If the tender is associated with a customer or represents a customer's card on file, this is the ID of the
    * associated customer.
    */
  var customer_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The tender's unique ID.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the transaction's associated location.
    */
  var location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * An optional note associated with the tender at the time of payment.
    */
  var note: js.UndefOr[java.lang.String] = js.native
  /**
    * The amount of any Square processing fees applied to the tender. This field is not immediately populated when a
    * new transaction is created. It is usually available after about ten seconds.
    */
  var processing_fee_money: js.UndefOr[Money] = js.native
  /**
    * The tip's amount of the tender.
    */
  var tip_money: js.UndefOr[Money] = js.native
  /**
    * The ID of the tender's associated transaction.
    */
  var transaction_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The type of tender, such as `CARD` or `CASH`. See [TenderType](#type-tendertype) for possible values.
    */
  var `type`: squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum = js.native
}

