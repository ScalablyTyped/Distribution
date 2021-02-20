package typings.reactNativeFirebase.mod

import typings.reactNativeFirebase.mod.Firebase.Options
import typings.reactNativeFirebase.mod.RNFirebase.Analytics
import typings.reactNativeFirebase.mod.RNFirebase.auth.Auth
import typings.reactNativeFirebase.mod.RNFirebase.config.Config
import typings.reactNativeFirebase.mod.RNFirebase.crashlytics.Crashlytics
import typings.reactNativeFirebase.mod.RNFirebase.database.Database
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Firestore
import typings.reactNativeFirebase.mod.RNFirebase.functions.Functions
import typings.reactNativeFirebase.mod.RNFirebase.iid.InstanceId
import typings.reactNativeFirebase.mod.RNFirebase.links.Links
import typings.reactNativeFirebase.mod.RNFirebase.messaging.Messaging
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Notifications
import typings.reactNativeFirebase.mod.RNFirebase.perf.Perf
import typings.reactNativeFirebase.mod.RNFirebase.storage.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "App")
@js.native
class App protected () extends StObject {
  
  // admob(): RNFirebase.admob.AdMob;
  def analytics(): Analytics = js.native
  
  def auth(): Auth = js.native
  
  def config(): Config = js.native
  
  def crashlytics(): Crashlytics = js.native
  
  def database(): Database = js.native
  
  def firestore(): Firestore = js.native
  
  def functions(): Functions = js.native
  def functions(appOrRegion: js.UndefOr[scala.Nothing], region: String): Functions = js.native
  def functions(appOrRegion: String): Functions = js.native
  def functions(appOrRegion: String, region: String): Functions = js.native
  def functions(appOrRegion: App): Functions = js.native
  def functions(appOrRegion: App, region: String): Functions = js.native
  
  def iid(): InstanceId = js.native
  
  def links(): Links = js.native
  
  def messaging(): Messaging = js.native
  
  // utils(): RNFirebase.utils.Utils;
  val name: String = js.native
  
  def notifications(): Notifications = js.native
  
  def onReady(): js.Promise[App] = js.native
  
  val options: Options = js.native
  
  def perf(): Perf = js.native
  
  def storage(): Storage = js.native
}
