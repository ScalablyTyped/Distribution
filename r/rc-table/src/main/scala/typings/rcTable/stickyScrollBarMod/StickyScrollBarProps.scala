package typings.rcTable.stickyScrollBarMod

import typings.rcTable.anon.`0`
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyScrollBarProps extends js.Object {
  
  var container: HTMLElement | Window = js.native
  
  var offsetScroll: Double = js.native
  
  def onScroll(params: `0`): Unit = js.native
  
  var scrollBodyRef: RefObject[HTMLDivElement] = js.native
}
object StickyScrollBarProps {
  
  @scala.inline
  def apply(
    container: HTMLElement | Window,
    offsetScroll: Double,
    onScroll: `0` => Unit,
    scrollBodyRef: RefObject[HTMLDivElement]
  ): StickyScrollBarProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyScrollBarProps]
  }
  
  @scala.inline
  implicit class StickyScrollBarPropsOps[Self <: StickyScrollBarProps] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: HTMLElement | Window): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScroll(value: Double): Self = this.set("offsetScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(value: `0` => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollBodyRef(value: RefObject[HTMLDivElement]): Self = this.set("scrollBodyRef", value.asInstanceOf[js.Any])
  }
}
