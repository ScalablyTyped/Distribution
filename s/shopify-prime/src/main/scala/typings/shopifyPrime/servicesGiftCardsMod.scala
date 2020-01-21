package typings.shopifyPrime

import typings.shopifyPrime.giftCardMod.GiftCard
import typings.shopifyPrime.giftCardsMod.GiftCardOptions
import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/gift_cards", JSImport.Namespace)
@js.native
object servicesGiftCardsMod extends js.Object {
  @js.native
  class GiftCards protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Deletes the Gift Card with the given id.
      */
    def count(): js.Promise[Unit] = js.native
    /**
      * Creates a new Gift Card.
      */
    def create(giftCard: GiftCard): js.Promise[GiftCard] = js.native
    /**
      * Disable a Gift Card.
      */
    def disable(id: Double): js.Promise[GiftCard] = js.native
    /**
      * Retrieves the Gift Card with the given id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[GiftCard] = js.native
    /**
      * Gets a paged list of up to 250 of the shop's Gift Cards
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[GiftCard]] = js.native
    def list(options: GiftCardOptions with FieldOptions with ListOptions): js.Promise[js.Array[GiftCard]] = js.native
    /**
      * Search for Giftcards matching the specified criteria
      * @param options Options for filtering the results.
      */
    def search(): js.Promise[js.Array[GiftCard]] = js.native
    def search(options: GiftCardOptions with FieldOptions with ListOptions): js.Promise[js.Array[GiftCard]] = js.native
  }
  
  @js.native
  class default protected () extends GiftCards {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

