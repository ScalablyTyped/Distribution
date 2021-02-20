package typings.protractor

import typings.protractor.configMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskSchedulerMod {
  
  @JSImport("protractor/built/taskScheduler", "TaskQueue")
  @js.native
  class TaskQueue protected () extends StObject {
    def this(capabilities: js.Any, specLists: js.Any) = this()
    
    var capabilities: js.Any = js.native
    
    var maxInstance: Double = js.native
    
    var numRunningInstances: Double = js.native
    
    var specLists: js.Any = js.native
    
    var specsIndex: Double = js.native
  }
  
  @JSImport("protractor/built/taskScheduler", "TaskScheduler")
  @js.native
  class TaskScheduler protected () extends StObject {
    /**
      * A scheduler to keep track of specs that need running and their associated
      * capabilities. It will suggest a task (combination of capabilities and spec)
      * to run while observing the following config rules:
      * multiCapabilities, shardTestFiles, and maxInstance.
      * Precondition: multiCapabilities is a non-empty array
      * (capabilities and getCapabilities will both be ignored)
      *
      * @constructor
      * @param {Object} config parsed from the config file
      */
    def this(config: Config) = this()
    
    var config: js.Any = js.native
    
    /**
      * Returns number of tasks currently running.
      *
      * @return {number}
      */
    def countActiveTasks(): Double = js.native
    
    /**
      * Get maximum number of concurrent tasks required/permitted.
      *
      * @return {number}
      */
    def maxConcurrentTasks(): Double = js.native
    
    /**
      * Get the next task that is allowed to run without going over maxInstance.
      *
      * @return {{capabilities: Object, specs: Array.<string>, taskId: string,
      * done: function()}}
      */
    def nextTask(): Task = js.native
    
    /**
      * Get the number of tasks left to run or are currently running.
      *
      * @return {number}
      */
    def numTasksOutstanding(): Double = js.native
    
    var rotationIndex: Double = js.native
    
    var taskQueues: js.Array[TaskQueue] = js.native
  }
  
  @js.native
  trait Task extends StObject {
    
    var capabilities: js.Any = js.native
    
    var done: js.Any = js.native
    
    var specs: js.Array[String] = js.native
    
    var taskId: String = js.native
  }
  object Task {
    
    @scala.inline
    def apply(capabilities: js.Any, done: js.Any, specs: js.Array[String], taskId: String): Task = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: js.Any): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDone(value: js.Any): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      @scala.inline
      def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
}
