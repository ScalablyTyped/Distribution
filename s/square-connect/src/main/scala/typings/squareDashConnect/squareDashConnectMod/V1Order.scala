package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Order")
@js.native
class V1Order () extends js.Object {
  /**
    * For Bitcoin transactions, the price of the buyer's order in satoshi (100 million satoshi equals 1 BTC).
    */
  var btc_price_satoshi: js.UndefOr[Double] = js.native
  /**
    * For Bitcoin transactions, the address that the buyer sent Bitcoin to.
    */
  var btc_receive_address: js.UndefOr[String] = js.native
  /**
    * The email address of the order's buyer.
    */
  var buyer_email: js.UndefOr[String] = js.native
  /**
    * A note provided by the buyer when the order was created, if any.
    */
  var buyer_note: js.UndefOr[String] = js.native
  /**
    * A note provided by the merchant when the order's state was set to CANCELED, if any.
    */
  var canceled_note: js.UndefOr[String] = js.native
  /**
    * A note provided by the merchant when the order's state was set to COMPLETED, if any
    */
  var completed_note: js.UndefOr[String] = js.native
  /**
    * The time when the order was created, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The time when the order expires if no action is taken, in ISO 8601 format.
    */
  var expires_at: js.UndefOr[String] = js.native
  /**
    * The order's unique identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The history of actions associated with the order.
    */
  var order_history: js.UndefOr[js.Array[V1OrderHistoryEntry]] = js.native
  /**
    * The unique identifier of the payment associated with the order.
    */
  var payment_id: js.UndefOr[String] = js.native
  /**
    * The promo code provided by the buyer, if any.
    */
  var promo_code: js.UndefOr[String] = js.native
  /**
    * The name of the order's buyer.
    */
  var recipient_name: js.UndefOr[String] = js.native
  /**
    * The phone number to use for the order's delivery.
    */
  var recipient_phone_number: js.UndefOr[String] = js.native
  /**
    * A note provided by the merchant when the order's state was set to REFUNDED, if any.
    */
  var refunded_note: js.UndefOr[String] = js.native
  /**
    * The address to ship the order to.
    */
  var shipping_address: js.UndefOr[Address] = js.native
  /**
    * Whether the tax is an ADDITIVE tax or an INCLUSIVE tax. See [V1OrderState](#type-v1orderstate) for possible
    * values
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The amount of all items purchased in the order, before taxes and shipping.
    */
  var subtotal_money: js.UndefOr[V1Money] = js.native
  /**
    * The tender used to pay for the order.
    */
  var tender: js.UndefOr[V1Tender] = js.native
  /**
    * The total of all discounts applied to the order.
    */
  var total_discount_money: js.UndefOr[V1Money] = js.native
  /**
    * The total cost of the order.
    */
  var total_price_money: js.UndefOr[V1Money] = js.native
  /**
    * The shipping cost for the order.
    */
  var total_shipping_money: js.UndefOr[V1Money] = js.native
  /**
    * The total of all taxes applied to the order.
    */
  var total_tax_money: js.UndefOr[V1Money] = js.native
  /**
    * The time when the order was last modified, in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

