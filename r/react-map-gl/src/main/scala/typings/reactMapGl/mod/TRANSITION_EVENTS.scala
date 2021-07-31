package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TRANSITION_EVENTS extends StObject
@JSImport("react-map-gl", "TRANSITION_EVENTS")
@js.native
object TRANSITION_EVENTS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TRANSITION_EVENTS & Double] = js.native
  
  @js.native
  sealed trait BREAK
    extends StObject
       with TRANSITION_EVENTS
  /* 1 */ val BREAK: typings.reactMapGl.mod.TRANSITION_EVENTS.BREAK & Double = js.native
  
  @js.native
  sealed trait IGNORE
    extends StObject
       with TRANSITION_EVENTS
  /* 3 */ val IGNORE: typings.reactMapGl.mod.TRANSITION_EVENTS.IGNORE & Double = js.native
  
  @js.native
  sealed trait SNAP_TO_END
    extends StObject
       with TRANSITION_EVENTS
  /* 2 */ val SNAP_TO_END: typings.reactMapGl.mod.TRANSITION_EVENTS.SNAP_TO_END & Double = js.native
  
  @js.native
  sealed trait UPDATE
    extends StObject
       with TRANSITION_EVENTS
  /* 4 */ val UPDATE: typings.reactMapGl.mod.TRANSITION_EVENTS.UPDATE & Double = js.native
}
