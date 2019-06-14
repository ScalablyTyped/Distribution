package typings
package realmLib.realmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.html }
  */
@JSImport("realm", "Sync")
@js.native
object SyncNs extends js.Object {
  @js.native
  class Adapter protected ()
    extends realmLib.RealmNs.SyncNs.Adapter {
    def this(local_path: java.lang.String, server_url: java.lang.String, admin_user: realmLib.RealmNs.SyncNs.User, regex: java.lang.String, change_callback: js.Function) = this()
    def this(local_path: java.lang.String, server_url: java.lang.String, admin_user: realmLib.RealmNs.SyncNs.User, regex: java.lang.String, change_callback: js.Function, ssl: realmLib.RealmNs.SyncNs.SSLConfiguration) = this()
  }
  
  @js.native
  class AdminCredentials ()
    extends realmLib.RealmNs.SyncNs.AdminCredentials
  
  /**
    * AuthError
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.AuthError.html }
    */
  @js.native
  class AuthError ()
    extends realmLib.RealmNs.SyncNs.AuthError
  
  @js.native
  class Credentials ()
    extends realmLib.RealmNs.SyncNs.Credentials
  
  @js.native
  class Permission ()
    extends realmLib.RealmNs.SyncNs.Permission
  
  @js.native
  class PermissionChange ()
    extends realmLib.RealmNs.SyncNs.PermissionChange
  
  @js.native
  class PermissionOffer ()
    extends realmLib.RealmNs.SyncNs.PermissionOffer
  
  /**
    * Session
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Session.html }
    */
  @js.native
  class Session ()
    extends realmLib.RealmNs.SyncNs.Session
  
  /**
    * Subscription
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Subscription.html }
    */
  @js.native
  class Subscription ()
    extends realmLib.RealmNs.SyncNs.Subscription
  
  /**
    * User
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
    */
  @js.native
  class User ()
    extends realmLib.RealmNs.SyncNs.User
  
