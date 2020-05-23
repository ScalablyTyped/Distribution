package typings.shopifyPrime.inventoryLevelMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryLevel extends ShopifyObject {
  var available: js.UndefOr[Double] = js.undefined
  var inventory_item_id: js.UndefOr[Double] = js.undefined
  var location_id: js.UndefOr[Double] = js.undefined
}

object InventoryLevel {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    available: js.UndefOr[Double] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    inventory_item_id: js.UndefOr[Double] = js.undefined,
    location_id: js.UndefOr[Double] = js.undefined
  ): InventoryLevel = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inventory_item_id)) __obj.updateDynamic("inventory_item_id")(inventory_item_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(location_id)) __obj.updateDynamic("location_id")(location_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryLevel]
  }
}

