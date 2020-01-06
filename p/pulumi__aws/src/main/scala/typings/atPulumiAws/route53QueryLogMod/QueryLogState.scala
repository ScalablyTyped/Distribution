package typings.atPulumiAws.route53QueryLogMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLogState extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object QueryLogState {
  @scala.inline
  def apply(cloudwatchLogGroupArn: Input[String] = null, zoneId: Input[String] = null): QueryLogState = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLogGroupArn != null) __obj.updateDynamic("cloudwatchLogGroupArn")(cloudwatchLogGroupArn.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLogState]
  }
}

