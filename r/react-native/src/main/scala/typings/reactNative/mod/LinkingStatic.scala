package typings.reactNative.mod

import typings.reactNative.anon.Key
import typings.reactNative.anon.UrlString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkingStatic extends NativeEventEmitter {
  /**
    * Add a handler to Linking changes by listening to the `url` event type
    * and providing the handler
    */
  def addEventListener(`type`: String, handler: js.Function1[/* event */ UrlString, Unit]): Unit = js.native
  /**
    * Determine whether or not an installed app can handle a given URL.
    * NOTE: For web URLs, the protocol ("http://", "https://") must be set accordingly!
    * NOTE: As of iOS 9, your app needs to provide the LSApplicationQueriesSchemes key inside Info.plist.
    * @param URL the URL to open
    */
  def canOpenURL(url: String): js.Promise[Boolean] = js.native
  /**
    * If the app launch was triggered by an app link with, it will give the link url, otherwise it will give null
    * NOTE: To support deep linking on Android, refer http://developer.android.com/training/app-indexing/deep-linking.html#handling-intents
    */
  def getInitialURL(): js.Promise[String | Null] = js.native
  /**
    * Open the Settings app and displays the app’s custom settings, if it has any.
    */
  def openSettings(): js.Promise[Unit] = js.native
  /**
    * Try to open the given url with any of the installed apps.
    * You can use other URLs, like a location (e.g. "geo:37.484847,-122.148386"), a contact, or any other URL that can be opened with the installed apps.
    * NOTE: This method will fail if the system doesn't know how to open the specified URL. If you're passing in a non-http(s) URL, it's best to check {@code canOpenURL} first.
    * NOTE: For web URLs, the protocol ("http://", "https://") must be set accordingly!
    */
  def openURL(url: String): js.Promise[_] = js.native
  /**
    * Remove a handler by passing the `url` event type and the handler
    */
  def removeEventListener(`type`: String, handler: js.Function1[/* event */ UrlString, Unit]): Unit = js.native
  /**
    * Sends an Android Intent - a broad surface to express Android functions.  Useful for deep-linking to settings pages,
    * opening an SMS app with a message draft in place, and more.  See https://developer.android.com/reference/kotlin/android/content/Intent?hl=en
    */
  def sendIntent(action: String): js.Promise[Unit] = js.native
  def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = js.native
}

