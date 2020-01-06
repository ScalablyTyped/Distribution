package typings.atPulumiAws.typesOutputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerAccessLogs extends js.Object {
  var bucket: String = js.native
  var enabled: Boolean = js.native
  var prefix: String = js.native
}

object GetLoadBalancerAccessLogs {
  @scala.inline
  def apply(bucket: String, enabled: Boolean, prefix: String): GetLoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoadBalancerAccessLogs]
  }
}

