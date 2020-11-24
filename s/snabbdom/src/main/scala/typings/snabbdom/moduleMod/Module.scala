package typings.snabbdom.moduleMod

import typings.snabbdom.hooksMod.CreateHook
import typings.snabbdom.hooksMod.DestroyHook
import typings.snabbdom.hooksMod.PostHook
import typings.snabbdom.hooksMod.PreHook
import typings.snabbdom.hooksMod.RemoveHook
import typings.snabbdom.hooksMod.UpdateHook
import typings.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  pre :snabbdom.snabbdom/build/package/hooks.PreHook,   create :snabbdom.snabbdom/build/package/hooks.CreateHook,   update :snabbdom.snabbdom/build/package/hooks.UpdateHook,   destroy :snabbdom.snabbdom/build/package/hooks.DestroyHook,   remove :snabbdom.snabbdom/build/package/hooks.RemoveHook,   post :snabbdom.snabbdom/build/package/hooks.PostHook}> */
@js.native
trait Module extends js.Object {
  
  var create: js.UndefOr[CreateHook] = js.native
  
  var destroy: js.UndefOr[DestroyHook] = js.native
  
  var post: js.UndefOr[PostHook] = js.native
  
  var pre: js.UndefOr[PreHook] = js.native
  
  var remove: js.UndefOr[RemoveHook] = js.native
  
  var update: js.UndefOr[UpdateHook] = js.native
}
object Module {
  
  @scala.inline
  def apply(): Module = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* vNode */ VNode_ => js.Any): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setPost(value: () => js.Any): Self = this.set("post", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPre(value: () => js.Any): Self = this.set("pre", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
