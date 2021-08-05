package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollDifference extends StObject {
  
  // The actual displacement as a result of a scroll is in the opposite
  // direction to the scroll itself. When scrolling down items are displaced
  // upwards. This value is the negated version of the 'value'
  var displacement: Position
  
  var value: Position
}
object ScrollDifference {
  
  inline def apply(displacement: Position, value: Position): ScrollDifference = {
    val __obj = js.Dynamic.literal(displacement = displacement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDifference]
  }
  
  extension [Self <: ScrollDifference](x: Self) {
    
    inline def setDisplacement(value: Position): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Position): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
