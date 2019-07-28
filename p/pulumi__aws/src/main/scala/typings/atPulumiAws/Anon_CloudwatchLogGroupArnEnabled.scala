package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupArnEnabled extends js.Object {
  var cloudwatchLogGroupArn: Input[String]
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var logType: Input[String]
}

object Anon_CloudwatchLogGroupArnEnabled {
  @scala.inline
  def apply(cloudwatchLogGroupArn: Input[String], logType: Input[String], enabled: Input[Boolean] = null): Anon_CloudwatchLogGroupArnEnabled = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLogGroupArnEnabled]
  }
}

