package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraySizeJobAttempts extends js.Object {
  var arraySize: js.UndefOr[Input[Double]] = js.undefined
  var jobAttempts: js.UndefOr[Input[Double]] = js.undefined
  var jobDefinition: Input[String]
  var jobName: Input[String]
}

object Anon_ArraySizeJobAttempts {
  @scala.inline
  def apply(
    jobDefinition: Input[String],
    jobName: Input[String],
    arraySize: Input[Double] = null,
    jobAttempts: Input[Double] = null
  ): Anon_ArraySizeJobAttempts = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    if (arraySize != null) __obj.updateDynamic("arraySize")(arraySize.asInstanceOf[js.Any])
    if (jobAttempts != null) __obj.updateDynamic("jobAttempts")(jobAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArraySizeJobAttempts]
  }
}

