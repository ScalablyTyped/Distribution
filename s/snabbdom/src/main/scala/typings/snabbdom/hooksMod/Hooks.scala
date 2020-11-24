package typings.snabbdom.hooksMod

import typings.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hooks extends js.Object {
  
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
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    
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
    def setInit(value: /* vNode */ VNode_ => js.Any): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setInsert(value: /* vNode */ VNode_ => js.Any): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setPost(value: () => js.Any): Self = this.set("post", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPostpatch(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = this.set("postpatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostpatch: Self = this.set("postpatch", js.undefined)
    
    @scala.inline
    def setPre(value: () => js.Any): Self = this.set("pre", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    
    @scala.inline
    def setPrepatch(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = this.set("prepatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrepatch: Self = this.set("prepatch", js.undefined)
    
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
