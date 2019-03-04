package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraySizeJobAttempts extends js.Object {
  var arraySize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var jobAttempts: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var jobDefinition: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var jobName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ArraySizeJobAttempts {
  @scala.inline
  def apply(
    jobDefinition: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    jobName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    arraySize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    jobAttempts: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_ArraySizeJobAttempts = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    if (arraySize != null) __obj.updateDynamic("arraySize")(arraySize.asInstanceOf[js.Any])
    if (jobAttempts != null) __obj.updateDynamic("jobAttempts")(jobAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArraySizeJobAttempts]
  }
}

