package typings.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverscanIndexRange extends StObject {
  
  var overscanStartIndex: Double
  
  var overscanStopIndex: Double
}
object OverscanIndexRange {
  
  inline def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndexRange = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndexRange]
  }
  
  extension [Self <: OverscanIndexRange](x: Self) {
    
    inline def setOverscanStartIndex(value: Double): Self = StObject.set(x, "overscanStartIndex", value.asInstanceOf[js.Any])
    
    inline def setOverscanStopIndex(value: Double): Self = StObject.set(x, "overscanStopIndex", value.asInstanceOf[js.Any])
  }
}
