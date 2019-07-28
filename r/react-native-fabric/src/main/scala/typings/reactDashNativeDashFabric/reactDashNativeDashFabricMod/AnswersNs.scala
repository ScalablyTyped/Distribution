package typings.reactDashNativeDashFabric.reactDashNativeDashFabricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fabric", "Answers")
@js.native
object AnswersNs extends js.Object {
  def logAddToCart(itemPrice: Double, currency: String, itemName: String, itemType: String, itemId: String): Unit = js.native
  def logAddToCart(
    itemPrice: Double,
    currency: String,
    itemName: String,
    itemType: String,
    itemId: String,
    customAttributes: CustomAttributes
  ): Unit = js.native
  def logContentView(contentName: String, contentType: String, contentId: String): Unit = js.native
  def logContentView(contentName: String, contentType: String, contentId: String, customAttributes: CustomAttributes): Unit = js.native
  def logCustom(eventName: String): Unit = js.native
  def logCustom(eventName: String, customAttributes: CustomAttributes): Unit = js.native
  def logInvite(method: String): Unit = js.native
  def logInvite(method: String, customAttributes: CustomAttributes): Unit = js.native
  def logLevelEnd(levelName: String): Unit = js.native
  def logLevelEnd(levelName: String, customAttributes: CustomAttributes): Unit = js.native
  def logLevelStart(levelName: String): Unit = js.native
  def logLevelStart(levelName: String, customAttributes: CustomAttributes): Unit = js.native
  def logLogin(method: String, success: Boolean): Unit = js.native
  def logLogin(method: String, success: Boolean, customAttributes: CustomAttributes): Unit = js.native
  def logPurchase(
    itemPrice: Double,
    currency: String,
    success: Boolean,
    itemName: String,
    itemType: String,
    itemId: String
  ): Unit = js.native
  def logPurchase(
    itemPrice: Double,
    currency: String,
    success: Boolean,
    itemName: String,
    itemType: String,
    itemId: String,
    customAttributes: CustomAttributes
  ): Unit = js.native
  def logRating(rating: Double, contentId: String, contentType: String, contentName: String): Unit = js.native
  def logRating(
    rating: Double,
    contentId: String,
    contentType: String,
    contentName: String,
    customAttributes: CustomAttributes
  ): Unit = js.native
  def logSearch(query: String): Unit = js.native
  def logSearch(query: String, customAttributes: CustomAttributes): Unit = js.native
  def logShare(method: String, contentName: String, contentType: String, contentId: String): Unit = js.native
  def logShare(
    method: String,
    contentName: String,
    contentType: String,
    contentId: String,
    customAttributes: CustomAttributes
  ): Unit = js.native
  def logSignUp(method: String, success: Boolean): Unit = js.native
  def logSignUp(method: String, success: Boolean, customAttributes: CustomAttributes): Unit = js.native
  def logStartCheckout(totalPrice: Double, count: Double, currency: String): Unit = js.native
  def logStartCheckout(totalPrice: Double, count: Double, currency: String, customAttributes: CustomAttributes): Unit = js.native
}

