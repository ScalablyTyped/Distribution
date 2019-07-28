package typings.atReactDashNativeDashFirebaseAppDashTypes.atReactDashNativeDashFirebaseAppDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseOptions
  extends /* name */ StringDictionary[js.Any] {
  /**
    * iOS only - The Android client ID used in Google AppInvite when an iOS app has its Android version, for
    * example "12345.apps.googleusercontent.com".
    */
  var androidClientId: js.UndefOr[String] = js.undefined
  /**
    * An API key used for authenticating requests from your app, e.g.
    * "AIzaSyDdVgKwhZl0sTTTLZ7iTmt1r3N2cJLnaDk", used to identify your app to Google servers.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  /**
    * The Google App ID that is used to uniquely identify an instance of an app.
    */
  var appId: String
  /**
    * iOS only - The OAuth2 client ID for iOS application used to authenticate Google users, for example
    * "12345.apps.googleusercontent.com", used for signing in with Google.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The database root URL, e.g. "http://abc-xyz-123.firebaseio.com".
    */
  var databaseURL: js.UndefOr[String] = js.undefined
  /**
    * iOS only - The URL scheme used to set up Durable Deep Link service.
    */
  var deepLinkURLScheme: js.UndefOr[String] = js.undefined
  /**
    * The tracking ID for Google Analytics, e.g. "UA-12345678-1", used to configure Google Analytics.
    */
  var gaTrackingId: js.UndefOr[String] = js.undefined
  /**
    * The Project Number from the Google Developer's console, for example "012345678901", used to
    * configure Google Cloud Messaging.
    */
  var messagingSenderId: js.UndefOr[String] = js.undefined
  /**
    * The Project ID from the Firebase console, for example "abc-xyz-123".
    */
  var projectId: String
  /**
    * The Google Cloud Storage bucket name, e.g. "abc-xyz-123.storage.firebase.com".
    */
  var storageBucket: js.UndefOr[String] = js.undefined
}

object FirebaseOptions {
  @scala.inline
  def apply(
    appId: String,
    projectId: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    androidClientId: String = null,
    apiKey: String = null,
    clientId: String = null,
    databaseURL: String = null,
    deepLinkURLScheme: String = null,
    gaTrackingId: String = null,
    messagingSenderId: String = null,
    storageBucket: String = null
  ): FirebaseOptions = {
    val __obj = js.Dynamic.literal(appId = appId, projectId = projectId)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (androidClientId != null) __obj.updateDynamic("androidClientId")(androidClientId)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL)
    if (deepLinkURLScheme != null) __obj.updateDynamic("deepLinkURLScheme")(deepLinkURLScheme)
    if (gaTrackingId != null) __obj.updateDynamic("gaTrackingId")(gaTrackingId)
    if (messagingSenderId != null) __obj.updateDynamic("messagingSenderId")(messagingSenderId)
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket)
    __obj.asInstanceOf[FirebaseOptions]
  }
}

