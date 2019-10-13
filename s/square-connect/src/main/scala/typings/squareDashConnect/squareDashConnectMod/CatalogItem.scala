package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectStrings.APPOINTMENTS_SERVICE
import typings.squareDashConnect.squareDashConnectStrings.GIFT_CARD
import typings.squareDashConnect.squareDashConnectStrings.REGULAR
import typings.squareDashConnect.squareDashConnectStrings.RESTAURANT_ITEM
import typings.squareDashConnect.squareDashConnectStrings.RETAIL_ITEM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItem")
@js.native
class CatalogItem () extends js.Object {
  /**
    * The text of the item's display label in the Square Point of Sale app. Only up to the first five characters of the
    * string are used. Searchable. This field has max length of 24 Unicode code points.
    */
  var abbreviation: js.UndefOr[String] = js.native
  /**
    * If `true`, the item can be added to electronically fulfilled orders from the merchant's online store.
    */
  var available_electronically: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the item can be added to pickup orders from the merchant's online store.
    */
  var available_for_pickup: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the item can be added to shipping orders from the merchant's online store.
    */
  var available_online: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the item's category, if any.
    */
  var category_id: js.UndefOr[String] = js.native
  /**
    * The item's description. Searchable. This field has max length of 4096 Unicode code points.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List of item options IDs for this item. Used to manage and group item variations in a specified order.
    * Maximum: 6 item options.
    */
  var item_options: js.UndefOr[js.Array[CatalogItemOptionForItem]] = js.native
  /**
    * The color of the item's display label in the Square Point of Sale app. This must be a valid hex color code.
    */
  var label_color: js.UndefOr[String] = js.native
  /**
    * A set of [CatalogItemModifierListInfo](#type-catalogitemmodifierlistinfo) objects representing the modifier lists
    * that apply to this item, along with the overrides and min and max limits that are specific to this item.
    * [CatalogModifierList](#type-catalogmodifierlist)s may also be added to or deleted from an item using `UpdateItemModifierLists`.
    */
  var modifier_list_info: js.UndefOr[js.Array[CatalogItemModifierListInfo]] = js.native
  /**
    * The item's name. Searchable. This field must not be empty. This field has max length of 512 Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The product type of the item. May not be changed once an item has been created.
    * Only items of product type `REGULAR` or `APPOINTMENTS_SERVICE` may be created by this API; items with other product
    * types are read-only. See [CatalogItemProductType](#type-catalogitemproducttype) for possible values
    */
  var product_type: js.UndefOr[REGULAR | GIFT_CARD | APPOINTMENTS_SERVICE | RETAIL_ITEM | RESTAURANT_ITEM] = js.native
  /**
    * If `false`, the Square Point of Sale app will present the [CatalogItem](#type-catalogitem)'s details screen immediately,
    * allowing the merchant to choose [CatalogModifier](#type-catalogmodifier)s before adding the item to the cart.
    * This is the default behavior. If `true`, the Square Point of Sale app will immediately add the item to the cart
    * with the pre-selected modifiers, and merchants can edit modifiers by drilling down onto the item's details.
    * Third-party clients are encouraged to implement similar behaviors.
    */
  var skip_modifier_screen: js.UndefOr[Boolean] = js.native
  /**
    * A set of IDs indicating the [CatalogTax](#type-catalogtax)es that are enabled for this item. When updating an
    * item, any taxes listed here will be added to the item. [CatalogTax](#type-catalogtax)es may also be added to or
    * deleted from an item using `UpdateItemTaxes`.
    */
  var tax_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of [CatalogObject](#type-catalogobject)s containing the [CatalogItemVariation](#type-catalogitemvariation)s
    * for this item. Maximum: 250 item variations.
    */
  var variations: js.UndefOr[js.Array[CatalogObject]] = js.native
}

