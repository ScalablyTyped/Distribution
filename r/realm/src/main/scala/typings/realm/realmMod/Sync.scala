package typings.realm.realmMod

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Anon_Provider
import typings.realm.Realm.Sync.ChangeEvent
import typings.realm.Realm.Sync.LocalRealm
import typings.realm.Realm.Sync.LogLevel
import typings.realm.Realm.Sync.NumericLogLevel
import typings.realm.Realm.Sync.OpenRealmBehaviorConfiguration
import typings.realm.Realm.Sync.RealmListenerConfiguration
import typings.realm.Realm.Sync.RealmListenerEventName
import typings.realm.Realm.Sync.RealmWatchPredicate
import typings.realm.Realm.Sync.SSLConfiguration
import typings.realm.Realm.Sync.SerializedTokenUser
import typings.realm.Realm.Sync.SerializedUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.html }
  */
@JSImport("realm", "Sync")
@js.native
object Sync extends js.Object {
  @js.native
  class Adapter protected ()
    extends typings.realm.Realm.Sync.Adapter {
    def this(
      local_path: String,
      server_url: String,
      admin_user: typings.realm.Realm.Sync.User,
      filter: String,
      change_callback: js.Function
    ) = this()
    def this(
      local_path: String,
      server_url: String,
      admin_user: typings.realm.Realm.Sync.User,
      filter: RealmWatchPredicate,
      change_callback: js.Function
    ) = this()
    def this(
      local_path: String,
      server_url: String,
      admin_user: typings.realm.Realm.Sync.User,
      filter: String,
      change_callback: js.Function,
      ssl: SSLConfiguration
    ) = this()
    def this(
      local_path: String,
      server_url: String,
      admin_user: typings.realm.Realm.Sync.User,
      filter: RealmWatchPredicate,
      change_callback: js.Function,
      ssl: SSLConfiguration
    ) = this()
  }
  
  @js.native
  class AdminCredentials ()
    extends typings.realm.Realm.Sync.AdminCredentials
  
  /**
    * AuthError
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.AuthError.html }
    */
  @js.native
  class AuthError ()
    extends typings.realm.Realm.Sync.AuthError
  
  @js.native
  class Credentials ()
    extends typings.realm.Realm.Sync.Credentials
  
  @js.native
  class Permission ()
    extends typings.realm.Realm.Sync.Permission
  
  @js.native
  class PermissionChange ()
    extends typings.realm.Realm.Sync.PermissionChange
  
  @js.native
  class PermissionOffer ()
    extends typings.realm.Realm.Sync.PermissionOffer
  
  /**
    * Session
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Session.html }
    */
  @js.native
  class Session ()
    extends typings.realm.Realm.Sync.Session
  
  /**
    * Subscription
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Subscription.html }
    */
  @js.native
  class Subscription ()
    extends typings.realm.Realm.Sync.Subscription
  
  /**
    * User
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
    */
  @js.native
  class User ()
    extends typings.realm.Realm.Sync.User
  
  var downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
  var openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
  def _hasExistingSessions(): Boolean = js.native
  def addListener(
    config: RealmListenerConfiguration,
    eventName: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): js.Promise[Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def addListener(
    serverURL: String,
    adminUser: typings.realm.Realm.Sync.User,
    regex: String,
    name: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): js.Promise[Unit] = js.native
  def initiateClientReset(path: String): Unit = js.native
  def localListenerRealms(regex: String): js.Array[LocalRealm] = js.native
  def reconnect(): Unit = js.native
  def removeAllListeners(): js.Promise[Unit] = js.native
  def removeListener(regex: String, name: String, changeCallback: js.Function1[/* changeEvent */ ChangeEvent, Unit]): js.Promise[Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def setFeatureToken(token: String): Unit = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
  def setLogger(callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]): Unit = js.native
  def setUserAgent(userAgent: String): Unit = js.native
  @js.native
  object ConnectionState extends js.Object {
    /* "connected" */ val Connected: typings.realm.Realm.Sync.ConnectionState.Connected with String = js.native
    /* "connecting" */ val Connecting: typings.realm.Realm.Sync.ConnectionState.Connecting with String = js.native
    /* "disconnected" */ val Disconnected: typings.realm.Realm.Sync.ConnectionState.Disconnected with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.realm.Realm.Sync.ConnectionState with String] = js.native
  }
  
