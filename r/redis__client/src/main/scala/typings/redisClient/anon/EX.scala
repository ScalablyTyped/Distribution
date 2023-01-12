package typings.redisClient.anon

import typings.redisClient.distLibCommandsGetexMod.GetExModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EX
  extends StObject
     with GetExModes {
  
  var EX: Double
}
object EX {
  
  inline def apply(EX: Double): EX = {
    val __obj = js.Dynamic.literal(EX = EX.asInstanceOf[js.Any])
    __obj.asInstanceOf[EX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EX] (val x: Self) extends AnyVal {
    
    inline def setEX(value: Double): Self = StObject.set(x, "EX", value.asInstanceOf[js.Any])
  }
}
