package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1TenderNs.CardBrandEnum
import typings.squareDashConnect.squareDashConnectMod.V1TenderNs.EntryMethodEnum
import typings.squareDashConnect.squareDashConnectMod.V1TenderNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Tender")
@js.native
class V1Tender () extends js.Object {
  /**
    * The brand of credit card provided. See [V1TenderCardBrand](#type-v1tendercardbrand) for possible values.
    */
  var card_brand: js.UndefOr[CardBrandEnum] = js.native
  /**
    * The amount of total_money returned to the buyer as change.
    */
  var change_back_money: js.UndefOr[V1Money] = js.native
  /**
    * The ID of the employee that processed the tender.
    */
  var employee_id: js.UndefOr[String] = js.native
  /**
    * The tender's unique ID. See [V1TenderEntryMethod](#type-v1tenderentrymethod) for possible values.
    */
  var entry_method: js.UndefOr[EntryMethodEnum] = js.native
  /**
    * The tender's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates whether or not the tender is associated with an exchange. If is_exchange is true, the tender represents
    * the value of goods returned in an exchange not the actual money paid. The exchange value reduces the tender
    * amounts needed to pay for items purchased in the exchange.
    */
  var is_exchange: js.UndefOr[Boolean] = js.native
  /**
    * A human-readable description of the tender.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The last four digits of the provided credit card's account number.
    */
  var pan_suffix: js.UndefOr[String] = js.native
  /**
    * Notes entered by the merchant about the tender at the time of payment, if any.
    * Typically only present for tender with the type: OTHER.
    */
  var payment_note: js.UndefOr[String] = js.native
  /**
    * The URL of the receipt for the tender.
    */
  var receipt_url: js.UndefOr[String] = js.native
  /**
    * The total of all refunds applied to this tender. This amount is always negative or zero.
    */
  var refunded_money: js.UndefOr[V1Money] = js.native
  /**
    * The time when the tender was settled, in ISO 8601 format.
    */
  var settled_at: js.UndefOr[String] = js.native
  /**
    * The time when the tender was created, in ISO 8601 format.
    */
  var tendered_at: js.UndefOr[String] = js.native
  /**
    * The amount of total_money applied to the payment.
    */
  var tendered_money: js.UndefOr[V1Money] = js.native
  /**
    * The total amount of money provided in this form of tender.
    */
  var total_money: js.UndefOr[V1Money] = js.native
  /**
    * The type of tender. See [V1TenderType](#type-v1tendertype) for possible values
    */
  var `type`: js.UndefOr[TypeEnum] = js.native
}

