package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Variation")
@js.native
class V1Variation () extends js.Object {
  /**
    * The item variation's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If the inventory quantity for the variation is less than or equal to this value and inventory_alert_type is
    * LOW_QUANTITY, the variation displays an alert in the merchant dashboard.
    */
  var inventory_alert_threshold: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its
    * inventory_alert_threshold. See [V1VariationInventoryAlertType](#type-v1variationinventoryalerttype) for possible values.
    */
  var inventory_alert_type: js.UndefOr[String] = js.native
  /**
    * The ID of the variation's associated item.
    */
  var item_id: js.UndefOr[String] = js.native
  /**
    * The item variation's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates the variation's list position when displayed in Square Register and the merchant dashboard.
    * If more than one variation for the same item has the same ordinal value, those variations are displayed in
    * alphabetical order
    */
  var ordinal: js.UndefOr[Double] = js.native
  /**
    * The item variation's price, if any.
    */
  var price_money: js.UndefOr[V1Money] = js.native
  /**
    * Indicates whether the item variation's price is fixed or determined at the time of sale.
    * See [V1VariationPricingType](#type-v1variationpricingtype) for possible values.
    */
  var pricing_type: js.UndefOr[String] = js.native
  /**
    * The item variation's SKU, if any.
    */
  var sku: js.UndefOr[String] = js.native
  /**
    * If true, inventory tracking is active for the variation.
    */
  var track_inventory: js.UndefOr[Boolean] = js.native
  /**
    * Arbitrary metadata associated with the variation. Cannot exceed 255 characters.
    */
  var user_data: js.UndefOr[String] = js.native
  /**
    * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID.
    */
  var v2_id: js.UndefOr[String] = js.native
}

