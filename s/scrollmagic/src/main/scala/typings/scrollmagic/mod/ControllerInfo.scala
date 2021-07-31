package typings.scrollmagic.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerInfo extends StObject {
  
  var container: Element | Null
  
  var isDocument: Boolean
  
  var scrollDirection: String
  
  var scrollPos: Double
  
  var size: Double
  
  var vertical: Boolean
}
object ControllerInfo {
  
  @scala.inline
  def apply(isDocument: Boolean, scrollDirection: String, scrollPos: Double, size: Double, vertical: Boolean): ControllerInfo = {
    val __obj = js.Dynamic.literal(isDocument = isDocument.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], container = null)
    __obj.asInstanceOf[ControllerInfo]
  }
  
  @scala.inline
  implicit class ControllerInfoMutableBuilder[Self <: ControllerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setIsDocument(value: Boolean): Self = StObject.set(x, "isDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: String): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPos(value: Double): Self = StObject.set(x, "scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
