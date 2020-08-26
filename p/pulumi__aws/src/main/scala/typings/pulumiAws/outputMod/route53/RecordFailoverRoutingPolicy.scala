package typings.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordFailoverRoutingPolicy extends js.Object {
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  var `type`: String = js.native
}

object RecordFailoverRoutingPolicy {
  @scala.inline
  def apply(`type`: String): RecordFailoverRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFailoverRoutingPolicy]
  }
  @scala.inline
  implicit class RecordFailoverRoutingPolicyOps[Self <: RecordFailoverRoutingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

