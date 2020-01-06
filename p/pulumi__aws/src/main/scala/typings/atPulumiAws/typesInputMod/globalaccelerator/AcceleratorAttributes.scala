package typings.atPulumiAws.typesInputMod.globalaccelerator

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorAttributes extends js.Object {
  /**
    * Indicates whether flow logs are enabled.
    */
  var flowLogsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The prefix for the location in the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Prefix: js.UndefOr[Input[String]] = js.native
}

object AcceleratorAttributes {
  @scala.inline
  def apply(
    flowLogsEnabled: Input[Boolean] = null,
    flowLogsS3Bucket: Input[String] = null,
    flowLogsS3Prefix: Input[String] = null
  ): AcceleratorAttributes = {
    val __obj = js.Dynamic.literal()
    if (flowLogsEnabled != null) __obj.updateDynamic("flowLogsEnabled")(flowLogsEnabled.asInstanceOf[js.Any])
    if (flowLogsS3Bucket != null) __obj.updateDynamic("flowLogsS3Bucket")(flowLogsS3Bucket.asInstanceOf[js.Any])
    if (flowLogsS3Prefix != null) __obj.updateDynamic("flowLogsS3Prefix")(flowLogsS3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorAttributes]
  }
}

