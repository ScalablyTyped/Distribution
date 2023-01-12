package typings.redisClient.distLibCommandsGenericTransformersMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZMPopOptions] (val x: Self) extends AnyVal {
    
    inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
  }
}
