package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * pass custom options by passing an object with configuration options.
  * The configuration object will be generated first by the native configuration object, if set and then will be overridden if passed in JS.
  * That is, all of the following key/value pairs are optional if the native configuration is set.
  */
trait configurationOptions extends StObject {
  
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
  
  inline def apply(): configurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[configurationOptions]
  }
  
  extension [Self <: configurationOptions](x: Self) {
    
    inline def setAPIKey(value: String): Self = StObject.set(x, "APIKey", value.asInstanceOf[js.Any])
    
    inline def setAPIKeyUndefined: Self = StObject.set(x, "APIKey", js.undefined)
    
    inline def setAndroidClientID(value: String): Self = StObject.set(x, "androidClientID", value.asInstanceOf[js.Any])
    
    inline def setAndroidClientIDUndefined: Self = StObject.set(x, "androidClientID", js.undefined)
    
    inline def setBundleID(value: String): Self = StObject.set(x, "bundleID", value.asInstanceOf[js.Any])
    
    inline def setBundleIDUndefined: Self = StObject.set(x, "bundleID", js.undefined)
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
    
    inline def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDeepLinkURLScheme(value: String): Self = StObject.set(x, "deepLinkURLScheme", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkURLSchemeUndefined: Self = StObject.set(x, "deepLinkURLScheme", js.undefined)
    
    inline def setGCMSenderID(value: String): Self = StObject.set(x, "GCMSenderID", value.asInstanceOf[js.Any])
    
    inline def setGCMSenderIDUndefined: Self = StObject.set(x, "GCMSenderID", js.undefined)
    
    inline def setGoogleAppID(value: String): Self = StObject.set(x, "googleAppID", value.asInstanceOf[js.Any])
    
    inline def setGoogleAppIDUndefined: Self = StObject.set(x, "googleAppID", js.undefined)
    
    inline def setPersistence(value: Boolean): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    
    inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    
    inline def setTrackingID(value: String): Self = StObject.set(x, "trackingID", value.asInstanceOf[js.Any])
    
    inline def setTrackingIDUndefined: Self = StObject.set(x, "trackingID", js.undefined)
  }
}
