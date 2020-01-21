package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * firebase Analytics
  */
@js.native
trait Analytics
  extends /* key */ StringDictionary[js.Any] {
  /**Log a custom event with optional params. */
  def logEvent(event: String): Unit = js.native
  def logEvent(event: String, params: js.Object): Unit = js.native
  /** Sets whether analytics collection is enabled for this app on this device. */
  def setAnalyticsCollectionEnabled(enabled: Boolean): Unit = js.native
  def setCurrentScreen(): Unit = js.native
  /**
    * Sets the current screen name, which specifies the current visual context in your app.
    * Whilst screenClassOverride is optional,
    * it is recommended it is always sent as your current class name,
    * for example on Android it will always show as 'MainActivity' if not specified.
    */
  def setCurrentScreen(screenName: String): Unit = js.native
  def setCurrentScreen(screenName: String, screenClassOverride: String): Unit = js.native
  def setCurrentScreen(screenName: Null, screenClassOverride: String): Unit = js.native
  /**
    * Sets the minimum engagement time required before starting a session.
    * The default value is 10000 (10 seconds)
    */
  def setMinimumSessionDuration(milliseconds: Double): Unit = js.native
  /**
    * Sets the duration of inactivity that terminates the current session.
    * The default value is 1800000 (30 minutes).
    */
  def setSessionTimeoutDuration(milliseconds: Double): Unit = js.native
  def setUserId(): Unit = js.native
  /**
    * Gives a user a unique identification.
    * @example
    * const id = firebase.auth().currentUser.uid;
    *
    * firebase.analytics().setUserId(id);
    */
  def setUserId(id: String): Unit = js.native
  /**
    * Sets multiple user properties to the supplied values.
    */
  def setUserProperties(fieldMapping: StringDictionary[String | Null]): Unit = js.native
  def setUserProperty(name: String): Unit = js.native
  /**
    * Sets a key/value pair of data on the current user.
    */
  def setUserProperty(name: String, value: String): Unit = js.native
}

