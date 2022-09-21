package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emoticon extends StObject {
  
  var count: Double
  
  var name: String
  
  var time_last_used: js.Date | Null
  
  var time_received: js.Date | Null
  
  var use_count: Double
}
object Emoticon {
  
  inline def apply(count: Double, name: String, use_count: Double): Emoticon = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], use_count = use_count.asInstanceOf[js.Any], time_last_used = null, time_received = null)
    __obj.asInstanceOf[Emoticon]
  }
  
  extension [Self <: Emoticon](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTime_last_used(value: js.Date): Self = StObject.set(x, "time_last_used", value.asInstanceOf[js.Any])
    
    inline def setTime_last_usedNull: Self = StObject.set(x, "time_last_used", null)
    
    inline def setTime_received(value: js.Date): Self = StObject.set(x, "time_received", value.asInstanceOf[js.Any])
    
    inline def setTime_receivedNull: Self = StObject.set(x, "time_received", null)
    
    inline def setUse_count(value: Double): Self = StObject.set(x, "use_count", value.asInstanceOf[js.Any])
  }
}
