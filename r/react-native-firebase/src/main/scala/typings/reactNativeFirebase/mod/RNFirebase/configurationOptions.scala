package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pass custom options by passing an object with configuration options.
  * The configuration object will be generated first by the native configuration object, if set and then will be overridden if passed in JS.
  * That is, all of the following key/value pairs are optional if the native configuration is set.
  */
@js.native
trait configurationOptions extends js.Object {
  /**
    * default ""
    * The secret iOS API key used for authenticating requests from our app
    */
  var APIKey: js.UndefOr[String] = js.native
  /**
    * default  ""
    * The Project number from the Google Developer's console used to configure Google Cloud Messaging
    */
  var GCMSenderID: js.UndefOr[String] = js.native
  /**
    * default ""
    * The Android client ID used in Google AppInvite when an iOS app has it's android version
    */
  var androidClientID: js.UndefOr[String] = js.native
  /**
    * Default from app [NSBundle mainBundle]  The bundle ID for the app to be bundled with
    */
  var bundleID: js.UndefOr[String] = js.native
  /**
    * default ""
    * The OAuth2 client ID for iOS application used to authenticate Google Users for signing in with Google
    */
  var clientID: js.UndefOr[String] = js.native
  /**
    * default ""
    * The database root (i.e. https://my-app.firebaseio.com)
    */
  var databaseURL: js.UndefOr[String] = js.native
  /**
    *  default false
    *  When set to true, RNFirebase will log messages to the console and fire debug events we can listen to in js
    * @usage
    * firebase.on('debug', msg => console.log('Received debug message', msg))
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * default ""
    * URL scheme to set up durable deep link service
    */
  var deepLinkURLScheme: js.UndefOr[String] = js.native
  /**
    * default ""
    * The Google App ID that is used to uniquely identify an instance of an app.
    */
  var googleAppID: js.UndefOr[String] = js.native
  /**
    * default false
    * When set to true, database persistence will be enabled.
    */
  var persistence: js.UndefOr[Boolean] = js.native
  /**
    * default ""
    * The Google Cloud storage bucket name
    */
  var storageBucket: js.UndefOr[String] = js.native
  /**
    * default ""
    * The tracking ID for Google Analytics
    */
  var trackingID: js.UndefOr[String] = js.native
}

object configurationOptions {
  @scala.inline
  def apply(): configurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[configurationOptions]
  }
  @scala.inline
  implicit class configurationOptionsOps[Self <: configurationOptions] (val x: Self) extends AnyVal {
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
    def setAPIKey(value: String): Self = this.set("APIKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAPIKey: Self = this.set("APIKey", js.undefined)
    @scala.inline
    def setGCMSenderID(value: String): Self = this.set("GCMSenderID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGCMSenderID: Self = this.set("GCMSenderID", js.undefined)
    @scala.inline
    def setAndroidClientID(value: String): Self = this.set("androidClientID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidClientID: Self = this.set("androidClientID", js.undefined)
    @scala.inline
    def setBundleID(value: String): Self = this.set("bundleID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleID: Self = this.set("bundleID", js.undefined)
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    @scala.inline
    def setDatabaseURL(value: String): Self = this.set("databaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseURL: Self = this.set("databaseURL", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDeepLinkURLScheme(value: String): Self = this.set("deepLinkURLScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLinkURLScheme: Self = this.set("deepLinkURLScheme", js.undefined)
    @scala.inline
    def setGoogleAppID(value: String): Self = this.set("googleAppID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleAppID: Self = this.set("googleAppID", js.undefined)
    @scala.inline
    def setPersistence(value: Boolean): Self = this.set("persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence: Self = this.set("persistence", js.undefined)
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageBucket: Self = this.set("storageBucket", js.undefined)
    @scala.inline
    def setTrackingID(value: String): Self = this.set("trackingID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingID: Self = this.set("trackingID", js.undefined)
  }
  
}

