package typings.reactSpringCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTransitionPhaseMod {
  
  @js.native
  sealed trait TransitionPhase extends StObject
  @JSImport("@react-spring/core/dist/declarations/src/TransitionPhase", "TransitionPhase")
  @js.native
  object TransitionPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransitionPhase & String] = js.native
    
    /** This transition is entering or has entered */
    @js.native
    sealed trait ENTER
      extends StObject
         with TransitionPhase
    /* "enter" */ val ENTER: typings.reactSpringCore.distDeclarationsSrcTransitionPhaseMod.TransitionPhase.ENTER & String = js.native
    
    /** This transition will expire after animating */
    @js.native
    sealed trait LEAVE
      extends StObject
         with TransitionPhase
    /* "leave" */ val LEAVE: typings.reactSpringCore.distDeclarationsSrcTransitionPhaseMod.TransitionPhase.LEAVE & String = js.native
    
    /** This transition is being mounted */
    @js.native
    sealed trait MOUNT
      extends StObject
         with TransitionPhase
    /* "mount" */ val MOUNT: typings.reactSpringCore.distDeclarationsSrcTransitionPhaseMod.TransitionPhase.MOUNT & String = js.native
    
    /** This transition had its animations updated */
    @js.native
    sealed trait UPDATE
      extends StObject
         with TransitionPhase
    /* "update" */ val UPDATE: typings.reactSpringCore.distDeclarationsSrcTransitionPhaseMod.TransitionPhase.UPDATE & String = js.native
  }
}
