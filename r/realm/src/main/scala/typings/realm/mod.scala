package typings.realm

import org.scalablytyped.runtime.Instantiable0
import typings.realm.Realm.App.Sync.LogLevel
import typings.realm.Realm.App.Sync.NumericLogLevel
import typings.realm.Realm.AppConfiguration
import typings.realm.Realm.Auth.ApiKey
import typings.realm.Realm.Auth.ApiKeyAuth
import typings.realm.Realm.Auth.EmailPasswordAuth
import typings.realm.Realm.BaseFunctionsFactory
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
import typings.realm.Realm.ObjectChangeCallback
import typings.realm.Realm.ObjectSchema
import typings.realm.Realm.OpenRealmBehaviorConfiguration
import typings.realm.Realm.Results
import typings.realm.Realm.Services.MongoDB
import typings.realm.Realm.Services.Push
import typings.realm.Realm.UserIdentity
import typings.realm.Realm.UserProfile
import typings.realm.Realm.UserState
import typings.realm.anon.TypeofCredentials
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("realm", JSImport.Namespace)
  @js.native
  /**
    * @param  {Realm.Configuration} config?
    */
  class ^ ()
    extends StObject
       with Realm {
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
    extends StObject
       with typings.realm.Realm.App[FunctionsFactoryType, CustomDataType] {
    /**
      * Construct a MongoDB Realm App.
      *
      * @param idOrConfiguration The id string or configuration for the app.
      */
    def this(idOrConfiguration: String) = this()
    def this(idOrConfiguration: AppConfiguration) = this()
    
    /**
      * All authenticated users.
      */
    /* CompleteClass */
    override val allUsers: Record[String, typings.realm.Realm.User[FunctionsFactoryType, CustomDataType]] = js.native
    
    /**
      * The last user to log in or being switched to.
      */
    /* CompleteClass */
    override val currentUser: (typings.realm.Realm.User[FunctionsFactoryType, CustomDataType]) | Null = js.native
    
    /**
      * Perform operations related to the email/password auth provider.
      */
    /* CompleteClass */
    var emailPasswordAuth: EmailPasswordAuth = js.native
    
    /**
      * The id of this Realm app.
      */
    /* CompleteClass */
    override val id: String = js.native
    
    /**
      * Log in a user using a specific credential
      *
      * @param credentials the credentials to use when logging in
      */
    /* CompleteClass */
    override def logIn(credentials: typings.realm.Realm.Credentials[js.Object]): js.Promise[typings.realm.Realm.User[FunctionsFactoryType, CustomDataType]] = js.native
    
    /**
      * Logs out and removes a user from the app.
      *
      * @returns A promise that resolves once the user has been logged out and removed from the app.
      */
    /* CompleteClass */
    override def removeUser(user: typings.realm.Realm.User[FunctionsFactoryType, CustomDataType]): js.Promise[Unit] = js.native
    
    /**
      * Switch current user, from an instance of `User` or the string id of the user.
      */
    /* CompleteClass */
    override def switchUser(user: typings.realm.Realm.User[FunctionsFactoryType, CustomDataType]): Unit = js.native
  }
  object App {
    
    @JSImport("realm", "App")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("realm", "App.Credentials")
    @js.native
    class Credentials[PayloadType /* <: js.Object */] ()
      extends StObject
         with typings.realm.Realm.Credentials[PayloadType] {
      
      /**
        * A simple object which can be passed to the server as the body of a request to authenticate.
        */
      /* CompleteClass */
      override val payload: PayloadType = js.native
      
      /**
        * Name of the authentication provider.
        */
      /* CompleteClass */
      override val providerName: String = js.native
      
      /**
        * Type of the authentication provider.
        */
      /* CompleteClass */
      override val providerType: String = js.native
    }
    /**
      * All credentials available for authentication.
      */
    /* static member */
    /* was `typeof Credentials` */
    @JSImport("realm", "App.Credentials")
    @js.native
    val Credentials: TypeofCredentials & Instantiable0[typings.realm.Realm.Credentials[js.Object]] = js.native
    
    object Sync {
      
      @JSImport("realm", "App.Sync")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * AuthError
        */
      @JSImport("realm", "App.Sync.AuthError")
      @js.native
      class AuthError ()
        extends StObject
           with typings.realm.Realm.App.Sync.AuthError {
        
        /* CompleteClass */
        override val code: Double = js.native
        
        /* CompleteClass */
        override val `type`: String = js.native
      }
      
      @JSImport("realm", "App.Sync.NumericLogLevel")
      @js.native
      object NumericLogLevel extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.realm.Realm.App.Sync.NumericLogLevel & Double] = js.native
        
        /* 0 */ val All: typings.realm.Realm.App.Sync.NumericLogLevel.All & Double = js.native
        
        /* 2 */ val Debug: typings.realm.Realm.App.Sync.NumericLogLevel.Debug & Double = js.native
        
        /* 3 */ val Detail: typings.realm.Realm.App.Sync.NumericLogLevel.Detail & Double = js.native
        
        /* 6 */ val Error: typings.realm.Realm.App.Sync.NumericLogLevel.Error & Double = js.native
        
        /* 7 */ val Fatal: typings.realm.Realm.App.Sync.NumericLogLevel.Fatal & Double = js.native
        
        /* 4 */ val Info: typings.realm.Realm.App.Sync.NumericLogLevel.Info & Double = js.native
        
        /* 8 */ val Off: typings.realm.Realm.App.Sync.NumericLogLevel.Off & Double = js.native
        
        /* 1 */ val Trace: typings.realm.Realm.App.Sync.NumericLogLevel.Trace & Double = js.native
        
        /* 5 */ val Warn: typings.realm.Realm.App.Sync.NumericLogLevel.Warn & Double = js.native
      }
      
      @JSImport("realm", "App.Sync.Session")
      @js.native
      class Session ()
        extends StObject
           with typings.realm.Realm.App.Sync.Session
      
      /**
        * The default behavior settings if you want to wait for downloading a synchronized Realm to complete before opening it.
        */
      @JSImport("realm", "App.Sync.downloadBeforeOpenBehavior")
      @js.native
      val downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
      
      @scala.inline
      def enableSessionMultiplexing(app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableSessionMultiplexing")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def getAllSyncSessions(user: typings.realm.Realm.User[DefaultFunctionsFactory, js.Any]): js.Array[typings.realm.Realm.App.Sync.Session] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllSyncSessions")(user.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.realm.Realm.App.Sync.Session]]
      
      @scala.inline
      def getSyncSession(user: typings.realm.Realm.User[DefaultFunctionsFactory, js.Any]): typings.realm.Realm.App.Sync.Session = ^.asInstanceOf[js.Dynamic].applyDynamic("getSyncSession")(user.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.App.Sync.Session]
      @scala.inline
      def getSyncSession(user: typings.realm.Realm.User[DefaultFunctionsFactory, js.Any], partitionValue: String): typings.realm.Realm.App.Sync.Session = (^.asInstanceOf[js.Dynamic].applyDynamic("getSyncSession")(user.asInstanceOf[js.Any], partitionValue.asInstanceOf[js.Any])).asInstanceOf[typings.realm.Realm.App.Sync.Session]
      @scala.inline
      def getSyncSession(
        user: typings.realm.Realm.User[DefaultFunctionsFactory, js.Any],
        partitionValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any
      ): typings.realm.Realm.App.Sync.Session = (^.asInstanceOf[js.Dynamic].applyDynamic("getSyncSession")(user.asInstanceOf[js.Any], partitionValue.asInstanceOf[js.Any])).asInstanceOf[typings.realm.Realm.App.Sync.Session]
      @scala.inline
      def getSyncSession(user: typings.realm.Realm.User[DefaultFunctionsFactory, js.Any], partitionValue: Double): typings.realm.Realm.App.Sync.Session = (^.asInstanceOf[js.Dynamic].applyDynamic("getSyncSession")(user.asInstanceOf[js.Any], partitionValue.asInstanceOf[js.Any])).asInstanceOf[typings.realm.Realm.App.Sync.Session]
      
      @scala.inline
      def hasExistingSessions(app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_hasExistingSessions")(app.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @scala.inline
      def initiateClientReset(app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any], path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initiateClientReset")(app.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * The default behavior settings if you want to open a synchronized Realm immediately and start working on it.
        * If this is the first time you open the Realm, it will be empty while the server data is being downloaded in the background.
        */
      @JSImport("realm", "App.Sync.openLocalRealmBehavior")
      @js.native
      val openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
      
      @scala.inline
      def reconnect(app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def setLogLevel(app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any], logLevel: LogLevel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(app.asInstanceOf[js.Any], logLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def setLogger(
        app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any],
        callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(app.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def setUserAgent(app: typings.realm.Realm.App[DefaultFunctionsFactory, js.Any], userAgent: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserAgent")(app.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * Get or create a singleton Realm App from an id.
      * Calling this function multiple times with the same id will return the same instance.
      *
      * @param id The Realm App id visible from the MongoDB Realm UI or a configuration.
      * @returns The Realm App instance.
      */
    /* static member */
    @scala.inline
    def getApp(appId: String): typings.realm.Realm.App[DefaultFunctionsFactory, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")(appId.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.App[DefaultFunctionsFactory, js.Any]]
  }
  
  object Auth {
    
    /**
      * Authentication provider where users identify using an API-key.
      */
    @JSImport("realm", "Auth.ApiKeyAuth")
    @js.native
    class ApiKeyAuth ()
      extends StObject
         with typings.realm.Realm.Auth.ApiKeyAuth {
      
      /**
        * Creates an API key that can be used to authenticate as the current user.
        *
        * @param name the name of the API key to be created.
        */
      /* CompleteClass */
      override def create(name: String): js.Promise[ApiKey] = js.native
      
      /**
        * Deletes an API key associated with the current user.
        *
        * @param keyId the id of the API key to delete
        */
      /* CompleteClass */
      override def delete(keyId: String): js.Promise[Unit] = js.native
      
      /**
        * Disable an API key associated with the current user.
        *
        * @param keyId the id of the API key to disable
        */
      /* CompleteClass */
      override def disable(keyId: String): js.Promise[Unit] = js.native
      
      /**
        * Enables an API key associated with the current user.
        *
        * @param keyId the id of the API key to enable
        */
      /* CompleteClass */
      override def enable(keyId: String): js.Promise[Unit] = js.native
      
      /**
        * Fetches an API key associated with the current user.
        *
        * @param keyId the id of the API key to fetch.
        */
      /* CompleteClass */
      override def fetch(keyId: String): js.Promise[ApiKey] = js.native
      
      /**
        * Fetches the API keys associated with the current user.
        */
      /* CompleteClass */
      override def fetchAll(): js.Promise[js.Array[ApiKey]] = js.native
    }
    
    /**
      * Authentication provider where users identify using email and password.
      */
    @JSImport("realm", "Auth.EmailPasswordAuth")
    @js.native
    class EmailPasswordAuth ()
      extends StObject
         with typings.realm.Realm.Auth.EmailPasswordAuth {
      
      /**
        * Call the custom function to reset the password.
        *
        * @param email the email associated with the user.
        * @param password the new password.
        * @param args one or more arguments to pass to the function.
        */
      /* CompleteClass */
      override def callResetPasswordFunction(email: String, password: String, args: js.Any*): js.Promise[Unit] = js.native
      
      /**
        * Confirm a user by the token received.
        *
        * @param token the token received.
        * @param tokenId the id of the token received.
        */
      /* CompleteClass */
      override def confirmUser(token: String, tokenId: String): js.Promise[Unit] = js.native
      
      /**
        * Register a new user.
        *
        * @param email The new users email.
        * @param password the new users passsword.
        */
      /* CompleteClass */
      override def registerUser(email: String, password: String): js.Promise[Unit] = js.native
      
      /**
        * Resend the confirmation email.
        *
        * @param email the email associated to resend the confirmation to.
        */
      /* CompleteClass */
      override def resendConfirmationEmail(email: String): js.Promise[Unit] = js.native
      
      /**
        * Complete resetting the password
        *
        * @param token the token received.
        * @param tokenId the id of the token received.
        * @param password the new password.
        */
      /* CompleteClass */
      override def resetPassword(token: String, tokenId: String, password: String): js.Promise[Unit] = js.native
      
      /**
        * Send an email with tokens to reset the password.
        *
        * @param email the email to send the tokens to.
        */
      /* CompleteClass */
      override def sendResetPasswordEmail(email: String): js.Promise[Unit] = js.native
    }
  }
  
  @JSImport("realm", "ConnectionState")
  @js.native
  object ConnectionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.ConnectionState & String] = js.native
    
    /* "connected" */ val Connected: typings.realm.Realm.ConnectionState.Connected & String = js.native
    
    /* "connecting" */ val Connecting: typings.realm.Realm.ConnectionState.Connecting & String = js.native
    
    /* "disconnected" */ val Disconnected: typings.realm.Realm.ConnectionState.Disconnected & String = js.native
  }
  
  // TODO: Add providerCapabilities?
  /**
    * End-users enter credentials to authenticate toward your MongoDB Realm App.
    */
  @JSImport("realm", "Credentials")
  @js.native
  class Credentials[PayloadType /* <: js.Object */] ()
    extends StObject
       with typings.realm.Realm.Credentials[PayloadType] {
    
    /**
      * A simple object which can be passed to the server as the body of a request to authenticate.
      */
    /* CompleteClass */
    override val payload: PayloadType = js.native
    
    /**
      * Name of the authentication provider.
      */
    /* CompleteClass */
    override val providerName: String = js.native
    
    /**
      * Type of the authentication provider.
      */
    /* CompleteClass */
    override val providerType: String = js.native
  }
  object Credentials {
    
    @JSImport("realm", "Credentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
      *
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def anonymous(): typings.realm.Realm.Credentials[AnonymousPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("anonymous")().asInstanceOf[typings.realm.Realm.Credentials[AnonymousPayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
      *
      * @param idToken The id_token returned from Apple.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def apple(idToken: String): typings.realm.Realm.Credentials[ApplePayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("apple")(idToken.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[ApplePayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
      * Note: This was formerly known as the "Username/Password" provider.
      *
      * @param email The end-users email address.
      * @param password The end-users password.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def emailPassword(email: String, password: String): typings.realm.Realm.Credentials[EmailPasswordPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("emailPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.realm.Realm.Credentials[EmailPasswordPayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
      *
      * @param accessToken The access token returned from Facebook.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def facebook(accessToken: String): typings.realm.Realm.Credentials[FacebookPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("facebook")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[FacebookPayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
      *
      * @param payload The custom payload as expected by the server.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def function[PayloadType /* <: FunctionPayload */](payload: PayloadType): typings.realm.Realm.Credentials[PayloadType] = ^.asInstanceOf[js.Dynamic].applyDynamic("function")(payload.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[PayloadType]]
    
    /**
      * Factory for `Credentials` which authenticate using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
      *
      * @param authCode The auth code returned from Google.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def google(authCode: String): typings.realm.Realm.Credentials[GooglePayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("google")(authCode.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[GooglePayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [Custom JWT Provider](https://docs.mongodb.com/realm/authentication/custom-jwt/).
      *
      * @param token The JSON Web Token (JWT).
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def jwt(token: String): typings.realm.Realm.Credentials[JWTPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("jwt")(token.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[JWTPayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      *
      * @deprecated Use `Credentials.apiKey`.
      *
      * @param key The secret content of the API key.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def serverApiKey(key: String): typings.realm.Realm.Credentials[ApiKeyPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverApiKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[ApiKeyPayload]]
    
    /**
      * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      *
      * @deprecated Use `Credentials.apiKey`.
      *
      * @param key The secret content of the API key.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    @scala.inline
    def userApiKey(key: String): typings.realm.Realm.Credentials[ApiKeyPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("userApiKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.realm.Realm.Credentials[ApiKeyPayload]]
  }
  
  /**
    * JsonSerializationReplacer solves circular structures when serializing Realm entities
    * @example JSON.stringify(realm.objects("Person"), Realm.JsonSerializationReplacer)
    */
  @scala.inline
  def JsonSerializationReplacer(key: String, `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("JsonSerializationReplacer")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Object
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
    */
  @JSImport("realm", "Object")
  @js.native
  abstract class Object ()
    extends StObject
       with typings.realm.Realm.Object {
    
    /* CompleteClass */
    override def _objectId(): String = js.native
    
    /**
      * @returns void
      */
    /* CompleteClass */
    override def addListener(callback: ObjectChangeCallback): Unit = js.native
    
    /**
      * @returns An array of key/value pairs of the object's properties.
      */
    /* CompleteClass */
    override def entries(): js.Array[js.Tuple2[String, js.Any]] = js.native
    
    /**
      * @returns boolean
      */
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
    /**
      * @returns An array of the names of the object's properties.
      */
    /* CompleteClass */
    override def keys(): js.Array[String] = js.native
    
    /**
      * @returns Results<T>
      */
    /* CompleteClass */
    override def linkingObjects[T](objectType: String, property: String): Results[T & typings.realm.Realm.Object] = js.native
    
    /**
      * @returns number
      */
    /* CompleteClass */
    override def linkingObjectsCount(): Double = js.native
    
    /**
      * @returns ObjectSchema
      */
    /* CompleteClass */
    override def objectSchema(): ObjectSchema = js.native
    
    /* CompleteClass */
    override def removeAllListeners(): Unit = js.native
    
    /* CompleteClass */
    override def removeListener(callback: ObjectChangeCallback): Unit = js.native
    
    /**
      * @returns An object for JSON serialization.
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  @JSImport("realm", "UpdateMode")
  @js.native
  object UpdateMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.UpdateMode & String] = js.native
    
    /* "all" */ val All: typings.realm.Realm.UpdateMode.All & String = js.native
    
    /* "modified" */ val Modified: typings.realm.Realm.UpdateMode.Modified & String = js.native
    
    /* "never" */ val Never: typings.realm.Realm.UpdateMode.Never & String = js.native
  }
  
  /**
    * Representation of an authenticated user of an app.
    */
  @JSImport("realm", "User")
  @js.native
  class User[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] ()
    extends StObject
       with typings.realm.Realm.User[FunctionsFactoryType, CustomDataType] {
    
    /**
      * The access token used when requesting a new access token.
      */
    /* CompleteClass */
    override val accessToken: String | Null = js.native
    
    /**
      * Perform operations related to the API-key auth provider.
      */
    /* CompleteClass */
    override val apiKeys: ApiKeyAuth = js.native
    
    /**
      * Call a remote MongoDB Realm function by its name.
      * Note: Consider using `functions[name]()` instead of calling this method.
      *
      * @example
      * // These are all equivalent:
      * await user.callFunction("doThing", [a1, a2, a3]);
      * await user.functions.doThing(a1, a2, a3);
      * await user.functions["doThing"](a1, a2, a3);
      *
      * @example
      * // The methods returned from the functions object are bound, which is why it's okay to store the function in a variable before calling it:
      * const doThing = user.functions.doThing;
      * await doThing(a1);
      * await doThing(a2);
      *
      * @param name Name of the function.
      * @param args Arguments passed to the function.
      */
    /* CompleteClass */
    override def callFunction(name: String, args: js.Any*): js.Promise[js.Any] = js.native
    
    /**
      * You can store arbitrary data about your application users in a MongoDB collection and configure MongoDB Realm to automatically expose each user’s data in a field of their user object.
      * For example, you might store a user’s preferred language, date of birth, or their local timezone.
      *
      * If this value has not been configured, it will be empty.
      */
    /* CompleteClass */
    override val customData: CustomDataType = js.native
    
    /**
      * The id of the device.
      */
    /* CompleteClass */
    override val deviceId: String | Null = js.native
    
    /**
      * Use this to call functions defined by the MongoDB Realm app, as this user.
      */
    /* CompleteClass */
    override val functions: FunctionsFactoryType & BaseFunctionsFactory = js.native
    
    /**
      * The automatically-generated internal ID of the user.
      */
    /* CompleteClass */
    override val id: String = js.native
    
    /**
      * The identities of the user at any of the app's authentication providers.
      */
    /* CompleteClass */
    override val identities: js.Array[UserIdentity] = js.native
    
    /**
      * The logged in state of the user.
      */
    /* CompleteClass */
    override val isLoggedIn: Boolean = js.native
    
    /**
      * Link the user with an identity represented by another set of credentials.
      *
      * @param credentials The credentials to use when linking.
      */
    /* CompleteClass */
    override def linkCredentials(credentials: typings.realm.Realm.Credentials[js.Object]): js.Promise[Unit] = js.native
    
    /**
      * Log out the user.
      *
      * @returns A promise that resolves once the user has been logged out of the app.
      */
    /* CompleteClass */
    override def logOut(): js.Promise[Unit] = js.native
    
    /**
      * Returns a connection to the MongoDB service.
      *
      * @example
      * let blueWidgets = user.mongoClient('myClusterName')
      *                       .db('myDb')
      *                       .collection('widgets')
      *                       .find({color: 'blue'});
      */
    /* CompleteClass */
    override def mongoClient(serviceName: String): MongoDB = js.native
    
    /**
      * A profile containing additional information about the user.
      */
    /* CompleteClass */
    override val profile: UserProfile = js.native
    
    /**
      * The provider type for the user.
      */
    /* CompleteClass */
    override val providerType: String = js.native
    
    /**
      * Use the Push service to enable sending push messages to this user via Firebase Cloud Messaging (FCM).
      *
      * @returns An service client with methods to register and deregister the device on the user.
      */
    /* CompleteClass */
    override def push(serviceName: String): Push = js.native
    
    /**
      * Refresh the access token and derive custom data from it.
      *
      * @returns The newly fetched custom data.
      */
    /* CompleteClass */
    override def refreshCustomData(): js.Promise[CustomDataType] = js.native
    
    /**
      * The refresh token used when requesting a new access token.
      */
    /* CompleteClass */
    override val refreshToken: String | Null = js.native
    
    /**
      * The state of the user.
      */
    /* CompleteClass */
    override val state: UserState = js.native
  }
  
  /**
    * The state of a user.
    */
  @JSImport("realm", "UserState")
  @js.native
  object UserState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.UserState & String] = js.native
    
    /* "active" */ val Active: typings.realm.Realm.UserState.Active & String = js.native
    
    /* "logged-out" */ val LoggedOut: typings.realm.Realm.UserState.LoggedOut & String = js.native
    
    /* "removed" */ val Removed: typings.realm.Realm.UserState.Removed & String = js.native
  }
  
  /**
    * The type of a user.
    */
  @JSImport("realm", "UserType")
  @js.native
  object UserType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.UserType & String] = js.native
    
    /* "normal" */ val Normal: typings.realm.Realm.UserType.Normal & String = js.native
    
    /* "server" */ val Server: typings.realm.Realm.UserType.Server & String = js.native
  }
  
  /**
    * Clears the state by closing and deleting any Realm in the default directory and logout all users.
    * @private Not a part of the public API: It's primarily used from the library's tests.
    */
  /* static member */
  @scala.inline
  def clearTestState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTestState")().asInstanceOf[Unit]
  
  /**
    * Copy all bundled Realm files to app's default file folder.
    */
  /* static member */
  @scala.inline
  def copyBundledRealmFiles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyBundledRealmFiles")().asInstanceOf[Unit]
  
  /**
    * @param {Realm.ObjectSchema} object schema describing the object that should be created.
    * @returns {T}
    */
  /* static member */
  @scala.inline
  def createTemplateObject[T](objectSchema: ObjectSchema): T & typings.realm.Realm.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateObject")(objectSchema.asInstanceOf[js.Any]).asInstanceOf[T & typings.realm.Realm.Object]
  
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
  @scala.inline
  def deleteFile(config: Configuration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFile")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Checks if the Realm already exists on disk.
    */
  /* static member */
  @scala.inline
  def exists(config: Configuration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Open a realm asynchronously with a promise. If the realm is synced, it will be fully synchronized before it is available.
    * @param {Configuration} config
    */
  /* static member */
  @scala.inline
  def open(config: Configuration): ProgressPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(config.asInstanceOf[js.Any]).asInstanceOf[ProgressPromise]
  
  /**
    * Get the current schema version of the Realm at the given path.
    * @param  {string} path
    * @param  {any} encryptionKey?
    * @returns number
    */
  /* static member */
  @scala.inline
  def schemaVersion(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaVersion")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def schemaVersion(path: String, encryptionKey: ArrayBuffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaVersion")(path.asInstanceOf[js.Any], encryptionKey.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def schemaVersion(path: String, encryptionKey: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaVersion")(path.asInstanceOf[js.Any], encryptionKey.asInstanceOf[js.Any])).asInstanceOf[Double]
}
