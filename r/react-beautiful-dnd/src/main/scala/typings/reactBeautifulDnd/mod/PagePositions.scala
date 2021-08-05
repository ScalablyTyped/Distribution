package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagePositions extends StObject {
  
  var borderBoxCenter: Position
  
  // how much the page position has changed from the initial
  var offset: Position
  
  var selection: Position
}
object PagePositions {
  
  inline def apply(borderBoxCenter: Position, offset: Position, selection: Position): PagePositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePositions]
  }
  
  extension [Self <: PagePositions](x: Self) {
    
    inline def setBorderBoxCenter(value: Position): Self = StObject.set(x, "borderBoxCenter", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Position): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
