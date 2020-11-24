package typings.reactMdUtils.useKeyboardMovementMod

import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardSearchMod.SearchData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardMovementOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends BaseKeyboardMovementOptions[D, CE, IE] {
  
  /**
    * The currently focused index within the item list. This will need to be
    * updated due to the `onChange` callback being called for this hook to work
    * as it is fully "controlled" by a parent hook/component.
    */
  var focusedIndex: Double = js.native
  
  /**
    * A required change event handler that will be called whenever a user types a
    * letter and it causes a new item to be "found". This should normally be
    * something that either updates the `aria-activedescendant` id to the new
    * found item's id or manually focus the item's DOM node.
    */
  @JSName("onChange")
  def onChange_MKeyboardMovementOptions(data: SearchData[D, CE], itemRefs: ItemRefList[IE]): Unit = js.native
}
object KeyboardMovementOptions {
  
  @scala.inline
  def apply[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    decrementKeys: js.Array[IncrementMovementKey],
    focusedIndex: Double,
    incrementKeys: js.Array[IncrementMovementKey],
    items: js.Array[D],
    jumpToFirstKeys: js.Array[JumpMovementKey],
    jumpToLastKeys: js.Array[JumpMovementKey],
    onChange: (SearchData[D, CE], ItemRefList[IE]) => Unit
  ): KeyboardMovementOptions[D, CE, IE] = {
    val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange))
    __obj.asInstanceOf[KeyboardMovementOptions[D, CE, IE]]
  }
  
  @scala.inline
  implicit class KeyboardMovementOptionsOps[Self <: KeyboardMovementOptions[_, _, _], D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] (val x: Self with (KeyboardMovementOptions[D, CE, IE])) extends AnyVal {
    
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
    def setFocusedIndex(value: Double): Self = this.set("focusedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: (SearchData[D, CE], ItemRefList[IE]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
  }
}
