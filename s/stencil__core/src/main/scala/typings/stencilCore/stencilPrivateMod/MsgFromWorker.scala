package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsgFromWorker extends StObject {
  
  var stencilId: js.UndefOr[Double] = js.undefined
  
  var stencilRtnError: String
  
  var stencilRtnValue: Any
}
object MsgFromWorker {
  
  inline def apply(stencilRtnError: String, stencilRtnValue: Any): MsgFromWorker = {
    val __obj = js.Dynamic.literal(stencilRtnError = stencilRtnError.asInstanceOf[js.Any], stencilRtnValue = stencilRtnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgFromWorker]
  }
  
  extension [Self <: MsgFromWorker](x: Self) {
    
    inline def setStencilId(value: Double): Self = StObject.set(x, "stencilId", value.asInstanceOf[js.Any])
    
    inline def setStencilIdUndefined: Self = StObject.set(x, "stencilId", js.undefined)
    
    inline def setStencilRtnError(value: String): Self = StObject.set(x, "stencilRtnError", value.asInstanceOf[js.Any])
    
    inline def setStencilRtnValue(value: Any): Self = StObject.set(x, "stencilRtnValue", value.asInstanceOf[js.Any])
  }
}
