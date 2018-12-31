package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  /**
    * The app binary version that this update is dependent on. This is the value that was
    * specified via the appStoreVersion parameter when calling the CLI's release command.
    */
  var appVersion: java.lang.String
  /**
    * The deployment key that was used to originally download this update.
    */
  var deploymentKey: java.lang.String
  /**
    * The description of the update. This is the same value that you specified in the CLI when you released the update.
    */
  var description: java.lang.String
  /**
    * Indicates whether this update has been previously installed but was rolled back.
    */
  var failedInstall: scala.Boolean
  /**
    * Indicates whether this is the first time the update has been run after being installed.
    */
  var isFirstRun: scala.Boolean
  /**
    * Indicates whether the update is considered mandatory. This is the value that was specified in the CLI when the update was released.
    */
  var isMandatory: scala.Boolean
  /**
    * Indicates whether this update is in a "pending" state. When true, that means the update has been downloaded and installed, but the app restart
    * needed to apply it hasn't occurred yet, and therefore, its changes aren't currently visible to the end-user.
    */
  var isPending: scala.Boolean
  /**
    * The internal label automatically given to the update by the Goby server. This value uniquely identifies the update within its deployment.
    */
  var label: java.lang.String
  /**
    * The SHA hash value of the update.
    */
  var packageHash: java.lang.String
  /**
    * The size of the code contained within the update, in bytes.
    */
  var packageSize: scala.Double
}

