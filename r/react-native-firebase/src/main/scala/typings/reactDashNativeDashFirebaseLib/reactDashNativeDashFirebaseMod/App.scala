package typings
package reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "App")
@js.native
class App protected () extends js.Object {
  // utils(): RNFirebase.utils.Utils;
  val name: java.lang.String = js.native
  val options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.FirebaseNs.Options = js.native
  // admob(): RNFirebase.admob.AdMob;
  def analytics(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Analytics = js.native
  def auth(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.Auth = js.native
  def config(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.configNs.Config = js.native
  def crashlytics(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.crashlyticsNs.Crashlytics = js.native
  def database(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.Database = js.native
  def firestore(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Firestore = js.native
  def functions(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions = js.native
  def functions(appOrRegion: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions = js.native
  def functions(appOrRegion: java.lang.String, region: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions = js.native
  def functions(appOrRegion: App): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions = js.native
  def functions(appOrRegion: App, region: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions = js.native
  def iid(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.iidNs.InstanceId = js.native
  def links(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.Links = js.native
  def messaging(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.Messaging = js.native
  def notifications(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.Notifications = js.native
  def onReady(): js.Promise[App] = js.native
  def perf(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.perfNs.Perf = js.native
  def storage(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.Storage = js.native
}

