package typings.redisTimeSeries.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesPerSample extends StObject {
  
  var bytesPerSample: String
  
  var endTimestamp: Double
  
  var samples: Double
  
  var size: Double
  
  var startTimestamp: Double
}
object BytesPerSample {
  
  inline def apply(
    bytesPerSample: String,
    endTimestamp: Double,
    samples: Double,
    size: Double,
    startTimestamp: Double
  ): BytesPerSample = {
    val __obj = js.Dynamic.literal(bytesPerSample = bytesPerSample.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesPerSample]
  }
  
  extension [Self <: BytesPerSample](x: Self) {
    
    inline def setBytesPerSample(value: String): Self = StObject.set(x, "bytesPerSample", value.asInstanceOf[js.Any])
    
    inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
  }
}
