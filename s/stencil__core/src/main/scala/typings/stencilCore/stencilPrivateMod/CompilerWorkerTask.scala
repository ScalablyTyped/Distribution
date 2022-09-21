package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerWorkerTask extends StObject {
  
  var inputArgs: js.UndefOr[js.Array[Any]] = js.undefined
  
  def reject(msg: String): Any
  
  def resolve(`val`: Any): Any
  
  var retries: js.UndefOr[Double] = js.undefined
  
  var stencilId: js.UndefOr[Double] = js.undefined
}
object CompilerWorkerTask {
  
  inline def apply(reject: String => Any, resolve: Any => Any): CompilerWorkerTask = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[CompilerWorkerTask]
  }
  
  extension [Self <: CompilerWorkerTask](x: Self) {
    
    inline def setInputArgs(value: js.Array[Any]): Self = StObject.set(x, "inputArgs", value.asInstanceOf[js.Any])
    
    inline def setInputArgsUndefined: Self = StObject.set(x, "inputArgs", js.undefined)
    
    inline def setInputArgsVarargs(value: Any*): Self = StObject.set(x, "inputArgs", js.Array(value*))
    
    inline def setReject(value: String => Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    inline def setResolve(value: Any => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setStencilId(value: Double): Self = StObject.set(x, "stencilId", value.asInstanceOf[js.Any])
    
    inline def setStencilIdUndefined: Self = StObject.set(x, "stencilId", js.undefined)
  }
}
