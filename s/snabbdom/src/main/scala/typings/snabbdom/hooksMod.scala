package typings.snabbdom

import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  type CreateHook = js.Function2[/* emptyVNode */ VNode_, /* vNode */ VNode_, js.Any]
  
  type DestroyHook = js.Function1[/* vNode */ VNode_, js.Any]
  
  @js.native
  trait Hooks extends StObject {
    
    var create: js.UndefOr[CreateHook] = js.native
    
    var destroy: js.UndefOr[DestroyHook] = js.native
    
    var init: js.UndefOr[InitHook] = js.native
    
    var insert: js.UndefOr[InsertHook] = js.native
    
    var post: js.UndefOr[PostHook] = js.native
    
    var postpatch: js.UndefOr[PostPatchHook] = js.native
    
    var pre: js.UndefOr[PreHook] = js.native
    
    var prepatch: js.UndefOr[PrePatchHook] = js.native
    
    var remove: js.UndefOr[RemoveHook] = js.native
    
    var update: js.UndefOr[UpdateHook] = js.native
  }
  object Hooks {
    
    @scala.inline
    def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    @scala.inline
    implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* vNode */ VNode_ => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setInit(value: /* vNode */ VNode_ => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setInsert(value: /* vNode */ VNode_ => js.Any): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setPost(value: () => js.Any): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPostpatch(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "postpatch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostpatchUndefined: Self = StObject.set(x, "postpatch", js.undefined)
      
      @scala.inline
      def setPre(value: () => js.Any): Self = StObject.set(x, "pre", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setPrepatch(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "prepatch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrepatchUndefined: Self = StObject.set(x, "prepatch", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type InitHook = js.Function1[/* vNode */ VNode_, js.Any]
  
  type InsertHook = js.Function1[/* vNode */ VNode_, js.Any]
  
  type PostHook = js.Function0[js.Any]
  
  type PostPatchHook = js.Function2[/* oldVNode */ VNode_, /* vNode */ VNode_, js.Any]
  
  type PreHook = js.Function0[js.Any]
  
  type PrePatchHook = js.Function2[/* oldVNode */ VNode_, /* vNode */ VNode_, js.Any]
  
  type RemoveHook = js.Function2[/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit], js.Any]
  
  type UpdateHook = js.Function2[/* oldVNode */ VNode_, /* vNode */ VNode_, js.Any]
}
