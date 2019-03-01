package typings
package atPulumiAwsLib.route53QueryLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLogArgs extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object QueryLogArgs {
  @scala.inline
  def apply(
    cloudwatchLogGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): QueryLogArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloudwatchLogGroupArn")(cloudwatchLogGroupArn.asInstanceOf[js.Any])
    __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLogArgs]
  }
}

