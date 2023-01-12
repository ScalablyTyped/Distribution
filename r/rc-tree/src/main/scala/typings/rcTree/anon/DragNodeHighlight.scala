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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragNodeHighlight] (val x: Self) extends AnyVal {
    
    inline def setDragNodeHighlight(value: Boolean): Self = StObject.set(x, "dragNodeHighlight", value.asInstanceOf[js.Any])
  }
}
