package typings
package serverlessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompiledCloudFormationTemplate extends js.Object {
  var compiledCloudFormationTemplate: Anon_Resources
  var name: java.lang.String
  var region: java.lang.String
  var runtime: js.UndefOr[java.lang.String] = js.undefined
  var stage: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var versionFunctions: scala.Boolean
}

object Anon_CompiledCloudFormationTemplate {
  @scala.inline
  def apply(
    compiledCloudFormationTemplate: Anon_Resources,
    name: java.lang.String,
    region: java.lang.String,
    stage: java.lang.String,
    versionFunctions: scala.Boolean,
    runtime: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Anon_CompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compiledCloudFormationTemplate")(compiledCloudFormationTemplate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("versionFunctions")(versionFunctions)
    if (runtime != null) __obj.updateDynamic("runtime")(runtime)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompiledCloudFormationTemplate]
  }
}

