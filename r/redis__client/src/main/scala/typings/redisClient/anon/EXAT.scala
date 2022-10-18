package typings.redisClient.anon

import typings.redisClient.distLibCommandsGetexMod.GetExModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXAT
  extends StObject
     with GetExModes {
  
  var EXAT: Double | js.Date
}
object EXAT {
  
  inline def apply(EXAT: Double | js.Date): EXAT = {
    val __obj = js.Dynamic.literal(EXAT = EXAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXAT]
  }
  
  extension [Self <: EXAT](x: Self) {
    
    inline def setEXAT(value: Double | js.Date): Self = StObject.set(x, "EXAT", value.asInstanceOf[js.Any])
  }
}
