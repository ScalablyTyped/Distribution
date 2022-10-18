package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LMPopOptions extends StObject {
  
  var COUNT: js.UndefOr[Double] = js.undefined
}
object LMPopOptions {
  
  inline def apply(): LMPopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LMPopOptions]
  }
  
  extension [Self <: LMPopOptions](x: Self) {
    
    inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
  }
}
