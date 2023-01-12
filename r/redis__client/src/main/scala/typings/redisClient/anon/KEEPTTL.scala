package typings.redisClient.anon

import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KEEPTTL extends StObject {
  
  var EX: Double
  
  var EXAT: Double
  
  var KEEPTTL: `true`
  
  var PX: Double
  
  var PXAT: Double
}
object KEEPTTL {
  
  inline def apply(EX: Double, EXAT: Double, PX: Double, PXAT: Double): KEEPTTL = {
    val __obj = js.Dynamic.literal(EX = EX.asInstanceOf[js.Any], EXAT = EXAT.asInstanceOf[js.Any], KEEPTTL = true, PX = PX.asInstanceOf[js.Any], PXAT = PXAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEEPTTL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KEEPTTL] (val x: Self) extends AnyVal {
    
    inline def setEX(value: Double): Self = StObject.set(x, "EX", value.asInstanceOf[js.Any])
    
    inline def setEXAT(value: Double): Self = StObject.set(x, "EXAT", value.asInstanceOf[js.Any])
    
    inline def setKEEPTTL(value: `true`): Self = StObject.set(x, "KEEPTTL", value.asInstanceOf[js.Any])
    
    inline def setPX(value: Double): Self = StObject.set(x, "PX", value.asInstanceOf[js.Any])
    
    inline def setPXAT(value: Double): Self = StObject.set(x, "PXAT", value.asInstanceOf[js.Any])
  }
}
