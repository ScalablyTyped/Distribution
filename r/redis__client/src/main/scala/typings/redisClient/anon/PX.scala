package typings.redisClient.anon

import typings.redisClient.getexMod.GetExModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PX
  extends StObject
     with GetExModes {
  
  var PX: Double
}
object PX {
  
  inline def apply(PX: Double): PX = {
    val __obj = js.Dynamic.literal(PX = PX.asInstanceOf[js.Any])
    __obj.asInstanceOf[PX]
  }
  
  extension [Self <: PX](x: Self) {
    
    inline def setPX(value: Double): Self = StObject.set(x, "PX", value.asInstanceOf[js.Any])
  }
}
