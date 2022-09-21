package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.CARD
import typings.squareConnect.squareConnectStrings.CASH
import typings.squareConnect.squareConnectStrings.NO_SALE
import typings.squareConnect.squareConnectStrings.OTHER
import typings.squareConnect.squareConnectStrings.SQUARE_GIFT_CARD
import typings.squareConnect.squareConnectStrings.THIRD_PARTY_CARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Tender")
@js.native
open class Tender () extends StObject {
  
  /**
    * Additional recipients (other than the merchant) receiving a portion of this tender.
    * For example, fees assessed on the purchase by a third party integration.
    */
  var additional_recipients: js.UndefOr[js.Array[AdditionalRecipient]] = js.native
  
  /**
    * The total amount of the tender, including `tip_money`. If the tender has a `payment_id`, the `total_money` of
    * the corresponding `Payment` will be equal to the `amount_money` of the tender.
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
    * The timestamp for when the tender was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * If the tender is associated with a customer or represents a customer's card on file, this is the ID of the
    * associated customer.
    */
  var customer_id: js.UndefOr[String] = js.native
  
  /**
    * The tender's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transaction's associated location.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * An optional note associated with the tender at the time of payment.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * The ID of the `Payment` that corresponds to this tender. This value is only present for payments created with the v2 Payments API.
    */
  var payment_id: js.UndefOr[String] = js.native
  
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
  var transaction_id: js.UndefOr[String] = js.native
  
  /**
    * The type of tender, such as `CARD` or `CASH`. See [TenderType](#type-tendertype) for possible values.
    */
  var `type`: CARD | CASH | THIRD_PARTY_CARD | SQUARE_GIFT_CARD | NO_SALE | OTHER = js.native
}
