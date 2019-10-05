package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordLatencyRoutingPolicy extends js.Object {
  /**
    * An AWS region from which to measure latency. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-latency
    */
  var region: String
}

object RecordLatencyRoutingPolicy {
  @scala.inline
  def apply(region: String): RecordLatencyRoutingPolicy = {
    val __obj = js.Dynamic.literal(region = region)
  
    __obj.asInstanceOf[RecordLatencyRoutingPolicy]
  }
}

