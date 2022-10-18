package typings.reactMdTransition.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionState extends StObject {
  
  /**
    * Boolean if this is the first {@link TransitionAction.appear} transition.
    * This will be `true` during the first transition if
    * {@link TransitionAction.appear} was also `true`. Otherwise it will be
    * `false`.
    */
  var appearing: Boolean
  
  /**
    * Boolean if the element should be rendered or not. This will always be
    * `true` if the {@link TransitionOptions.temporary} is `false`. Otherwise, it
    * will be `true` when not the `"exited"` {@link TransitionStage}.
    */
  var rendered: Boolean
  
  /** {@inheritDoc TransitionStage} */
  var stage: TransitionStage
}
object TransitionState {
  
  inline def apply(appearing: Boolean, rendered: Boolean, stage: TransitionStage): TransitionState = {
    val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionState]
  }
  
  extension [Self <: TransitionState](x: Self) {
    
    inline def setAppearing(value: Boolean): Self = StObject.set(x, "appearing", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setStage(value: TransitionStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
  }
}
