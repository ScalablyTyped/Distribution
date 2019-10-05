package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordFailoverRoutingPolicy extends js.Object {
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  var `type`: String
}

object RecordFailoverRoutingPolicy {
  @scala.inline
  def apply(`type`: String): RecordFailoverRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecordFailoverRoutingPolicy]
  }
}

