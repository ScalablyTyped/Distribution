package typings
package reactDashSwipeableDashViewsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSwipeableDashViewsMod {
  type AxisType = reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsLibStrings.x | reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsLibStrings.`x-reverse` | reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsLibStrings.y | reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsLibStrings.`y-reverse`
  type OnChangeIndexCallback = js.Function2[/* index */ scala.Double, /* indexLatest */ scala.Double, scala.Unit]
  type OnSwitchingCallback = js.Function2[/* index */ scala.Double, /* type */ OnSwitchingCallbackTypeDescriptor, scala.Unit]
  type OnSwitchingCallbackTypeDescriptor = reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsLibStrings.move | reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsLibStrings.end
  type OnTransitionEndCallback = js.Function0[scala.Unit]
  type SwipeableViews = reactLib.reactMod.Component[SwipeableViewsProps, SwipeableViewsState, js.Any]
}
