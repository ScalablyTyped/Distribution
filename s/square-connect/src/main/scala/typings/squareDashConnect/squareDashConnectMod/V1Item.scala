package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Item")
@js.native
class V1Item () extends js.Object {
  /**
    * The text of the item's display label in Square Register. Only up to the first five characters of the string are used.
    */
  var abbreviation: js.UndefOr[String] = js.native
  /**
    * If true, the item can be added to pickup orders from the merchant's online store. Default value: false
    */
  var available_for_pickup: js.UndefOr[Boolean] = js.native
  /**
    * If true, the item can be added to shipping orders from the merchant's online store.
    */
  var available_online: js.UndefOr[Boolean] = js.native
  /**
    * The category the item belongs to, if any.
    */
  var category: js.UndefOr[V1Category] = js.native
  /**
    * The ID of the item's category, if any.
    */
  var category_id: js.UndefOr[String] = js.native
  /**
    * The color of the discount's display label in Square Register, if not the default color.
    * The default color is '9da2a6'. See [V1ItemColor](#type-v1itemcolor) for possible values.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The item's description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The fees that apply to the item, if any.
    */
  var fees: js.UndefOr[js.Array[V1Fee]] = js.native
  /**
    * The item's ID. Must be unique among all entity IDs ever provided on behalf of the merchant.
    * You can never reuse an ID. This value can include alphanumeric characters, dashes (-), and underscores (_).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The item's master image, if any.
    */
  var master_image: js.UndefOr[V1ItemImage] = js.native
  /**
    * The modifier lists that apply to the item, if any.
    */
  var modifier_lists: js.UndefOr[js.Array[V1Variation]] = js.native
  /**
    * The item's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. This field is not used.
    */
  var taxable: js.UndefOr[Boolean] = js.native
  /**
    * The item's type. This value is NORMAL for almost all items. See [V1ItemType](#type-v1itemtype) for possible values.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID.
    */
  var v2_id: js.UndefOr[String] = js.native
  /**
    * The item's variations. You must specify at least one variation.
    */
  var variations: js.UndefOr[js.Array[V1Variation]] = js.native
  /**
    * Indicates whether the item is viewable from the merchant's online store (PUBLIC) or PRIVATE.
    * See [V1ItemVisibility](#type-v1itemvisibility) for possible values.
    */
  var visibility: js.UndefOr[String] = js.native
}

