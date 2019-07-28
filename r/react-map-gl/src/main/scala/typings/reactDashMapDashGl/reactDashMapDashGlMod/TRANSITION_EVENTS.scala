package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TRANSITION_EVENTS extends js.Object

@JSImport("react-map-gl", "TRANSITION_EVENTS")
@js.native
object TRANSITION_EVENTS extends js.Object {
  @js.native
  sealed trait BREAK extends TRANSITION_EVENTS
  
  @js.native
  sealed trait IGNORE extends TRANSITION_EVENTS
  
  @js.native
  sealed trait SNAP_TO_END extends TRANSITION_EVENTS
  
  @js.native
  sealed trait UPDATE extends TRANSITION_EVENTS
  
  /* 1 */ val BREAK: typings.reactDashMapDashGl.reactDashMapDashGlMod.TRANSITION_EVENTS.BREAK with Double = js.native
  /* 3 */ val IGNORE: typings.reactDashMapDashGl.reactDashMapDashGlMod.TRANSITION_EVENTS.IGNORE with Double = js.native
  /* 2 */ val SNAP_TO_END: typings.reactDashMapDashGl.reactDashMapDashGlMod.TRANSITION_EVENTS.SNAP_TO_END with Double = js.native
  /* 4 */ val UPDATE: typings.reactDashMapDashGl.reactDashMapDashGlMod.TRANSITION_EVENTS.UPDATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TRANSITION_EVENTS with Double] = js.native
}

