package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupCloudwatchLogStream extends js.Object {
  var cloudwatchLogGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var cloudwatchLogStream: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
}

object Anon_CloudwatchLogGroupCloudwatchLogStream {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    cloudwatchLogGroup: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cloudwatchLogStream: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CloudwatchLogGroupCloudwatchLogStream = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup.asInstanceOf[js.Any])
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogGroupCloudwatchLogStream]
  }
}

