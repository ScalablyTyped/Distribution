package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogItemVariation.InventoryAlertTypeEnum
import typings.squareDashConnect.squareDashConnectMod.CatalogItemVariation.PricingTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItemVariation")
@js.native
class CatalogItemVariation () extends js.Object {
  /**
    * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is
    * `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard. This value is always an integer.
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
    * List of item option values associated with this item variation. Listed in the same order as the item options of the parent item.
    */
  var item_option_values: js.UndefOr[js.Array[CatalogItemOptionValueForItemVariation]] = js.native
  /**
    * Per-[location](#type-location) price and inventory overrides.
    */
  var location_overrides: js.UndefOr[js.Array[ItemVariationLocationOverrides]] = js.native
  /**
    * ID of the ‘CatalogMeasurementUnit’ that is used to measure the quantity sold of this item variation. If left unset, the item will be sold in whole quantities.
    */
  var measurement_unit_id: js.UndefOr[String] = js.native
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

@JSImport("square-connect", "CatalogItemVariation")
@js.native
object CatalogItemVariation extends js.Object {
  @js.native
  sealed trait InventoryAlertTypeEnum extends js.Object
  
  @js.native
  sealed trait PricingTypeEnum extends js.Object
  
  @js.native
  object InventoryAlertTypeEnum extends js.Object {
    @js.native
    sealed trait LOW_QUANTITY extends InventoryAlertTypeEnum
    
    @js.native
    sealed trait NONE extends InventoryAlertTypeEnum
    
    /* "LOW_QUANTITY" */ val LOW_QUANTITY: typings.squareDashConnect.squareDashConnectMod.CatalogItemVariation.InventoryAlertTypeEnum.LOW_QUANTITY with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.CatalogItemVariation.InventoryAlertTypeEnum.NONE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InventoryAlertTypeEnum with String] = js.native
  }
  
  @js.native
  object PricingTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_PRICING extends PricingTypeEnum
    
    @js.native
    sealed trait VARIABLE_PRICING extends PricingTypeEnum
    
    /* "FIXED_PRICING" */ val FIXED_PRICING: typings.squareDashConnect.squareDashConnectMod.CatalogItemVariation.PricingTypeEnum.FIXED_PRICING with String = js.native
    /* "VARIABLE_PRICING" */ val VARIABLE_PRICING: typings.squareDashConnect.squareDashConnectMod.CatalogItemVariation.PricingTypeEnum.VARIABLE_PRICING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PricingTypeEnum with String] = js.native
  }
  
}

