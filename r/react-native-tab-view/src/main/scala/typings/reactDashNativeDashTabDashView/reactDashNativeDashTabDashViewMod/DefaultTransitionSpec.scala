package typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod

import typings.reactDashNativeDashTabDashView.Fn_Config
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewNumbers.`300`
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTransitionSpec extends js.Object {
  var friction: `35`
  var tension: `300`
  var timing: Fn_Config
}

object DefaultTransitionSpec {
  @scala.inline
  def apply(friction: `35`, tension: `300`, timing: Fn_Config): DefaultTransitionSpec = {
    val __obj = js.Dynamic.literal(friction = friction, tension = tension, timing = timing)
  
    __obj.asInstanceOf[DefaultTransitionSpec]
  }
}

