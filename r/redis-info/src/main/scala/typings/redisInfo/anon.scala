package typings.redisInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Calls extends StObject {
    
    var calls: Double
    
    var usec: Double
    
    var usec_per_call: Double
  }
  object Calls {
    
    inline def apply(calls: Double, usec: Double, usec_per_call: Double): Calls = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], usec = usec.asInstanceOf[js.Any], usec_per_call = usec_per_call.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calls]
    }
    
    extension [Self <: Calls](x: Self) {
      
      inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setUsec(value: Double): Self = StObject.set(x, "usec", value.asInstanceOf[js.Any])
      
      inline def setUsec_per_call(value: Double): Self = StObject.set(x, "usec_per_call", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expires extends StObject {
    
    var expires: Double
    
    var keys: Double
  }
  object Expires {
    
    inline def apply(expires: Double, keys: Double): Expires = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expires]
    }
    
    extension [Self <: Expires](x: Self) {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Double): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
}
