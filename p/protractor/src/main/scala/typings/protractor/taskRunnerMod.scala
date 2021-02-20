package typings.protractor

import typings.node.eventsMod.EventEmitter
import typings.protractor.configMod.Config
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskRunnerMod {
  
  @JSImport("protractor/built/taskRunner", "TaskRunner")
  @js.native
  class TaskRunner protected () extends EventEmitter {
    def this(configFile: String, additionalConfig: Config, task: js.Any, runInFork: Boolean) = this()
    
    var additionalConfig: js.Any = js.native
    
    var configFile: js.Any = js.native
    
    /**
      * Sends the run command.
      * @return {q.Promise} A promise that will resolve when the task finishes
      *     running. The promise contains the following parameters representing the
      *     result of the run:
      *       taskId, specs, capabilities, failedCount, exitCode, specResults
      */
    def run(): Promise[_] = js.native
    
    var runInFork: js.Any = js.native
    
    var task: js.Any = js.native
  }
  
  @js.native
  trait RunResults extends StObject {
    
    var capabilities: js.Any = js.native
    
    var exitCode: Double = js.native
    
    var failedCount: Double = js.native
    
    var specResults: js.Array[_] = js.native
    
    var specs: js.Array[String] = js.native
    
    var taskId: Double = js.native
  }
  object RunResults {
    
    @scala.inline
    def apply(
      capabilities: js.Any,
      exitCode: Double,
      failedCount: Double,
      specResults: js.Array[_],
      specs: js.Array[String],
      taskId: Double
    ): RunResults = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResults]
    }
    
    @scala.inline
    implicit class RunResultsMutableBuilder[Self <: RunResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: js.Any): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecResults(value: js.Array[_]): Self = StObject.set(x, "specResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecResultsVarargs(value: js.Any*): Self = StObject.set(x, "specResults", js.Array(value :_*))
      
      @scala.inline
      def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      @scala.inline
      def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
}
