package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.Firebase.Options
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.Analytics
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.Auth
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.config.Config
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.crashlytics.Crashlytics
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Database
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Firestore
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.functions.Functions
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.iid.InstanceId
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links.Links
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging.Messaging
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Notifications
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.perf.Perf
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.Storage
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

