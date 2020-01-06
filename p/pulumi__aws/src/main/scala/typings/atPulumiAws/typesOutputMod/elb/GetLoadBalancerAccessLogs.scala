package typings.atPulumiAws.typesOutputMod.elb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerAccessLogs extends js.Object {
  var bucket: String = js.native
  var bucketPrefix: String = js.native
  var enabled: Boolean = js.native
  var interval: Double = js.native
}

object GetLoadBalancerAccessLogs {
  @scala.inline
  def apply(bucket: String, bucketPrefix: String, enabled: Boolean, interval: Double): GetLoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], bucketPrefix = bucketPrefix.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoadBalancerAccessLogs]
  }
}

