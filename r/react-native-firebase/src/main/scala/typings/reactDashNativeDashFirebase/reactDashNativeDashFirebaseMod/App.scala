package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.FirebaseNs.Options
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.Analytics
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.Auth
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.configNs.Config
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.crashlyticsNs.Crashlytics
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.Database
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Firestore
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.iidNs.InstanceId
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.Links
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.Messaging
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.Notifications
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.perfNs.Perf
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "App")
@js.native
class App protected () extends js.Object {
  // utils(): RNFirebase.utils.Utils;
  val name: String = js.native
  val options: Options = js.native
  // admob(): RNFirebase.admob.AdMob;
  def analytics(): Analytics = js.native
  def auth(): Auth = js.native
  def config(): Config = js.native
  def crashlytics(): Crashlytics = js.native
  def database(): Database = js.native
  def firestore(): Firestore = js.native
  def functions(): Functions = js.native
  def functions(appOrRegion: String): Functions = js.native
  def functions(appOrRegion: String, region: String): Functions = js.native
  def functions(appOrRegion: App): Functions = js.native
  def functions(appOrRegion: App, region: String): Functions = js.native
  def iid(): InstanceId = js.native
  def links(): Links = js.native
  def messaging(): Messaging = js.native
  def notifications(): Notifications = js.native
  def onReady(): js.Promise[App] = js.native
  def perf(): Perf = js.native
  def storage(): Storage = js.native
}

