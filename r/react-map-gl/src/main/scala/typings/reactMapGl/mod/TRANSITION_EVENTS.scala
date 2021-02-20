package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TRANSITION_EVENTS extends StObject
@JSImport("react-map-gl", "TRANSITION_EVENTS")
@js.native
object TRANSITION_EVENTS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TRANSITION_EVENTS with Double] = js.native
  
  @js.native
  sealed trait BREAK extends TRANSITION_EVENTS
  /* 1 */ val BREAK: typings.reactMapGl.mod.TRANSITION_EVENTS.BREAK with Double = js.native
  
  @js.native
  sealed trait IGNORE extends TRANSITION_EVENTS
  /* 3 */ val IGNORE: typings.reactMapGl.mod.TRANSITION_EVENTS.IGNORE with Double = js.native
  
  @js.native
  sealed trait SNAP_TO_END extends TRANSITION_EVENTS
  /* 2 */ val SNAP_TO_END: typings.reactMapGl.mod.TRANSITION_EVENTS.SNAP_TO_END with Double = js.native
  
  @js.native
  sealed trait UPDATE extends TRANSITION_EVENTS
  /* 4 */ val UPDATE: typings.reactMapGl.mod.TRANSITION_EVENTS.UPDATE with Double = js.native
}
