package typings.atPulumiAws.typesInputMod.route53

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordLatencyRoutingPolicy extends js.Object {
  /**
    * An AWS region from which to measure latency. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-latency
    */
  var region: Input[String]
}

object RecordLatencyRoutingPolicy {
  @scala.inline
  def apply(region: Input[String]): RecordLatencyRoutingPolicy = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordLatencyRoutingPolicy]
  }
}

