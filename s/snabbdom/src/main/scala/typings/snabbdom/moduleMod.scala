package typings.snabbdom

import typings.snabbdom.hooksMod.CreateHook
import typings.snabbdom.hooksMod.DestroyHook
import typings.snabbdom.hooksMod.PostHook
import typings.snabbdom.hooksMod.PreHook
import typings.snabbdom.hooksMod.RemoveHook
import typings.snabbdom.hooksMod.UpdateHook
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  /* Inlined std.Partial<{  pre :snabbdom.snabbdom/build/package/hooks.PreHook,   create :snabbdom.snabbdom/build/package/hooks.CreateHook,   update :snabbdom.snabbdom/build/package/hooks.UpdateHook,   destroy :snabbdom.snabbdom/build/package/hooks.DestroyHook,   remove :snabbdom.snabbdom/build/package/hooks.RemoveHook,   post :snabbdom.snabbdom/build/package/hooks.PostHook}> */
  trait Module extends StObject {
    
    var create: js.UndefOr[CreateHook] = js.undefined
    
    var destroy: js.UndefOr[DestroyHook] = js.undefined
    
    var post: js.UndefOr[PostHook] = js.undefined
    
    var pre: js.UndefOr[PreHook] = js.undefined
    
    var remove: js.UndefOr[RemoveHook] = js.undefined
    
    var update: js.UndefOr[UpdateHook] = js.undefined
  }
  object Module {
    
    inline def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: /* vNode */ VNode_ => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setPost(value: () => js.Any): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: () => js.Any): Self = StObject.set(x, "pre", js.Any.fromFunction0(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
