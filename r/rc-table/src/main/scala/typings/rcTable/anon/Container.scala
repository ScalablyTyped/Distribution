package typings.rcTable.anon

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Window | HTMLElement
  
  var isSticky: Boolean
  
  var offsetHeader: Double
  
  var offsetScroll: Double
  
  var offsetSummary: Double
  
  var stickyClassName: String
}
object Container {
  
  inline def apply(
    container: Window | HTMLElement,
    isSticky: Boolean,
    offsetHeader: Double,
    offsetScroll: Double,
    offsetSummary: Double,
    stickyClassName: String
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], offsetHeader = offsetHeader.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], offsetSummary = offsetSummary.asInstanceOf[js.Any], stickyClassName = stickyClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Window | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setOffsetHeader(value: Double): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
    
    inline def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
    
    inline def setOffsetSummary(value: Double): Self = StObject.set(x, "offsetSummary", value.asInstanceOf[js.Any])
    
    inline def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
  }
}
