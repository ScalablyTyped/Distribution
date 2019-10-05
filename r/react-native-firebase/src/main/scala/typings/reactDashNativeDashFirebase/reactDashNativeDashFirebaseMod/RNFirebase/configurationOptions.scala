package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pass custom options by passing an object with configuration options.
  * The configuration object will be generated first by the native configuration object, if set and then will be overridden if passed in JS.
  * That is, all of the following key/value pairs are optional if the native configuration is set.
  */
trait configurationOptions extends js.Object {
  /**
    * default ""
    * The secret iOS API key used for authenticating requests from our app
    */
  var APIKey: js.UndefOr[String] = js.undefined
  /**
    * default  ""
    * The Project number from the Google Developer's console used to configure Google Cloud Messaging
    */
  var GCMSenderID: js.UndefOr[String] = js.undefined
  /**
    * default ""
    * The Android client ID used in Google AppInvite when an iOS app has it's android version
    */
  var androidClientID: js.UndefOr[String] = js.undefined
  /**
    * Default from app [NSBundle mainBundle]  The bundle ID for the app to be bundled with
    */
  var bundleID: js.UndefOr[String] = js.undefined
  /**
    * default ""
    * The OAuth2 client ID for iOS application used to authenticate Google Users for signing in with Google
    */
  var clientID: js.UndefOr[String] = js.undefined
  /**
    * default ""
    * The database root (i.e. https://my-app.firebaseio.com)
    */
  var databaseURL: js.UndefOr[String] = js.undefined
  /**
    *  default false
    *  When set to true, RNFirebase will log messages to the console and fire debug events we can listen to in js
    * @usage
    * firebase.on('debug', msg => console.log('Received debug message', msg))
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * default ""
    * URL scheme to set up durable deep link service
    */
  var deepLinkURLScheme: js.UndefOr[String] = js.undefined
  /**
    * default ""
    * The Google App ID that is used to uniquely identify an instance of an app.
    */
  var googleAppID: js.UndefOr[String] = js.undefined
  /**
    * default false
    * When set to true, database persistence will be enabled.
    */
  var persistence: js.UndefOr[Boolean] = js.undefined
  /**
    * default ""
    * The Google Cloud storage bucket name
    */
  var storageBucket: js.UndefOr[String] = js.undefined
  /**
    * default ""
    * The tracking ID for Google Analytics
    */
  var trackingID: js.UndefOr[String] = js.undefined
}

object configurationOptions {
  @scala.inline
  def apply(
    APIKey: String = null,
    GCMSenderID: String = null,
    androidClientID: String = null,
    bundleID: String = null,
    clientID: String = null,
    databaseURL: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deepLinkURLScheme: String = null,
    googleAppID: String = null,
    persistence: js.UndefOr[Boolean] = js.undefined,
    storageBucket: String = null,
    trackingID: String = null
  ): configurationOptions = {
    val __obj = js.Dynamic.literal()
    if (APIKey != null) __obj.updateDynamic("APIKey")(APIKey)
    if (GCMSenderID != null) __obj.updateDynamic("GCMSenderID")(GCMSenderID)
    if (androidClientID != null) __obj.updateDynamic("androidClientID")(androidClientID)
    if (bundleID != null) __obj.updateDynamic("bundleID")(bundleID)
    if (clientID != null) __obj.updateDynamic("clientID")(clientID)
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (deepLinkURLScheme != null) __obj.updateDynamic("deepLinkURLScheme")(deepLinkURLScheme)
    if (googleAppID != null) __obj.updateDynamic("googleAppID")(googleAppID)
    if (!js.isUndefined(persistence)) __obj.updateDynamic("persistence")(persistence)
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket)
    if (trackingID != null) __obj.updateDynamic("trackingID")(trackingID)
    __obj.asInstanceOf[configurationOptions]
  }
}

