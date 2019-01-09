package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTransitionSpec extends js.Object {
  var friction: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`35` = js.native
  var tension: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewLibNumbers.`300` = js.native
  @JSName("timing")
  var timing_Original: reactDashNativeDashTabDashViewLib.Anon_Config = js.native
  def timing(
    value: reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValueXY,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def timing(
    value: reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
}

