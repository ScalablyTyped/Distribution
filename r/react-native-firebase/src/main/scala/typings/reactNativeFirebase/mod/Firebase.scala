package typings.reactNativeFirebase.mod

import typings.reactNativeFirebase.mod.Firebase.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "Firebase")
@js.native
class Firebase protected () extends StObject {
  
  val SDK_VERSION: String = js.native
  
  // admob: AdmobModule;
  var analytics: AnalyticsModule = js.native
  
  def app(): App = js.native
  def app(name: String): App = js.native
  
  val apps: js.Array[App] = js.native
  
  var auth: AuthModule = js.native
  
  var config: ConfigModule = js.native
  
  var crashlytics: CrashlyticsModule = js.native
  
  var database: DatabaseModule = js.native
  
  var firestore: FirestoreModule = js.native
  
  var functions: FunctionsModule = js.native
  
  var iid: IidModule = js.native
  
  // utils: UtilsModule;
  def initializeApp(options: Options, name: String): App = js.native
  
  var links: LinksModule = js.native
  
  var messaging: MessagingModule = js.native
  
  var notifications: NotificationsModule = js.native
  
  var perf: PerfModule = js.native
  
  var storage: StorageModule = js.native
}
object Firebase {
  
  @js.native
  trait Options extends StObject {
    
    var apiKey: String = js.native
    
    var appId: String = js.native
    
    var databaseURL: String = js.native
    
    var messagingSenderId: String = js.native
    
    var projectId: String = js.native
    
    var storageBucket: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      apiKey: String,
      appId: String,
      databaseURL: String,
      messagingSenderId: String,
      projectId: String,
      storageBucket: String
    ): Options = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], databaseURL = databaseURL.asInstanceOf[js.Any], messagingSenderId = messagingSenderId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], storageBucket = storageBucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    }
  }
}
