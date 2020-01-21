package typings.protractor.taskRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunResults extends js.Object {
  var capabilities: js.Any
  var exitCode: Double
  var failedCount: Double
  var specResults: js.Array[_]
  var specs: js.Array[String]
  var taskId: Double
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
}

