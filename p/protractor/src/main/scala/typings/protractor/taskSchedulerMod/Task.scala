package typings.protractor.taskSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var capabilities: js.Any
  var done: js.Any
  var specs: js.Array[String]
  var taskId: String
}

object Task {
  @scala.inline
  def apply(capabilities: js.Any, done: js.Any, specs: js.Array[String], taskId: String): Task = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Task]
  }
}

