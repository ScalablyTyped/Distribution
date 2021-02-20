package typings.realm

import org.scalablytyped.runtime.Instantiable0
import typings.realm.Realm.App.Sync.LogLevel
import typings.realm.Realm.App.Sync.NumericLogLevel
import typings.realm.Realm.AppConfiguration
import typings.realm.Realm.Configuration
import typings.realm.Realm.Credentials.AnonymousPayload
import typings.realm.Realm.Credentials.ApiKeyPayload
import typings.realm.Realm.Credentials.ApplePayload
import typings.realm.Realm.Credentials.EmailPasswordPayload
import typings.realm.Realm.Credentials.FacebookPayload
import typings.realm.Realm.Credentials.FunctionPayload
import typings.realm.Realm.Credentials.GooglePayload
import typings.realm.Realm.Credentials.JWTPayload
import typings.realm.Realm.DefaultFunctionsFactory
import typings.realm.Realm.ObjectSchema
import typings.realm.Realm.OpenRealmBehaviorConfiguration
import typings.realm.anon.TypeofCredentials
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("realm", JSImport.Namespace)
  @js.native
  /**
    * @param  {Realm.Configuration} config?
    */
  class ^ () extends Realm {
    def this(config: Configuration) = this()
    def this(path: String) = this()
  }
  @JSImport("realm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A MongoDB Realm App.
    */
  @JSImport("realm", "App")
  @js.native
  class App[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] protected ()
    extends typings.realm.Realm.App[FunctionsFactoryType, CustomDataType] {
    /**
      * Construct a MongoDB Realm App.
      *
      * @param idOrConfiguration The id string or configuration for the app.
      */
    def this(idOrConfiguration: String) = this()
    def this(idOrConfiguration: AppConfiguration) = this()
  }
  object App {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("realm", "App.Credentials")
    @js.native
    class Credentials[PayloadType /* <: js.Object */] ()
      extends typings.realm.Realm.Credentials[PayloadType]
    /**
      * All credentials available for authentication.
      */
    /* static member */
    /* was `typeof Credentials` */
    @JSImport("realm", "App.Credentials")
    @js.native
    val Credentials: TypeofCredentials with Instantiable0[typings.realm.Realm.Credentials[js.Object]] = js.native
    
    object Sync {
      
      /**
        * AuthError
        */
      @JSImport("realm", "App.Sync.AuthError")
      @js.native
      class AuthError ()
        extends typings.realm.Realm.App.Sync.AuthError
      
      @JSImport("realm", "App.Sync.NumericLogLevel")
      @js.native
      object NumericLogLevel extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.realm.Realm.App.Sync.NumericLogLevel with Double] = js.native
        
        /* 0 */ val All: typings.realm.Realm.App.Sync.NumericLogLevel.All with Double = js.native
        
        /* 2 */ val Debug: typings.realm.Realm.App.Sync.NumericLogLevel.Debug with Double = js.native
        
        /* 3 */ val Detail: typings.realm.Realm.App.Sync.NumericLogLevel.Detail with Double = js.native
        
        /* 6 */ val Error: typings.realm.Realm.App.Sync.NumericLogLevel.Error with Double = js.native
        
        /* 7 */ val Fatal: typings.realm.Realm.App.Sync.NumericLogLevel.Fatal with Double = js.native
        
        /* 4 */ val Info: typings.realm.Realm.App.Sync.NumericLogLevel.Info with Double = js.native
        
        /* 8 */ val Off: typings.realm.Realm.App.Sync.NumericLogLevel.Off with Double = js.native
        
        /* 1 */ val Trace: typings.realm.Realm.App.Sync.NumericLogLevel.Trace with Double = js.native
        
        /* 5 */ val Warn: typings.realm.Realm.App.Sync.NumericLogLevel.Warn with Double = js.native
      }
      
      @JSImport("realm", "App.Sync.Session")
      @js.native
      class Session ()
        extends typings.realm.Realm.App.Sync.Session
      
      /**
        * The default behavior settings if you want to wait for downloading a synchronized Realm to complete before opening it.
        */
      @JSImport("realm", "App.Sync.downloadBeforeOpenBehavior")
      @js.native
      val downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
      
      @JSImport("realm", "App.Sync.enableSessionMultiplexing")
      @js.native
      def enableSessionMultiplexing(app: typings.realm.Realm.App[DefaultFunctionsFactory, _]): Unit = js.native
      
      @JSImport("realm", "App.Sync.getAllSyncSessions")
      @js.native
      def getAllSyncSessions(user: typings.realm.Realm.User[DefaultFunctionsFactory, _]): js.Array[typings.realm.Realm.App.Sync.Session] = js.native
      
      @JSImport("realm", "App.Sync.getSyncSession")
      @js.native
      def getSyncSession(user: typings.realm.Realm.User[DefaultFunctionsFactory, _]): typings.realm.Realm.App.Sync.Session = js.native
      @JSImport("realm", "App.Sync.getSyncSession")
      @js.native
      def getSyncSession(user: typings.realm.Realm.User[DefaultFunctionsFactory, _], partitionValue: String): typings.realm.Realm.App.Sync.Session = js.native
      @JSImport("realm", "App.Sync.getSyncSession")
      @js.native
      def getSyncSession(
        user: typings.realm.Realm.User[DefaultFunctionsFactory, _],
        partitionValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any
      ): typings.realm.Realm.App.Sync.Session = js.native
      @JSImport("realm", "App.Sync.getSyncSession")
      @js.native
      def getSyncSession(user: typings.realm.Realm.User[DefaultFunctionsFactory, _], partitionValue: Double): typings.realm.Realm.App.Sync.Session = js.native
      
      @JSImport("realm", "App.Sync._hasExistingSessions")
      @js.native
      def hasExistingSessions(app: typings.realm.Realm.App[DefaultFunctionsFactory, _]): Boolean = js.native
      
      @JSImport("realm", "App.Sync.initiateClientReset")
      @js.native
      def initiateClientReset(app: typings.realm.Realm.App[DefaultFunctionsFactory, _], path: String): Unit = js.native
      
      /**
        * The default behavior settings if you want to open a synchronized Realm immediately and start working on it.
        * If this is the first time you open the Realm, it will be empty while the server data is being downloaded in the background.
        */
      @JSImport("realm", "App.Sync.openLocalRealmBehavior")
      @js.native
      val openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
      
      @JSImport("realm", "App.Sync.reconnect")
      @js.native
      def reconnect(app: typings.realm.Realm.App[DefaultFunctionsFactory, _]): Unit = js.native
      
      @JSImport("realm", "App.Sync.setLogLevel")
      @js.native
      def setLogLevel(app: typings.realm.Realm.App[DefaultFunctionsFactory, _], logLevel: LogLevel): Unit = js.native
      
      @JSImport("realm", "App.Sync.setLogger")
      @js.native
      def setLogger(
        app: typings.realm.Realm.App[DefaultFunctionsFactory, _],
        callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]
      ): Unit = js.native
      
      @JSImport("realm", "App.Sync.setUserAgent")
      @js.native
      def setUserAgent(app: typings.realm.Realm.App[DefaultFunctionsFactory, _], userAgent: String): Unit = js.native
    }
    
    /**
      * Get or create a singleton Realm App from an id.
      * Calling this function multiple times with the same id will return the same instance.
      *
      * @param id The Realm App id visible from the MongoDB Realm UI or a configuration.
      * @returns The Realm App instance.
      */
    /* static member */
    @JSImport("realm", "App.getApp")
    @js.native
    def getApp(appId: String): typings.realm.Realm.App[DefaultFunctionsFactory, _] = js.native
  }
  
  object Auth {
    
    /**
      * Authentication provider where users identify using an API-key.
      */
    @JSImport("realm", "Auth.ApiKeyAuth")
    @js.native
    class ApiKeyAuth ()
      extends typings.realm.Realm.Auth.ApiKeyAuth
    
    /**
      * Authentication provider where users identify using email and password.
      */
    @JSImport("realm", "Auth.EmailPasswordAuth")
    @js.native
    class EmailPasswordAuth ()
      extends typings.realm.Realm.Auth.EmailPasswordAuth
  }
  
  @JSImport("realm", "ConnectionState")
  @js.native
  object ConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.ConnectionState with String] = js.native
    
    /* "connected" */ val Connected: typings.realm.Realm.ConnectionState.Connected with String = js.native
    
    /* "connecting" */ val Connecting: typings.realm.Realm.ConnectionState.Connecting with String = js.native
    
    /* "disconnected" */ val Disconnected: typings.realm.Realm.ConnectionState.Disconnected with String = js.native
  }
  
  // TODO: Add providerCapabilities?
  /**
    * End-users enter credentials to authenticate toward your MongoDB Realm App.
    */
  @JSImport("realm", "Credentials")
  @js.native
  class Credentials[PayloadType /* <: js.Object */] ()
    extends typings.realm.Realm.Credentials[PayloadType]
  object Credentials {
    
    /**
      * Factory for `Credentials` which authenticate using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
      *
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.anonymous")
    @js.native
    def anonymous(): typings.realm.Realm.Credentials[AnonymousPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
      *
      * @param idToken The id_token returned from Apple.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.apple")
    @js.native
    def apple(idToken: String): typings.realm.Realm.Credentials[ApplePayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
      * Note: This was formerly known as the "Username/Password" provider.
      *
      * @param email The end-users email address.
      * @param password The end-users password.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.emailPassword")
    @js.native
    def emailPassword(email: String, password: String): typings.realm.Realm.Credentials[EmailPasswordPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
      *
      * @param accessToken The access token returned from Facebook.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.facebook")
    @js.native
    def facebook(accessToken: String): typings.realm.Realm.Credentials[FacebookPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
      *
      * @param payload The custom payload as expected by the server.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.function")
    @js.native
    def function[PayloadType /* <: FunctionPayload */](payload: PayloadType): typings.realm.Realm.Credentials[PayloadType] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
      *
      * @param authCode The auth code returned from Google.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.google")
    @js.native
    def google(authCode: String): typings.realm.Realm.Credentials[GooglePayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Custom JWT Provider](https://docs.mongodb.com/realm/authentication/custom-jwt/).
      *
      * @param token The JSON Web Token (JWT).
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.jwt")
    @js.native
    def jwt(token: String): typings.realm.Realm.Credentials[JWTPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      *
      * @deprecated Use `Credentials.apiKey`.
      *
      * @param key The secret content of the API key.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.serverApiKey")
    @js.native
    def serverApiKey(key: String): typings.realm.Realm.Credentials[ApiKeyPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      *
      * @deprecated Use `Credentials.apiKey`.
      *
      * @param key The secret content of the API key.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @JSImport("realm", "Credentials.userApiKey")
    @js.native
    def userApiKey(key: String): typings.realm.Realm.Credentials[ApiKeyPayload] = js.native
  }
  
  /**
    * JsonSerializationReplacer solves circular structures when serializing Realm entities
    * @example JSON.stringify(realm.objects("Person"), Realm.JsonSerializationReplacer)
    */
  @JSImport("realm", "JsonSerializationReplacer")
  @js.native
  def JsonSerializationReplacer(key: String, `val`: js.Any): js.Any = js.native
  
  /**
    * Object
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
    */
  @JSImport("realm", "Object")
  @js.native
  abstract class Object ()
    extends typings.realm.Realm.Object
  
  @JSImport("realm", "UpdateMode")
  @js.native
  object UpdateMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.UpdateMode with String] = js.native
    
    /* "all" */ val All: typings.realm.Realm.UpdateMode.All with String = js.native
    
    /* "modified" */ val Modified: typings.realm.Realm.UpdateMode.Modified with String = js.native
    
    /* "never" */ val Never: typings.realm.Realm.UpdateMode.Never with String = js.native
  }
  
  /**
    * Representation of an authenticated user of an app.
    */
  @JSImport("realm", "User")
  @js.native
  class User[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] ()
    extends typings.realm.Realm.User[FunctionsFactoryType, CustomDataType]
  
  /**
    * The state of a user.
    */
  @JSImport("realm", "UserState")
  @js.native
  object UserState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.UserState with String] = js.native
    
    /* "active" */ val Active: typings.realm.Realm.UserState.Active with String = js.native
    
    /* "logged-out" */ val LoggedOut: typings.realm.Realm.UserState.LoggedOut with String = js.native
    
    /* "removed" */ val Removed: typings.realm.Realm.UserState.Removed with String = js.native
  }
  
  /**
    * The type of a user.
    */
  @JSImport("realm", "UserType")
  @js.native
  object UserType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.UserType with String] = js.native
    
    /* "normal" */ val Normal: typings.realm.Realm.UserType.Normal with String = js.native
    
    /* "server" */ val Server: typings.realm.Realm.UserType.Server with String = js.native
  }
  
  /**
    * Clears the state by closing and deleting any Realm in the default directory and logout all users.
    * @private Not a part of the public API: It's primarily used from the library's tests.
    */
  /* static member */
  @JSImport("realm", "clearTestState")
  @js.native
  def clearTestState(): Unit = js.native
  
  /**
    * Copy all bundled Realm files to app's default file folder.
    */
  /* static member */
  @JSImport("realm", "copyBundledRealmFiles")
  @js.native
  def copyBundledRealmFiles(): Unit = js.native
  
  /**
    * @param {Realm.ObjectSchema} object schema describing the object that should be created.
    * @returns {T}
    */
  /* static member */
  @JSImport("realm", "createTemplateObject")
  @js.native
  def createTemplateObject[T](objectSchema: ObjectSchema): T with typings.realm.Realm.Object = js.native
  
  /* static member */
  @JSImport("realm", "defaultPath")
  @js.native
  def defaultPath: String = js.native
  @scala.inline
  def defaultPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPath")(x.asInstanceOf[js.Any])
  
  /**
    * Delete the Realm file for the given configuration.
    * @param {Configuration} config
    */
  /* static member */
  @JSImport("realm", "deleteFile")
  @js.native
  def deleteFile(config: Configuration): Unit = js.native
  
  /**
    * Checks if the Realm already exists on disk.
    */
  /* static member */
  @JSImport("realm", "exists")
  @js.native
  def exists(config: Configuration): Boolean = js.native
  
  /**
    * Open a realm asynchronously with a promise. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    */
  /* static member */
  @JSImport("realm", "open")
  @js.native
  def open(config: Configuration): ProgressPromise = js.native
  
  /**
    * Get the current schema version of the Realm at the given path.
    * @param  {string} path
    * @param  {any} encryptionKey?
    * @returns number
    */
  /* static member */
  @JSImport("realm", "schemaVersion")
  @js.native
  def schemaVersion(path: String): Double = js.native
  @JSImport("realm", "schemaVersion")
  @js.native
  def schemaVersion(path: String, encryptionKey: ArrayBuffer): Double = js.native
  @JSImport("realm", "schemaVersion")
  @js.native
  def schemaVersion(path: String, encryptionKey: ArrayBufferView): Double = js.native
}
