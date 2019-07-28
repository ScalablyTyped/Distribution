package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogsRoleArnFieldLogLevel extends js.Object {
  var cloudwatchLogsRoleArn: Input[String]
  var fieldLogLevel: Input[String]
}

object Anon_CloudwatchLogsRoleArnFieldLogLevel {
  @scala.inline
  def apply(cloudwatchLogsRoleArn: Input[String], fieldLogLevel: Input[String]): Anon_CloudwatchLogsRoleArnFieldLogLevel = {
    val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CloudwatchLogsRoleArnFieldLogLevel]
  }
}

