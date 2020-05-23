package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.inventoryBehaviorMod.InventoryBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCreateOptions extends js.Object {
  var inventory_behavior: js.UndefOr[InventoryBehavior] = js.undefined
  var send_fulfillment_receipt: js.UndefOr[Boolean] = js.undefined
  var send_receipt: js.UndefOr[Boolean] = js.undefined
}

object OrderCreateOptions {
  @scala.inline
  def apply(
    inventory_behavior: InventoryBehavior = null,
    send_fulfillment_receipt: js.UndefOr[Boolean] = js.undefined,
    send_receipt: js.UndefOr[Boolean] = js.undefined
  ): OrderCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (inventory_behavior != null) __obj.updateDynamic("inventory_behavior")(inventory_behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(send_fulfillment_receipt)) __obj.updateDynamic("send_fulfillment_receipt")(send_fulfillment_receipt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(send_receipt)) __obj.updateDynamic("send_receipt")(send_receipt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCreateOptions]
  }
}

