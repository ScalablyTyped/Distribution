package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.FirebaseNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "Firebase")
@js.native
class Firebase protected () extends js.Object {
  val SDK_VERSION: String = js.native
  // admob: AdmobModule;
  var analytics: AnalyticsModule = js.native
  val apps: js.Array[App] = js.native
  var auth: AuthModule = js.native
  var config: ConfigModule = js.native
  var crashlytics: CrashlyticsModule = js.native
  var database: DatabaseModule = js.native
  var firestore: FirestoreModule = js.native
  var functions: FunctionsModule = js.native
  var iid: IidModule = js.native
  var links: LinksModule = js.native
  var messaging: MessagingModule = js.native
  var notifications: NotificationsModule = js.native
  var perf: PerfModule = js.native
  var storage: StorageModule = js.native
  def app(): App = js.native
  def app(name: String): App = js.native
  // utils: UtilsModule;
  def initializeApp(options: Options, name: String): App = js.native
}

