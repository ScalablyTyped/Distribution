package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompiledCloudFormationTemplate extends js.Object {
  var compiledCloudFormationTemplate: AnonKey
  var name: String
  var region: String
  var runtime: js.UndefOr[String] = js.undefined
  var stage: String
  var timeout: js.UndefOr[Double] = js.undefined
  var versionFunctions: Boolean
}

object AnonCompiledCloudFormationTemplate {
  @scala.inline
  def apply(
    compiledCloudFormationTemplate: AnonKey,
    name: String,
    region: String,
    stage: String,
    versionFunctions: Boolean,
    runtime: String = null,
    timeout: Int | Double = null
  ): AnonCompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal(compiledCloudFormationTemplate = compiledCloudFormationTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], versionFunctions = versionFunctions.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompiledCloudFormationTemplate]
  }
}

