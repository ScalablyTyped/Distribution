package typings.reactNativeFirebaseApp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFirebaseApp.anon.Call
import typings.reactNativeFirebaseApp.anon.SDKVERSION
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeFirebase {
  
  @JSImport("@react-native-firebase/app", "ReactNativeFirebase.FirebaseModule")
  @js.native
  class FirebaseModule () extends StObject {
    
    /**
      * The current `FirebaseApp` instance for this Firebase service.
      */
    var app: FirebaseApp = js.native
    
    /**
      * Returns the shared event emitter instance used for all JS event routing.
      */
    var emitter: js.Any = js.native
    
    /**
      * The native module instance for this Firebase service.
      */
    var native: js.Any = js.native
  }
  
  @js.native
  trait FirebaseApp extends StObject {
    
    /**
      * Make this app unusable and free up resources.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * The name (identifier) for this App. '[DEFAULT]' is the default App.
      */
    val name: String = js.native
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    val options: FirebaseAppOptions = js.native
    
    def utils(): typings.reactNativeFirebaseApp.mod.Utils_.Module = js.native
  }
  object FirebaseApp {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      name: String,
      options: FirebaseAppOptions,
      utils: () => typings.reactNativeFirebaseApp.mod.Utils_.Module
    ): FirebaseApp = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], utils = js.Any.fromFunction0(utils))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    @scala.inline
    implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: FirebaseAppOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtils(value: () => typings.reactNativeFirebaseApp.mod.Utils_.Module): Self = StObject.set(x, "utils", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FirebaseAppConfig extends StObject {
    
    /**
      *
      */
    var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to true it indicates that Firebase should close database connections
      * automatically when the app is in the background. Disabled by default.
      */
    var automaticResourceManagement: js.UndefOr[Boolean] = js.native
    
    /**
      * The Firebase App name, defaults to [DEFAULT] if none provided.
      */
    var name: js.UndefOr[String] = js.native
  }
  object FirebaseAppConfig {
    
    @scala.inline
    def apply(): FirebaseAppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseAppConfig]
    }
    
    @scala.inline
    implicit class FirebaseAppConfigMutableBuilder[Self <: FirebaseAppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticDataCollectionEnabledUndefined: Self = StObject.set(x, "automaticDataCollectionEnabled", js.undefined)
      
      @scala.inline
      def setAutomaticResourceManagement(value: Boolean): Self = StObject.set(x, "automaticResourceManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticResourceManagementUndefined: Self = StObject.set(x, "automaticResourceManagement", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
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
    implicit class FirebaseAppOptionsMutableBuilder[Self <: FirebaseAppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroidClientId(value: String): Self = StObject.set(x, "androidClientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidClientIdUndefined: Self = StObject.set(x, "androidClientId", js.undefined)
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
      
      @scala.inline
      def setDeepLinkURLScheme(value: String): Self = StObject.set(x, "deepLinkURLScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepLinkURLSchemeUndefined: Self = StObject.set(x, "deepLinkURLScheme", js.undefined)
      
      @scala.inline
      def setGaTrackingId(value: String): Self = StObject.set(x, "gaTrackingId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaTrackingIdUndefined: Self = StObject.set(x, "gaTrackingId", js.undefined)
      
      @scala.inline
      def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagingSenderIdUndefined: Self = StObject.set(x, "messagingSenderId", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    }
  }
  
  @js.native
  trait FirebaseJsonConfig extends StObject
  
  type FirebaseModuleWithStatics[M, S] = Call[M] with S
  
  type FirebaseModuleWithStaticsAndApp[M, S] = SDKVERSION[M] with S
  
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
    def initializeApp(options: FirebaseAppOptions): FirebaseApp = js.native
    def initializeApp(options: FirebaseAppOptions, config: FirebaseAppConfig): FirebaseApp = js.native
    def initializeApp(options: FirebaseAppOptions, name: String): FirebaseApp = js.native
    
    /**
      * Utils provides a collection of utilities to aid in using Firebase
      * and related services inside React Native, e.g. Test Lab helpers
      * and Google Play Services version helpers.
      */
    var utils: typings.reactNativeFirebaseApp.anon.FirebaseModuleWithStatics = js.native
  }
  
  @js.native
  trait NativeFirebaseError extends Error {
    
    /**
      * Firebase error code, e.g. `auth/invalid-email`
      */
    val code: String = js.native
    
    /**
      * The firebase module namespace that this error originated from, e.g. 'analytics'
      */
    val namespace: String = js.native
    
    /**
      * The native sdks returned error code, different per platform
      */
    val nativeErrorCode: String | Double = js.native
    
    /**
      * The native sdks returned error message, different per platform
      */
    val nativeErrorMessage: String = js.native
  }
  object NativeFirebaseError {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class NativeFirebaseErrorMutableBuilder[Self <: NativeFirebaseError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeErrorCode(value: String | Double): Self = StObject.set(x, "nativeErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeErrorMessage(value: String): Self = StObject.set(x, "nativeErrorMessage", value.asInstanceOf[js.Any])
    }
  }
}
