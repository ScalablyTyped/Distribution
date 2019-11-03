package typings.reactDashNativeDashFabric

import typings.reactDashNativeDashFabric.reactDashNativeDashFabricMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attributes extends js.Object {
  /**
    * Sends the Add To Cart tracking event.
    *
    * All parameters are optional.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#add-to-cart
    *
    * @param itemPrice The item's amount in the currency specified.
    * @param currency The ISO4217 currency code.
    * @param itemName The human-readable name for the item.
    * @param itemType The category the item falls under.
    * @param itemId A unique identifier used to track the item.
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logAddToCart(
    itemPrice: js.UndefOr[Double],
    currency: js.UndefOr[String],
    itemName: js.UndefOr[String],
    itemType: js.UndefOr[String],
    itemId: js.UndefOr[String],
    attributes: js.UndefOr[Attributes]
  ): Unit = js.native
  /**
    * Send the Content View tracking event.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#content-view
    */
  def logContentView(name: String): Unit = js.native
  def logContentView(name: String, `type`: String): Unit = js.native
  def logContentView(name: String, `type`: String, id: String): Unit = js.native
  def logContentView(name: String, `type`: String, id: String, attributes: Attributes): Unit = js.native
  /**
    * Send a custom tracking event with the given name.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#custom-event
    */
  def logCustom(name: String): Unit = js.native
  def logCustom(name: String, attributes: Attributes): Unit = js.native
  /**
    * Sends the Invite tracking event.
    *
    * All parameters are optional.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#invite
    *
    * @param method An optional description of the sign in method (Twitter, Facebook, etc.); defaults to "Direct".
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logInvite(): Unit = js.native
  def logInvite(method: String): Unit = js.native
  def logInvite(method: String, attributes: Attributes): Unit = js.native
  /**
    * Sends the Log In tracking event.
    *
    * All parameters are optional.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#log-in
    *
    * @param method An optional description of the sign in method (Twitter, Facebook, etc.); defaults to "Direct".
    * @param success An optional flag that indicates sign in success; defaults to true.
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logLogin(): Unit = js.native
  def logLogin(method: String): Unit = js.native
  def logLogin(method: String, success: Boolean): Unit = js.native
  def logLogin(method: String, success: Boolean, attributes: Attributes): Unit = js.native
  /**
    * Sends the Purchase tracking event.
    *
    * All parameters are optional.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#purchase
    *
    * @param itemPrice The item's amount in the currency specified.
    * @param currency The ISO4217 currency code.
    * @param success Was the purchase completed succesfully?
    * @param itemName The human-readable name for the item.
    * @param itemType The category the item falls under.
    * @param itemId A unique identifier used to track the item.
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logPurchase(
    itemPrice: js.UndefOr[Double],
    currency: js.UndefOr[String],
    success: js.UndefOr[Boolean],
    itemName: js.UndefOr[String],
    itemType: js.UndefOr[String],
    itemId: js.UndefOr[String],
    attributes: js.UndefOr[Attributes]
  ): Unit = js.native
  /**
    * Sends the Search tracking event.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#search
    *
    * @param query What the user is searching for.
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logSearch(query: String): Unit = js.native
  def logSearch(query: String, attributes: Attributes): Unit = js.native
  /**
    * Sends the Share tracking event.
    *
    * All parameters are optional.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#share
    *
    * @param method The method used to share content.
    * @param contentName The description of the content.
    * @param contentType The type or genre of content.
    * @param contentId A unique key identifying the content.
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logShare(): Unit = js.native
  def logShare(method: String): Unit = js.native
  def logShare(method: String, contentName: String): Unit = js.native
  def logShare(method: String, contentName: String, contentType: String): Unit = js.native
  def logShare(method: String, contentName: String, contentType: String, contentId: String): Unit = js.native
  def logShare(
    method: String,
    contentName: String,
    contentType: String,
    contentId: String,
    attributes: Attributes
  ): Unit = js.native
  /**
    * Sends the Sign Up tracking event.
    *
    * All parameters are optional.
    *
    * https://docs.fabric.io/android/answers/answers-events.html#sign-up
    *
    * @param method An optional description of the sign up method (Twitter, Facebook, etc.); defaults to "Direct".
    * @param success An optional flag that indicates sign up success; defaults to true.
    * @param attributes Any additional user-defined attributes to be logged.
    */
  def logSignUp(): Unit = js.native
  def logSignUp(method: String): Unit = js.native
  def logSignUp(method: String, success: Boolean): Unit = js.native
  def logSignUp(method: String, success: Boolean, attributes: Attributes): Unit = js.native
}

