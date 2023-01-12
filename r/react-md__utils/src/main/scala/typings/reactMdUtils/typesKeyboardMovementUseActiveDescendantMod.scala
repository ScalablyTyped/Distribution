package typings.reactMdUtils

import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementUseActiveDescendantMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/useActiveDescendant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useActiveDescendant[E /* <: HTMLElement */](param0: ActiveDescendantHookOptions[E]): ActiveDescendantHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantHookReturnValue[E]]
  
  trait ActiveDescendantHookOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The DOM id for the element. This is required so that the
      * {@link ActiveDescendantContext.activeId} can be updated to the current
      * element as needed.
      */
    var id: String
    
    /**
      * An optional ref to merge with the ref returned by this hook.
      */
    var ref: js.UndefOr[Ref[E]] = js.undefined
  }
  object ActiveDescendantHookOptions {
    
    inline def apply[E /* <: HTMLElement */](id: String): ActiveDescendantHookOptions[E] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveDescendantHookOptions[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveDescendantHookOptions[?], E /* <: HTMLElement */] (val x: Self & ActiveDescendantHookOptions[E]) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait ActiveDescendantHookReturnValue[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if this element is the current focus. This is useful for adding a
      * focus class name since this element actually does not gain focus while
      * active.
      */
    var active: Boolean
    
    /**
      * A ref handler that **must** be provided to the DOM element for the active
      * descendant movement to work correctly.
      */
    var ref: RefCallback[E]
  }
  object ActiveDescendantHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](active: Boolean, ref: /* instance */ E | Null => Unit): ActiveDescendantHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[ActiveDescendantHookReturnValue[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveDescendantHookReturnValue[?], E /* <: HTMLElement */] (val x: Self & ActiveDescendantHookReturnValue[E]) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
}
