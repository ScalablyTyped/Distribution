package typings.pulumiAws.inputMod.elb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAccessLogs extends js.Object {
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: Input[String] = js.native
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var bucketPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean to enable / disable `accessLogs`. Default is `true`
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The interval between checks.
    */
  var interval: js.UndefOr[Input[Double]] = js.native
}

object LoadBalancerAccessLogs {
  @scala.inline
  def apply(
    bucket: Input[String],
    bucketPrefix: Input[String] = null,
    enabled: Input[Boolean] = null,
    interval: Input[Double] = null
  ): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
}

