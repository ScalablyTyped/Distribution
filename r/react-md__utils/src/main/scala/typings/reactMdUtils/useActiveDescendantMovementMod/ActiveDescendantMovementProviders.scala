package typings.reactMdUtils.useActiveDescendantMovementMod

import typings.react.mod.Dispatch
import typings.react.mod.KeyboardEvent
import typings.react.mod.SetStateAction
import typings.reactMdUtils.useKeyboardMovementMod.ItemRef
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.reactMdUtils.useKeyboardMovementMod.MovementHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveDescendantMovementProviders[CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends js.Object {
  
  var activeId: ActiveDescendantId = js.native
  
  var focusedIndex: Double = js.native
  
  var itemRefs: ItemRefList[IE] = js.native
  
  var onKeyDown: MovementHandler[CE] = js.native
  
  var setFocusedIndex: Dispatch[SetStateAction[Double]] = js.native
}
object ActiveDescendantMovementProviders {
  
  @scala.inline
  def apply[CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    activeId: ActiveDescendantId,
    focusedIndex: Double,
    itemRefs: ItemRefList[IE],
    onKeyDown: KeyboardEvent[CE] => Unit,
    setFocusedIndex: SetStateAction[Double] => Unit
  ): ActiveDescendantMovementProviders[CE, IE] = {
    val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], itemRefs = itemRefs.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), setFocusedIndex = js.Any.fromFunction1(setFocusedIndex))
    __obj.asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  }
  
  @scala.inline
  implicit class ActiveDescendantMovementProvidersOps[Self <: ActiveDescendantMovementProviders[_, _], CE /* <: HTMLElement */, IE /* <: HTMLElement */] (val x: Self with (ActiveDescendantMovementProviders[CE, IE])) extends AnyVal {
    
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
    def setActiveId(value: ActiveDescendantId): Self = this.set("activeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedIndex(value: Double): Self = this.set("focusedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefsVarargs(value: ItemRef[IE]*): Self = this.set("itemRefs", js.Array(value :_*))
    
    @scala.inline
    def setItemRefs(value: ItemRefList[IE]): Self = this.set("itemRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[CE] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFocusedIndex(value: SetStateAction[Double] => Unit): Self = this.set("setFocusedIndex", js.Any.fromFunction1(value))
  }
}
