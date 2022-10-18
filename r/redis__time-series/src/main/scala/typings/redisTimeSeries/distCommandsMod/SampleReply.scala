package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleReply extends StObject {
  
  var timestamp: Double
  
  var value: Double
}
object SampleReply {
  
  inline def apply(timestamp: Double, value: Double): SampleReply = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleReply]
  }
  
  extension [Self <: SampleReply](x: Self) {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