  /* static members */
  @js.native
  object Credentials extends js.Object {
    def adminToken(token: String): typings.realm.Realm.Sync.AdminCredentials = js.native
    def anonymous(): typings.realm.Realm.Sync.Credentials = js.native
    def azureAD(token: String): typings.realm.Realm.Sync.Credentials = js.native
    def custom(providerName: String, token: String): typings.realm.Realm.Sync.Credentials = js.native
    def custom(providerName: String, token: String, userInfo: StringDictionary[js.Any]): typings.realm.Realm.Sync.Credentials = js.native
    def facebook(token: String): typings.realm.Realm.Sync.Credentials = js.native
    def google(token: String): typings.realm.Realm.Sync.Credentials = js.native
    def jwt(token: String): typings.realm.Realm.Sync.Credentials = js.native
    def jwt(token: String, providerName: String): typings.realm.Realm.Sync.Credentials = js.native
    def nickname(value: String): typings.realm.Realm.Sync.Credentials = js.native
    def nickname(value: String, isAdmin: Boolean): typings.realm.Realm.Sync.Credentials = js.native
    def usernamePassword(username: String, password: String): typings.realm.Realm.Sync.Credentials = js.native
    def usernamePassword(username: String, password: String, createUser: Boolean): typings.realm.Realm.Sync.Credentials = js.native
  }
  
  @js.native
  object NumericLogLevel extends js.Object {
    /* 0 */ val All: typings.realm.Realm.Sync.NumericLogLevel.All with Double = js.native
    /* 2 */ val Debug: typings.realm.Realm.Sync.NumericLogLevel.Debug with Double = js.native
    /* 3 */ val Detail: typings.realm.Realm.Sync.NumericLogLevel.Detail with Double = js.native
    /* 6 */ val Error: typings.realm.Realm.Sync.NumericLogLevel.Error with Double = js.native
    /* 7 */ val Fatal: typings.realm.Realm.Sync.NumericLogLevel.Fatal with Double = js.native
    /* 4 */ val Info: typings.realm.Realm.Sync.NumericLogLevel.Info with Double = js.native
    /* 8 */ val Off: typings.realm.Realm.Sync.NumericLogLevel.Off with Double = js.native
    /* 1 */ val Trace: typings.realm.Realm.Sync.NumericLogLevel.Trace with Double = js.native
    /* 5 */ val Warn: typings.realm.Realm.Sync.NumericLogLevel.Warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.realm.Realm.Sync.NumericLogLevel with Double] = js.native
  }
  
  @js.native
  object SubscriptionState extends js.Object {
    /* 3 */ val Complete: typings.realm.Realm.Sync.SubscriptionState.Complete with Double = js.native
    /* 1 */ val Creating: typings.realm.Realm.Sync.SubscriptionState.Creating with Double = js.native
    /* 0 */ val Error: typings.realm.Realm.Sync.SubscriptionState.Error with Double = js.native
    /* 4 */ val Invalidated: typings.realm.Realm.Sync.SubscriptionState.Invalidated with Double = js.native
    /* 2 */ val Pending: typings.realm.Realm.Sync.SubscriptionState.Pending with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.realm.Realm.Sync.SubscriptionState with Double] = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    val all: StringDictionary[typings.realm.Realm.Sync.User] = js.native
    val current: typings.realm.Realm.Sync.User = js.native
    // Deprecated
    /** @deprecated, to be removed in future versions */
    def adminUser(adminToken: String): typings.realm.Realm.Sync.User = js.native
    def adminUser(adminToken: String, server: String): typings.realm.Realm.Sync.User = js.native
    /** @deprecated, to be removed in future versions */
    def authenticate(server: String, provider: String, options: js.Any): js.Promise[typings.realm.Realm.Sync.User] = js.native
    def completePasswordReset(server: String, resetToken: String, newPassword: String): js.Promise[Unit] = js.native
    def confirmEmail(server: String, confirmationToken: String): js.Promise[Unit] = js.native
    def deserialize(serialized: SerializedTokenUser): typings.realm.Realm.Sync.User = js.native
    def deserialize(serialized: SerializedUser): typings.realm.Realm.Sync.User = js.native
    def login(server: String, credentials: typings.realm.Realm.Sync.AdminCredentials): typings.realm.Realm.Sync.User = js.native
    def login(server: String, credentials: typings.realm.Realm.Sync.Credentials): js.Promise[typings.realm.Realm.Sync.User] = js.native
    /** @deprecated, to be removed in future versions */
    def login(server: String, username: String, password: String): js.Promise[typings.realm.Realm.Sync.User] = js.native
    /** @deprecated, to be removed in future versions */
    def register(server: String, username: String, password: String): js.Promise[typings.realm.Realm.Sync.User] = js.native
    /** @deprecated, to be removed in future versions */
    def registerWithProvider(server: String, options: Anon_Provider): js.Promise[typings.realm.Realm.Sync.User] = js.native
    def requestEmailConfirmation(server: String, email: String): js.Promise[Unit] = js.native
    def requestPasswordReset(server: String, email: String): js.Promise[Unit] = js.native
  }
  
}

