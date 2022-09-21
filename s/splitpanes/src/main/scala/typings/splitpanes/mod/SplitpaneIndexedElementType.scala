package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneIndexedElementType extends StObject {
  
  var givenSize: Double | Null
  
  var id: Double
  
  var index: Double
  
  var max: Double
  
  var min: Double
  
  var size: Double
}
object SplitpaneIndexedElementType {
  
  inline def apply(id: Double, index: Double, max: Double, min: Double, size: Double): SplitpaneIndexedElementType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], givenSize = null)
    __obj.asInstanceOf[SplitpaneIndexedElementType]
  }
  
  extension [Self <: SplitpaneIndexedElementType](x: Self) {
    
    inline def setGivenSize(value: Double): Self = StObject.set(x, "givenSize", value.asInstanceOf[js.Any])
    
    inline def setGivenSizeNull: Self = StObject.set(x, "givenSize", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
