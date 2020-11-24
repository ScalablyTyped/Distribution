package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.LOW_QUANTITY
import typings.squareConnect.squareConnectStrings.NONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ItemVariationLocationOverrides")
@js.native
class ItemVariationLocationOverrides () extends js.Object {
  
  /**
    * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is
    * `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard. This value is always an integer.
    */
  var inventory_alert_threshold: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the `CatalogItemVariation` displays an alert when its inventory quantity is less than or
    * equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for possible values.
    */
  var inventory_alert_type: js.UndefOr[NONE | LOW_QUANTITY] = js.native
  
  /**
    * The ID of the `Location`.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The price of the `CatalogItemVariation` at the given `Location`, or blank for variable pricing.
    */
  var price_money: js.UndefOr[Money] = js.native
  
  /**
    * The pricing type (fixed or variable) for the `CatalogItemVariation` at the given `Location`.
    * See [CatalogPricingType](#type-catalogpricingtype) for possible values.
    */
  var pricing_type: js.UndefOr[String] = js.native
  
  /**
    * If `true`, inventory tracking is active for the `CatalogItemVariation` at this `Location`.
    */
  var track_inventory: js.UndefOr[Boolean] = js.native
}
