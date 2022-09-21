package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerTask extends StObject {
  
  var args: js.Array[Any]
  
  var isLongRunningTask: Boolean
  
  var method: String
  
  def reject(msg: String): Any
  
  def resolve(`val`: Any): Any
  
  var retries: Double
  
  var taskId: Double
  
  var workerKey: String
}
object WorkerTask {
  
  inline def apply(
    args: js.Array[Any],
    isLongRunningTask: Boolean,
    method: String,
    reject: String => Any,
    resolve: Any => Any,
    retries: Double,
    taskId: Double,
    workerKey: String
  ): WorkerTask = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isLongRunningTask = isLongRunningTask.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve), retries = retries.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], workerKey = workerKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerTask]
  }
  
  extension [Self <: WorkerTask](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setIsLongRunningTask(value: Boolean): Self = StObject.set(x, "isLongRunningTask", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setReject(value: String => Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    inline def setResolve(value: Any => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setWorkerKey(value: String): Self = StObject.set(x, "workerKey", value.asInstanceOf[js.Any])
  }
}
