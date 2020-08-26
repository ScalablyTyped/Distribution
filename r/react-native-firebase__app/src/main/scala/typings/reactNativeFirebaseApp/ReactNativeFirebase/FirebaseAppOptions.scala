package typings.reactNativeFirebaseApp.ReactNativeFirebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAppOptions
  extends /* name */ StringDictionary[js.Any] {
  /**
    * iOS only - The Android client ID used in Google AppInvite when an iOS app has its Android version, for
    * example "12345.apps.googleusercontent.com".
    */
  var androidClientId: js.UndefOr[String] = js.native
  /**
    * An API key used for authenticating requests from your app, e.g.
    * "AIzaSyDdVgKwhZl0sTTTLZ7iTmt1r3N2cJLnaDk", used to identify your app to Google servers.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * The Google App ID that is used to uniquely identify an instance of an app.
    */
  var appId: String = js.native
  /**
    * iOS only - The OAuth2 client ID for iOS application used to authenticate Google users, for example
    * "12345.apps.googleusercontent.com", used for signing in with Google.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The database root URL, e.g. "http://abc-xyz-123.firebaseio.com".
    */
  var databaseURL: js.UndefOr[String] = js.native
  /**
    * iOS only - The URL scheme used to set up Durable Deep Link service.
    */
  var deepLinkURLScheme: js.UndefOr[String] = js.native
  /**
    * The tracking ID for Google Analytics, e.g. "UA-12345678-1", used to configure Google Analytics.
    */
  var gaTrackingId: js.UndefOr[String] = js.native
  /**
    * The Project Number from the Google Developer's console, for example "012345678901", used to
    * configure Google Cloud Messaging.
    */
  var messagingSenderId: js.UndefOr[String] = js.native
  /**
    * The Project ID from the Firebase console, for example "abc-xyz-123".
    */
  var projectId: String = js.native
  /**
    * The Google Cloud Storage bucket name, e.g. "abc-xyz-123.storage.firebase.com".
    */
  var storageBucket: js.UndefOr[String] = js.native
}

object FirebaseAppOptions {
  @scala.inline
  def apply(appId: String, projectId: String): FirebaseAppOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseAppOptions]
  }
  @scala.inline
  implicit class FirebaseAppOptionsOps[Self <: FirebaseAppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAndroidClientId(value: String): Self = this.set("androidClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidClientId: Self = this.set("androidClientId", js.undefined)
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setDatabaseURL(value: String): Self = this.set("databaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseURL: Self = this.set("databaseURL", js.undefined)
    @scala.inline
    def setDeepLinkURLScheme(value: String): Self = this.set("deepLinkURLScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLinkURLScheme: Self = this.set("deepLinkURLScheme", js.undefined)
    @scala.inline
    def setGaTrackingId(value: String): Self = this.set("gaTrackingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaTrackingId: Self = this.set("gaTrackingId", js.undefined)
    @scala.inline
    def setMessagingSenderId(value: String): Self = this.set("messagingSenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagingSenderId: Self = this.set("messagingSenderId", js.undefined)
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageBucket: Self = this.set("storageBucket", js.undefined)
  }
  
}

