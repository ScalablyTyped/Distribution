package typings.reactMdTabs.useTabsMovementMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactMdUtils.useKeyboardMovementMod.ItemRef
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValue extends js.Object {
  var handleClick: MouseEventHandler[HTMLDivElement] = js.native
  var handleKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  var itemRefs: ItemRefList[HTMLElement] = js.native
  var tabs: js.Array[ReactNode] = js.native
}

object ReturnValue {
  @scala.inline
  def apply(
    handleClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
    handleKeyDown: KeyboardEvent[HTMLDivElement] => Unit,
    itemRefs: ItemRefList[HTMLElement],
    tabs: js.Array[ReactNode]
  ): ReturnValue = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), handleKeyDown = js.Any.fromFunction1(handleKeyDown), itemRefs = itemRefs.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
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
    def setHandleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("handleClick", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("handleKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setItemRefsVarargs(value: ItemRef[HTMLElement]*): Self = this.set("itemRefs", js.Array(value :_*))
    @scala.inline
    def setItemRefs(value: ItemRefList[HTMLElement]): Self = this.set("itemRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsVarargs(value: ReactNode*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[ReactNode]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
  
}

