package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledCloudFormationTemplate extends js.Object {
  var compiledCloudFormationTemplate: Outputs
  var name: String
  var region: String
  var runtime: js.UndefOr[String] = js.undefined
  var stage: String
  var timeout: js.UndefOr[Double] = js.undefined
  var versionFunctions: Boolean
}

object CompiledCloudFormationTemplate {
  @scala.inline
  def apply(
    compiledCloudFormationTemplate: Outputs,
    name: String,
    region: String,
    stage: String,
    versionFunctions: Boolean,
    runtime: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): CompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal(compiledCloudFormationTemplate = compiledCloudFormationTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], versionFunctions = versionFunctions.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledCloudFormationTemplate]
  }
}

