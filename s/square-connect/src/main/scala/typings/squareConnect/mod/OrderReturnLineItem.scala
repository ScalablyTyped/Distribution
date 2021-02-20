package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderReturnLineItem")
@js.native
class OrderReturnLineItem () extends StObject {
  
  /**
    * The list of references to `OrderReturnDiscount` entities applied to the returned line item.
    * Each `OrderLineItemAppliedDiscount` has a `discount_uid` that references the `uid` of a top-level `OrderReturnDiscount`
    * applied to the returned line item. On reads, the amount applied is populated.
    */
  var applied_discounts: js.UndefOr[js.Array[OrderLineItemAppliedDiscount]] = js.native
  
  /**
    * The list of references to `OrderReturnTax` entities applied to the returned line item.
    * Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderReturnTax`
    * applied to the returned line item. On reads, the amount applied is populated.
    */
  var applied_taxes: js.UndefOr[js.Array[OrderLineItemAppliedTax]] = js.native
  
  /**
    * The base price for a single unit of the line item.
    */
  var base_price_money: js.UndefOr[Money] = js.native
  
  /**
    * The `CatalogItemVariation` id applied to this returned line item.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  
  /**
    * The gross return amount of money calculated as (item base price + modifiers price) * quantity.
    */
  var gross_return_money: js.UndefOr[Money] = js.native
  
  /**
    * The name of the line item.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The note of the returned line item.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * The quantity returned, formatted as a decimal number. For example: "3".
    * Line items with a `quantity_unit` can have non-integer quantities. For example: "1.70000".
    */
  var quantity: String = js.native
  
  /**
    * The unit and precision that this return line item's quantity is measured in.
    */
  var quantity_unit: js.UndefOr[OrderQuantityUnit] = js.native
  
  /**
    * The `CatalogModifier`s applied to this line item.
    */
  var return_modifiers: js.UndefOr[js.Array[OrderReturnLineItemModifier]] = js.native
  
  /**
    * `uid` of the LineItem in the original sale Order.
    */
  var source_line_item_uid: js.UndefOr[String] = js.native
  
  /**
    * The total discount amount of money to return for the line item.
    */
  var total_discount_money: js.UndefOr[Money] = js.native
  
  /**
    * The total amount of money to return for this line item.
    */
  var total_money: js.UndefOr[Money] = js.native
  
  /**
    * The total tax amount of money to return for the line item.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
  
  /**
    * Unique identifier for this return line item entry.
    */
  var uid: js.UndefOr[String] = js.native
  
  /**
    * The name of the variation applied to this returned line item.
    */
  var variation_name: js.UndefOr[String] = js.native
  
  /**
    * The total price of all item variations returned in this line item.
    * Calculated as `base_price_money` multiplied by `quantity`. Does not include modifiers.
    */
  var variation_total_price_money: js.UndefOr[Money] = js.native
}
