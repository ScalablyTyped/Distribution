package typings.remixRunRouter.distUtilsMod

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  * Arguments passed to route loader/action functions.  Same for now but we keep
  * this as a private implementation detail in case they diverge in the future.
  */
trait DataFunctionArgs extends StObject {
  
  var params: Params[String]
  
  var request: Request
}
object DataFunctionArgs {
  
  inline def apply(params: Params[String], request: Request): DataFunctionArgs = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFunctionArgs]
  }
  
  extension [Self <: DataFunctionArgs](x: Self) {
    
    inline def setParams(value: Params[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
