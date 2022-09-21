package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerRunnerOptions extends StObject {
  
  var isLongRunningTask: js.UndefOr[Boolean] = js.undefined
  
  var workerKey: js.UndefOr[String] = js.undefined
}
object WorkerRunnerOptions {
  
  inline def apply(): WorkerRunnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerRunnerOptions]
  }
  
  extension [Self <: WorkerRunnerOptions](x: Self) {
    
    inline def setIsLongRunningTask(value: Boolean): Self = StObject.set(x, "isLongRunningTask", value.asInstanceOf[js.Any])
    
    inline def setIsLongRunningTaskUndefined: Self = StObject.set(x, "isLongRunningTask", js.undefined)
    
    inline def setWorkerKey(value: String): Self = StObject.set(x, "workerKey", value.asInstanceOf[js.Any])
    
    inline def setWorkerKeyUndefined: Self = StObject.set(x, "workerKey", js.undefined)
  }
}
