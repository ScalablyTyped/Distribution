package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateOrderRequestLineItem")
@js.native
class CreateOrderRequestLineItem () extends js.Object {
  /**
    * The base price for a single unit of the line item. `base_price_money` is required for ad hoc line items and
    * variable priced [CatalogItemVariation](#type-catalogitemvariation)s. If both `catalog_object_id` and
    * `base_price_money` are set, `base_price_money` will override the CatalogItemVariation's price.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  /**
    * Only used for Catalog line items. The catalog object ID for an existing
    * [CatalogItemVariation](#type-catalogitemvariation).  Do not provide a value for this field if you provide a value
    * for `name` and `base_price_money`.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * The discounts to include on the line item.
    */
  var discounts: js.UndefOr[js.Array[CreateOrderRequestDiscount]] = js.native
  /**
    * Only used for Catalog line items. The modifiers to include on the line item.
    */
  var modifiers: js.UndefOr[js.Array[CreateOrderRequestModifier]] = js.native
  /**
    * Only used for ad hoc line items. The name of the line item. This value cannot exceed 500 characters.  Do not
    * provide a value for this field if you provide a value for `catalog_object_id`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The note of the line item. This value cannot exceed 500 characters.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The quantity to purchase, as a string representation of a number.  This string must have a positive integer
    * value.
    */
  var quantity: String = js.native
  /**
    * The taxes to include on the line item.
    */
  var taxes: js.UndefOr[js.Array[CreateOrderRequestTax]] = js.native
  /**
    * Only used for ad hoc line items. The variation name of the line item. This value cannot exceed 255 characters.
    * If this value is not set for an ad hoc line item, the default value of `Regular` is used.  Do not provide a value
    * for this field if you provide a value for the `catalog_object_id`.
    */
  var variation_name: js.UndefOr[String] = js.native
}

