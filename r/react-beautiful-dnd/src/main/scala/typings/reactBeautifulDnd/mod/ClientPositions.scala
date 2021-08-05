package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPositions extends StObject {
  
  // the current center of the item
  var borderBoxCenter: Position
  
  // how far the item has moved from its original position
  var offset: Position
  
  // where the user initially selected
  // This point is not used to calculate the impact of a dragging item
  // It is used to calculate the offset from the initial selection point
  var selection: Position
}
object ClientPositions {
  
  inline def apply(borderBoxCenter: Position, offset: Position, selection: Position): ClientPositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPositions]
  }
  
  extension [Self <: ClientPositions](x: Self) {
    
    inline def setBorderBoxCenter(value: Position): Self = StObject.set(x, "borderBoxCenter", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Position): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
