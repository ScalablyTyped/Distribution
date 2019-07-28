package typings.atPulumiAws.route53QueryLogMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLogArgs extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: Input[String]
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: Input[String]
}

object QueryLogArgs {
  @scala.inline
  def apply(cloudwatchLogGroupArn: Input[String], zoneId: Input[String]): QueryLogArgs = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryLogArgs]
  }
}

