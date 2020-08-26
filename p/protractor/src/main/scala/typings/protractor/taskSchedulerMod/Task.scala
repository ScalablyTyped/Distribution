package typings.protractor.taskSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
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
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilities(value: js.Any): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: js.Any): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecsVarargs(value: String*): Self = this.set("specs", js.Array(value :_*))
    @scala.inline
    def setSpecs(value: js.Array[String]): Self = this.set("specs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
  
}

