package typings
package reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "Firebase")
@js.native
class Firebase protected () extends js.Object {
  val SDK_VERSION: java.lang.String = js.native
  // admob: AdmobModule;
  @JSName("analytics")
  var analytics_Original: AnalyticsModule = js.native
  val apps: js.Array[App] = js.native
  @JSName("auth")
  var auth_Original: AuthModule = js.native
  @JSName("config")
  var config_Original: ConfigModule = js.native
  @JSName("crashlytics")
  var crashlytics_Original: CrashlyticsModule = js.native
  @JSName("database")
  var database_Original: DatabaseModule = js.native
  @JSName("firestore")
  var firestore_Original: FirestoreModule = js.native
  @JSName("functions")
  var functions_Original: FunctionsModule = js.native
  @JSName("iid")
  var iid_Original: IidModule = js.native
  // invites: InvitesModule;
  @JSName("links")
  var links_Original: LinksModule = js.native
  @JSName("messaging")
  var messaging_Original: MessagingModule = js.native
  @JSName("notifications")
  var notifications_Original: NotificationsModule = js.native
  @JSName("perf")
  var perf_Original: PerfModule = js.native
  @JSName("storage")
  var storage_Original: StorageModule = js.native
  // admob: AdmobModule;
  def analytics(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Analytics = js.native
  def app(): App = js.native
  def app(name: java.lang.String): App = js.native
  def auth(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.Auth = js.native
  def config(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.configNs.Config = js.native
  def crashlytics(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.crashlyticsNs.Crashlytics = js.native
  def database(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.Database = js.native
  def firestore(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Firestore = js.native
  def functions(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions = js.native
  def iid(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.iidNs.InstanceId = js.native
  // utils: UtilsModule;
  def initializeApp(
    options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.FirebaseNs.Options,
    name: java.lang.String
  ): App = js.native
  // invites: InvitesModule;
  def links(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.Links = js.native
  def messaging(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.Messaging = js.native
  def notifications(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.Notifications = js.native
  def perf(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.perfNs.Perf = js.native
  def storage(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.Storage = js.native
}

