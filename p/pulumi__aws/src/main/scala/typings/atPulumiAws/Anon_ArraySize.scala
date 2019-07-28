package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraySize extends js.Object {
  var arraySize: js.UndefOr[Double] = js.undefined
  var jobAttempts: js.UndefOr[Double] = js.undefined
  var jobDefinition: String
  var jobName: String
}

object Anon_ArraySize {
  @scala.inline
  def apply(
    jobDefinition: String,
    jobName: String,
    arraySize: Int | Double = null,
    jobAttempts: Int | Double = null
  ): Anon_ArraySize = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition, jobName = jobName)
    if (arraySize != null) __obj.updateDynamic("arraySize")(arraySize.asInstanceOf[js.Any])
    if (jobAttempts != null) __obj.updateDynamic("jobAttempts")(jobAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArraySize]
  }
}

