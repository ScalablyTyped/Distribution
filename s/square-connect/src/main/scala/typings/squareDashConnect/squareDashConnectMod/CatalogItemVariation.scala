package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogItemVariationNs.InventoryAlertTypeEnum
import typings.squareDashConnect.squareDashConnectMod.CatalogItemVariationNs.PricingTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItemVariation")
@js.native
class CatalogItemVariation () extends js.Object {
  /**
    * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is
    * `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard.  This value is always an integer.
    */
  var inventory_alert_threshold: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its
    * `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for possible values.
    */
  var inventory_alert_type: js.UndefOr[InventoryAlertTypeEnum] = js.native
  /**
    * The ID of the [CatalogItem](#type-catalogitem) associated with this item variation. Searchable.
    */
  var item_id: js.UndefOr[String] = js.native
  /**
    * Per-[location](#type-location) price and inventory overrides.
    */
  var location_overrides: js.UndefOr[js.Array[ItemVariationLocationOverrides]] = js.native
  /**
    * The item variation's name. Searchable. This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The order in which this item variation should be displayed. This value is read-only. On writes, the ordinal for
    * each item variation within a parent [CatalogItem](#type-catalogitem) is set according to the item variations's
    * position. On reads, the value is not guaranteed to be sequential or unique.
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
  var pricing_type: js.UndefOr[PricingTypeEnum] = js.native
  /**
    * If the [CatalogItem](#type-catalogitem) that owns this item variation is of type `APPOINTMENTS_SERVICE`, then
    * this is the duration of the service in milliseconds. For example, a 30 minute appointment would have the value
    * `1800000`, which is equal to 30 (minutes) * 60 (seconds per minute) * 1000 (milliseconds per second).
    */
  var service_duration: js.UndefOr[Double] = js.native
  /**
    * The item variation's SKU, if any. Searchable.
    */
  var sku: js.UndefOr[String] = js.native
  /**
    * If `true`, inventory tracking is active for the variation.
    */
  var track_inventory: js.UndefOr[Boolean] = js.native
  /**
    * The item variation's UPC, if any. Searchable in the Connect API. This field is only exposed in the Connect API.
    * It is not exposed in Square's Dashboard, Square Point of Sale app or Retail Point of Sale app.
    */
  var upc: js.UndefOr[String] = js.native
  /**
    * Arbitrary user metadata to associate with the item variation. Cannot exceed 255 characters. Searchable.
    */
  var user_data: js.UndefOr[String] = js.native
}

