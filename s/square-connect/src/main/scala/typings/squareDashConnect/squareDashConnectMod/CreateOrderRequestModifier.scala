package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateOrderRequestModifier")
@js.native
class CreateOrderRequestModifier () extends js.Object {
  /**
    * The base price for the modifier. `base_price_money` is required for ad hoc modifiers. If both
    * `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the predefined
    * [CatalogModifier](#type-catalogmodifier) price.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  /**
    * The catalog object ID of a [CatalogModifier](#type-catalogmodifier).
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * Only used for ad hoc modifiers. The name of the modifier. `name` cannot exceed 255 characters. Do not provide a
    * value for `name` if you provide a value for `catalog_object_id`.
    */
  var name: js.UndefOr[String] = js.native
}

