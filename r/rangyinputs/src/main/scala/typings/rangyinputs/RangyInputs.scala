package typings.rangyinputs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangyInputs {
  
  trait Selection extends StObject {
    
    /**  The character index of the end position of the selection */
    var end: Double
    
    /** The number of characters selected */
    var length: Double
    
    /** The character index of the start position of the selection */
    var start: Double
    
    /** The selected Text */
    var text: String
  }
  object Selection {
    
    inline def apply(end: Double, length: Double, start: Double, text: String): Selection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    extension [Self <: Selection](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
