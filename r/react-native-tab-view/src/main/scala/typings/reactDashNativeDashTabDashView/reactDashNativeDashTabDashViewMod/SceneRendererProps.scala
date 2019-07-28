package typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod

import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value
import typings.reactDashNativeDashTabDashView.Anon_Measured
import typings.reactDashNativeDashTabDashView.Anon_Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneRendererProps[T /* <: RouteBase */] extends js.Object {
  var layout: Layout with Anon_Measured
  var navigationState: NavigationState[T]
  var position: Value
  def getLastPosition(): Double
  def jumpTo(key: String): Unit
  def subscribe(event: SubscriptionName, callback: js.Function0[Unit]): Anon_Remove
}

object SceneRendererProps {
  @scala.inline
  def apply[T /* <: RouteBase */](
    getLastPosition: () => Double,
    jumpTo: String => Unit,
    layout: Layout with Anon_Measured,
    navigationState: NavigationState[T],
    position: Value,
    subscribe: (SubscriptionName, js.Function0[Unit]) => Anon_Remove
  ): SceneRendererProps[T] = {
    val __obj = js.Dynamic.literal(getLastPosition = js.Any.fromFunction0(getLastPosition), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout, navigationState = navigationState, position = position, subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[SceneRendererProps[T]]
  }
}

