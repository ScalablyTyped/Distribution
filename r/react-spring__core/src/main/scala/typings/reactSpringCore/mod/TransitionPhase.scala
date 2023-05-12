package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitionPhase extends StObject
@JSImport("@react-spring/core", "TransitionPhase")
@js.native
object TransitionPhase extends StObject {
  
  /** This transition is entering or has entered */
  @js.native
  sealed trait ENTER
    extends StObject
       with TransitionPhase
  
  /** This transition will expire after animating */
  @js.native
  sealed trait LEAVE
    extends StObject
       with TransitionPhase
  
  /** This transition is being mounted */
  @js.native
  sealed trait MOUNT
    extends StObject
       with TransitionPhase
  
  /** This transition had its animations updated */
  @js.native
  sealed trait UPDATE
    extends StObject
       with TransitionPhase
}
