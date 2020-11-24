package typings.reactNativeFirebase.mod.RNFirebase.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messaging extends js.Object {
  
  def deleteToken(): js.Promise[Unit] = js.native
  def deleteToken(authorizedEntity: js.UndefOr[scala.Nothing], scope: String): js.Promise[Unit] = js.native
  def deleteToken(authorizedEntity: String): js.Promise[Unit] = js.native
  def deleteToken(authorizedEntity: String, scope: String): js.Promise[Unit] = js.native
  
  /**
    * Returns the devices FCM token.
    */
  def getToken(): js.Promise[String] = js.native
  
  /**
    * Checks if the app has notification permissions.
    */
  def hasPermission(): js.Promise[Boolean] = js.native
  
  /**
    * Returns firebase.messaging.IOSMessaging that gets the
    *  iOS specific methods and properties of messaging.
    */
  var ios: IOSMessaging = js.native
  
  /**
    * On a new message,
    * the payload object is passed to the listener callback.
    * This method is only triggered when the app is running.
    */
  def onMessage(listener: js.Function1[/* message */ js.Any, _]): js.Function0[_] = js.native
  
  /**
    * On the event a devices FCM token is refreshed by Google,
    *  the new token is returned in a callback listener.
    */
  def onTokenRefresh(listener: js.Function1[/* token */ String, _]): js.Function0[_] = js.native
  
  /**
    * Requests app notification permissions in an Alert dialog.
    */
  def requestPermission(): js.Promise[Unit] = js.native
  
  /**
    * Send an upstream message
    */
  def sendMessage(remoteMessage: RemoteMessage): js.Promise[Unit] = js.native
  
  /**
    * Subscribes the device to a topic.
    */
  def subscribeToTopic(topic: String): Unit = js.native
  
  /**
    * Unsubscribe the device from a topic.
    */
  def unsubscribeFromTopic(topic: String): Unit = js.native
}
