package typings.protractor

import typings.node.eventsMod.EventEmitter
import typings.protractor.configMod.Config
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskRunnerMod {
  
  @JSImport("protractor/built/taskRunner", "TaskRunner")
  @js.native
  open class TaskRunner protected () extends EventEmitter {
    def this(configFile: String, additionalConfig: Config, task: Any, runInFork: Boolean) = this()
    
    /* private */ var additionalConfig: Any = js.native
    
    /* private */ var configFile: Any = js.native
    
    /**
      * Sends the run command.
      * @return {q.Promise} A promise that will resolve when the task finishes
      *     running. The promise contains the following parameters representing the
      *     result of the run:
      *       taskId, specs, capabilities, failedCount, exitCode, specResults
      */
    def run(): Promise[Any] = js.native
    
    /* private */ var runInFork: Any = js.native
    
    /* private */ var task: Any = js.native
  }
  
  trait RunResults extends StObject {
    
    var capabilities: Any
    
    var exitCode: Double
    
    var failedCount: Double
    
    var specResults: js.Array[Any]
    
    var specs: js.Array[String]
    
    var taskId: Double
  }
  object RunResults {
    
    inline def apply(
      capabilities: Any,
      exitCode: Double,
      failedCount: Double,
      specResults: js.Array[Any],
      specs: js.Array[String],
      taskId: Double
    ): RunResults = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResults]
    }
    
    extension [Self <: RunResults](x: Self) {
      
      inline def setCapabilities(value: Any): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
      
      inline def setSpecResults(value: js.Array[Any]): Self = StObject.set(x, "specResults", value.asInstanceOf[js.Any])
      
      inline def setSpecResultsVarargs(value: Any*): Self = StObject.set(x, "specResults", js.Array(value*))
      
      inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
      
      inline def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
}
