package typings.rcTable.anon

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  var container: Window | HTMLElement = js.native
  
  var isSticky: Boolean = js.native
  
  var offsetHeader: Double = js.native
  
  var offsetScroll: Double = js.native
  
  var stickyClassName: String = js.native
}
object Container {
  
  @scala.inline
  def apply(
    container: Window | HTMLElement,
    isSticky: Boolean,
    offsetHeader: Double,
    offsetScroll: Double,
    stickyClassName: String
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], offsetHeader = offsetHeader.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], stickyClassName = stickyClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: Window | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSticky(value: Boolean): Self = this.set("isSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHeader(value: Double): Self = this.set("offsetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScroll(value: Double): Self = this.set("offsetScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyClassName(value: String): Self = this.set("stickyClassName", value.asInstanceOf[js.Any])
  }
}
