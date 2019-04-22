package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItemModifier")
@js.native
class OrderLineItemModifier () extends js.Object {
  /**
    * The base price for the modifier. `base_price_money` is required for ad hoc modifiers. If both
    * `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the predefined
    * [CatalogModifier](#type-catalogmodifier) price.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  /**
    * The catalog object id referencing [CatalogModifier](#type-catalogmodifier).
    */
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The name of the item modifier.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The total price of the item modifier for its line item.
    * This is the modifier's base_price_money multiplied by the line item's quantity.
    */
  var total_price_money: js.UndefOr[Money] = js.native
}

