package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerOptions extends StObject {
  
  var logger: js.UndefOr[Logger] = js.undefined
  
  var maxConcurrentTasksPerWorker: js.UndefOr[Double] = js.undefined
  
  var maxConcurrentWorkers: js.UndefOr[Double] = js.undefined
}
object WorkerOptions {
  
  inline def apply(): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerOptions]
  }
  
  extension [Self <: WorkerOptions](x: Self) {
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "maxConcurrentTasksPerWorker", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentTasksPerWorkerUndefined: Self = StObject.set(x, "maxConcurrentTasksPerWorker", js.undefined)
    
    inline def setMaxConcurrentWorkers(value: Double): Self = StObject.set(x, "maxConcurrentWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentWorkersUndefined: Self = StObject.set(x, "maxConcurrentWorkers", js.undefined)
  }
}
