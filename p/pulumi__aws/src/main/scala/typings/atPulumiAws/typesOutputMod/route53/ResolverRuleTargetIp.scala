package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRuleTargetIp extends js.Object {
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var ip: String
  /**
    * The port at `ip` that you want to forward DNS queries to. Default value is `53`
    */
  var port: js.UndefOr[Double] = js.undefined
}

object ResolverRuleTargetIp {
  @scala.inline
  def apply(ip: String, port: Int | Double = null): ResolverRuleTargetIp = {
    val __obj = js.Dynamic.literal(ip = ip)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleTargetIp]
  }
}

