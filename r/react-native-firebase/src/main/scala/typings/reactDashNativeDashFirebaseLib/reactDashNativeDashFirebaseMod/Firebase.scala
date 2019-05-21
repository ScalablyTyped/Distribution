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
  var analytics: AnalyticsModule = js.native
  val apps: js.Array[App] = js.native
  var auth: AuthModule = js.native
  var config: ConfigModule = js.native
  var crashlytics: CrashlyticsModule = js.native
  var database: DatabaseModule = js.native
  var firestore: FirestoreModule = js.native
  var functions: FunctionsModule = js.native
  var iid: IidModule = js.native
  // invites: InvitesModule;
  var links: LinksModule = js.native
  var messaging: MessagingModule = js.native
  var notifications: NotificationsModule = js.native
  var perf: PerfModule = js.native
  var storage: StorageModule = js.native
  def app(): App = js.native
  def app(name: java.lang.String): App = js.native
  // utils: UtilsModule;
  def initializeApp(
    options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.FirebaseNs.Options,
    name: java.lang.String
  ): App = js.native
}

