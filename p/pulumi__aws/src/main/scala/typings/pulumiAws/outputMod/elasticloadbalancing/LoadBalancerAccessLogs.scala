package typings.pulumiAws.outputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAccessLogs extends js.Object {
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: String = js.native
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var bucketPrefix: js.UndefOr[String] = js.native
  /**
    * Boolean to enable / disable `accessLogs`. Default is `true`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The interval between checks.
    */
  var interval: js.UndefOr[Double] = js.native
}

object LoadBalancerAccessLogs {
  @scala.inline
  def apply(
    bucket: String,
    bucketPrefix: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null
  ): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
}

