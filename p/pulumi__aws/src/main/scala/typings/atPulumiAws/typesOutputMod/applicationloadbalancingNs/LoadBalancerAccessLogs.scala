package typings.atPulumiAws.typesOutputMod.applicationloadbalancingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerAccessLogs extends js.Object {
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: String
  /**
    * Boolean to enable / disable `accessLogs`. Defaults to `false`, even when `bucket` is specified.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object LoadBalancerAccessLogs {
  @scala.inline
  def apply(bucket: String, enabled: js.UndefOr[Boolean] = js.undefined, prefix: String = null): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
}

