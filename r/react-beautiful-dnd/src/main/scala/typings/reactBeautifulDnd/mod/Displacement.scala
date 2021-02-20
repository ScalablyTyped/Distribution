package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Displacement extends StObject {
  
  var draggableId: DraggableId = js.native
  
  var shouldAnimate: Boolean = js.native
}
object Displacement {
  
  @scala.inline
  def apply(draggableId: DraggableId, shouldAnimate: Boolean): Displacement = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displacement]
  }
  
  @scala.inline
  implicit class DisplacementMutableBuilder[Self <: Displacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
  }
}
