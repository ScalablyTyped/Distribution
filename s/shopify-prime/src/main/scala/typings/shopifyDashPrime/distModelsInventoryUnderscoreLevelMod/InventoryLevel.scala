package typings.shopifyDashPrime.distModelsInventoryUnderscoreLevelMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
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
    available: Int | Double = null,
    id: Int | Double = null,
    inventory_item_id: Int | Double = null,
    location_id: Int | Double = null
  ): InventoryLevel = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (available != null) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inventory_item_id != null) __obj.updateDynamic("inventory_item_id")(inventory_item_id.asInstanceOf[js.Any])
    if (location_id != null) __obj.updateDynamic("location_id")(location_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryLevel]
  }
}

