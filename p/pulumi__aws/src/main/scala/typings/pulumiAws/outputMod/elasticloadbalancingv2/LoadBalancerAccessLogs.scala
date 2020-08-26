package typings.pulumiAws.outputMod.elasticloadbalancingv2

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
    * Boolean to enable / disable `accessLogs`. Defaults to `false`, even when `bucket` is specified.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var prefix: js.UndefOr[String] = js.native
}

object LoadBalancerAccessLogs {
  @scala.inline
  def apply(bucket: String): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
  @scala.inline
  implicit class LoadBalancerAccessLogsOps[Self <: LoadBalancerAccessLogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

