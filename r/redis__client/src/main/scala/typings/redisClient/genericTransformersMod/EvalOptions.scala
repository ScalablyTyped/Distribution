package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvalOptions extends StObject {
  
  var arguments: js.UndefOr[js.Array[String]] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
}
object EvalOptions {
  
  inline def apply(): EvalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvalOptions]
  }
  
  extension [Self <: EvalOptions](x: Self) {
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
