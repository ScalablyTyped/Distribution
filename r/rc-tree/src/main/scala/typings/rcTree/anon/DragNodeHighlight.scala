package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragNodeHighlight extends StObject {
  
  var dragNodeHighlight: Boolean
}
object DragNodeHighlight {
  
  inline def apply(dragNodeHighlight: Boolean): DragNodeHighlight = {
    val __obj = js.Dynamic.literal(dragNodeHighlight = dragNodeHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragNodeHighlight]
  }
  
  extension [Self <: DragNodeHighlight](x: Self) {
    
    inline def setDragNodeHighlight(value: Boolean): Self = StObject.set(x, "dragNodeHighlight", value.asInstanceOf[js.Any])
  }
}
