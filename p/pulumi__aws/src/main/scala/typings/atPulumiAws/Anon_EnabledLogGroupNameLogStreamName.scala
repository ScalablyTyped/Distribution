package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledLogGroupNameLogStreamName extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var logGroupName: js.UndefOr[Input[String]] = js.undefined
  var logStreamName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EnabledLogGroupNameLogStreamName {
  @scala.inline
  def apply(
    enabled: Input[Boolean] = null,
    logGroupName: Input[String] = null,
    logStreamName: Input[String] = null
  ): Anon_EnabledLogGroupNameLogStreamName = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledLogGroupNameLogStreamName]
  }
}

