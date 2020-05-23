package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorAttributes extends js.Object {
  /**
    * Indicates whether flow logs are enabled.
    */
  var flowLogsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Bucket: js.UndefOr[String] = js.native
  /**
    * The prefix for the location in the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Prefix: js.UndefOr[String] = js.native
}

object AcceleratorAttributes {
  @scala.inline
  def apply(
    flowLogsEnabled: js.UndefOr[Boolean] = js.undefined,
    flowLogsS3Bucket: String = null,
    flowLogsS3Prefix: String = null
  ): AcceleratorAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flowLogsEnabled)) __obj.updateDynamic("flowLogsEnabled")(flowLogsEnabled.get.asInstanceOf[js.Any])
    if (flowLogsS3Bucket != null) __obj.updateDynamic("flowLogsS3Bucket")(flowLogsS3Bucket.asInstanceOf[js.Any])
    if (flowLogsS3Prefix != null) __obj.updateDynamic("flowLogsS3Prefix")(flowLogsS3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorAttributes]
  }
}

