package typings
package shopifyDashPrimeLib.distServicesGiftUnderscoreCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/gift_cards", "GiftCards")
@js.native
class GiftCards protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Deletes the Gift Card with the given id.
       */
  def count(): js.Promise[scala.Unit] = js.native
  /**
       * Creates a new Gift Card.
       */
  def create(giftCard: shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard): js.Promise[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard] = js.native
  /**
       * Disable a Gift Card.
       */
  def disable(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard] = js.native
  /**
       * Retrieves the Gift Card with the given id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard] = js.native
  /**
       * Gets a paged list of up to 250 of the shop's Gift Cards
       * @param options Options for filtering the results.
       */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard]] = js.native
  /**
       * Gets a paged list of up to 250 of the shop's Gift Cards
       * @param options Options for filtering the results.
       */
  def list(
    options: shopifyDashPrimeLib.distOptionsGiftUnderscoreCardsMod.GiftCardOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard]] = js.native
  /**
       * Search for Giftcards matching the specified criteria
       * @param options Options for filtering the results.
       */
  def search(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard]] = js.native
  /**
       * Search for Giftcards matching the specified criteria
       * @param options Options for filtering the results.
       */
  def search(
    options: shopifyDashPrimeLib.distOptionsGiftUnderscoreCardsMod.GiftCardOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod.GiftCard]] = js.native
}

