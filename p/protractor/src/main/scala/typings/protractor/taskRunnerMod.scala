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
  class TaskRunner protected () extends EventEmitter {
    def this(configFile: String, additionalConfig: Config, task: js.Any, runInFork: Boolean) = this()
    
    /* private */ var additionalConfig: js.Any = js.native
    
    /* private */ var configFile: js.Any = js.native
    
    /**
      * Sends the run command.
      * @return {q.Promise} A promise that will resolve when the task finishes
      *     running. The promise contains the following parameters representing the
      *     result of the run:
      *       taskId, specs, capabilities, failedCount, exitCode, specResults
      */
    def run(): Promise[js.Any] = js.native
    
    /* private */ var runInFork: js.Any = js.native
    
    /* private */ var task: js.Any = js.native
  }
  
  trait RunResults extends StObject {
    
    var capabilities: js.Any
    
    var exitCode: Double
    
    var failedCount: Double
    
    var specResults: js.Array[js.Any]
    
    var specs: js.Array[String]
    
    var taskId: Double
  }
  object RunResults {
    
    inline def apply(
      capabilities: js.Any,
      exitCode: Double,
      failedCount: Double,
      specResults: js.Array[js.Any],
      specs: js.Array[String],
      taskId: Double
    ): RunResults = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResults]
    }
    
    extension [Self <: RunResults](x: Self) {
      
      inline def setCapabilities(value: js.Any): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
      
      inline def setSpecResults(value: js.Array[js.Any]): Self = StObject.set(x, "specResults", value.asInstanceOf[js.Any])
      
      inline def setSpecResultsVarargs(value: js.Any*): Self = StObject.set(x, "specResults", js.Array(value :_*))
      
      inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      inline def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
}
