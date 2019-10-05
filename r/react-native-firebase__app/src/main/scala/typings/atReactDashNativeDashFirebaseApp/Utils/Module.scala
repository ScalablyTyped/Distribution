package typings.atReactDashNativeDashFirebaseApp.Utils

import typings.atReactDashNativeDashFirebaseApp.ReactNativeFirebase.FirebaseModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Utils.Module")
@js.native
class Module () extends FirebaseModule {
  /**
    * Returns true if this app is running inside a Firebase Test Lab environment. Always returns false on iOS.
    *
    * @android
    */
  var isRunningInTestLab: Boolean = js.native
}

