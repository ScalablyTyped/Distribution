package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderLineItemModifier")
@js.native
open class OrderLineItemModifier () extends StObject {
  
  /**
    * The base price for the modifier. `base_price_money` is required for ad hoc modifiers.
    * If both `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the predefined `CatalogModifier` price.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  
  /**
    * The catalog object id referencing `CatalogModifier`.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  
  /**
    * The name of the item modifier.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The total price of the item modifier for its line item.
    * This is the modifier's `base_price_money` multiplied by the line item's quantity.
    */
  var total_price_money: js.UndefOr[Money] = js.native
  
  /**
    * Unique ID that identifies the modifier only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}
