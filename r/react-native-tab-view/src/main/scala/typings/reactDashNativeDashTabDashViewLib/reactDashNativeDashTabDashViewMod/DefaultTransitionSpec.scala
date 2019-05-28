package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTransitionSpec extends js.Object {
  var friction: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`35`
  var tension: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`300`
  var timing: reactDashNativeDashTabDashViewLib.Fn_Config
}

object DefaultTransitionSpec {
  @scala.inline
  def apply(
    friction: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`35`,
    tension: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`300`,
    timing: reactDashNativeDashTabDashViewLib.Fn_Config
  ): DefaultTransitionSpec = {
    val __obj = js.Dynamic.literal(friction = friction, tension = tension, timing = timing)
  
    __obj.asInstanceOf[DefaultTransitionSpec]
  }
}

