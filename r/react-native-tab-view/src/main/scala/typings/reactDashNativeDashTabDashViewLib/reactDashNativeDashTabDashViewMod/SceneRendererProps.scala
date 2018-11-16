package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SceneRendererProps[T /* <: RouteBase */] extends js.Object {
  var getLastPosition: js.Function0[scala.Double]
  var jumpTo: js.Function1[/* key */ java.lang.String, scala.Unit]
  var layout: Layout with reactDashNativeDashTabDashViewLib.Anon_Measured
  var navigationState: NavigationState[T]
  var position: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  var subscribe: js.Function2[
    /* event */ SubscriptionName, 
    /* callback */ js.Function0[scala.Unit], 
    reactDashNativeDashTabDashViewLib.Anon_Remove
  ]
}

