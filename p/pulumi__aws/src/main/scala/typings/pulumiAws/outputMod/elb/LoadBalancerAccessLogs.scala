package typings.pulumiAws.outputMod.elb

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
    * The publishing interval in minutes. Default: 60 minutes.
    */
  var interval: js.UndefOr[Double] = js.native
}

object LoadBalancerAccessLogs {
  @scala.inline
  def apply(
    bucket: String,
    bucketPrefix: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined
  ): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
}

