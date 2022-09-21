package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerMainController extends StObject {
  
  def destroy(): Unit
  
  def handler(name: String): js.Function1[/* repeated */ Any, js.Promise[Any]]
  
  var maxWorkers: Double
  
  def send(args: Any*): js.Promise[Any]
}
object WorkerMainController {
  
  inline def apply(
    destroy: () => Unit,
    handler: String => js.Function1[/* repeated */ Any, js.Promise[Any]],
    maxWorkers: Double,
    send: /* repeated */ Any => js.Promise[Any]
  ): WorkerMainController = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), handler = js.Any.fromFunction1(handler), maxWorkers = maxWorkers.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[WorkerMainController]
  }
  
  extension [Self <: WorkerMainController](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setHandler(value: String => js.Function1[/* repeated */ Any, js.Promise[Any]]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setSend(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
