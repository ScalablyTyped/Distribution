package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupArnEnabled extends js.Object {
  var cloudwatchLogGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var logType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CloudwatchLogGroupArnEnabled {
  @scala.inline
  def apply(
    cloudwatchLogGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    logType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_CloudwatchLogGroupArnEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloudwatchLogGroupArn")(cloudwatchLogGroupArn.asInstanceOf[js.Any])
    __obj.updateDynamic("logType")(logType.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogGroupArnEnabled]
  }
}

