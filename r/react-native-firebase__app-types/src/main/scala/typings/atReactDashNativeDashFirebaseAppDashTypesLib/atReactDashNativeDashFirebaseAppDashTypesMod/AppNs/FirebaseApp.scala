package typings
package atReactDashNativeDashFirebaseAppDashTypesLib.atReactDashNativeDashFirebaseAppDashTypesMod.AppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  /**
    * The name (identifier) for this App. '[DEFAULT]' is the default App.
    */
  val name: java.lang.String
  /**
    * The (read-only) configuration options from the app initialization.
    */
  val options: atReactDashNativeDashFirebaseAppDashTypesLib.atReactDashNativeDashFirebaseAppDashTypesMod.FirebaseOptions
  /**
    * Make this app unusable and free up resources.
    */
  def delete(): js.Promise[scala.Unit]
}

object FirebaseApp {
  @scala.inline
  def apply(
    delete: () => js.Promise[scala.Unit],
    name: java.lang.String,
    options: atReactDashNativeDashFirebaseAppDashTypesLib.atReactDashNativeDashFirebaseAppDashTypesMod.FirebaseOptions
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name, options = options)
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

