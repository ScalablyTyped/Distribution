package typings.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsProcessingData extends StObject {
  
  var isProcessingData: js.Array[Any]
  
  var isProfiling: js.Array[Any]
  
  var profilingData: js.Array[Any]
}
object IsProcessingData {
  
  inline def apply(isProcessingData: js.Array[Any], isProfiling: js.Array[Any], profilingData: js.Array[Any]): IsProcessingData = {
    val __obj = js.Dynamic.literal(isProcessingData = isProcessingData.asInstanceOf[js.Any], isProfiling = isProfiling.asInstanceOf[js.Any], profilingData = profilingData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsProcessingData]
  }
  
  extension [Self <: IsProcessingData](x: Self) {
    
    inline def setIsProcessingData(value: js.Array[Any]): Self = StObject.set(x, "isProcessingData", value.asInstanceOf[js.Any])
    
    inline def setIsProcessingDataVarargs(value: Any*): Self = StObject.set(x, "isProcessingData", js.Array(value*))
    
    inline def setIsProfiling(value: js.Array[Any]): Self = StObject.set(x, "isProfiling", value.asInstanceOf[js.Any])
    
    inline def setIsProfilingVarargs(value: Any*): Self = StObject.set(x, "isProfiling", js.Array(value*))
    
    inline def setProfilingData(value: js.Array[Any]): Self = StObject.set(x, "profilingData", value.asInstanceOf[js.Any])
    
    inline def setProfilingDataVarargs(value: Any*): Self = StObject.set(x, "profilingData", js.Array(value*))
  }
}
