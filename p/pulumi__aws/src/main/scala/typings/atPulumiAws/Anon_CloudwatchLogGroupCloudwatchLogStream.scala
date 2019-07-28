package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupCloudwatchLogStream extends js.Object {
  var cloudwatchLogGroup: js.UndefOr[Input[String]] = js.undefined
  var cloudwatchLogStream: js.UndefOr[Input[String]] = js.undefined
  var enabled: Input[Boolean]
}

object Anon_CloudwatchLogGroupCloudwatchLogStream {
  @scala.inline
  def apply(
    enabled: Input[Boolean],
    cloudwatchLogGroup: Input[String] = null,
    cloudwatchLogStream: Input[String] = null
  ): Anon_CloudwatchLogGroupCloudwatchLogStream = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup.asInstanceOf[js.Any])
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogGroupCloudwatchLogStream]
  }
}

