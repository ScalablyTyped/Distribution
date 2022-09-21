package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsgToWorker extends StObject {
  
  var args: js.Array[Any]
  
  var stencilId: Double
}
object MsgToWorker {
  
  inline def apply(args: js.Array[Any], stencilId: Double): MsgToWorker = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stencilId = stencilId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgToWorker]
  }
  
  extension [Self <: MsgToWorker](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setStencilId(value: Double): Self = StObject.set(x, "stencilId", value.asInstanceOf[js.Any])
  }
}
