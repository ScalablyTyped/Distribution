package typings.reactMdTransition.typesMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedPositioningTransitionOptions[E /* <: HTMLElement */]
  extends StObject
     with FixedPositioningTransitionCallbacks {
  
  /** {@inheritDoc TransitionOptions.nodeRef} */
  var nodeRef: js.UndefOr[Ref[E]] = js.undefined
}
object FixedPositioningTransitionOptions {
  
  inline def apply[E /* <: HTMLElement */](): FixedPositioningTransitionOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedPositioningTransitionOptions[E]]
  }
  
  extension [Self <: FixedPositioningTransitionOptions[?], E /* <: HTMLElement */](x: Self & FixedPositioningTransitionOptions[E]) {
    
    inline def setNodeRef(value: Ref[E]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
    
    inline def setNodeRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "nodeRef", js.Any.fromFunction1(value))
    
    inline def setNodeRefNull: Self = StObject.set(x, "nodeRef", null)
    
    inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
  }
}
