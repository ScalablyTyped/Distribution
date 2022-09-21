package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchType extends StObject {
  
  var activeSplitter: Null | Double
  
  var dragging: Boolean
  
  var mouseDown: Boolean
}
object TouchType {
  
  inline def apply(dragging: Boolean, mouseDown: Boolean): TouchType = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any], activeSplitter = null)
    __obj.asInstanceOf[TouchType]
  }
  
  extension [Self <: TouchType](x: Self) {
    
    inline def setActiveSplitter(value: Double): Self = StObject.set(x, "activeSplitter", value.asInstanceOf[js.Any])
    
    inline def setActiveSplitterNull: Self = StObject.set(x, "activeSplitter", null)
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setMouseDown(value: Boolean): Self = StObject.set(x, "mouseDown", value.asInstanceOf[js.Any])
  }
}
