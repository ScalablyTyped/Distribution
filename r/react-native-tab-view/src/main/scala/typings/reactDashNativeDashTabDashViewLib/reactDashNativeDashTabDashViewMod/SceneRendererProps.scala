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
    getLastPosition: js.Function0[scala.Double],
    jumpTo: js.Function1[java.lang.String, scala.Unit],
    layout: Layout with reactDashNativeDashTabDashViewLib.Anon_Measured,
    navigationState: NavigationState[T],
    position: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value,
    subscribe: js.Function2[
      SubscriptionName, 
      js.Function0[scala.Unit], 
      reactDashNativeDashTabDashViewLib.Anon_Remove
    ]
  ): SceneRendererProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLastPosition")(getLastPosition)
    __obj.updateDynamic("jumpTo")(jumpTo)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("navigationState")(navigationState)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[SceneRendererProps[T]]
  }
}

