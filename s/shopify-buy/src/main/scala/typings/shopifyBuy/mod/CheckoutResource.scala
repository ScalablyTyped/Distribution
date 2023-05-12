package typings.shopifyBuy.mod

import typings.shopifyBuy.anon.AllowPartialAddresses
import typings.shopifyBuy.anon.CustomAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection resource
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/collection-resource.js
  */
@JSImport("shopify-buy", "CheckoutResource")
@js.native
open class CheckoutResource protected () extends Resource {
  def this(client: GraphQLJSClient) = this()
  
  /**
    * Applies a discount to an existing checkout using a discount code.
    */
  def addDiscount(checkoutId: ID, discountCode: String): js.Promise[Checkout] = js.native
  
  /**
    * Applies gift cards to an existing checkout using a list of gift card codes
    */
  def addGiftCards(checkoutId: ID, giftCardCodes: String): js.Promise[Checkout] = js.native
  
  /**
    * Adds line items to an existing checkout.
    */
  def addLineItems(checkoutId: ID, lineItems: js.Array[CheckoutLineItemInput]): js.Promise[Checkout] = js.native
  
  /**
    * Creates a checkout.
    */
  def create(): js.Promise[Checkout] = js.native
  def create(input: CustomAttributes): js.Promise[Checkout] = js.native
  
  /**
    * Fetches a checkout by ID.
    */
  def fetch(id: ID): js.Promise[Checkout] = js.native
  
  /**
    * Removes the applied discount from an existing checkout.
    */
  def removeDiscount(checkoutId: ID): js.Promise[Checkout] = js.native
  
  /**
    * Remove a gift card from an existing checkout
    */
  def removeGiftCard(checkoutId: ID, appliedGiftCardId: ID): js.Promise[Checkout] = js.native
  
  /**
    * Removes line items from an existing checkout.
    */
  def removeLineItems(checkoutId: ID, lineItemIds: js.Array[String]): js.Promise[Checkout] = js.native
  
  /**
    * Replace line items on an existing checkout.
    */
  def replaceLineItems(checkoutId: ID, lineItems: js.Array[CheckoutLineItemInput]): js.Promise[Checkout] = js.native
  
  /**
    * Replaces the value of checkout's custom attributes and/or note with values defined in the input
    */
  def updateAttributes(checkoutId: ID, input: AllowPartialAddresses): js.Promise[Checkout] = js.native
  
  /**
    * Replaces the value of checkout's email address
    */
  def updateEmail(checkoutId: ID, email: String): js.Promise[Checkout] = js.native
  
  /**
    * Updates line items on an existing checkout.
    */
  def updateLineItems(checkoutId: ID, lineItems: js.Array[CheckoutLineItemUpdateInput]): js.Promise[Checkout] = js.native
  
  /**
    * Updates shipping address on an existing checkout.
    */
  def updateShippingAddress(checkoutId: ID, shippingAddress: MailingAddressInput): js.Promise[Checkout] = js.native
}
