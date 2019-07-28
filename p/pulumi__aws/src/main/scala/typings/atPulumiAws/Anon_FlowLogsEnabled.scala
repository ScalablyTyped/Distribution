package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlowLogsEnabled extends js.Object {
  var flowLogsEnabled: js.UndefOr[Boolean] = js.undefined
  var flowLogsS3Bucket: js.UndefOr[String] = js.undefined
  var flowLogsS3Prefix: js.UndefOr[String] = js.undefined
}

object Anon_FlowLogsEnabled {
  @scala.inline
  def apply(
    flowLogsEnabled: js.UndefOr[Boolean] = js.undefined,
    flowLogsS3Bucket: String = null,
    flowLogsS3Prefix: String = null
  ): Anon_FlowLogsEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flowLogsEnabled)) __obj.updateDynamic("flowLogsEnabled")(flowLogsEnabled)
    if (flowLogsS3Bucket != null) __obj.updateDynamic("flowLogsS3Bucket")(flowLogsS3Bucket)
    if (flowLogsS3Prefix != null) __obj.updateDynamic("flowLogsS3Prefix")(flowLogsS3Prefix)
    __obj.asInstanceOf[Anon_FlowLogsEnabled]
  }
}

