package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutResource extends js.Object {
  def addLineItems(checkoutId: java.lang.String, lineItems: js.Array[LineItem]): stdLib.Promise[Cart] = js.native
  def addLineItems(checkoutId: scala.Double, lineItems: js.Array[LineItem]): stdLib.Promise[Cart] = js.native
  /**
           * Add items to cart. Updates cart's lineItems
           */
  def addVariants(item: Item): stdLib.Promise[Cart] = js.native
  /**
           * Add items to cart. Updates cart's lineItems
           */
  def addVariants(item: Item, nextItem: js.Array[Item]): stdLib.Promise[Cart] = js.native
  /**
           * Remove all line items from cart
           */
  def clearLineItems(checkoutId: java.lang.String, lineItems: js.Array[LineItem]): stdLib.Promise[Cart] = js.native
  /**
           * Remove all line items from cart
           */
  def clearLineItems(checkoutId: scala.Double, lineItems: js.Array[LineItem]): stdLib.Promise[Cart] = js.native
  def create(): stdLib.Promise[Cart] = js.native
  def create(email: java.lang.String): stdLib.Promise[Cart] = js.native
  def create(email: java.lang.String, lineItems: js.Array[LineItem]): stdLib.Promise[Cart] = js.native
  def create(email: java.lang.String, lineItems: js.Array[LineItem], shippingAddress: Address): stdLib.Promise[Cart] = js.native
  def create(
    email: java.lang.String,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: java.lang.String
  ): stdLib.Promise[Cart] = js.native
  def create(
    email: java.lang.String,
    lineItems: js.Array[LineItem],
    shippingAddress: Address,
    note: java.lang.String,
    customAttributes: js.Array[AttributeInput]
  ): stdLib.Promise[Cart] = js.native
  def fetch(id: java.lang.String): stdLib.Promise[Cart] = js.native
  /**
           * Remove a line item from cart based on line item id
           */
  def removeLineItem(checkoutId: java.lang.String, lineItemIds: js.Array[java.lang.String]): stdLib.Promise[Cart] = js.native
  /**
           * Remove a line item from cart based on line item id
           */
  def removeLineItem(checkoutId: scala.Double, lineItemIds: js.Array[java.lang.String]): stdLib.Promise[Cart] = js.native
  /**
           * Update a line item quantity based on line item id
           */
  def updateLineItem(checkoutId: java.lang.String, lineItems: js.Array[AttributeInput]): stdLib.Promise[Cart] = js.native
  /**
           * Update a line item quantity based on line item id
           */
  def updateLineItem(checkoutId: scala.Double, lineItems: js.Array[AttributeInput]): stdLib.Promise[Cart] = js.native
}

