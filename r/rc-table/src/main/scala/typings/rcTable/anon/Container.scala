package typings.rcTable.anon

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
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
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Window | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHeader(value: Double): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
  }
}
