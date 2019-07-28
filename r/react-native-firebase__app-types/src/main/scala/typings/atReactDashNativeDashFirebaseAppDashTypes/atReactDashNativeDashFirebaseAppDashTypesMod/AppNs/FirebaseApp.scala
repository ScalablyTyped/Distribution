package typings.atReactDashNativeDashFirebaseAppDashTypes.atReactDashNativeDashFirebaseAppDashTypesMod.AppNs

import typings.atReactDashNativeDashFirebaseAppDashTypes.atReactDashNativeDashFirebaseAppDashTypesMod.FirebaseOptions
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
  val options: FirebaseOptions
  /**
    * Make this app unusable and free up resources.
    */
  def delete(): js.Promise[Unit]
}

object FirebaseApp {
  @scala.inline
  def apply(delete: () => js.Promise[Unit], name: String, options: FirebaseOptions): FirebaseApp = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name, options = options)
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

