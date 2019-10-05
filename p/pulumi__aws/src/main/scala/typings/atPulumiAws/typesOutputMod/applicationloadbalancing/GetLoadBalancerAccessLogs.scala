package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerAccessLogs extends js.Object {
  var bucket: String
  var enabled: Boolean
  var prefix: String
}

object GetLoadBalancerAccessLogs {
  @scala.inline
  def apply(bucket: String, enabled: Boolean, prefix: String): GetLoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket, enabled = enabled, prefix = prefix)
  
    __obj.asInstanceOf[GetLoadBalancerAccessLogs]
  }
}

