package typings.protractor.builtTaskSchedulerMod

import typings.protractor.builtConfigMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/taskScheduler", "TaskScheduler")
@js.native
class TaskScheduler protected () extends js.Object {
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
  var rotationIndex: Double = js.native
  var taskQueues: js.Array[TaskQueue] = js.native
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
}

