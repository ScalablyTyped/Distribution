package typings
package reactDashSwipeableDashViewsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSwipeableDashViewsMod {
  type OnChangeIndexCallback = js.Function2[/* index */ scala.Double, /* indexLatest */ scala.Double, scala.Unit]
  type OnSwitchingCallback = js.Function2[/* index */ scala.Double, /* type */ OnSwitchingCallbackTypeDescriptor, scala.Unit]
  type OnTransitionEndCallback = js.Function0[scala.Unit]
  type SwipeableViews = reactLib.reactMod.Component[SwipeableViewsProps, SwipeableViewsState, js.Any]
}
