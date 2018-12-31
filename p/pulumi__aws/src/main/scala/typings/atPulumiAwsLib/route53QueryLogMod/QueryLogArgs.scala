package typings
package atPulumiAwsLib.route53QueryLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLogArgs extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

