package typings.snabbdom

import typings.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildHooksMod {
  
  type CreateHook = js.Function2[/* emptyVNode */ VNode_, /* vNode */ VNode_, Any]
  
  type DestroyHook = js.Function1[/* vNode */ VNode_, Any]
  
  trait Hooks extends StObject {
    
    var create: js.UndefOr[CreateHook] = js.undefined
    
    var destroy: js.UndefOr[DestroyHook] = js.undefined
    
    var init: js.UndefOr[InitHook] = js.undefined
    
    var insert: js.UndefOr[InsertHook] = js.undefined
    
    var post: js.UndefOr[PostHook] = js.undefined
    
    var postpatch: js.UndefOr[PostPatchHook] = js.undefined
    
    var pre: js.UndefOr[PreHook] = js.undefined
    
    var prepatch: js.UndefOr[PrePatchHook] = js.undefined
    
    var remove: js.UndefOr[RemoveHook] = js.undefined
    
    var update: js.UndefOr[UpdateHook] = js.undefined
  }
  object Hooks {
    
    inline def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: /* vNode */ VNode_ => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setInit(value: /* vNode */ VNode_ => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setInsert(value: /* vNode */ VNode_ => Any): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setPost(value: () => Any): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPostpatch(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => Any): Self = StObject.set(x, "postpatch", js.Any.fromFunction2(value))
      
      inline def setPostpatchUndefined: Self = StObject.set(x, "postpatch", js.undefined)
      
      inline def setPre(value: () => Any): Self = StObject.set(x, "pre", js.Any.fromFunction0(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setPrepatch(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => Any): Self = StObject.set(x, "prepatch", js.Any.fromFunction2(value))
      
      inline def setPrepatchUndefined: Self = StObject.set(x, "prepatch", js.undefined)
      
      inline def setRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => Any): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => Any): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type InitHook = js.Function1[/* vNode */ VNode_, Any]
  
  type InsertHook = js.Function1[/* vNode */ VNode_, Any]
  
  type PostHook = js.Function0[Any]
  
  type PostPatchHook = js.Function2[/* oldVNode */ VNode_, /* vNode */ VNode_, Any]
  
  type PreHook = js.Function0[Any]
  
  type PrePatchHook = js.Function2[/* oldVNode */ VNode_, /* vNode */ VNode_, Any]
  
  type RemoveHook = js.Function2[/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit], Any]
  
  type UpdateHook = js.Function2[/* oldVNode */ VNode_, /* vNode */ VNode_, Any]
}
