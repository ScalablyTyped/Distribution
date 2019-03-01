package typings
package shopifyDashPrimeLib.distModelsInventoryUnderscoreItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var sku: js.UndefOr[java.lang.String] = js.undefined
  var tracked: js.UndefOr[scala.Boolean] = js.undefined
  var updated_at: js.UndefOr[scala.Double] = js.undefined
}

object InventoryItem {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    sku: java.lang.String = null,
    tracked: js.UndefOr[scala.Boolean] = js.undefined,
    updated_at: scala.Int | scala.Double = null
  ): InventoryItem = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku)
    if (!js.isUndefined(tracked)) __obj.updateDynamic("tracked")(tracked)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItem]
  }
}

