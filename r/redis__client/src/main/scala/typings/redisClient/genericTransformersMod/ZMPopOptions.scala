package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZMPopOptions extends StObject {
  
  var COUNT: js.UndefOr[Double] = js.undefined
}
object ZMPopOptions {
  
  inline def apply(): ZMPopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZMPopOptions]
  }
  
  extension [Self <: ZMPopOptions](x: Self) {
    
    inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
  }
}
