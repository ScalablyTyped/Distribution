package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfoBrokerLogsS3 extends js.Object {
  /**
    * Name of the S3 bucket to deliver logs to.
    */
  var bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Input[Boolean] = js.native
  /**
    * Prefix to append to the folder name.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
}

object ClusterLoggingInfoBrokerLogsS3 {
  @scala.inline
  def apply(enabled: Input[Boolean], bucket: Input[String] = null, prefix: Input[String] = null): ClusterLoggingInfoBrokerLogsS3 = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsS3]
  }
}

