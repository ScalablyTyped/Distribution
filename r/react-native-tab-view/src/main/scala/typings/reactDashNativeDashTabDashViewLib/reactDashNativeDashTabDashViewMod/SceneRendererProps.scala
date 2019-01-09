package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneRendererProps[T /* <: RouteBase */] extends js.Object {
  var layout: Layout with reactDashNativeDashTabDashViewLib.Anon_Measured
  var navigationState: NavigationState[T]
  var position: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  def getLastPosition(): scala.Double
  def jumpTo(key: java.lang.String): scala.Unit
  def subscribe(event: SubscriptionName, callback: js.Function0[scala.Unit]): reactDashNativeDashTabDashViewLib.Anon_Remove
}

