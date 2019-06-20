package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TRANSITION_EVENTS extends js.Object

@JSImport("react-map-gl", "TRANSITION_EVENTS")
@js.native
object TRANSITION_EVENTS extends js.Object {
  @js.native
  sealed trait BREAK
    extends reactDashMapDashGlLib.reactDashMapDashGlMod.TRANSITION_EVENTS
  
  @js.native
  sealed trait IGNORE
    extends reactDashMapDashGlLib.reactDashMapDashGlMod.TRANSITION_EVENTS
  
  @js.native
  sealed trait SNAP_TO_END
    extends reactDashMapDashGlLib.reactDashMapDashGlMod.TRANSITION_EVENTS
  
  @js.native
  sealed trait UPDATE
    extends reactDashMapDashGlLib.reactDashMapDashGlMod.TRANSITION_EVENTS
  
  /* 1 */ val BREAK: BREAK with scala.Double = js.native
  /* 3 */ val IGNORE: IGNORE with scala.Double = js.native
  /* 2 */ val SNAP_TO_END: SNAP_TO_END with scala.Double = js.native
  /* 4 */ val UPDATE: UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[reactDashMapDashGlLib.reactDashMapDashGlMod.TRANSITION_EVENTS with scala.Double] = js.native
}

