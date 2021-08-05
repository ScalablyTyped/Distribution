package typings.realm

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Realm.App.Sync.Session
import typings.realm.Realm.Auth.ApiKeyAuth
import typings.realm.Realm.Auth.EmailPasswordAuth
import typings.realm.Realm.List
import typings.realm.Realm.Object
import typings.realm.Realm.ObjectSchema
import typings.realm.Realm.Results
import typings.realm.Realm.Services.HTTP
import typings.realm.Realm.Services.HTTP.RequestOptions
import typings.realm.Realm.Services.HTTP.Response
import typings.realm.Realm.Services.MongoDB
import typings.realm.Realm.Services.MongoDB.Document
import typings.realm.Realm.Services.MongoDB.MongoDBCollection
import typings.realm.Realm.Services.Push
import typings.realm.Realm.UpdateMode.All
import typings.realm.Realm.UpdateMode.Modified
import typings.realm.Realm.UpdateMode.Never
import typings.realm.anon.Id
import typings.realm.anon.Ids
import typings.realm.anon.Instantiable
import typings.realm.anon.OmitDocumentNamespacecoll
import typings.realm.realmStrings._id
import typings.realm.realmStrings.`after-upload`
import typings.realm.realmStrings.active
import typings.realm.realmStrings.change
import typings.realm.realmStrings.delete
import typings.realm.realmStrings.downloadBeforeOpen
import typings.realm.realmStrings.drop
import typings.realm.realmStrings.dropDatabase
import typings.realm.realmStrings.immediately
import typings.realm.realmStrings.inactive
import typings.realm.realmStrings.insert
import typings.realm.realmStrings.invalid
import typings.realm.realmStrings.invalidate
import typings.realm.realmStrings.never
import typings.realm.realmStrings.openImmediately
import typings.realm.realmStrings.openLocalRealm
import typings.realm.realmStrings.rename
import typings.realm.realmStrings.replace
import typings.realm.realmStrings.throwException
import typings.realm.realmStrings.update
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Date
import typings.std.Int8Array
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.ReadonlyArray
import typings.std.Record
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Realm extends StObject {
  
  /**
    * Update the schema of the Realm.
    *
    * @param schema The schema which the Realm should be updated to use.
    * @private Not a part of the public API: Consider passing a `schema` when constructing the `Realm` instead.
    */
  def _updateSchema(schema: js.Array[ObjectSchema]): Unit = js.native
  
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("addListener")
  def addListener_change(name: String, callback: js.Function2[/* sender */ this.type, change, Unit]): Unit = js.native
  @JSName("addListener")
  def addListener_schema(
    name: String,
    callback: js.Function3[
      /* sender */ this.type, 
      typings.realm.realmStrings.schema, 
      /* schema */ js.Array[ObjectSchema], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * @returns void
    */
  def beginTransaction(): Unit = js.native
  
  /**
    * @returns void
    */
  def cancelTransaction(): Unit = js.native
  
  /**
    * @returns void
    */
  def close(): Unit = js.native
  
  /**
    * @returns void
    */
  def commitTransaction(): Unit = js.native
  
  /**
    * @returns boolean
    */
  def compact(): Boolean = js.native
  
  /**
    * @param  {string} type
    * @param  {T} properties
    * @param  {Realm.UpdateMode} mode? If not provided, `Realm.UpdateMode.Never` is used.
    * @returns T & Realm.Object
    */
  def create[T](`type`: String, properties: RealmInsertionModel[T]): T & Object = js.native
  def create[T](`type`: String, properties: RealmInsertionModel[T], mode: Never): T & Object = js.native
  def create[T](`type`: String, properties: Partial[RealmInsertionModel[T] | T], mode: All): T & Object = js.native
  def create[T](`type`: String, properties: Partial[RealmInsertionModel[T] | T], mode: Modified): T & Object = js.native
  /**
    * @param  {Class} type
    * @param  {T} properties
    * @param  {Realm.UpdateMode} mode? If not provided, `Realm.UpdateMode.Never` is used.
    * @returns T
    */
  def create[T /* <: Object */](`type`: Instantiable[T], properties: RealmInsertionModel[T]): T = js.native
  def create[T /* <: Object */](`type`: Instantiable[T], properties: RealmInsertionModel[T], mode: Never): T = js.native
  def create[T /* <: Object */](`type`: Instantiable[T], properties: Partial[RealmInsertionModel[T] | T], mode: All): T = js.native
  def create[T /* <: Object */](`type`: Instantiable[T], properties: Partial[RealmInsertionModel[T] | T], mode: Modified): T = js.native
  
  def delete(`object`: js.Any): Unit = js.native
  def delete(`object`: js.Array[Object]): Unit = js.native
  def delete(`object`: List[js.Any]): Unit = js.native
  /**
    * @param  {Realm.Object|Realm.Object[]|Realm.List<any>|Realm.Results<any>|any} object
    * @returns void
    */
  def delete(`object`: Object): Unit = js.native
  def delete(`object`: Results[js.Any]): Unit = js.native
  
  /**
    * @returns void
    */
  def deleteAll(): Unit = js.native
  
  /**
    * @returns void
    */
  def deleteModel(name: String): Unit = js.native
  
  val empty: Boolean = js.native
  
  val isClosed: Boolean = js.native
  
  val isInTransaction: Boolean = js.native
  
  def objectForPrimaryKey[T](`type`: String, key: String): js.UndefOr[T & Object] = js.native
  def objectForPrimaryKey[T](
    `type`: String,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Realm.ObjectId */ js.Any
  ): js.UndefOr[T & Object] = js.native
  /**
    * @param  {string} type
    * @param  {number|string|ObjectId} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T](`type`: String, key: Double): js.UndefOr[T & Object] = js.native
  def objectForPrimaryKey[T /* <: Object */](`type`: Instantiable[T], key: String): js.UndefOr[T] = js.native
  def objectForPrimaryKey[T /* <: Object */](
    `type`: Instantiable[T],
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Realm.ObjectId */ js.Any
  ): js.UndefOr[T] = js.native
  /**
    * @param  {Class} type
    * @param  {number|string|ObjectId} key
    * @returns {T | undefined}
    */
  def objectForPrimaryKey[T /* <: Object */](`type`: Instantiable[T], key: Double): js.UndefOr[T] = js.native
  
  /**
    * @param  {string} type
    * @returns Realm.Results<T & Realm.Object>
    */
  def objects[T](`type`: String): Results[T & Object] = js.native
  /**
    * @param  {Class} type
    * @returns Realm.Results<T>
    */
  def objects[T /* <: Object */](`type`: Instantiable[T]): Results[T] = js.native
  
  val path: String = js.native
  
  val readOnly: Boolean = js.native
  
  /**
    * @param  {string} name?
    * @returns void
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(name: String): Unit = js.native
  
  /**
    * @param  {string} name
    * @param  {()=>void} callback
    * @returns void
    */
  @JSName("removeListener")
  def removeListener_change(name: String, callback: js.Function2[/* sender */ this.type, change, Unit]): Unit = js.native
  @JSName("removeListener")
  def removeListener_schema(
    name: String,
    callback: js.Function3[
      /* sender */ this.type, 
      typings.realm.realmStrings.schema, 
      /* schema */ js.Array[ObjectSchema], 
      Unit
    ]
  ): Unit = js.native
  
  val schema: js.Array[ObjectSchema] = js.native
  
  val schemaVersion: Double = js.native
  
  val syncSession: Session | Null = js.native
  
  /**
    * @param  {()=>void} callback
    * @returns void
    */
  def write(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Write a copy to destination path
    * @param path destination path
    * @param encryptionKey encryption key to use
    * @returns void
    */
  def writeCopyTo(path: String): Unit = js.native
  def writeCopyTo(path: String, encryptionKey: ArrayBuffer): Unit = js.native
  def writeCopyTo(path: String, encryptionKey: ArrayBufferView): Unit = js.native
}
object Realm {
  
  /**
    * A MongoDB Realm App.
    */
  trait App[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] extends StObject {
    
    /**
      * All authenticated users.
      */
    val allUsers: Record[String, User[FunctionsFactoryType, CustomDataType]]
    
    /**
      * The last user to log in or being switched to.
      */
    val currentUser: (User[FunctionsFactoryType, CustomDataType]) | Null
    
    /**
      * Perform operations related to the email/password auth provider.
      */
    var emailPasswordAuth: EmailPasswordAuth
    
    /**
      * The id of this Realm app.
      */
    val id: String
    
    /**
      * Log in a user using a specific credential
      *
      * @param credentials the credentials to use when logging in
      */
    def logIn(credentials: Credentials[js.Object]): js.Promise[User[FunctionsFactoryType, CustomDataType]]
    
    /**
      * Logs out and removes a user from the app.
      *
      * @returns A promise that resolves once the user has been logged out and removed from the app.
      */
    def removeUser(user: User[FunctionsFactoryType, CustomDataType]): js.Promise[Unit]
    
    /**
      * Switch current user, from an instance of `User` or the string id of the user.
      */
    def switchUser(user: User[FunctionsFactoryType, CustomDataType]): Unit
  }
  object App {
    
    inline def apply[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */](
      allUsers: Record[String, User[FunctionsFactoryType, CustomDataType]],
      emailPasswordAuth: EmailPasswordAuth,
      id: String,
      logIn: Credentials[js.Object] => js.Promise[User[FunctionsFactoryType, CustomDataType]],
      removeUser: User[FunctionsFactoryType, CustomDataType] => js.Promise[Unit],
      switchUser: User[FunctionsFactoryType, CustomDataType] => Unit
    ): App[FunctionsFactoryType, CustomDataType] = {
      val __obj = js.Dynamic.literal(allUsers = allUsers.asInstanceOf[js.Any], emailPasswordAuth = emailPasswordAuth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logIn = js.Any.fromFunction1(logIn), removeUser = js.Any.fromFunction1(removeUser), switchUser = js.Any.fromFunction1(switchUser), currentUser = null)
      __obj.asInstanceOf[App[FunctionsFactoryType, CustomDataType]]
    }
    
    object Sync {
      
      @js.native
      sealed trait NumericLogLevel extends StObject
      @JSGlobal("Realm.App.Sync.NumericLogLevel")
      @js.native
      object NumericLogLevel extends StObject {
        
        @js.native
        sealed trait All
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Debug
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Detail
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Error
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Fatal
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Info
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Off
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Trace
          extends StObject
             with NumericLogLevel
        
        @js.native
        sealed trait Warn
          extends StObject
             with NumericLogLevel
      }
      
      /**
        * AuthError
        */
      trait AuthError extends StObject {
        
        val code: Double
        
        val `type`: String
      }
      object AuthError {
        
        inline def apply(code: Double, `type`: String): AuthError = {
          val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[AuthError]
        }
        
        extension [Self <: AuthError](x: Self) {
          
          inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.realm.realmStrings.all
        - typings.realm.realmStrings.trace
        - typings.realm.realmStrings.debug
        - typings.realm.realmStrings.detail
        - typings.realm.realmStrings.info
        - typings.realm.realmStrings.warn
        - typings.realm.realmStrings.error
        - typings.realm.realmStrings.fatal
        - typings.realm.realmStrings.off
      */
      trait LogLevel extends StObject
      object LogLevel {
        
        inline def all: typings.realm.realmStrings.all = "all".asInstanceOf[typings.realm.realmStrings.all]
        
        inline def debug: typings.realm.realmStrings.debug = "debug".asInstanceOf[typings.realm.realmStrings.debug]
        
        inline def detail: typings.realm.realmStrings.detail = "detail".asInstanceOf[typings.realm.realmStrings.detail]
        
        inline def error: typings.realm.realmStrings.error = "error".asInstanceOf[typings.realm.realmStrings.error]
        
        inline def fatal: typings.realm.realmStrings.fatal = "fatal".asInstanceOf[typings.realm.realmStrings.fatal]
        
        inline def info: typings.realm.realmStrings.info = "info".asInstanceOf[typings.realm.realmStrings.info]
        
        inline def off: typings.realm.realmStrings.off = "off".asInstanceOf[typings.realm.realmStrings.off]
        
        inline def trace: typings.realm.realmStrings.trace = "trace".asInstanceOf[typings.realm.realmStrings.trace]
        
        inline def warn: typings.realm.realmStrings.warn = "warn".asInstanceOf[typings.realm.realmStrings.warn]
      }
      
      @js.native
      trait Session extends StObject {
        
        def addConnectionNotification(callback: ConnectionNotificationCallback): Unit = js.native
        
        def addProgressNotification(direction: ProgressDirection, mode: ProgressMode, progressCallback: ProgressNotificationCallback): Unit = js.native
        
        val config: SyncConfiguration = js.native
        
        val connectionState: ConnectionState = js.native
        
        def downloadAllServerChanges(): js.Promise[Unit] = js.native
        def downloadAllServerChanges(timeoutMs: Double): js.Promise[Unit] = js.native
        
        def isConnected(): Boolean = js.native
        
        def pause(): Unit = js.native
        
        def removeConnectionNotification(callback: ConnectionNotificationCallback): Unit = js.native
        
        def removeProgressNotification(progressCallback: ProgressNotificationCallback): Unit = js.native
        
        def resume(): Unit = js.native
        
        val state: invalid | active | inactive = js.native
        
        def uploadAllLocalChanges(): js.Promise[Unit] = js.native
        def uploadAllLocalChanges(timeoutMs: Double): js.Promise[Unit] = js.native
        
        val url: String = js.native
        
        val user: User[DefaultFunctionsFactory, js.Any] = js.native
      }
    }
    
    extension [Self <: App[?, ?], FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */](x: Self & (App[FunctionsFactoryType, CustomDataType])) {
      
      inline def setAllUsers(value: Record[String, User[FunctionsFactoryType, CustomDataType]]): Self = StObject.set(x, "allUsers", value.asInstanceOf[js.Any])
      
      inline def setCurrentUser(value: User[FunctionsFactoryType, CustomDataType]): Self = StObject.set(x, "currentUser", value.asInstanceOf[js.Any])
      
      inline def setCurrentUserNull: Self = StObject.set(x, "currentUser", null)
      
      inline def setEmailPasswordAuth(value: EmailPasswordAuth): Self = StObject.set(x, "emailPasswordAuth", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLogIn(value: Credentials[js.Object] => js.Promise[User[FunctionsFactoryType, CustomDataType]]): Self = StObject.set(x, "logIn", js.Any.fromFunction1(value))
      
      inline def setRemoveUser(value: User[FunctionsFactoryType, CustomDataType] => js.Promise[Unit]): Self = StObject.set(x, "removeUser", js.Any.fromFunction1(value))
      
      inline def setSwitchUser(value: User[FunctionsFactoryType, CustomDataType] => Unit): Self = StObject.set(x, "switchUser", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  sealed trait ConnectionState extends StObject
  @JSGlobal("Realm.ConnectionState")
  @js.native
  object ConnectionState extends StObject {
    
    @js.native
    sealed trait Connected
      extends StObject
         with ConnectionState
    
    @js.native
    sealed trait Connecting
      extends StObject
         with ConnectionState
    
    @js.native
    sealed trait Disconnected
      extends StObject
         with ConnectionState
  }
  
  @js.native
  sealed trait UpdateMode extends StObject
  @JSGlobal("Realm.UpdateMode")
  @js.native
  object UpdateMode extends StObject {
    
    @js.native
    sealed trait All
      extends StObject
         with UpdateMode
    
    @js.native
    sealed trait Modified
      extends StObject
         with UpdateMode
    
    @js.native
    sealed trait Never
      extends StObject
         with UpdateMode
  }
  
  @js.native
  sealed trait UserState extends StObject
  /**
    * The state of a user.
    */
  @JSGlobal("Realm.UserState")
  @js.native
  object UserState extends StObject {
    
    /** Authenticated and available to communicate with services. */
    @js.native
    sealed trait Active
      extends StObject
         with UserState
    
    /** Logged out, but ready to be logged in. */
    @js.native
    sealed trait LoggedOut
      extends StObject
         with UserState
    
    /** Removed from the app entirely. */
    @js.native
    sealed trait Removed
      extends StObject
         with UserState
  }
  
  @js.native
  sealed trait UserType extends StObject
  /**
    * The type of a user.
    */
  @JSGlobal("Realm.UserType")
  @js.native
  object UserType extends StObject {
    
    /** A normal end-user created this user */
    @js.native
    sealed trait Normal
      extends StObject
         with UserType
    
    /** The user was created by the server */
    @js.native
    sealed trait Server
      extends StObject
         with UserType
  }
  
  /**
    * Pass an object implementing this interface to the app constructor.
    */
  trait AppConfiguration extends StObject {
    
    /**
      * This describes the local app, sent to the server when a user authenticates.
      * Specifying this will enable the server to respond differently to specific versions of specific apps.
      */
    var app: js.UndefOr[LocalAppConfiguration] = js.undefined
    
    /**
      * An optional URL to use as a prefix when requesting the MongoDB Realm services.
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The Realm App ID
      */
    var id: String
  }
  object AppConfiguration {
    
    inline def apply(id: String): AppConfiguration = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppConfiguration]
    }
    
    extension [Self <: AppConfiguration](x: Self) {
      
      inline def setApp(value: LocalAppConfiguration): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  object Auth {
    
    /**
      * The representation of an API-key stored in the service.
      */
    trait ApiKey extends StObject {
      
      /**
        * The internal identifier of the key.
        */
      var _id: String
      
      /**
        * When disabled, the key cannot authenticate.
        */
      var disabled: Boolean
      
      /**
        * The secret part of the key.
        */
      var key: String
      
      /**
        * A name for the key.
        */
      var name: String
    }
    object ApiKey {
      
      inline def apply(_id: String, disabled: Boolean, key: String, name: String): ApiKey = {
        val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ApiKey]
      }
      
      extension [Self <: ApiKey](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Authentication provider where users identify using an API-key.
      */
    trait ApiKeyAuth extends StObject {
      
      /**
        * Creates an API key that can be used to authenticate as the current user.
        *
        * @param name the name of the API key to be created.
        */
      def create(name: String): js.Promise[ApiKey]
      
      /**
        * Deletes an API key associated with the current user.
        *
        * @param keyId the id of the API key to delete
        */
      def delete(keyId: String): js.Promise[Unit]
      
      /**
        * Disable an API key associated with the current user.
        *
        * @param keyId the id of the API key to disable
        */
      def disable(keyId: String): js.Promise[Unit]
      
      /**
        * Enables an API key associated with the current user.
        *
        * @param keyId the id of the API key to enable
        */
      def enable(keyId: String): js.Promise[Unit]
      
      /**
        * Fetches an API key associated with the current user.
        *
        * @param keyId the id of the API key to fetch.
        */
      def fetch(keyId: String): js.Promise[ApiKey]
      
      /**
        * Fetches the API keys associated with the current user.
        */
      def fetchAll(): js.Promise[js.Array[ApiKey]]
    }
    object ApiKeyAuth {
      
      inline def apply(
        create: String => js.Promise[ApiKey],
        delete: String => js.Promise[Unit],
        disable: String => js.Promise[Unit],
        enable: String => js.Promise[Unit],
        fetch: String => js.Promise[ApiKey],
        fetchAll: () => js.Promise[js.Array[ApiKey]]
      ): ApiKeyAuth = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), fetch = js.Any.fromFunction1(fetch), fetchAll = js.Any.fromFunction0(fetchAll))
        __obj.asInstanceOf[ApiKeyAuth]
      }
      
      extension [Self <: ApiKeyAuth](x: Self) {
        
        inline def setCreate(value: String => js.Promise[ApiKey]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        inline def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
        
        inline def setDisable(value: String => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
        
        inline def setEnable(value: String => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
        
        inline def setFetch(value: String => js.Promise[ApiKey]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
        
        inline def setFetchAll(value: () => js.Promise[js.Array[ApiKey]]): Self = StObject.set(x, "fetchAll", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * Authentication provider where users identify using email and password.
      */
    trait EmailPasswordAuth extends StObject {
      
      /**
        * Call the custom function to reset the password.
        *
        * @param email the email associated with the user.
        * @param password the new password.
        * @param args one or more arguments to pass to the function.
        */
      def callResetPasswordFunction(email: String, password: String, args: js.Any*): js.Promise[Unit]
      
      /**
        * Confirm a user by the token received.
        *
        * @param token the token received.
        * @param tokenId the id of the token received.
        */
      def confirmUser(token: String, tokenId: String): js.Promise[Unit]
      
      /**
        * Register a new user.
        *
        * @param email The new users email.
        * @param password the new users passsword.
        */
      def registerUser(email: String, password: String): js.Promise[Unit]
      
      /**
        * Resend the confirmation email.
        *
        * @param email the email associated to resend the confirmation to.
        */
      def resendConfirmationEmail(email: String): js.Promise[Unit]
      
      /**
        * Complete resetting the password
        *
        * @param token the token received.
        * @param tokenId the id of the token received.
        * @param password the new password.
        */
      def resetPassword(token: String, tokenId: String, password: String): js.Promise[Unit]
      
      /**
        * Send an email with tokens to reset the password.
        *
        * @param email the email to send the tokens to.
        */
      def sendResetPasswordEmail(email: String): js.Promise[Unit]
    }
    object EmailPasswordAuth {
      
      inline def apply(
        callResetPasswordFunction: (String, String, /* repeated */ js.Any) => js.Promise[Unit],
        confirmUser: (String, String) => js.Promise[Unit],
        registerUser: (String, String) => js.Promise[Unit],
        resendConfirmationEmail: String => js.Promise[Unit],
        resetPassword: (String, String, String) => js.Promise[Unit],
        sendResetPasswordEmail: String => js.Promise[Unit]
      ): EmailPasswordAuth = {
        val __obj = js.Dynamic.literal(callResetPasswordFunction = js.Any.fromFunction3(callResetPasswordFunction), confirmUser = js.Any.fromFunction2(confirmUser), registerUser = js.Any.fromFunction2(registerUser), resendConfirmationEmail = js.Any.fromFunction1(resendConfirmationEmail), resetPassword = js.Any.fromFunction3(resetPassword), sendResetPasswordEmail = js.Any.fromFunction1(sendResetPasswordEmail))
        __obj.asInstanceOf[EmailPasswordAuth]
      }
      
      extension [Self <: EmailPasswordAuth](x: Self) {
        
        inline def setCallResetPasswordFunction(value: (String, String, /* repeated */ js.Any) => js.Promise[Unit]): Self = StObject.set(x, "callResetPasswordFunction", js.Any.fromFunction3(value))
        
        inline def setConfirmUser(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "confirmUser", js.Any.fromFunction2(value))
        
        inline def setRegisterUser(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "registerUser", js.Any.fromFunction2(value))
        
        inline def setResendConfirmationEmail(value: String => js.Promise[Unit]): Self = StObject.set(x, "resendConfirmationEmail", js.Any.fromFunction1(value))
        
        inline def setResetPassword(value: (String, String, String) => js.Promise[Unit]): Self = StObject.set(x, "resetPassword", js.Any.fromFunction3(value))
        
        inline def setSendResetPasswordEmail(value: String => js.Promise[Unit]): Self = StObject.set(x, "sendResetPasswordEmail", js.Any.fromFunction1(value))
      }
    }
  }
  
  /**
    * An object with interfaces to all possible authentication providers the app might have.
    */
  trait AuthProviders extends StObject {
    
    /** Authentication provider where users identify using an API-key. */
    var apiKey: ApiKeyAuth
    
    /** Authentication provider where users identify using email and password. */
    var emailPassword: EmailPasswordAuth
  }
  object AuthProviders {
    
    inline def apply(apiKey: ApiKeyAuth, emailPassword: EmailPasswordAuth): AuthProviders = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], emailPassword = emailPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthProviders]
    }
    
    extension [Self <: AuthProviders](x: Self) {
      
      inline def setApiKey(value: ApiKeyAuth): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setEmailPassword(value: EmailPasswordAuth): Self = StObject.set(x, "emailPassword", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A collection of functions as defined on the MongoDB Server.
    */
  trait BaseFunctionsFactory extends StObject {
    
    /**
      * Call a remote MongoDB Realm function by its name.
      * Consider using `functions[name]()` instead of calling this method.
      *
      * @param name Name of the function.
      * @param args Arguments passed to the function.
      */
    def callFunction(name: String, args: js.Any*): js.Promise[js.Any]
    
    /**
      * Call a remote MongoDB Realm function by its name, in a streaming mode.
      * Consider using `functions[name]()` instead of calling this method.
      *
      * @param name Name of the function.
      * @param args Arguments passed to the function.
      */
    def callFunctionStreaming(name: String, args: js.Any*): js.Promise[AsyncIterable[Uint8Array]]
  }
  object BaseFunctionsFactory {
    
    inline def apply(
      callFunction: (String, /* repeated */ js.Any) => js.Promise[js.Any],
      callFunctionStreaming: (String, /* repeated */ js.Any) => js.Promise[AsyncIterable[Uint8Array]]
    ): BaseFunctionsFactory = {
      val __obj = js.Dynamic.literal(callFunction = js.Any.fromFunction2(callFunction), callFunctionStreaming = js.Any.fromFunction2(callFunctionStreaming))
      __obj.asInstanceOf[BaseFunctionsFactory]
    }
    
    extension [Self <: BaseFunctionsFactory](x: Self) {
      
      inline def setCallFunction(value: (String, /* repeated */ js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "callFunction", js.Any.fromFunction2(value))
      
      inline def setCallFunctionStreaming(value: (String, /* repeated */ js.Any) => js.Promise[AsyncIterable[Uint8Array]]): Self = StObject.set(x, "callFunctionStreaming", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Collection
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html }
    */
  @js.native
  trait Collection[T]
    extends StObject
       with ReadonlyArray[T] {
    
    /**
      * @param  {(collection:any,changes:any)=>void} callback
      * @returns void
      */
    def addListener(callback: CollectionChangeCallback[T]): Unit = js.native
    
    def avg(): Double = js.native
    def avg(property: String): Double = js.native
    
    def description(): String = js.native
    
    /**
      * @param  {string} query
      * @param  {any[]} ...arg
      * @returns Results
      */
    def filtered(query: String, arg: js.Any*): Results[T] = js.native
    
    /**
      * @returns boolean
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @returns boolean
      */
    def isValid(): Boolean = js.native
    
    def max(): Double | Date | Null = js.native
    def max(property: String): Double | Date | Null = js.native
    
    def min(): Double | Date | Null = js.native
    def min(property: String): Double | Date | Null = js.native
    
    val optional: Boolean = js.native
    
    /**
      * @returns void
      */
    def removeAllListeners(): Unit = js.native
    
    /**
      * @param  {()=>void} callback this is the callback to remove
      * @returns void
      */
    def removeListener(callback: CollectionChangeCallback[T]): Unit = js.native
    
    /**
      * @returns Results
      */
    def snapshot(): Results[T] = js.native
    
    def sorted(): Results[T] = js.native
    def sorted(descriptor: String): Results[T] = js.native
    def sorted(descriptor: String, reverse: Boolean): Results[T] = js.native
    def sorted(descriptor: js.Array[SortDescriptor]): Results[T] = js.native
    def sorted(reverse: Boolean): Results[T] = js.native
    
    def sum(): Double | Null = js.native
    def sum(property: String): Double | Null = js.native
    
    /**
      * @returns An object for JSON serialization.
      */
    def toJSON(): js.Array[js.Any] = js.native
    
    val `type`: PropertyType = js.native
  }
  
  type CollectionChangeCallback[T] = js.Function2[/* collection */ Collection[T], /* changes */ CollectionChangeSet, Unit]
  
  trait CollectionChangeSet extends StObject {
    
    var deletions: js.Array[Double]
    
    var insertions: js.Array[Double]
    
    var newModifications: js.Array[Double]
    
    var oldModifications: js.Array[Double]
  }
  object CollectionChangeSet {
    
    inline def apply(
      deletions: js.Array[Double],
      insertions: js.Array[Double],
      newModifications: js.Array[Double],
      oldModifications: js.Array[Double]
    ): CollectionChangeSet = {
      val __obj = js.Dynamic.literal(deletions = deletions.asInstanceOf[js.Any], insertions = insertions.asInstanceOf[js.Any], newModifications = newModifications.asInstanceOf[js.Any], oldModifications = oldModifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionChangeSet]
    }
    
    extension [Self <: CollectionChangeSet](x: Self) {
      
      inline def setDeletions(value: js.Array[Double]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
      
      inline def setDeletionsVarargs(value: Double*): Self = StObject.set(x, "deletions", js.Array(value :_*))
      
      inline def setInsertions(value: js.Array[Double]): Self = StObject.set(x, "insertions", value.asInstanceOf[js.Any])
      
      inline def setInsertionsVarargs(value: Double*): Self = StObject.set(x, "insertions", js.Array(value :_*))
      
      inline def setNewModifications(value: js.Array[Double]): Self = StObject.set(x, "newModifications", value.asInstanceOf[js.Any])
      
      inline def setNewModificationsVarargs(value: Double*): Self = StObject.set(x, "newModifications", js.Array(value :_*))
      
      inline def setOldModifications(value: js.Array[Double]): Self = StObject.set(x, "oldModifications", value.asInstanceOf[js.Any])
      
      inline def setOldModificationsVarargs(value: Double*): Self = StObject.set(x, "oldModifications", js.Array(value :_*))
    }
  }
  
  /**
    * realm configuration
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  trait Configuration extends StObject {
    
    var deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.undefined
    
    var disableFormatUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var encryptionKey: js.UndefOr[ArrayBuffer | ArrayBufferView | Int8Array] = js.undefined
    
    var fifoFilesFallbackPath: js.UndefOr[String] = js.undefined
    
    var inMemory: js.UndefOr[Boolean] = js.undefined
    
    var migration: js.UndefOr[MigrationCallback] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.undefined
    
    var schemaVersion: js.UndefOr[Double] = js.undefined
    
    var shouldCompactOnLaunch: js.UndefOr[js.Function2[/* totalBytes */ Double, /* usedBytes */ Double, Boolean]] = js.undefined
    
    var sync: js.UndefOr[SyncConfiguration] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setDeleteRealmIfMigrationNeeded(value: Boolean): Self = StObject.set(x, "deleteRealmIfMigrationNeeded", value.asInstanceOf[js.Any])
      
      inline def setDeleteRealmIfMigrationNeededUndefined: Self = StObject.set(x, "deleteRealmIfMigrationNeeded", js.undefined)
      
      inline def setDisableFormatUpgrade(value: Boolean): Self = StObject.set(x, "disableFormatUpgrade", value.asInstanceOf[js.Any])
      
      inline def setDisableFormatUpgradeUndefined: Self = StObject.set(x, "disableFormatUpgrade", js.undefined)
      
      inline def setEncryptionKey(value: ArrayBuffer | ArrayBufferView | Int8Array): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setFifoFilesFallbackPath(value: String): Self = StObject.set(x, "fifoFilesFallbackPath", value.asInstanceOf[js.Any])
      
      inline def setFifoFilesFallbackPathUndefined: Self = StObject.set(x, "fifoFilesFallbackPath", js.undefined)
      
      inline def setInMemory(value: Boolean): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
      
      inline def setInMemoryUndefined: Self = StObject.set(x, "inMemory", js.undefined)
      
      inline def setMigration(value: (/* oldRealm */ Realm, /* newRealm */ Realm) => Unit): Self = StObject.set(x, "migration", js.Any.fromFunction2(value))
      
      inline def setMigrationUndefined: Self = StObject.set(x, "migration", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSchema(value: js.Array[ObjectClass | ObjectSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemaVarargs(value: (ObjectClass | ObjectSchema)*): Self = StObject.set(x, "schema", js.Array(value :_*))
      
      inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
      
      inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
      
      inline def setShouldCompactOnLaunch(value: (/* totalBytes */ Double, /* usedBytes */ Double) => Boolean): Self = StObject.set(x, "shouldCompactOnLaunch", js.Any.fromFunction2(value))
      
      inline def setShouldCompactOnLaunchUndefined: Self = StObject.set(x, "shouldCompactOnLaunch", js.undefined)
      
      inline def setSync(value: SyncConfiguration): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type ConnectionNotificationCallback = js.Function2[/* newState */ ConnectionState, /* oldState */ ConnectionState, Unit]
  
  // TODO: Add providerCapabilities?
  /**
    * End-users enter credentials to authenticate toward your MongoDB Realm App.
    */
  trait Credentials[PayloadType /* <: js.Object */] extends StObject {
    
    /**
      * A simple object which can be passed to the server as the body of a request to authenticate.
      */
    val payload: PayloadType
    
    /**
      * Name of the authentication provider.
      */
    val providerName: String
    
    /**
      * Type of the authentication provider.
      */
    val providerType: String
  }
  object Credentials {
    
    inline def apply[PayloadType /* <: js.Object */](payload: PayloadType, providerName: String, providerType: String): Credentials[PayloadType] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials[PayloadType]]
    }
    
    /**
      * Payload sent when authenticating using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
      */
    type AnonymousPayload = js.Object
    
    /**
      * Payload sent when authenticating using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      */
    trait ApiKeyPayload extends StObject {
      
      /**
        * The secret content of the API key.
        */
      var key: String
    }
    object ApiKeyPayload {
      
      inline def apply(key: String): ApiKeyPayload = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[ApiKeyPayload]
      }
      
      extension [Self <: ApiKeyPayload](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Payload sent when authenticating using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
      */
    trait ApplePayload extends StObject {
      
      /**
        * The ID token from Apple.
        */
      var id_token: String
    }
    object ApplePayload {
      
      inline def apply(id_token: String): ApplePayload = {
        val __obj = js.Dynamic.literal(id_token = id_token.asInstanceOf[js.Any])
        __obj.asInstanceOf[ApplePayload]
      }
      
      extension [Self <: ApplePayload](x: Self) {
        
        inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: Credentials[?], PayloadType /* <: js.Object */](x: Self & Credentials[PayloadType]) {
      
      inline def setPayload(value: PayloadType): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      inline def setProviderType(value: String): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
    }
    
    /**
      * Payload sent when authenticating using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
      */
    trait EmailPasswordPayload extends StObject {
      
      /**
        * The end-users password.
        */
      var password: String
      
      /**
        * The end-users username.
        * Note: This currently has to be an email.
        */
      var username: String
    }
    object EmailPasswordPayload {
      
      inline def apply(password: String, username: String): EmailPasswordPayload = {
        val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[EmailPasswordPayload]
      }
      
      extension [Self <: EmailPasswordPayload](x: Self) {
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Payload sent when authenticating using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
      */
    trait FacebookPayload extends StObject {
      
      /**
        * The auth code returned from Google.
        */
      var accessToken: String
    }
    object FacebookPayload {
      
      inline def apply(accessToken: String): FacebookPayload = {
        val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[FacebookPayload]
      }
      
      extension [Self <: FacebookPayload](x: Self) {
        
        inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Payload sent when authenticating using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
      */
    type FunctionPayload = js.Object
    
    /**
      * Payload sent when authenticating using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
      */
    trait GooglePayload extends StObject {
      
      /**
        * The auth code returned from Google.
        */
      var authCode: String
    }
    object GooglePayload {
      
      inline def apply(authCode: String): GooglePayload = {
        val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any])
        __obj.asInstanceOf[GooglePayload]
      }
      
      extension [Self <: GooglePayload](x: Self) {
        
        inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Payload sent when authenticating using the [Custom JWT Provider](https://docs.mongodb.com/realm/authentication/custom-jwt/).
      */
    trait JWTPayload extends StObject {
      
      /**
        * The JSON Web Token signed by another service.
        */
      var token: String
    }
    object JWTPayload {
      
      inline def apply(token: String): JWTPayload = {
        val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
        __obj.asInstanceOf[JWTPayload]
      }
      
      extension [Self <: JWTPayload](x: Self) {
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Payload sent when authenticating using an OAuth 2.0 provider:
      * - [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
      * - [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
      */
    trait OAuth2RedirectPayload extends StObject {
      
      /**
        * The auth code returned from Google.
        */
      var redirectUrl: String
    }
    object OAuth2RedirectPayload {
      
      inline def apply(redirectUrl: String): OAuth2RedirectPayload = {
        val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
        __obj.asInstanceOf[OAuth2RedirectPayload]
      }
      
      extension [Self <: OAuth2RedirectPayload](x: Self) {
        
        inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * A collection of functions as defined on the MongoDB Server.
    */
  trait DefaultFunctionsFactory
    extends StObject
       with BaseFunctionsFactory
       with /**
    * All the functions are accessable as members on this instance.
    */
  /* name */ StringDictionary[RealmFunction[js.Any, js.Array[js.Any]]]
  object DefaultFunctionsFactory {
    
    inline def apply(
      callFunction: (String, /* repeated */ js.Any) => js.Promise[js.Any],
      callFunctionStreaming: (String, /* repeated */ js.Any) => js.Promise[AsyncIterable[Uint8Array]]
    ): DefaultFunctionsFactory = {
      val __obj = js.Dynamic.literal(callFunction = js.Any.fromFunction2(callFunction), callFunctionStreaming = js.Any.fromFunction2(callFunctionStreaming))
      __obj.asInstanceOf[DefaultFunctionsFactory]
    }
  }
  
  type ErrorCallback = js.Function2[/* session */ Session, /* error */ SyncError, Unit]
  
  /**
    * List
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.List.html }
    */
  @js.native
  trait List[T]
    extends StObject
       with Collection[T] {
    
    def pop(): js.UndefOr[T | Null] = js.native
    
    /**
      * @param  {T} object
      * @returns number
      */
    def push(`object`: T*): Double = js.native
    
    /**
      * @returns T
      */
    def shift(): js.UndefOr[T | Null] = js.native
    
    /**
      * @param  {number} index
      * @param  {number} count?
      * @param  {any} object?
      * @returns T
      */
    def splice(index: Double): js.Array[T] = js.native
    def splice(index: Double, count: Double): js.Array[T] = js.native
    def splice(index: Double, count: Double, `object`: js.Any): js.Array[T] = js.native
    def splice(index: Double, count: Unit, `object`: js.Any): js.Array[T] = js.native
    
    def unshift(`object`: T*): Double = js.native
  }
  
  /**
    * This describes the local app, sent to the server when a user authenticates.
    */
  trait LocalAppConfiguration extends StObject {
    
    /**
      * The name / id of the local app.
      * Note: This should be the name or a bundle id of your app, not the MongoDB Realm app.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the local app.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object LocalAppConfiguration {
    
    inline def apply(): LocalAppConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalAppConfiguration]
    }
    
    extension [Self <: LocalAppConfiguration](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /**
    * A function which can be called to migrate a Realm from one version of the schema to another.
    */
  type MigrationCallback = js.Function2[/* oldRealm */ Realm, /* newRealm */ Realm, Unit]
  
  /**
    * Object
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
    */
  trait Object extends StObject {
    
    def _objectId(): String
    
    /**
      * @returns void
      */
    def addListener(callback: ObjectChangeCallback): Unit
    
    /**
      * @returns An array of key/value pairs of the object's properties.
      */
    def entries(): js.Array[js.Tuple2[String, js.Any]]
    
    /**
      * @returns boolean
      */
    def isValid(): Boolean
    
    /**
      * @returns An array of the names of the object's properties.
      */
    def keys(): js.Array[String]
    
    /**
      * @returns Results<T>
      */
    def linkingObjects[T](objectType: String, property: String): Results[T & Object]
    
    /**
      * @returns number
      */
    def linkingObjectsCount(): Double
    
    /**
      * @returns ObjectSchema
      */
    def objectSchema(): ObjectSchema
    
    def removeAllListeners(): Unit
    
    def removeListener(callback: ObjectChangeCallback): Unit
    
    /**
      * @returns An object for JSON serialization.
      */
    def toJSON(): js.Any
  }
  object Object {
    
    inline def apply(
      _objectId: () => String,
      addListener: ObjectChangeCallback => Unit,
      entries: () => js.Array[js.Tuple2[String, js.Any]],
      isValid: () => Boolean,
      keys: () => js.Array[String],
      linkingObjects: (String, String) => Results[js.Any & Object],
      linkingObjectsCount: () => Double,
      objectSchema: () => ObjectSchema,
      removeAllListeners: () => Unit,
      removeListener: ObjectChangeCallback => Unit,
      toJSON: () => js.Any
    ): Object = {
      val __obj = js.Dynamic.literal(_objectId = js.Any.fromFunction0(_objectId), addListener = js.Any.fromFunction1(addListener), entries = js.Any.fromFunction0(entries), isValid = js.Any.fromFunction0(isValid), keys = js.Any.fromFunction0(keys), linkingObjects = js.Any.fromFunction2(linkingObjects), linkingObjectsCount = js.Any.fromFunction0(linkingObjectsCount), objectSchema = js.Any.fromFunction0(objectSchema), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Object]
    }
    
    extension [Self <: Object](x: Self) {
      
      inline def setAddListener(value: ObjectChangeCallback => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setEntries(value: () => js.Array[js.Tuple2[String, js.Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setLinkingObjects(value: (String, String) => Results[js.Any & Object]): Self = StObject.set(x, "linkingObjects", js.Any.fromFunction2(value))
      
      inline def setLinkingObjectsCount(value: () => Double): Self = StObject.set(x, "linkingObjectsCount", js.Any.fromFunction0(value))
      
      inline def setObjectSchema(value: () => ObjectSchema): Self = StObject.set(x, "objectSchema", js.Any.fromFunction0(value))
      
      inline def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      inline def setRemoveListener(value: ObjectChangeCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def set_objectId(value: () => String): Self = StObject.set(x, "_objectId", js.Any.fromFunction0(value))
    }
  }
  
  type ObjectChangeCallback = js.Function2[/* object */ Object, /* changes */ ObjectChangeSet, Unit]
  
  trait ObjectChangeSet extends StObject {
    
    var changedProperties: js.Array[String]
    
    var deleted: Boolean
  }
  object ObjectChangeSet {
    
    inline def apply(changedProperties: js.Array[String], deleted: Boolean): ObjectChangeSet = {
      val __obj = js.Dynamic.literal(changedProperties = changedProperties.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectChangeSet]
    }
    
    extension [Self <: ObjectChangeSet](x: Self) {
      
      inline def setChangedProperties(value: js.Array[String]): Self = StObject.set(x, "changedProperties", value.asInstanceOf[js.Any])
      
      inline def setChangedPropertiesVarargs(value: String*): Self = StObject.set(x, "changedProperties", js.Array(value :_*))
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ObjectClass
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectClass }
    */
  trait ObjectClass extends StObject {
    
    var schema: ObjectSchema
  }
  object ObjectClass {
    
    inline def apply(schema: ObjectSchema): ObjectClass = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectClass]
    }
    
    extension [Self <: ObjectClass](x: Self) {
      
      inline def setSchema(value: ObjectSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * realm configuration used for overriding default configuration values.
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  // object props type
  type ObjectPropsType = StringDictionary[js.Any]
  
  /**
    * ObjectSchema
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchema }
    */
  trait ObjectSchema extends StObject {
    
    var embedded: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var primaryKey: js.UndefOr[String] = js.undefined
    
    var properties: PropertiesTypes
  }
  object ObjectSchema {
    
    inline def apply(name: String, properties: PropertiesTypes): ObjectSchema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectSchema]
    }
    
    extension [Self <: ObjectSchema](x: Self) {
      
      inline def setEmbedded(value: Boolean): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedUndefined: Self = StObject.set(x, "embedded", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setProperties(value: PropertiesTypes): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ObjectSchemaProperty
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchemaProperty }
    */
  trait ObjectSchemaProperty extends StObject {
    
    var default: js.UndefOr[js.Any] = js.undefined
    
    var indexed: js.UndefOr[Boolean] = js.undefined
    
    var mapTo: js.UndefOr[String] = js.undefined
    
    var objectType: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var `type`: PropertyType
  }
  object ObjectSchemaProperty {
    
    inline def apply(`type`: PropertyType): ObjectSchemaProperty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectSchemaProperty]
    }
    
    extension [Self <: ObjectSchemaProperty](x: Self) {
      
      inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      inline def setMapTo(value: String): Self = StObject.set(x, "mapTo", value.asInstanceOf[js.Any])
      
      inline def setMapToUndefined: Self = StObject.set(x, "mapTo", js.undefined)
      
      inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
      
      inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ObjectType
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectType }
    */
  trait ObjectType extends StObject {
    
    var `type`: ObjectClass
  }
  object ObjectType {
    
    inline def apply(`type`: ObjectClass): ObjectType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectType]
    }
    
    extension [Self <: ObjectType](x: Self) {
      
      inline def setType(value: ObjectClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenRealmBehaviorConfiguration extends StObject {
    
    val timeOut: js.UndefOr[Double] = js.undefined
    
    val timeOutBehavior: js.UndefOr[OpenRealmTimeOutBehavior] = js.undefined
    
    val `type`: OpenRealmBehaviorType
  }
  object OpenRealmBehaviorConfiguration {
    
    inline def apply(`type`: OpenRealmBehaviorType): OpenRealmBehaviorConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenRealmBehaviorConfiguration]
    }
    
    extension [Self <: OpenRealmBehaviorConfiguration](x: Self) {
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutBehavior(value: OpenRealmTimeOutBehavior): Self = StObject.set(x, "timeOutBehavior", value.asInstanceOf[js.Any])
      
      inline def setTimeOutBehaviorUndefined: Self = StObject.set(x, "timeOutBehavior", js.undefined)
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setType(value: OpenRealmBehaviorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realm.realmStrings.downloadBeforeOpen
    - typings.realm.realmStrings.openImmediately
  */
  trait OpenRealmBehaviorType extends StObject
  object OpenRealmBehaviorType {
    
    inline def DownloadBeforeOpen: downloadBeforeOpen = "downloadBeforeOpen".asInstanceOf[downloadBeforeOpen]
    
    inline def OpenImmediately: openImmediately = "openImmediately".asInstanceOf[openImmediately]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realm.realmStrings.openLocalRealm
    - typings.realm.realmStrings.throwException
  */
  trait OpenRealmTimeOutBehavior extends StObject
  object OpenRealmTimeOutBehavior {
    
    inline def OpenLocalRealm: openLocalRealm = "openLocalRealm".asInstanceOf[openLocalRealm]
    
    inline def ThrowException: throwException = "throwException".asInstanceOf[throwException]
  }
  
  /* Inlined parent std.Partial<realm.Realm.Configuration> */
  trait PartialConfiguration extends StObject {
    
    var deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.undefined
    
    var disableFormatUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var encryptionKey: js.UndefOr[ArrayBuffer | ArrayBufferView | Int8Array] = js.undefined
    
    var fifoFilesFallbackPath: js.UndefOr[String] = js.undefined
    
    var inMemory: js.UndefOr[Boolean] = js.undefined
    
    var migration: js.UndefOr[MigrationCallback] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.undefined
    
    var schemaVersion: js.UndefOr[Double] = js.undefined
    
    var shouldCompactOnLaunch: js.UndefOr[js.Function2[/* totalBytes */ Double, /* usedBytes */ Double, Boolean]] = js.undefined
    
    var sync: js.UndefOr[SyncConfiguration] = js.undefined
  }
  object PartialConfiguration {
    
    inline def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    extension [Self <: PartialConfiguration](x: Self) {
      
      inline def setDeleteRealmIfMigrationNeeded(value: Boolean): Self = StObject.set(x, "deleteRealmIfMigrationNeeded", value.asInstanceOf[js.Any])
      
      inline def setDeleteRealmIfMigrationNeededUndefined: Self = StObject.set(x, "deleteRealmIfMigrationNeeded", js.undefined)
      
      inline def setDisableFormatUpgrade(value: Boolean): Self = StObject.set(x, "disableFormatUpgrade", value.asInstanceOf[js.Any])
      
      inline def setDisableFormatUpgradeUndefined: Self = StObject.set(x, "disableFormatUpgrade", js.undefined)
      
      inline def setEncryptionKey(value: ArrayBuffer | ArrayBufferView | Int8Array): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setFifoFilesFallbackPath(value: String): Self = StObject.set(x, "fifoFilesFallbackPath", value.asInstanceOf[js.Any])
      
      inline def setFifoFilesFallbackPathUndefined: Self = StObject.set(x, "fifoFilesFallbackPath", js.undefined)
      
      inline def setInMemory(value: Boolean): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
      
      inline def setInMemoryUndefined: Self = StObject.set(x, "inMemory", js.undefined)
      
      inline def setMigration(value: (/* oldRealm */ Realm, /* newRealm */ Realm) => Unit): Self = StObject.set(x, "migration", js.Any.fromFunction2(value))
      
      inline def setMigrationUndefined: Self = StObject.set(x, "migration", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSchema(value: js.Array[ObjectClass | ObjectSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemaVarargs(value: (ObjectClass | ObjectSchema)*): Self = StObject.set(x, "schema", js.Array(value :_*))
      
      inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
      
      inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
      
      inline def setShouldCompactOnLaunch(value: (/* totalBytes */ Double, /* usedBytes */ Double) => Boolean): Self = StObject.set(x, "shouldCompactOnLaunch", js.Any.fromFunction2(value))
      
      inline def setShouldCompactOnLaunchUndefined: Self = StObject.set(x, "shouldCompactOnLaunch", js.undefined)
      
      inline def setSync(value: SyncConfiguration): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realm.realmStrings.download
    - typings.realm.realmStrings.upload
  */
  trait ProgressDirection extends StObject
  object ProgressDirection {
    
    inline def download: typings.realm.realmStrings.download = "download".asInstanceOf[typings.realm.realmStrings.download]
    
    inline def upload: typings.realm.realmStrings.upload = "upload".asInstanceOf[typings.realm.realmStrings.upload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realm.realmStrings.reportIndefinitely
    - typings.realm.realmStrings.forCurrentlyOutstandingWork
  */
  trait ProgressMode extends StObject
  object ProgressMode {
    
    inline def forCurrentlyOutstandingWork: typings.realm.realmStrings.forCurrentlyOutstandingWork = "forCurrentlyOutstandingWork".asInstanceOf[typings.realm.realmStrings.forCurrentlyOutstandingWork]
    
    inline def reportIndefinitely: typings.realm.realmStrings.reportIndefinitely = "reportIndefinitely".asInstanceOf[typings.realm.realmStrings.reportIndefinitely]
  }
  
  type ProgressNotificationCallback = js.Function2[/* transferred */ Double, /* transferable */ Double, Unit]
  
  // properties types
  type PropertiesTypes = StringDictionary[PropertyType | ObjectSchemaProperty | ObjectSchema]
  
  /**
    * PropertyType
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~PropertyType }
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.realm.realmStrings.bool
    - typings.realm.realmStrings.int
    - typings.realm.realmStrings.float
    - typings.realm.realmStrings.double
    - typings.realm.realmStrings.decimal128
    - typings.realm.realmStrings.objectId
    - typings.realm.realmStrings.string
    - typings.realm.realmStrings.data
    - typings.realm.realmStrings.date
    - typings.realm.realmStrings.list
    - typings.realm.realmStrings.linkingObjects
  */
  type PropertyType = _PropertyType | String
  
  /**
    * A function which executes on the MongoDB Realm platform.
    */
  type RealmFunction[R, A /* <: js.Array[js.Any] */] = js.Function1[/* args */ A, js.Promise[R]]
  
  /**
    * Results
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Results.html }
    */
  @js.native
  trait Results[T]
    extends StObject
       with Collection[T] {
    
    /**
      * Bulk update objects in the collection.
      * @param  {string} property
      * @param  {any} value
      * @returns void
      */
    def update(property: String, value: js.Any): Unit = js.native
  }
  
  /**
    * The MongoDB Realm Services bound to an app.
    */
  @js.native
  trait Services extends StObject {
    
    /** Get the interface to the HTTP service */
    def http(): HTTP = js.native
    def http(serviceName: String): HTTP = js.native
    
    /** Get the interface to the remote MongoDB service */
    def mongodb(): MongoDB = js.native
    def mongodb(serviceName: String): MongoDB = js.native
  }
  object Services {
    
    /**
      * The Stitch HTTP Service is a generic interface that enables you to communicate with any service that is available over HTTP.
      *
      * @see https://docs.mongodb.com/stitch/services/http/
      */
    @js.native
    trait HTTP extends StObject {
      
      /**
        * Sends an HTTP DELETE request to the specified URL.
        *
        * @param url The URL to send the request to.
        * @param options Options related to the request.
        * @returns The response.
        */
      def delete(url: String): js.Promise[Response] = js.native
      def delete(url: String, options: RequestOptions): js.Promise[Response] = js.native
      
      /**
        * Sends an HTTP GET request to the specified URL.
        *
        * @param url The URL to send the request to.
        * @param options Options related to the request.
        * @returns The response.
        */
      def get(url: String): js.Promise[Response] = js.native
      def get(url: String, options: RequestOptions): js.Promise[Response] = js.native
      
      /**
        * Sends an HTTP HEAD request to the specified URL.
        *
        * @param url The URL to send the request to.
        * @param options Options related to the request.
        * @returns The response.
        */
      def head(url: String): js.Promise[Response] = js.native
      def head(url: String, options: RequestOptions): js.Promise[Response] = js.native
      
      /**
        * Sends an HTTP PATCH request to the specified URL.
        *
        * @param url The URL to send the request to.
        * @param options Options related to the request.
        * @returns The response.
        */
      def patch(url: String): js.Promise[Response] = js.native
      def patch(url: String, options: RequestOptions): js.Promise[Response] = js.native
      
      /**
        * Sends an HTTP POST request to the specified URL.
        *
        * @param url The URL to send the request to.
        * @param options Options related to the request.
        * @returns The response.
        */
      def post(url: String): js.Promise[Response] = js.native
      def post(url: String, options: RequestOptions): js.Promise[Response] = js.native
      
      /**
        * Sends an HTTP PUT request to the specified URL.
        *
        * @param url The URL to send the request to.
        * @param options Options related to the request.
        * @returns The response.
        */
      def put(url: String): js.Promise[Response] = js.native
      def put(url: String, options: RequestOptions): js.Promise[Response] = js.native
    }
    object HTTP {
      
      /**
        * Options to use when sending a request.
        */
      trait RequestOptions extends StObject {
        
        // TODO: Add a link to its documentation.
        /**
          * A url to request from the service to retrieve the authorization header.
          */
        var authUrl: js.UndefOr[String] = js.undefined
        
        /**
          * String encoded body sent in the request.
          */
        var body: js.UndefOr[String] = js.undefined
        
        /**
          * Cookies used when sending the request.
          */
        var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
        
        /**
          * Is the body a stringified JSON object? (application/json)
          */
        var encodeBodyAsJSON: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Should redirects be followed?
          */
        var followRedirects: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Is the body stringified form? (multipart/form-data)
          */
        var form: js.UndefOr[Boolean] = js.undefined
        
        // TODO: Determine if headers could map to a single string too
        /**
          * Headers used when sending the request.
          */
        var headers: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
      }
      object RequestOptions {
        
        inline def apply(): RequestOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[RequestOptions]
        }
        
        extension [Self <: RequestOptions](x: Self) {
          
          inline def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
          
          inline def setAuthUrlUndefined: Self = StObject.set(x, "authUrl", js.undefined)
          
          inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
          
          inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
          
          inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
          
          inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
          
          inline def setEncodeBodyAsJSON(value: Boolean): Self = StObject.set(x, "encodeBodyAsJSON", value.asInstanceOf[js.Any])
          
          inline def setEncodeBodyAsJSONUndefined: Self = StObject.set(x, "encodeBodyAsJSON", js.undefined)
          
          inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
          
          inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
          
          inline def setForm(value: Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
          
          inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
          
          inline def setHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        }
      }
      
      /**
        *
        */
      trait Response extends StObject {
        
        /**
          * A BSON binary representation of the body.
          */
        var body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ js.Any
        
        /**
          * The length of the content.
          */
        var contentLength: Double
        
        /**
          * The headers of the response.
          */
        var headers: StringDictionary[js.Array[String]]
        
        /**
          * A text representation of the status.
          */
        var status: String
        
        /**
          * The nummeric status code.
          */
        var statusCode: Double
      }
      object Response {
        
        inline def apply(
          body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ js.Any,
          contentLength: Double,
          headers: StringDictionary[js.Array[String]],
          status: String,
          statusCode: Double
        ): Response = {
          val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
          __obj.asInstanceOf[Response]
        }
        
        extension [Self <: Response](x: Self) {
          
          inline def setBody(
            value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ js.Any
          ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
          
          inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
          
          inline def setHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /**
      * The MongoDB service can be used to get database and collection objects for interacting with MongoDB data.
      */
    trait MongoDB extends StObject {
      
      /**
        * Get the interface to a remote MongoDB database.
        *
        * @param databaseName The name of the database.
        * @returns The remote MongoDB database.
        */
      def db(databaseName: String): MongoDBDatabase
    }
    object MongoDB {
      
      inline def apply(db: String => MongoDBDatabase): MongoDB = {
        val __obj = js.Dynamic.literal(db = js.Any.fromFunction1(db))
        __obj.asInstanceOf[MongoDB]
      }
      
      /**
        * A stage of an aggregation pipeline.
        */
      type AggregatePipelineStage = js.Object
      
      /**
        * A base change event containing the properties which apply across operation types.
        */
      trait BaseChangeEvent[T /* <: OperationType */] extends StObject {
        
        /** The id of the change event. */
        var _id: ChangeEventId
        
        /** The timestamp from the oplog entry associated with the event. */
        var clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any
        
        /**
          * The identifier for the session associated with the transaction.
          * Only present if the operation is part of a multi-document transaction.
          */
        var lsid: js.UndefOr[js.Object] = js.undefined
        
        /** The type of operation which was performed on the document. */
        var operationType: T
        
        /**
          * The transaction number.
          * Only present if the operation is part of a multi-document transaction.
          */
        var txnNumber: js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any
              ] = js.undefined
      }
      object BaseChangeEvent {
        
        inline def apply[T /* <: OperationType */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          operationType: T
        ): BaseChangeEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
          __obj.asInstanceOf[BaseChangeEvent[T]]
        }
        
        extension [Self <: BaseChangeEvent[?], T /* <: OperationType */](x: Self & BaseChangeEvent[T]) {
          
          inline def setClusterTime(
            value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any
          ): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
          
          inline def setLsid(value: js.Object): Self = StObject.set(x, "lsid", value.asInstanceOf[js.Any])
          
          inline def setLsidUndefined: Self = StObject.set(x, "lsid", js.undefined)
          
          inline def setOperationType(value: T): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
          
          inline def setTxnNumber(
            value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any
          ): Self = StObject.set(x, "txnNumber", value.asInstanceOf[js.Any])
          
          inline def setTxnNumberUndefined: Self = StObject.set(x, "txnNumber", js.undefined)
          
          inline def set_id(value: ChangeEventId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Represents a change event communicated via a MongoDB change stream.
        *
        * @see https://docs.mongodb.com/manual/reference/change-events/
        */
      /* Rewritten from type alias, can be one of: 
        - typings.realm.Realm.Services.MongoDB.InsertEvent[T]
        - typings.realm.Realm.Services.MongoDB.UpdateEvent[T]
        - typings.realm.Realm.Services.MongoDB.ReplaceEvent[T]
        - typings.realm.Realm.Services.MongoDB.DeleteEvent[T]
        - typings.realm.Realm.Services.MongoDB.DropEvent
        - typings.realm.Realm.Services.MongoDB.RenameEvent
        - typings.realm.Realm.Services.MongoDB.DropDatabaseEvent
        - typings.realm.Realm.Services.MongoDB.InvalidateEvent
      */
      type ChangeEvent[T /* <: Document[js.Any] */] = _ChangeEvent[T] | InvalidateEvent
      
      /**
        * Acts as the `resumeToken` for the `resumeAfter` parameter when resuming a change stream.
        */
      type ChangeEventId = js.Any
      
      /**
        * Options passed when counting documents
        */
      trait CountOptions extends StObject {
        
        /**
          * The maximum number of documents to count.
          */
        val limit: js.UndefOr[Double] = js.undefined
      }
      object CountOptions {
        
        inline def apply(): CountOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CountOptions]
        }
        
        extension [Self <: CountOptions](x: Self) {
          
          inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
          
          inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        }
      }
      
      /**
        * A document got deleted from the collection.
        */
      trait DeleteEvent[T /* <: Document[js.Any] */]
        extends StObject
           with BaseChangeEvent[delete]
           with _ChangeEvent[T] {
        
        /** A document that contains the _id of the deleted document. */
        var documentKey: DocumentKey[
                /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
              ]
        
        /** The namespace (database and collection) which the document got deleted from. */
        var ns: DocumentNamespace
      }
      object DeleteEvent {
        
        inline def apply[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          ns: DocumentNamespace
        ): DeleteEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "delete")
          __obj.asInstanceOf[DeleteEvent[T]]
        }
        
        extension [Self <: DeleteEvent[?], T /* <: Document[js.Any] */](x: Self & DeleteEvent[T]) {
          
          inline def setDocumentKey(
            value: DocumentKey[
                      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                    ]
          ): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
          
          inline def setNs(value: DocumentNamespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Result of deleting documents
        */
      trait DeleteResult extends StObject {
        
        /**
          * The number of documents that were deleted.
          */
        val deletedCount: Double
      }
      object DeleteResult {
        
        inline def apply(deletedCount: Double): DeleteResult = {
          val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any])
          __obj.asInstanceOf[DeleteResult]
        }
        
        extension [Self <: DeleteResult](x: Self) {
          
          inline def setDeletedCount(value: Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * A document from a MongoDB collection
        */
      trait Document[IdType] extends StObject {
        
        /**
          * The id of the document.
          */
        var _id: IdType
      }
      object Document {
        
        inline def apply[IdType](_id: IdType): Document[IdType] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
          __obj.asInstanceOf[Document[IdType]]
        }
        
        extension [Self <: Document[?], IdType](x: Self & Document[IdType]) {
          
          inline def set_id(value: IdType): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * A document that contains the _id of the document created or modified by the insert, replace, delete, update operations (i.e. CRUD operations). For sharded collections, also displays the full shard key for the document. The _id field is not repeated if it is already a part of the shard key.
        */
      type DocumentKey[IdType] = Id[IdType] & (Record[String, js.Any])
      
      /**
        * The namespace of a document.
        */
      trait DocumentNamespace extends StObject {
        
        // database: string;
        /** The name of the collection. */
        var coll: String
        
        /** The name of the database. */
        var db: String
      }
      object DocumentNamespace {
        
        inline def apply(coll: String, db: String): DocumentNamespace = {
          val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
          __obj.asInstanceOf[DocumentNamespace]
        }
        
        extension [Self <: DocumentNamespace](x: Self) {
          
          inline def setColl(value: String): Self = StObject.set(x, "coll", value.asInstanceOf[js.Any])
          
          inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Occurs when a database is dropped.
        */
      trait DropDatabaseEvent
        extends StObject
           with BaseChangeEvent[dropDatabase]
           with _ChangeEvent[js.Any] {
        
        /** The namespace (specifying only the database name) of the database that got dropped. */
        var ns: OmitDocumentNamespacecoll
      }
      object DropDatabaseEvent {
        
        inline def apply(
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          ns: OmitDocumentNamespacecoll
        ): DropDatabaseEvent = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "dropDatabase")
          __obj.asInstanceOf[DropDatabaseEvent]
        }
        
        extension [Self <: DropDatabaseEvent](x: Self) {
          
          inline def setNs(value: OmitDocumentNamespacecoll): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Occurs when a collection is dropped from a database.
        */
      trait DropEvent
        extends StObject
           with BaseChangeEvent[drop]
           with _ChangeEvent[js.Any] {
        
        /** The namespace (database and collection) of the collection that got dropped. */
        var ns: DocumentNamespace
      }
      object DropEvent {
        
        inline def apply(
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          ns: DocumentNamespace
        ): DropEvent = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "drop")
          __obj.asInstanceOf[DropEvent]
        }
        
        extension [Self <: DropEvent](x: Self) {
          
          inline def setNs(value: DocumentNamespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * A filter applied to limit the documents being queried for.
        */
      type Filter = js.Object
      
      /**
        * Options passed when finding and modifying a signle document
        */
      trait FindOneAndModifyOptions
        extends StObject
           with FindOneOptions {
        
        /**
          * Optional. Default: false.
          * A boolean that, if true, indicates that the action should return
          * the document in its updated form instead of its original, pre-update form.
          */
        val returnNewDocument: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional. Default: false.
          * A boolean that, if true, indicates that MongoDB should insert a new document that matches the
          * query filter when the query does not match any existing documents in the collection.
          */
        val upsert: js.UndefOr[Boolean] = js.undefined
      }
      object FindOneAndModifyOptions {
        
        inline def apply(): FindOneAndModifyOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FindOneAndModifyOptions]
        }
        
        extension [Self <: FindOneAndModifyOptions](x: Self) {
          
          inline def setReturnNewDocument(value: Boolean): Self = StObject.set(x, "returnNewDocument", value.asInstanceOf[js.Any])
          
          inline def setReturnNewDocumentUndefined: Self = StObject.set(x, "returnNewDocument", js.undefined)
          
          inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
          
          inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
        }
      }
      
      /**
        * Options passed when finding a signle document
        */
      trait FindOneOptions extends StObject {
        
        /**
          * Limits the fields to return for all matching documents.
          * See [Tutorial: Project Fields to Return from Query](https://docs.mongodb.com/manual/tutorial/project-fields-from-query-results/).
          */
        val projection: js.UndefOr[js.Object] = js.undefined
        
        /**
          * The order in which to return matching documents.
          */
        val sort: js.UndefOr[js.Object] = js.undefined
      }
      object FindOneOptions {
        
        inline def apply(): FindOneOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FindOneOptions]
        }
        
        extension [Self <: FindOneOptions](x: Self) {
          
          inline def setProjection(value: js.Object): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
          
          inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
          
          inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
          
          inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        }
      }
      
      /**
        * Options passed when finding a multiple documents
        */
      trait FindOptions
        extends StObject
           with FindOneOptions {
        
        /**
          * The maximum number of documents to return.
          */
        val limit: js.UndefOr[Double] = js.undefined
      }
      object FindOptions {
        
        inline def apply(): FindOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FindOptions]
        }
        
        extension [Self <: FindOptions](x: Self) {
          
          inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
          
          inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        }
      }
      
      /**
        * A document got inserted into the collection.
        */
      trait InsertEvent[T /* <: Document[js.Any] */]
        extends StObject
           with BaseChangeEvent[insert]
           with _ChangeEvent[T] {
        
        /** A document that contains the _id of the inserted document. */
        var documentKey: DocumentKey[
                /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
              ]
        
        /** The new document created by the operation */
        var fullDocument: T
        
        /** The namespace (database and collection) of the document got inserted into. */
        var ns: DocumentNamespace
      }
      object InsertEvent {
        
        inline def apply[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          fullDocument: T,
          ns: DocumentNamespace
        ): InsertEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "insert")
          __obj.asInstanceOf[InsertEvent[T]]
        }
        
        extension [Self <: InsertEvent[?], T /* <: Document[js.Any] */](x: Self & InsertEvent[T]) {
          
          inline def setDocumentKey(
            value: DocumentKey[
                      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                    ]
          ): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
          
          inline def setFullDocument(value: T): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
          
          inline def setNs(value: DocumentNamespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Result of inserting many documents
        */
      trait InsertManyResult[IdType] extends StObject {
        
        /**
          * The ids of the inserted documents
          */
        val insertedIds: js.Array[IdType]
      }
      object InsertManyResult {
        
        inline def apply[IdType](insertedIds: js.Array[IdType]): InsertManyResult[IdType] = {
          val __obj = js.Dynamic.literal(insertedIds = insertedIds.asInstanceOf[js.Any])
          __obj.asInstanceOf[InsertManyResult[IdType]]
        }
        
        extension [Self <: InsertManyResult[?], IdType](x: Self & InsertManyResult[IdType]) {
          
          inline def setInsertedIds(value: js.Array[IdType]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
          
          inline def setInsertedIdsVarargs(value: IdType*): Self = StObject.set(x, "insertedIds", js.Array(value :_*))
        }
      }
      
      /**
        * Result of inserting one document
        */
      trait InsertOneResult[IdType] extends StObject {
        
        /**
          * The id of the inserted document
          */
        val insertedId: IdType
      }
      object InsertOneResult {
        
        inline def apply[IdType](insertedId: IdType): InsertOneResult[IdType] = {
          val __obj = js.Dynamic.literal(insertedId = insertedId.asInstanceOf[js.Any])
          __obj.asInstanceOf[InsertOneResult[IdType]]
        }
        
        extension [Self <: InsertOneResult[?], IdType](x: Self & InsertOneResult[IdType]) {
          
          inline def setInsertedId(value: IdType): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Invalidate events close the change stream cursor.
        */
      type InvalidateEvent = BaseChangeEvent[invalidate]
      
      /**
        * A remote collection of documents in a MongoDB database.
        */
      @js.native
      trait MongoDBCollection[T /* <: Document[js.Any] */] extends StObject {
        
        // TODO: Verify pipeline and return type
        /**
          * Runs an aggregation framework pipeline against this collection.
          *
          * @param pipeline An array of aggregation pipeline stages.
          * @returns The result.
          */
        def aggregate(pipeline: js.Array[AggregatePipelineStage]): js.Promise[js.Any] = js.native
        
        /**
          * Counts the number of documents in this collection matching the provided filter.
          */
        def count(): js.Promise[Double] = js.native
        def count(filter: Unit, options: CountOptions): js.Promise[Double] = js.native
        def count(filter: Filter): js.Promise[Double] = js.native
        def count(filter: Filter, options: CountOptions): js.Promise[Double] = js.native
        
        /**
          * Deletes multiple documents.
          *
          * @param filter A filter applied to narrow down the result.
          * @returns The result.
          */
        def deleteMany(filter: Filter): js.Promise[DeleteResult] = js.native
        
        /**
          * Deletes a single matching document from the collection.
          *
          * @param filter A filter applied to narrow down the result.
          * @returns The result.
          */
        def deleteOne(filter: Filter): js.Promise[DeleteResult] = js.native
        
        /**
          * Finds the documents which match the provided query.
          *
          * @param filter An optional filter applied to narrow down the results.
          * @param options Additional options to apply.
          * @returns The documents.
          */
        def find(): js.Promise[js.Array[T]] = js.native
        def find(filter: Unit, options: FindOptions): js.Promise[js.Array[T]] = js.native
        def find(filter: Filter): js.Promise[js.Array[T]] = js.native
        def find(filter: Filter, options: FindOptions): js.Promise[js.Array[T]] = js.native
        
        /**
          * Finds a document which matches the provided filter.
          *
          * @param filter A filter applied to narrow down the result.
          * @param options Additional options to apply.
          * @returns The document.
          */
        def findOne(): js.Promise[T | Null] = js.native
        def findOne(filter: Unit, options: FindOneOptions): js.Promise[T | Null] = js.native
        def findOne(filter: Filter): js.Promise[T | Null] = js.native
        def findOne(filter: Filter, options: FindOneOptions): js.Promise[T | Null] = js.native
        
        /**
          * Finds a document which matches the provided filter and deletes it
          *
          * @param filter A filter applied to narrow down the result.
          * @param options Additional options to apply.
          * @returns The document found before deleting it.
          */
        def findOneAndDelete(filter: Filter): js.Promise[T | Null] = js.native
        def findOneAndDelete(filter: Filter, options: FindOneOptions): js.Promise[T | Null] = js.native
        
        /**
          * Finds a document which matches the provided filter and replaces it with a new document.
          *
          * @param filter A filter applied to narrow down the result.
          * @param replacement The new replacing document.
          * @param options Additional options to apply.
          * @returns The document found before replacing it.
          */
        def findOneAndReplace(filter: Filter, replacement: NewDocument[T]): js.Promise[T | Null] = js.native
        def findOneAndReplace(filter: Filter, replacement: NewDocument[T], options: FindOneAndModifyOptions): js.Promise[T | Null] = js.native
        
        /**
          * Finds a document which matches the provided query and performs the desired update to individual fields.
          *
          * @param filter A filter applied to narrow down the result.
          * @param update The new values for the document.
          * @param options Additional options to apply.
          * @returns The document found before updating it.
          */
        def findOneAndUpdate(filter: Filter, update: Update): js.Promise[T | Null] = js.native
        def findOneAndUpdate(filter: Filter, update: Update, options: FindOneAndModifyOptions): js.Promise[T | Null] = js.native
        
        /**
          * Inserts an array of documents into the collection.
          * If any values are missing identifiers, they will be generated by the server.
          *
          * @param document The array of documents.
          * @returns The result.
          */
        def insertMany(documents: js.Array[NewDocument[T]]): js.Promise[
                InsertManyResult[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ]
              ] = js.native
        
        /**
          * Inserts a single document into the collection.
          * Note: If the document is missing an _id, one will be generated for it by the server.
          *
          * @param document The document.
          * @returns The result.
          */
        def insertOne(document: NewDocument[T]): js.Promise[
                InsertOneResult[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ]
              ] = js.native
        
        /**
          * Updates multiple documents matching the provided filter in this collection.
          *
          * @param filter A filter applied to narrow down the result.
          * @param update The new values for the documents.
          * @param options Additional options to apply.
          * @returns The result.
          */
        def updateMany(filter: Filter, update: Update): js.Promise[
                UpdateResult[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ]
              ] = js.native
        def updateMany(filter: Filter, update: Update, options: UpdateOptions): js.Promise[
                UpdateResult[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ]
              ] = js.native
        
        /**
          * Updates a single document matching the provided filter in this collection.
          *
          * @param filter A filter applied to narrow down the result.
          * @param update The new values for the document.
          * @param options Additional options to apply.
          * @returns The result.
          */
        def updateOne(filter: Filter, update: Update): js.Promise[
                UpdateResult[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ]
              ] = js.native
        def updateOne(filter: Filter, update: Update, options: UpdateOptions): js.Promise[
                UpdateResult[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ]
              ] = js.native
        
        /**
          * Creates an asynchronous change stream to monitor this collection for changes.
          *
          * By default, yields all change events for this collection. You may specify at most one of
          * the `filter` or `ids` options.
          *
          * @param options.filter A filter for which change events you are interested in.
          * @param options.ids A list of ids that you are interested in watching.
          *
          * @see https://docs.mongodb.com/manual/reference/change-events/
          */
        def watch(): AsyncGenerator[ChangeEvent[T], js.Any, js.Any] = js.native
        def watch(options: js.Object): AsyncGenerator[ChangeEvent[T], js.Any, js.Any] = js.native
        /**
          * Creates an asynchronous change stream to monitor this collection for changes.
          *
          * By default, yields all change events for this collection.
          * You may specify at most one of the `filter` or `ids` options.
          *
          * @param options.filter A filter for which change events you are interested in.
          * @param options.ids A list of ids that you are interested in watching.
          *
          * @see https://docs.mongodb.com/manual/reference/change-events/
          */
        def watch(options: typings.realm.anon.Filter): AsyncGenerator[ChangeEvent[T], js.Any, js.Any] = js.native
        /**
          * Creates an asynchronous change stream to monitor this collection for changes.
          *
          * By default, yields all change events for this collection. You may specify at most one of
          * the `filter` or `ids` options.
          *
          * @param options.filter A filter for which change events you are interested in.
          * @param options.ids A list of ids that you are interested in watching.
          *
          * @see https://docs.mongodb.com/manual/reference/change-events/
          */
        def watch(options: Ids[T]): AsyncGenerator[ChangeEvent[T], js.Any, js.Any] = js.native
      }
      
      extension [Self <: MongoDB](x: Self) {
        
        inline def setDb(value: String => MongoDBDatabase): Self = StObject.set(x, "db", js.Any.fromFunction1(value))
      }
      
      /**
        * A new document with an optional _id defined.
        */
      type NewDocument[T /* <: Document[js.Any] */] = (Omit[T, _id]) & (Partial[Pick[T, _id]])
      
      /**
        * An operation performed on a document.
        */
      /* Rewritten from type alias, can be one of: 
        - typings.realm.realmStrings.insert
        - typings.realm.realmStrings.delete
        - typings.realm.realmStrings.replace
        - typings.realm.realmStrings.update
        - typings.realm.realmStrings.drop
        - typings.realm.realmStrings.rename
        - typings.realm.realmStrings.dropDatabase
        - typings.realm.realmStrings.invalidate
      */
      trait OperationType extends StObject
      object OperationType {
        
        inline def delete: typings.realm.realmStrings.delete = "delete".asInstanceOf[typings.realm.realmStrings.delete]
        
        inline def drop: typings.realm.realmStrings.drop = "drop".asInstanceOf[typings.realm.realmStrings.drop]
        
        inline def dropDatabase: typings.realm.realmStrings.dropDatabase = "dropDatabase".asInstanceOf[typings.realm.realmStrings.dropDatabase]
        
        inline def insert: typings.realm.realmStrings.insert = "insert".asInstanceOf[typings.realm.realmStrings.insert]
        
        inline def invalidate: typings.realm.realmStrings.invalidate = "invalidate".asInstanceOf[typings.realm.realmStrings.invalidate]
        
        inline def rename: typings.realm.realmStrings.rename = "rename".asInstanceOf[typings.realm.realmStrings.rename]
        
        inline def replace: typings.realm.realmStrings.replace = "replace".asInstanceOf[typings.realm.realmStrings.replace]
        
        inline def update: typings.realm.realmStrings.update = "update".asInstanceOf[typings.realm.realmStrings.update]
      }
      
      /**
        * Occurs when a collection is renamed.
        */
      trait RenameEvent
        extends StObject
           with BaseChangeEvent[rename]
           with _ChangeEvent[js.Any] {
        
        /** The original namespace (database and collection) that got renamed. */
        var ns: DocumentNamespace
        
        /** The namespace (database and collection) going forward. */
        var to: DocumentNamespace
      }
      object RenameEvent {
        
        inline def apply(
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          ns: DocumentNamespace,
          to: DocumentNamespace
        ): RenameEvent = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "rename", to = to.asInstanceOf[js.Any])
          __obj.asInstanceOf[RenameEvent]
        }
        
        extension [Self <: RenameEvent](x: Self) {
          
          inline def setNs(value: DocumentNamespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
          
          inline def setTo(value: DocumentNamespace): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * A document got replaced in the collection.
        */
      trait ReplaceEvent[T /* <: Document[js.Any] */]
        extends StObject
           with BaseChangeEvent[replace]
           with _ChangeEvent[T] {
        
        /** A document that contains the _id of the replaced document. */
        var documentKey: DocumentKey[
                /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
              ]
        
        /** The document after the insert of the replacement document. */
        var fullDocument: T
        
        /** The namespace (database and collection) of the document got replaced within. */
        var ns: DocumentNamespace
      }
      object ReplaceEvent {
        
        inline def apply[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          fullDocument: T,
          ns: DocumentNamespace
        ): ReplaceEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "replace")
          __obj.asInstanceOf[ReplaceEvent[T]]
        }
        
        extension [Self <: ReplaceEvent[?], T /* <: Document[js.Any] */](x: Self & ReplaceEvent[T]) {
          
          inline def setDocumentKey(
            value: DocumentKey[
                      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                    ]
          ): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
          
          inline def setFullDocument(value: T): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
          
          inline def setNs(value: DocumentNamespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * An object specifying the update operations to perform when updating a document.
        */
      type Update = js.Object
      
      /**
        * A detailed description of an update performed on a document.
        */
      trait UpdateDescription extends StObject {
        
        /** Names of fields that got removed. */
        var removedFields: js.Array[String]
        
        /** Names of fields that got updated. */
        var updatedFields: Record[String, js.Any]
      }
      object UpdateDescription {
        
        inline def apply(removedFields: js.Array[String], updatedFields: Record[String, js.Any]): UpdateDescription = {
          val __obj = js.Dynamic.literal(removedFields = removedFields.asInstanceOf[js.Any], updatedFields = updatedFields.asInstanceOf[js.Any])
          __obj.asInstanceOf[UpdateDescription]
        }
        
        extension [Self <: UpdateDescription](x: Self) {
          
          inline def setRemovedFields(value: js.Array[String]): Self = StObject.set(x, "removedFields", value.asInstanceOf[js.Any])
          
          inline def setRemovedFieldsVarargs(value: String*): Self = StObject.set(x, "removedFields", js.Array(value :_*))
          
          inline def setUpdatedFields(value: Record[String, js.Any]): Self = StObject.set(x, "updatedFields", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * A document got updated in the collection.
        */
      trait UpdateEvent[T /* <: Document[js.Any] */]
        extends StObject
           with BaseChangeEvent[update]
           with _ChangeEvent[T] {
        
        /** A document that contains the _id of the updated document. */
        var documentKey: DocumentKey[
                /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
              ]
        
        /**
          * For change streams opened with the `fullDocument: updateLookup` option, this will represents the most current majority-committed version of the document modified by the update operation.
          */
        var fullDocument: js.UndefOr[T] = js.undefined
        
        /** The namespace (database and collection) of the updated document. */
        var ns: DocumentNamespace
        
        /** A document describing the fields that were updated or removed. */
        var updateDescription: UpdateDescription
      }
      object UpdateEvent {
        
        inline def apply[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          ns: DocumentNamespace,
          updateDescription: UpdateDescription
        ): UpdateEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "update", updateDescription = updateDescription.asInstanceOf[js.Any])
          __obj.asInstanceOf[UpdateEvent[T]]
        }
        
        extension [Self <: UpdateEvent[?], T /* <: Document[js.Any] */](x: Self & UpdateEvent[T]) {
          
          inline def setDocumentKey(
            value: DocumentKey[
                      /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                    ]
          ): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
          
          inline def setFullDocument(value: T): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
          
          inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
          
          inline def setNs(value: DocumentNamespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
          
          inline def setUpdateDescription(value: UpdateDescription): Self = StObject.set(x, "updateDescription", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * Options passed when updating documents
        */
      trait UpdateOptions extends StObject {
        
        /**
          * When true, creates a new document if no document matches the query.
          */
        val upsert: js.UndefOr[Boolean] = js.undefined
      }
      object UpdateOptions {
        
        inline def apply(): UpdateOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UpdateOptions]
        }
        
        extension [Self <: UpdateOptions](x: Self) {
          
          inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
          
          inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
        }
      }
      
      /**
        * Result of updating documents
        */
      trait UpdateResult[IdType] extends StObject {
        
        /**
          * The number of documents that matched the filter.
          */
        val matchedCount: Double
        
        /**
          * The number of documents matched by the query.
          */
        val modifiedCount: Double
        
        /**
          * The identifier of the inserted document if an upsert took place.
          *
          * See [[RemoteUpdateOptions.upsert]].
          */
        val upsertedId: js.UndefOr[IdType] = js.undefined
      }
      object UpdateResult {
        
        inline def apply[IdType](matchedCount: Double, modifiedCount: Double): UpdateResult[IdType] = {
          val __obj = js.Dynamic.literal(matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any])
          __obj.asInstanceOf[UpdateResult[IdType]]
        }
        
        extension [Self <: UpdateResult[?], IdType](x: Self & UpdateResult[IdType]) {
          
          inline def setMatchedCount(value: Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
          
          inline def setModifiedCount(value: Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
          
          inline def setUpsertedId(value: IdType): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
          
          inline def setUpsertedIdUndefined: Self = StObject.set(x, "upsertedId", js.undefined)
        }
      }
      
      trait _ChangeEvent[T /* <: Document[js.Any] */] extends StObject
      object _ChangeEvent {
        
        inline def DeleteEvent[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          ns: DocumentNamespace
        ): typings.realm.Realm.Services.MongoDB.DeleteEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "delete")
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.DeleteEvent[T]]
        }
        
        inline def DropDatabaseEvent(
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          ns: OmitDocumentNamespacecoll
        ): typings.realm.Realm.Services.MongoDB.DropDatabaseEvent = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "dropDatabase")
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.DropDatabaseEvent]
        }
        
        inline def DropEvent(
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          ns: DocumentNamespace
        ): typings.realm.Realm.Services.MongoDB.DropEvent = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "drop")
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.DropEvent]
        }
        
        inline def InsertEvent[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          fullDocument: T,
          ns: DocumentNamespace
        ): typings.realm.Realm.Services.MongoDB.InsertEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "insert")
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.InsertEvent[T]]
        }
        
        inline def RenameEvent(
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          ns: DocumentNamespace,
          to: DocumentNamespace
        ): typings.realm.Realm.Services.MongoDB.RenameEvent = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "rename", to = to.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.RenameEvent]
        }
        
        inline def ReplaceEvent[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          fullDocument: T,
          ns: DocumentNamespace
        ): typings.realm.Realm.Services.MongoDB.ReplaceEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "replace")
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.ReplaceEvent[T]]
        }
        
        inline def UpdateEvent[T /* <: Document[js.Any] */](
          _id: ChangeEventId,
          clusterTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp */ js.Any,
          documentKey: DocumentKey[
                  /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
                ],
          ns: DocumentNamespace,
          updateDescription: UpdateDescription
        ): typings.realm.Realm.Services.MongoDB.UpdateEvent[T] = {
          val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "update", updateDescription = updateDescription.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.realm.Realm.Services.MongoDB.UpdateEvent[T]]
        }
      }
    }
    
    /**
      * The MongoDB service can be used to get database and collection objects for interacting with MongoDB data.
      */
    trait MongoDBDatabase extends StObject {
      
      /**
        * Get the interface to a remote MongoDB collection.
        *
        * @param name The name of the collection.
        * @returns The remote MongoDB collection.
        */
      def collection[T /* <: Document[js.Any] */](name: String): MongoDBCollection[T]
    }
    object MongoDBDatabase {
      
      inline def apply(collection: String => MongoDBCollection[js.Any]): MongoDBDatabase = {
        val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
        __obj.asInstanceOf[MongoDBDatabase]
      }
      
      extension [Self <: MongoDBDatabase](x: Self) {
        
        inline def setCollection(value: String => MongoDBCollection[js.Any]): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Use the Push service to enable sending push messages to this user via Firebase Cloud Messaging (FCM).
      */
    trait Push extends StObject {
      
      /**
        * Deregister this device with the user, to disable sending messages to this device.
        */
      def deregister(): js.Promise[Unit]
      
      /**
        * Register this device with the user.
        *
        * @param token A Firebase Cloud Messaging (FCM) token, retrieved via the firebase SDK.
        */
      def register(token: String): js.Promise[Unit]
    }
    object Push {
      
      inline def apply(deregister: () => js.Promise[Unit], register: String => js.Promise[Unit]): Push = {
        val __obj = js.Dynamic.literal(deregister = js.Any.fromFunction0(deregister), register = js.Any.fromFunction1(register))
        __obj.asInstanceOf[Push]
      }
      
      extension [Self <: Push](x: Self) {
        
        inline def setDeregister(value: () => js.Promise[Unit]): Self = StObject.set(x, "deregister", js.Any.fromFunction0(value))
        
        inline def setRegister(value: String => js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realm.realmStrings.`after-upload`
    - typings.realm.realmStrings.immediately
    - typings.realm.realmStrings.never
  */
  trait SessionStopPolicy extends StObject
  object SessionStopPolicy {
    
    inline def AfterUpload: `after-upload` = "after-upload".asInstanceOf[`after-upload`]
    
    inline def Immediately: immediately = "immediately".asInstanceOf[immediately]
    
    inline def Never: never = "never".asInstanceOf[never]
  }
  
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[String] | (js.Tuple2[String, Boolean])
  
  trait SyncConfiguration extends StObject {
    
    var _sessionStopPolicy: js.UndefOr[SessionStopPolicy] = js.undefined
    
    var customHttpHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var error: js.UndefOr[ErrorCallback] = js.undefined
    
    var existingRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.undefined
    
    var newRealmFileBehavior: js.UndefOr[OpenRealmBehaviorConfiguration] = js.undefined
    
    var partitionValue: String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any) | Null
    
    var user: User[DefaultFunctionsFactory, js.Any]
  }
  object SyncConfiguration {
    
    inline def apply(user: User[DefaultFunctionsFactory, js.Any]): SyncConfiguration = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any], partitionValue = null)
      __obj.asInstanceOf[SyncConfiguration]
    }
    
    extension [Self <: SyncConfiguration](x: Self) {
      
      inline def setCustomHttpHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHttpHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHttpHeadersUndefined: Self = StObject.set(x, "customHttpHeaders", js.undefined)
      
      inline def setError(value: (/* session */ Session, /* error */ SyncError) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExistingRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = StObject.set(x, "existingRealmFileBehavior", value.asInstanceOf[js.Any])
      
      inline def setExistingRealmFileBehaviorUndefined: Self = StObject.set(x, "existingRealmFileBehavior", js.undefined)
      
      inline def setNewRealmFileBehavior(value: OpenRealmBehaviorConfiguration): Self = StObject.set(x, "newRealmFileBehavior", value.asInstanceOf[js.Any])
      
      inline def setNewRealmFileBehaviorUndefined: Self = StObject.set(x, "newRealmFileBehavior", js.undefined)
      
      inline def setPartitionValue(
        value: String | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any)
      ): Self = StObject.set(x, "partitionValue", value.asInstanceOf[js.Any])
      
      inline def setPartitionValueNull: Self = StObject.set(x, "partitionValue", null)
      
      inline def setUser(value: User[DefaultFunctionsFactory, js.Any]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def set_sessionStopPolicy(value: SessionStopPolicy): Self = StObject.set(x, "_sessionStopPolicy", value.asInstanceOf[js.Any])
      
      inline def set_sessionStopPolicyUndefined: Self = StObject.set(x, "_sessionStopPolicy", js.undefined)
    }
  }
  
  trait SyncError extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var code: Double
    
    var isFatal: Boolean
    
    var message: String
    
    var name: String
  }
  object SyncError {
    
    inline def apply(code: Double, isFatal: Boolean, message: String, name: String): SyncError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], isFatal = isFatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncError]
    }
    
    extension [Self <: SyncError](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setIsFatal(value: Boolean): Self = StObject.set(x, "isFatal", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Representation of an authenticated user of an app.
    */
  trait User[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] extends StObject {
    
    /**
      * The access token used when requesting a new access token.
      */
    val accessToken: String | Null
    
    /**
      * Perform operations related to the API-key auth provider.
      */
    val apiKeys: ApiKeyAuth
    
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
    def callFunction(name: String, args: js.Any*): js.Promise[js.Any]
    
    /**
      * You can store arbitrary data about your application users in a MongoDB collection and configure MongoDB Realm to automatically expose each user’s data in a field of their user object.
      * For example, you might store a user’s preferred language, date of birth, or their local timezone.
      *
      * If this value has not been configured, it will be empty.
      */
    val customData: CustomDataType
    
    /**
      * The id of the device.
      */
    val deviceId: String | Null
    
    /**
      * Use this to call functions defined by the MongoDB Realm app, as this user.
      */
    val functions: FunctionsFactoryType & BaseFunctionsFactory
    
    /**
      * The automatically-generated internal ID of the user.
      */
    val id: String
    
    /**
      * The identities of the user at any of the app's authentication providers.
      */
    val identities: js.Array[UserIdentity]
    
    /**
      * The logged in state of the user.
      */
    val isLoggedIn: Boolean
    
    /**
      * Link the user with an identity represented by another set of credentials.
      *
      * @param credentials The credentials to use when linking.
      */
    def linkCredentials(credentials: Credentials[js.Object]): js.Promise[Unit]
    
    /**
      * Log out the user.
      *
      * @returns A promise that resolves once the user has been logged out of the app.
      */
    def logOut(): js.Promise[Unit]
    
    /**
      * Returns a connection to the MongoDB service.
      *
      * @example
      * let blueWidgets = user.mongoClient('myClusterName')
      *                       .db('myDb')
      *                       .collection('widgets')
      *                       .find({color: 'blue'});
      */
    def mongoClient(serviceName: String): MongoDB
    
    /**
      * A profile containing additional information about the user.
      */
    val profile: UserProfile
    
    /**
      * The provider type for the user.
      */
    val providerType: String
    
    /**
      * Use the Push service to enable sending push messages to this user via Firebase Cloud Messaging (FCM).
      *
      * @returns An service client with methods to register and deregister the device on the user.
      */
    def push(serviceName: String): Push
    
    /**
      * Refresh the access token and derive custom data from it.
      *
      * @returns The newly fetched custom data.
      */
    def refreshCustomData(): js.Promise[CustomDataType]
    
    /**
      * The refresh token used when requesting a new access token.
      */
    val refreshToken: String | Null
    
    /**
      * The state of the user.
      */
    val state: UserState
  }
  object User {
    
    inline def apply[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */](
      apiKeys: ApiKeyAuth,
      callFunction: (String, /* repeated */ js.Any) => js.Promise[js.Any],
      customData: CustomDataType,
      functions: FunctionsFactoryType & BaseFunctionsFactory,
      id: String,
      identities: js.Array[UserIdentity],
      isLoggedIn: Boolean,
      linkCredentials: Credentials[js.Object] => js.Promise[Unit],
      logOut: () => js.Promise[Unit],
      mongoClient: String => MongoDB,
      profile: UserProfile,
      providerType: String,
      push: String => Push,
      refreshCustomData: () => js.Promise[CustomDataType],
      state: UserState
    ): User[FunctionsFactoryType, CustomDataType] = {
      val __obj = js.Dynamic.literal(apiKeys = apiKeys.asInstanceOf[js.Any], callFunction = js.Any.fromFunction2(callFunction), customData = customData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], linkCredentials = js.Any.fromFunction1(linkCredentials), logOut = js.Any.fromFunction0(logOut), mongoClient = js.Any.fromFunction1(mongoClient), profile = profile.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), refreshCustomData = js.Any.fromFunction0(refreshCustomData), state = state.asInstanceOf[js.Any], accessToken = null, deviceId = null, refreshToken = null)
      __obj.asInstanceOf[User[FunctionsFactoryType, CustomDataType]]
    }
    
    extension [Self <: User[?, ?], FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */](x: Self & (User[FunctionsFactoryType, CustomDataType])) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
      
      inline def setApiKeys(value: ApiKeyAuth): Self = StObject.set(x, "apiKeys", value.asInstanceOf[js.Any])
      
      inline def setCallFunction(value: (String, /* repeated */ js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "callFunction", js.Any.fromFunction2(value))
      
      inline def setCustomData(value: CustomDataType): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
      
      inline def setFunctions(value: FunctionsFactoryType & BaseFunctionsFactory): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdentities(value: js.Array[UserIdentity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: UserIdentity*): Self = StObject.set(x, "identities", js.Array(value :_*))
      
      inline def setIsLoggedIn(value: Boolean): Self = StObject.set(x, "isLoggedIn", value.asInstanceOf[js.Any])
      
      inline def setLinkCredentials(value: Credentials[js.Object] => js.Promise[Unit]): Self = StObject.set(x, "linkCredentials", js.Any.fromFunction1(value))
      
      inline def setLogOut(value: () => js.Promise[Unit]): Self = StObject.set(x, "logOut", js.Any.fromFunction0(value))
      
      inline def setMongoClient(value: String => MongoDB): Self = StObject.set(x, "mongoClient", js.Any.fromFunction1(value))
      
      inline def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProviderType(value: String): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
      
      inline def setPush(value: String => Push): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setRefreshCustomData(value: () => js.Promise[CustomDataType]): Self = StObject.set(x, "refreshCustomData", js.Any.fromFunction0(value))
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
      
      inline def setState(value: UserState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO: Implement storing these identities on the user
  /**
    * A user's identity with a particular authentication provider.
    */
  trait UserIdentity extends StObject {
    
    /**
      * The type of the provider associated with the identity.
      */
    var providerType: String
    
    /**
      * The id of the user.
      */
    var userId: String
  }
  object UserIdentity {
    
    inline def apply(providerType: String, userId: String): UserIdentity = {
      val __obj = js.Dynamic.literal(providerType = providerType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdentity]
    }
    
    extension [Self <: UserIdentity](x: Self) {
      
      inline def setProviderType(value: String): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  type UserMap = StringDictionary[User[DefaultFunctionsFactory, js.Any]]
  
  /**
    * An extended profile with detailed information about the user.
    */
  trait UserProfile extends StObject {
    
    // TODO: Determine if this is free-text or actually an enum type.
    /**
      * The users birthday.
      */
    var birthday: js.UndefOr[String] = js.undefined
    
    /**
      * The users email address.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The users first name.
      */
    var firstName: js.UndefOr[String] = js.undefined
    
    /**
      * The users gender.
      */
    var gender: js.UndefOr[String] = js.undefined
    
    /**
      * The users last name.
      */
    var lastName: js.UndefOr[String] = js.undefined
    
    /**
      * The maximal age of the user.
      */
    var maxAge: js.UndefOr[String] = js.undefined
    
    // TODO: Determine the format.
    /**
      * The minimal age of the user.
      */
    var minAge: js.UndefOr[String] = js.undefined
    
    /**
      * The commonly displayed name of the user.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A URL referencing a picture associated with the user.
      */
    var pictureUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The type of user
      * // TODO: Determine the meaning of the different possibilities.
      */
    var `type`: UserType
  }
  object UserProfile {
    
    inline def apply(`type`: UserType): UserProfile = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProfile]
    }
    
    extension [Self <: UserProfile](x: Self) {
      
      inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMinAge(value: String): Self = StObject.set(x, "minAge", value.asInstanceOf[js.Any])
      
      inline def setMinAgeUndefined: Self = StObject.set(x, "minAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPictureUrl(value: String): Self = StObject.set(x, "pictureUrl", value.asInstanceOf[js.Any])
      
      inline def setPictureUrlUndefined: Self = StObject.set(x, "pictureUrl", js.undefined)
      
      inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PropertyType extends StObject
}
