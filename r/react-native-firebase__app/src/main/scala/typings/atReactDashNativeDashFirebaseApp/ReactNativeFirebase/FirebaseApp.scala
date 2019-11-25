package typings.atReactDashNativeDashFirebaseApp.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  /**
    * The name (identifier) for this App. '[DEFAULT]' is the default App.
    */
  val name: String
  /**
    * The (read-only) configuration options from the app initialization.
    */
  val options: FirebaseAppOptions
  /**
    * Make this app unusable and free up resources.
    */
  def delete(): js.Promise[Unit]
}

object FirebaseApp {
  @scala.inline
  def apply(delete: () => js.Promise[Unit], name: String, options: FirebaseAppOptions): FirebaseApp = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

