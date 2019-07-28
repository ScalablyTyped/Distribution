package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlowLogsEnabledFlowLogsS3Bucket extends js.Object {
  var flowLogsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  var flowLogsS3Bucket: js.UndefOr[Input[String]] = js.undefined
  var flowLogsS3Prefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_FlowLogsEnabledFlowLogsS3Bucket {
  @scala.inline
  def apply(
    flowLogsEnabled: Input[Boolean] = null,
    flowLogsS3Bucket: Input[String] = null,
    flowLogsS3Prefix: Input[String] = null
  ): Anon_FlowLogsEnabledFlowLogsS3Bucket = {
    val __obj = js.Dynamic.literal()
    if (flowLogsEnabled != null) __obj.updateDynamic("flowLogsEnabled")(flowLogsEnabled.asInstanceOf[js.Any])
    if (flowLogsS3Bucket != null) __obj.updateDynamic("flowLogsS3Bucket")(flowLogsS3Bucket.asInstanceOf[js.Any])
    if (flowLogsS3Prefix != null) __obj.updateDynamic("flowLogsS3Prefix")(flowLogsS3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FlowLogsEnabledFlowLogsS3Bucket]
  }
}

