package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlowLogsEnabled extends js.Object {
  var flowLogsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var flowLogsS3Bucket: js.UndefOr[java.lang.String] = js.undefined
  var flowLogsS3Prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FlowLogsEnabled {
  @scala.inline
  def apply(
    flowLogsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    flowLogsS3Bucket: java.lang.String = null,
    flowLogsS3Prefix: java.lang.String = null
  ): Anon_FlowLogsEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flowLogsEnabled)) __obj.updateDynamic("flowLogsEnabled")(flowLogsEnabled)
    if (flowLogsS3Bucket != null) __obj.updateDynamic("flowLogsS3Bucket")(flowLogsS3Bucket)
    if (flowLogsS3Prefix != null) __obj.updateDynamic("flowLogsS3Prefix")(flowLogsS3Prefix)
    __obj.asInstanceOf[Anon_FlowLogsEnabled]
  }
}