  def _hasExistingSessions(): scala.Boolean = js.native
  def addListener(
    config: realmLib.RealmNs.SyncNs.RealmListenerConfiguration,
    eventName: realmLib.RealmNs.SyncNs.RealmListenerEventName,
    changeCallback: js.Function1[
      /* changeEvent */ realmLib.RealmNs.SyncNs.ChangeEvent, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def addListener(
    serverURL: java.lang.String,
    adminUser: realmLib.RealmNs.SyncNs.User,
    regex: java.lang.String,
    name: realmLib.RealmNs.SyncNs.RealmListenerEventName,
    changeCallback: js.Function1[
      /* changeEvent */ realmLib.RealmNs.SyncNs.ChangeEvent, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ): scala.Unit = js.native
  def initiateClientReset(path: java.lang.String): scala.Unit = js.native
  def localListenerRealms(regex: java.lang.String): js.Array[realmLib.RealmNs.SyncNs.LocalRealm] = js.native
  def reconnect(): scala.Unit = js.native
  def removeAllListeners(): js.Promise[scala.Unit] = js.native
  def removeListener(
    regex: java.lang.String,
    name: java.lang.String,
    changeCallback: js.Function1[/* changeEvent */ realmLib.RealmNs.SyncNs.ChangeEvent, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def setFeatureToken(token: java.lang.String): scala.Unit = js.native
  def setLogLevel(logLevel: realmLib.RealmNs.SyncNs.LogLevel): scala.Unit = js.native
  def setLogger(
    callback: js.Function2[
      /* level */ realmLib.RealmNs.SyncNs.NumericLogLevel, 
      /* message */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
  @js.native
  object ConnectionState extends js.Object {
    /* "connected" */ val Connected: realmLib.RealmNs.SyncNs.ConnectionState.Connected with java.lang.String = js.native
    /* "connecting" */ val Connecting: realmLib.RealmNs.SyncNs.ConnectionState.Connecting with java.lang.String = js.native
    /* "disconnected" */ val Disconnected: realmLib.RealmNs.SyncNs.ConnectionState.Disconnected with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[realmLib.RealmNs.SyncNs.ConnectionState with java.lang.String] = js.native
  }
  
  /* static members */
  @js.native
  object Credentials extends js.Object {
    def adminToken(token: java.lang.String): realmLib.RealmNs.SyncNs.AdminCredentials = js.native
    def anonymous(): realmLib.RealmNs.SyncNs.Credentials = js.native
    def azureAD(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def custom(providerName: java.lang.String, token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def custom(
      providerName: java.lang.String,
      token: java.lang.String,
      userInfo: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): realmLib.RealmNs.SyncNs.Credentials = js.native
    def facebook(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def google(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def jwt(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def jwt(token: java.lang.String, providerName: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def nickname(value: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def nickname(value: java.lang.String, isAdmin: scala.Boolean): realmLib.RealmNs.SyncNs.Credentials = js.native
    def usernamePassword(username: java.lang.String, password: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
    def usernamePassword(username: java.lang.String, password: java.lang.String, createUser: scala.Boolean): realmLib.RealmNs.SyncNs.Credentials = js.native
  }
  
  @js.native
  object NumericLogLevel extends js.Object {
    /* 0 */ val All: realmLib.RealmNs.SyncNs.NumericLogLevel.All with scala.Double = js.native
    /* 2 */ val Debug: realmLib.RealmNs.SyncNs.NumericLogLevel.Debug with scala.Double = js.native
    /* 3 */ val Detail: realmLib.RealmNs.SyncNs.NumericLogLevel.Detail with scala.Double = js.native
    /* 6 */ val Error: realmLib.RealmNs.SyncNs.NumericLogLevel.Error with scala.Double = js.native
    /* 7 */ val Fatal: realmLib.RealmNs.SyncNs.NumericLogLevel.Fatal with scala.Double = js.native
    /* 4 */ val Info: realmLib.RealmNs.SyncNs.NumericLogLevel.Info with scala.Double = js.native
    /* 8 */ val Off: realmLib.RealmNs.SyncNs.NumericLogLevel.Off with scala.Double = js.native
    /* 1 */ val Trace: realmLib.RealmNs.SyncNs.NumericLogLevel.Trace with scala.Double = js.native
    /* 5 */ val Warn: realmLib.RealmNs.SyncNs.NumericLogLevel.Warn with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[realmLib.RealmNs.SyncNs.NumericLogLevel with scala.Double] = js.native
  }
  
  @js.native
  object SubscriptionState extends js.Object {
    /* 3 */ val Complete: realmLib.RealmNs.SyncNs.SubscriptionState.Complete with scala.Double = js.native
    /* 1 */ val Creating: realmLib.RealmNs.SyncNs.SubscriptionState.Creating with scala.Double = js.native
    /* 0 */ val Error: realmLib.RealmNs.SyncNs.SubscriptionState.Error with scala.Double = js.native
    /* 4 */ val Invalidated: realmLib.RealmNs.SyncNs.SubscriptionState.Invalidated with scala.Double = js.native
    /* 2 */ val Pending: realmLib.RealmNs.SyncNs.SubscriptionState.Pending with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[realmLib.RealmNs.SyncNs.SubscriptionState with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    val all: org.scalablytyped.runtime.StringDictionary[realmLib.RealmNs.SyncNs.User] = js.native
    val current: realmLib.RealmNs.SyncNs.User = js.native
    // Deprecated
    /** @deprecated, to be removed in future versions */
    def adminUser(adminToken: java.lang.String): realmLib.RealmNs.SyncNs.User = js.native
    def adminUser(adminToken: java.lang.String, server: java.lang.String): realmLib.RealmNs.SyncNs.User = js.native
    /** @deprecated, to be removed in future versions */
    def authenticate(server: java.lang.String, provider: java.lang.String, options: js.Any): js.Promise[realmLib.RealmNs.SyncNs.User] = js.native
    def completePasswordReset(server: java.lang.String, resetToken: java.lang.String, newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
    def confirmEmail(server: java.lang.String, confirmationToken: java.lang.String): js.Promise[scala.Unit] = js.native
    def deserialize(serialized: realmLib.RealmNs.SyncNs.SerializedTokenUser): realmLib.RealmNs.SyncNs.User = js.native
    def deserialize(serialized: realmLib.RealmNs.SyncNs.SerializedUser): realmLib.RealmNs.SyncNs.User = js.native
    def login(server: java.lang.String, credentials: realmLib.RealmNs.SyncNs.AdminCredentials): realmLib.RealmNs.SyncNs.User = js.native
    def login(server: java.lang.String, credentials: realmLib.RealmNs.SyncNs.Credentials): js.Promise[realmLib.RealmNs.SyncNs.User] = js.native
    /** @deprecated, to be removed in future versions */
    def login(server: java.lang.String, username: java.lang.String, password: java.lang.String): js.Promise[realmLib.RealmNs.SyncNs.User] = js.native
    /** @deprecated, to be removed in future versions */
    def register(server: java.lang.String, username: java.lang.String, password: java.lang.String): js.Promise[realmLib.RealmNs.SyncNs.User] = js.native
    /** @deprecated, to be removed in future versions */
    def registerWithProvider(server: java.lang.String, options: realmLib.Anon_Provider): js.Promise[realmLib.RealmNs.SyncNs.User] = js.native
    def requestEmailConfirmation(server: java.lang.String, email: java.lang.String): js.Promise[scala.Unit] = js.native
    def requestPasswordReset(server: java.lang.String, email: java.lang.String): js.Promise[scala.Unit] = js.native
  }
  
  type SessionStopPolicy = realmLib.RealmNs.SyncNs.SessionStopPolicy
}

