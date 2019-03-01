package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraySize extends js.Object {
  var arraySize: js.UndefOr[scala.Double] = js.undefined
  var jobAttempts: js.UndefOr[scala.Double] = js.undefined
  var jobDefinition: java.lang.String
  var jobName: java.lang.String
}

object Anon_ArraySize {
  @scala.inline
  def apply(
    jobDefinition: java.lang.String,
    jobName: java.lang.String,
    arraySize: scala.Int | scala.Double = null,
    jobAttempts: scala.Int | scala.Double = null
  ): Anon_ArraySize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobDefinition")(jobDefinition)
    __obj.updateDynamic("jobName")(jobName)
    if (arraySize != null) __obj.updateDynamic("arraySize")(arraySize.asInstanceOf[js.Any])
    if (jobAttempts != null) __obj.updateDynamic("jobAttempts")(jobAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArraySize]
  }
}

