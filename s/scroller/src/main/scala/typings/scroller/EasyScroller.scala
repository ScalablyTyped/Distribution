package typings.scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EasyScroller extends js.Object {
  
  def bindEvents(): Unit = js.native
  
  def reflow(): Unit = js.native
  
  def render(): Unit = js.native
}
object EasyScroller {
  
  @scala.inline
  def apply(bindEvents: () => Unit, reflow: () => Unit, render: () => Unit): EasyScroller = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), reflow = js.Any.fromFunction0(reflow), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[EasyScroller]
  }
  
  @scala.inline
  implicit class EasyScrollerOps[Self <: EasyScroller] (val x: Self) extends AnyVal {
    
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
    def setBindEvents(value: () => Unit): Self = this.set("bindEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReflow(value: () => Unit): Self = this.set("reflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
  }
}
