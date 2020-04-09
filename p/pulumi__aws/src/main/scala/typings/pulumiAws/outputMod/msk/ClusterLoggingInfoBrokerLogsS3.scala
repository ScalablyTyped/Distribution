package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfoBrokerLogsS3 extends js.Object {
  /**
    * Name of the S3 bucket to deliver logs to.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Boolean = js.native
  /**
    * Prefix to append to the folder name.
    */
  var prefix: js.UndefOr[String] = js.native
}

object ClusterLoggingInfoBrokerLogsS3 {
  @scala.inline
  def apply(enabled: Boolean, bucket: String = null, prefix: String = null): ClusterLoggingInfoBrokerLogsS3 = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsS3]
  }
}

