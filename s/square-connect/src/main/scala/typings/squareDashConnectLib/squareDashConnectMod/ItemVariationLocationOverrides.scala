package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ItemVariationLocationOverrides")
@js.native
class ItemVariationLocationOverrides () extends js.Object {
  /**
    * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is
    * `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard. This value is always an integer.
    */
  var inventory_alert_threshold: js.UndefOr[scala.Double] = js.native
  /**
    * Indicates whether the [CatalogItemVariation](#type-catalogitemvariation) displays an alert when its inventory
    * quantity is less than or equal to its `inventory_alert_threshold`.
    * See [InventoryAlertType](#type-inventoryalerttype) for possible values.
    */
  var inventory_alert_type: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.InventoryAlertTypeEnum
  ] = js.native
  /**
    * The ID of the [location](#type-location).
    */
  var location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The price of the [CatalogItemVariation](#type-catalogitemvariation) at the given [location](#type-location), or
    * blank for variable pricing.
    */
  var price_money: js.UndefOr[Money] = js.native
  /**
    * The pricing type (fixed or variable) for the [CatalogItemVariation](#type-catalogitemvariation) at the given
    * [location](#type-location). See [CatalogPricingType](#type-catalogpricingtype) for possible values.
    */
  var pricing_type: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.ItemVariationLocationOverridesNs.PricingTypeEnum
  ] = js.native
  /**
    * If `true`, inventory tracking is active for the [CatalogItemVariation](#type-catalogitemvariation) at this
    * [location](#type-location).
    */
  var track_inventory: js.UndefOr[scala.Boolean] = js.native
}

