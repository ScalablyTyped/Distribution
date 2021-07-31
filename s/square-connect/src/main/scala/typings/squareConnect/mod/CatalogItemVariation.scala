package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.LOW_QUANTITY
import typings.squareConnect.squareConnectStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogItemVariation")
@js.native
class CatalogItemVariation () extends StObject {
  
  /**
    * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is
    * `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard. This value is always an integer.
    */
  var inventory_alert_threshold: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its
    * `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for possible values.
    */
  var inventory_alert_type: js.UndefOr[NONE | LOW_QUANTITY] = js.native
  
  /**
    * The ID of the `CatalogItem` associated with this item variation.
    */
  var item_id: js.UndefOr[String] = js.native
  
  /**
    * List of item option values associated with this item variation. Listed in the same order as the item options of the parent item.
    */
  var item_option_values: js.UndefOr[js.Array[CatalogItemOptionValueForItemVariation]] = js.native
  
  /**
    * Per-location price and inventory overrides.
    */
  var location_overrides: js.UndefOr[js.Array[ItemVariationLocationOverrides]] = js.native
  
  /**
    * ID of the ‘CatalogMeasurementUnit’ that is used to measure the quantity sold of this item variation.
    * If left unset, the item will be sold in whole quantities.
    */
  var measurement_unit_id: js.UndefOr[String] = js.native
  
  /**
    * The item variation's name. This is a searchable attribute for use in applicable query filters, and its value length is of Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The order in which this item variation should be displayed. This value is read-only. On writes, the ordinal for
    * each item variation within a parent `CatalogItem` is set according to the item variations's position. On reads,
    * the value is not guaranteed to be sequential or unique.
    */
  var ordinal: js.UndefOr[Double] = js.native
  
  /**
    * The item variation's price, if fixed pricing is used.
    */
  var price_money: js.UndefOr[Money] = js.native
  
  /**
    * Indicates whether the item variation's price is fixed or determined at the time of sale.
    * See [CatalogPricingType](#type-catalogpricingtype) for possible values.
    */
  var pricing_type: js.UndefOr[PricingType] = js.native
  
  /**
    * If the `CatalogItem` that owns this item variation is of type `APPOINTMENTS_SERVICE`, then this is the duration
    * of the service in milliseconds. For example, a 30 minute appointment would have the value `1800000`, which is
    * equal to 30 (minutes) * 60 (seconds per minute) * 1000 (milliseconds per second).
    */
  var service_duration: js.UndefOr[Double] = js.native
  
  /**
    * The item variation's SKU, if any. This is a searchable attribute for use in applicable query filters.
    */
  var sku: js.UndefOr[String] = js.native
  
  /**
    * If `true`, inventory tracking is active for the variation.
    */
  var track_inventory: js.UndefOr[Boolean] = js.native
  
  /**
    * The item variation's UPC, if any. This is a searchable attribute for use in applicable query filters.
    * It is only accessible through the Square API, and not exposed in the Square Seller Dashboard, Square Point of Sale or Retail Point of Sale apps.
    */
  var upc: js.UndefOr[String] = js.native
  
  /**
    * Arbitrary user metadata to associate with the item variation. This attribute value length is of Unicode code points.
    */
  var user_data: js.UndefOr[String] = js.native
}
