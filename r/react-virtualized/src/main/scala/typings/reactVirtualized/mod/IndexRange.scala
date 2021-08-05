package typings.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexRange extends StObject {
  
  var startIndex: Double
  
  var stopIndex: Double
}
object IndexRange {
  
  inline def apply(startIndex: Double, stopIndex: Double): IndexRange = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexRange]
  }
  
  extension [Self <: IndexRange](x: Self) {
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStopIndex(value: Double): Self = StObject.set(x, "stopIndex", value.asInstanceOf[js.Any])
  }
}
