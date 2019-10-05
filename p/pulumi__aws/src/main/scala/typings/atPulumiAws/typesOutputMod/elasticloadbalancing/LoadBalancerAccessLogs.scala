package typings.atPulumiAws.typesOutputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerAccessLogs extends js.Object {
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: String
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var bucketPrefix: js.UndefOr[String] = js.undefined
  /**
    * Boolean to enable / disable `accessLogs`. Default is `true`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The interval between checks.
    */
  var interval: js.UndefOr[Double] = js.undefined
}

object LoadBalancerAccessLogs {
  @scala.inline
  def apply(
    bucket: String,
    bucketPrefix: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null
  ): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
}

