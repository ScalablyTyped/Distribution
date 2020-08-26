package typings.protractor.taskRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunResults extends js.Object {
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
  implicit class RunResultsOps[Self <: RunResults] (val x: Self) extends AnyVal {
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedCount(value: Double): Self = this.set("failedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecResultsVarargs(value: js.Any*): Self = this.set("specResults", js.Array(value :_*))
    @scala.inline
    def setSpecResults(value: js.Array[_]): Self = this.set("specResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecsVarargs(value: String*): Self = this.set("specs", js.Array(value :_*))
    @scala.inline
    def setSpecs(value: js.Array[String]): Self = this.set("specs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskId(value: Double): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
  
}

