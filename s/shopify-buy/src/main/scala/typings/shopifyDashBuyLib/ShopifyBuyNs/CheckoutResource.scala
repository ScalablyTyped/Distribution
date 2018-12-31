package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutResource extends js.Object {
  def addLineItems(checkoutId: java.lang.String, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def addLineItems(checkoutId: scala.Double, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  /**
    * Add items to cart. Updates cart's lineItems
    */
  def addVariants(item: Item): js.Promise[Cart] = js.native
  def addVariants(item: Item, nextItem: js.Array[Item]): js.Promise[Cart] = js.native
  /**
    * Remove all line items from cart
    */
  def clearLineItems(checkoutId: java.lang.String, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def clearLineItems(checkoutId: scala.Double, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def create(): js.Promise[Cart] = js.native
  def create(email: java.lang.String): js.Promise[Cart] = js.native
  def create(email: java.lang.String, lineItems: js.Array[LineItem]): js.Promise[Cart] = js.native
  def create(email: java.lang.String, lineItems: js.Array[LineItem], shippingAddress: Address): js.Promise[Cart] = js.native
  def create(
    email: java.lang.String,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: java.lang.String
  ): js.Promise[Cart] = js.native
  def create(
    email: java.lang.String,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: java.lang.String,
    customAttributes: js.Array[AttributeInput]
  ): js.Promise[Cart] = js.native
  def fetch(id: java.lang.String): js.Promise[Cart] = js.native
  /**
    * Remove a line item from cart based on line item id
    */
  def removeLineItem(checkoutId: java.lang.String, lineItemIds: js.Array[java.lang.String]): js.Promise[Cart] = js.native
  def removeLineItem(checkoutId: scala.Double, lineItemIds: js.Array[java.lang.String]): js.Promise[Cart] = js.native
  /**
    * Update a line item quantity based on line item id
    */
  def updateLineItem(checkoutId: java.lang.String, lineItems: js.Array[AttributeInput]): js.Promise[Cart] = js.native
  def updateLineItem(checkoutId: scala.Double, lineItems: js.Array[AttributeInput]): js.Promise[Cart] = js.native
}

