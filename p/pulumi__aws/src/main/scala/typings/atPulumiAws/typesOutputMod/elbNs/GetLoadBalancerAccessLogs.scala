package typings.atPulumiAws.typesOutputMod.elbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerAccessLogs extends js.Object {
  var bucket: String
  var bucketPrefix: String
  var enabled: Boolean
  var interval: Double
}

object GetLoadBalancerAccessLogs {
  @scala.inline
  def apply(bucket: String, bucketPrefix: String, enabled: Boolean, interval: Double): GetLoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket, bucketPrefix = bucketPrefix, enabled = enabled, interval = interval)
  
    __obj.asInstanceOf[GetLoadBalancerAccessLogs]
  }
}

