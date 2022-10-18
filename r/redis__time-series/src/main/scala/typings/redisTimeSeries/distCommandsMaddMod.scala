package typings.redisTimeSeries

import typings.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsMaddMod {
  
  @JSImport("@redis/time-series/dist/commands/MADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/MADD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(toAdd: js.Array[MAddSample]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(toAdd.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[Double]]
  
  trait MAddSample extends StObject {
    
    var key: String
    
    var timestamp: Timestamp
    
    var value: Double
  }
  object MAddSample {
    
    inline def apply(key: String, timestamp: Timestamp, value: Double): MAddSample = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAddSample]
    }
    
    extension [Self <: MAddSample](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
