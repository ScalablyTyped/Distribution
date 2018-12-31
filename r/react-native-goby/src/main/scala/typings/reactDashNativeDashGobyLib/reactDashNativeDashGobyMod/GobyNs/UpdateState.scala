package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateState extends js.Object

/**
  * Indicates the state that an update is currently in.
  */
@JSImport("react-native-goby/Goby", "UpdateState")
@js.native
object UpdateState extends js.Object {
  /**
    * Indicates than an update represents the latest available
    * release, and can be either currently running or pending.
    */
  @js.native
  sealed trait LATEST
    extends reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState
  
  /**
    * Indicates than an update has been installed, but the
    * app hasn't been restarted yet in order to apply it.
    */
  @js.native
  sealed trait PENDING
    extends reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState
  
  /**
    * Indicates that an update represents the
    * version of the app that is currently running.
    */
  @js.native
  sealed trait RUNNING
    extends reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.UpdateState
  
}

