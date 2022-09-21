package typings.reactNativeFirebaseApp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFirebaseApp.anon.Call
import typings.reactNativeFirebaseApp.anon.SDKVERSION
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeFirebase {
  
  @JSImport("@react-native-firebase/app", "ReactNativeFirebase.FirebaseModule")
  @js.native
  open class FirebaseModule () extends StObject {
    
    /**
      * The current `FirebaseApp` instance for this Firebase service.
      */
    var app: FirebaseApp = js.native
    
    /**
      * Returns the shared event emitter instance used for all JS event routing.
      */
    /* private */ var emitter: Any = js.native
    
    /**
      * The native module instance for this Firebase service.
      */
    /* private */ var native: Any = js.native
  }
  
  trait FirebaseApp extends StObject {
    
    /**
      * Make this app unusable and free up resources.
      */
    def delete(): js.Promise[Unit]
    
    /**
      * The name (identifier) for this App. '[DEFAULT]' is the default App.
      */
    val name: String
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    val options: FirebaseAppOptions
    
    def utils(): typings.reactNativeFirebaseApp.mod.Utils_.Module
  }
  object FirebaseApp {
    
    inline def apply(
      delete: () => js.Promise[Unit],
      name: String,
      options: FirebaseAppOptions,
      utils: () => typings.reactNativeFirebaseApp.mod.Utils_.Module
    ): FirebaseApp = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], utils = js.Any.fromFunction0(utils))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: FirebaseAppOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: () => typings.reactNativeFirebaseApp.mod.Utils_.Module): Self = StObject.set(x, "utils", js.Any.fromFunction0(value))
    }
  }
  
  trait FirebaseAppConfig extends StObject {
    
    /**
      * Default setting for data collection on startup that affects all Firebase module startup data collection settings,
      * in the absence of module-specific overrides. This will start as false if you set "app_data_collection_default_enabled"
      * to false in firebase.json and may be used in opt-in flows, for example a GDPR-compliant app.
      * If configured false initially, set to true after obtaining consent, then enable module-specific settings as needed afterwards.
      */
    var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true it indicates that Firebase should close database connections
      * automatically when the app is in the background. Disabled by default.
      */
    var automaticResourceManagement: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Firebase App name, defaults to [DEFAULT] if none provided.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object FirebaseAppConfig {
    
    inline def apply(): FirebaseAppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseAppConfig]
    }
    
    extension [Self <: FirebaseAppConfig](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutomaticDataCollectionEnabledUndefined: Self = StObject.set(x, "automaticDataCollectionEnabled", js.undefined)
      
      inline def setAutomaticResourceManagement(value: Boolean): Self = StObject.set(x, "automaticResourceManagement", value.asInstanceOf[js.Any])
      
      inline def setAutomaticResourceManagementUndefined: Self = StObject.set(x, "automaticResourceManagement", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait FirebaseAppOptions
    extends StObject
       with /* name */ StringDictionary[Any] {
    
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
  object FirebaseAppOptions {
    
    inline def apply(appId: String, projectId: String): FirebaseAppOptions = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAppOptions]
    }
    
    extension [Self <: FirebaseAppOptions](x: Self) {
      
      inline def setAndroidClientId(value: String): Self = StObject.set(x, "androidClientId", value.asInstanceOf[js.Any])
      
      inline def setAndroidClientIdUndefined: Self = StObject.set(x, "androidClientId", js.undefined)
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      inline def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
      
      inline def setDeepLinkURLScheme(value: String): Self = StObject.set(x, "deepLinkURLScheme", value.asInstanceOf[js.Any])
      
      inline def setDeepLinkURLSchemeUndefined: Self = StObject.set(x, "deepLinkURLScheme", js.undefined)
      
      inline def setGaTrackingId(value: String): Self = StObject.set(x, "gaTrackingId", value.asInstanceOf[js.Any])
      
      inline def setGaTrackingIdUndefined: Self = StObject.set(x, "gaTrackingId", js.undefined)
      
      inline def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      inline def setMessagingSenderIdUndefined: Self = StObject.set(x, "messagingSenderId", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
      
      inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    }
  }
  
  type FirebaseModuleWithStatics[M, S] = Call[M] & S
  
  type FirebaseModuleWithStaticsAndApp[M, S] = SDKVERSION[M] & S
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.debug
    - typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.verbose
    - typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.info
    - typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.warn
    - typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.error
    - typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.silent
  */
  trait LogLevelString extends StObject
  object LogLevelString {
    
    inline def debug: typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.debug = "debug".asInstanceOf[typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.debug]
    
    inline def error: typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.error = "error".asInstanceOf[typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.error]
    
    inline def info: typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.info = "info".asInstanceOf[typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.info]
    
    inline def silent: typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.silent = "silent".asInstanceOf[typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.silent]
    
    inline def verbose: typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.verbose = "verbose".asInstanceOf[typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.verbose]
    
    inline def warn: typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.warn = "warn".asInstanceOf[typings.reactNativeFirebaseApp.reactNativeFirebaseAppStrings.warn]
  }
  
  @js.native
  trait Module extends StObject {
    
    /**
      * The current React Native Firebase version.
      */
    val SDK_VERSION: String = js.native
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * @example
      * ```js
      * const app = firebase.app('foo');
      * ```
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def app(): FirebaseApp = js.native
    def app(name: String): FirebaseApp = js.native
    
    /**
      * A (read-only) array of all the initialized Apps.
      */
    var apps: js.Array[FirebaseApp] = js.native
    
    /**
      * Create (and initialize) a FirebaseApp.
      *
      * @param options Options to configure the services used in the App.
      * @param config The optional config for your firebase app
      */
    def initializeApp(options: FirebaseAppOptions): js.Promise[FirebaseApp] = js.native
    def initializeApp(options: FirebaseAppOptions, config: FirebaseAppConfig): js.Promise[FirebaseApp] = js.native
    def initializeApp(options: FirebaseAppOptions, name: String): js.Promise[FirebaseApp] = js.native
    
    /**
      * Set the log level across all modules. Only applies to iOS currently, has no effect on Android.
      * Should be one of 'error', 'warn', 'info', or 'debug'.
      * Logs messages at the configured level or lower (less verbose / more important).
      * Note that if an app is running from AppStore, it will never log above info even if
      * level is set to a higher (more verbose) setting.
      * Note that iOS is missing firebase-js-sdk log levels 'verbose' and 'silent'.
      * 'verbose' if used will map to 'debug', 'silent' has no valid mapping and will return an error if used.
      *
      * @ios
      */
    def setLogLevel(logLevel: LogLevelString): Unit = js.native
    
    /**
      * Utils provides a collection of utilities to aid in using Firebase
      * and related services inside React Native, e.g. Test Lab helpers
      * and Google Play Services version helpers.
      */
    var utils: typings.reactNativeFirebaseApp.anon.FirebaseModuleWithStatics = js.native
  }
  
  trait NativeFirebaseError
    extends StObject
       with Error {
    
    /**
      * Firebase error code, e.g. `auth/invalid-email`
      */
    val code: String
    
    /**
      * The firebase module namespace that this error originated from, e.g. 'analytics'
      */
    val namespace: String
    
    /**
      * The native sdks returned error code, different per platform
      */
    val nativeErrorCode: String | Double
    
    /**
      * The native sdks returned error message, different per platform
      */
    val nativeErrorMessage: String
  }
  object NativeFirebaseError {
    
    inline def apply(
      code: String,
      message: String,
      name: String,
      namespace: String,
      nativeErrorCode: String | Double,
      nativeErrorMessage: String
    ): NativeFirebaseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], nativeErrorCode = nativeErrorCode.asInstanceOf[js.Any], nativeErrorMessage = nativeErrorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeFirebaseError]
    }
    
    extension [Self <: NativeFirebaseError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNativeErrorCode(value: String | Double): Self = StObject.set(x, "nativeErrorCode", value.asInstanceOf[js.Any])
      
      inline def setNativeErrorMessage(value: String): Self = StObject.set(x, "nativeErrorMessage", value.asInstanceOf[js.Any])
    }
  }
}
