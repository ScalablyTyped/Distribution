package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckoutResource extends StObject {
  
  def addLineItems(checkoutId: String, lineItems: js.Array[LineItemToAdd]): js.Promise[Cart] = js.native
  def addLineItems(checkoutId: Double, lineItems: js.Array[LineItemToAdd]): js.Promise[Cart] = js.native
  
  /**
    * Add items to cart. Updates cart's lineItems
    */
  def addVariants(item: Item): js.Promise[Cart] = js.native
  def addVariants(item: Item, nextItem: js.Array[Item]): js.Promise[Cart] = js.native
  
  /**
    * Remove all line items from cart
    */
  def clearLineItems(checkoutId: String, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def clearLineItems(checkoutId: Double, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  
  def create(): js.Promise[Cart] = js.native
  def create(email: String): js.Promise[Cart] = js.native
  def create(email: String, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def create(email: String, lineItems: js.Array[LineItem], shippingAddress: Unit, note: String): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: js.Array[LineItem],
    shippingAddress: Unit,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: js.Array[LineItem],
    shippingAddress: Unit,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: String, lineItems: js.Array[LineItem], shippingAddress: Address): js.Promise[Cart] = js.native
  def create(email: String, lineItems: js.Array[LineItem], shippingAddress: Address, note: String): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: String, lineItems: Unit, shippingAddress: Unit, note: String): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: Unit,
    shippingAddress: Unit,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: Unit,
    shippingAddress: Unit,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: String, lineItems: Unit, shippingAddress: Address): js.Promise[Cart] = js.native
  def create(email: String, lineItems: Unit, shippingAddress: Address, note: String): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: Unit,
    shippingAddress: Address,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: String,
    lineItems: Unit,
    shippingAddress: Address,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: js.Array[LineItem], shippingAddress: Unit, note: String): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: js.Array[LineItem],
    shippingAddress: Unit,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: js.Array[LineItem],
    shippingAddress: Unit,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: js.Array[LineItem], shippingAddress: Address): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: js.Array[LineItem], shippingAddress: Address, note: String): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: Unit, shippingAddress: Unit, note: String): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: Unit,
    shippingAddress: Unit,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: Unit,
    shippingAddress: Unit,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: Unit, shippingAddress: Address): js.Promise[Cart] = js.native
  def create(email: Unit, lineItems: Unit, shippingAddress: Address, note: String): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: Unit,
    shippingAddress: Address,
    note: String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def create(
    email: Unit,
    lineItems: Unit,
    shippingAddress: Address,
    note: Unit,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  
  def fetch(id: String): js.Promise[Cart] = js.native
  
  /**
    * Remove discounts from cart
    */
  def removeDiscount(checkoutId: String): js.Promise[Cart] = js.native
  def removeDiscount(checkoutId: Double): js.Promise[Cart] = js.native
  
  /**
    * Remove a line item from cart based on line item id
    */
  def removeLineItems(checkoutId: String, lineItemIds: js.Array[String]): js.Promise[Cart] = js.native
  def removeLineItems(checkoutId: Double, lineItemIds: js.Array[String]): js.Promise[Cart] = js.native
  
  /**
    * Update a line item quantity based on line item id
    */
  def updateLineItem(checkoutId: String, lineItems: js.Array[AttributeInput]): js.Promise[Cart] = js.native
  def updateLineItem(checkoutId: Double, lineItems: js.Array[AttributeInput]): js.Promise[Cart] = js.native
}
