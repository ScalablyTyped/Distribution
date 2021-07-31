package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderReturnDiscount")
@js.native
class OrderReturnDiscount () extends StObject {
  
  /**
    * The total declared monetary amount of the discount. `amount_money` is not set for percentage-based discounts.
    */
  var amount_money: js.UndefOr[Money] = js.native
  
  /**
    * The amount of discount actually applied to this line item. When an amount-based discount is at order-level,
    * this value is different from `amount_money` because the discount is distributed across the line items.
    */
  var applied_money: js.UndefOr[Money] = js.native
  
  /**
    * The catalog object id referencing `CatalogDiscount`.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  
  /**
    * The discount's name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The percentage of the tax, as a string representation of a decimal number. A value of `7.25` corresponds
    * to a percentage of 7.25%. `percentage` is not set for amount-based discounts.
    */
  var percentage: js.UndefOr[String] = js.native
  
  /**
    * Indicates the level at which the discount applies. This field is set by the server.
    * If set in a CreateOrder request, it will be ignored on write.
    * See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values.
    */
  var scope: js.UndefOr[DiscountApplicationScopeType] = js.native
  
  /**
    * `uid` of the Discount from the Order which contains the original application of this discount.
    */
  var source_discount_uid: js.UndefOr[String] = js.native
  
  /**
    * The type of the discount. If it is created by API, it would be either `FIXED_PERCENTAGE` or `FIXED_AMOUNT`.
    * Discounts that don't reference a catalog object ID must have a type of `FIXED_PERCENTAGE` or `FIXED_AMOUNT`.
    * See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values.
    */
  var `type`: js.UndefOr[DiscountType] = js.native
  
  /**
    * Unique ID that identifies the return discount only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}
