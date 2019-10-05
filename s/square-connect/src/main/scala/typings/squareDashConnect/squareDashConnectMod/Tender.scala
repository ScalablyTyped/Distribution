package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum
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
    * The total amount of the tender, including `tip_money`. If the tender has a `payment_id`, the `total_money` of
    * the corresponding [Payment](#type-payment) will be equal to the `amount_money` of the tender.
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
    * The ID of the [Payment](#type-payment) that corresponds to this tender.
    * This value is only present for payments created with the v2 Payments API.
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
  var `type`: TypeEnum = js.native
}

@JSImport("square-connect", "Tender")
@js.native
object Tender extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CARD extends TypeEnum
    
    @js.native
    sealed trait CASH extends TypeEnum
    
    @js.native
    sealed trait NO_SALE extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD extends TypeEnum
    
    @js.native
    sealed trait THIRD_PARTY_CARD extends TypeEnum
    
    /* "CARD" */ val CARD: typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum.CARD with String = js.native
    /* "CASH" */ val CASH: typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum.CASH with String = js.native
    /* "NO_SALE" */ val NO_SALE: typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum.NO_SALE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum.OTHER with String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum.SQUARE_GIFT_CARD with String = js.native
    /* "THIRD_PARTY_CARD" */ val THIRD_PARTY_CARD: typings.squareDashConnect.squareDashConnectMod.Tender.TypeEnum.THIRD_PARTY_CARD with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

