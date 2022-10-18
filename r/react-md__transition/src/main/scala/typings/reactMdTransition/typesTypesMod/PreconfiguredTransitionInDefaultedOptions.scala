package typings.reactMdTransition.typesTypesMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreconfiguredTransitionInDefaultedOptions[E /* <: HTMLElement */]
  extends StObject
     with TransitionActions
     with TransitionCallbacks {
  
  /**
    * An optional ref that will be merged with the
    * {@link TransitionHookReturnValue.ref}
    */
  var nodeRef: js.UndefOr[Ref[E]] = js.undefined
  
  /**
    * Boolean if the element should mount and unmount based on the
    * {@link transitionIn} value.
    *
    * @defaultValue `false`
    */
  var temporary: js.UndefOr[Boolean] = js.undefined
  
  /** {@inheritDoc TransitionTimeout} */
  var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  
  /**
    * This boolean controls the transition by activating flowing through the
    * {@link TransitionStage}.
    *
    * @see {@link TransitionActions} for a description around the transitions.
    */
  var transitionIn: js.UndefOr[Boolean] = js.undefined
}
object PreconfiguredTransitionInDefaultedOptions {
  
  inline def apply[E /* <: HTMLElement */](): PreconfiguredTransitionInDefaultedOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreconfiguredTransitionInDefaultedOptions[E]]
  }
  
  extension [Self <: PreconfiguredTransitionInDefaultedOptions[?], E /* <: HTMLElement */](x: Self & PreconfiguredTransitionInDefaultedOptions[E]) {
    
    inline def setNodeRef(value: Ref[E]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
    
    inline def setNodeRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "nodeRef", js.Any.fromFunction1(value))
    
    inline def setNodeRefNull: Self = StObject.set(x, "nodeRef", null)
    
    inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
    
    inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    
    inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
    
    inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
  }
}
