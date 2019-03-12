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

object SceneRendererProps {
  @scala.inline
  def apply[T /* <: RouteBase */](
    getLastPosition: () => scala.Double,
    jumpTo: java.lang.String => scala.Unit,
    layout: Layout with reactDashNativeDashTabDashViewLib.Anon_Measured,
    navigationState: NavigationState[T],
    position: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value,
    subscribe: (SubscriptionName, js.Function0[scala.Unit]) => reactDashNativeDashTabDashViewLib.Anon_Remove
  ): SceneRendererProps[T] = {
    val __obj = js.Dynamic.literal(getLastPosition = js.Any.fromFunction0(getLastPosition), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout, navigationState = navigationState, position = position, subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[SceneRendererProps[T]]
  }
}

