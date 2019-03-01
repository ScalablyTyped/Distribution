package typings
package atPulumiAwsLib.route53QueryLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLogState extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object QueryLogState {
  @scala.inline
  def apply(
    cloudwatchLogGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): QueryLogState = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLogGroupArn != null) __obj.updateDynamic("cloudwatchLogGroupArn")(cloudwatchLogGroupArn.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLogState]
  }
}

