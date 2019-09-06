package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentItemization")
@js.native
class V1PaymentItemization () extends js.Object {
  /**
    * The total of all discounts applied to the itemization. This value is always negative or zero.
    */
  var discount_money: js.UndefOr[V1Money] = js.native
  /**
    * All discounts applied to this itemization.
    */
  var discounts: js.UndefOr[js.Array[V1PaymentDiscount]] = js.native
  /**
    * The total cost of the itemization and its modifiers, not including taxes or discounts.
    */
  var gross_sales_money: js.UndefOr[V1Money] = js.native
  /**
    * Details of the item, including its unique identifier and the identifier of the item variation purchased.
    */
  var item_detail: js.UndefOr[V1PaymentItemDetail] = js.native
  /**
    * The name of the item variation purchased, if any.
    */
  var item_variation_name: js.UndefOr[String] = js.native
  /**
    * The type of purchase that the itemization represents, such as an ITEM or CUSTOM_AMOUNT See
    * [V1PaymentItemizationItemizationType](#type-v1paymentitemizationitemizationtype) for possible values
    */
  var itemization_type: js.UndefOr[String] = js.native
  /**
    * All modifier options applied to this itemization.
    */
  var modifiers: js.UndefOr[js.Array[V1PaymentModifier]] = js.native
  /**
    * The item's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The sum of gross_sales_money and discount_money.
    */
  var net_sales_money: js.UndefOr[V1Money] = js.native
  /**
    * Notes entered by the merchant about the item at the time of payment, if any.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The quantity of the item purchased. This can be a decimal value.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The cost of a single unit of this item.
    */
  var single_quantity_money: js.UndefOr[V1Money] = js.native
  /**
    * All taxes applied to this itemization.
    */
  var taxes: js.UndefOr[js.Array[V1PaymentTax]] = js.native
  /**
    * The total cost of the item, including all taxes and discounts.
    */
  var total_money: js.UndefOr[V1Money] = js.native
}

