package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesScannedCutoffPerQuery extends js.Object {
  var bytesScannedCutoffPerQuery: js.UndefOr[scala.Double] = js.undefined
  var enforceWorkgroupConfiguration: js.UndefOr[scala.Boolean] = js.undefined
  var publishCloudwatchMetricsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var resultConfiguration: js.UndefOr[Anon_EncryptionConfiguration] = js.undefined
}

object Anon_BytesScannedCutoffPerQuery {
  @scala.inline
  def apply(
    bytesScannedCutoffPerQuery: scala.Int | scala.Double = null,
    enforceWorkgroupConfiguration: js.UndefOr[scala.Boolean] = js.undefined,
    publishCloudwatchMetricsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    resultConfiguration: Anon_EncryptionConfiguration = null
  ): Anon_BytesScannedCutoffPerQuery = {
    val __obj = js.Dynamic.literal()
    if (bytesScannedCutoffPerQuery != null) __obj.updateDynamic("bytesScannedCutoffPerQuery")(bytesScannedCutoffPerQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceWorkgroupConfiguration)) __obj.updateDynamic("enforceWorkgroupConfiguration")(enforceWorkgroupConfiguration)
    if (!js.isUndefined(publishCloudwatchMetricsEnabled)) __obj.updateDynamic("publishCloudwatchMetricsEnabled")(publishCloudwatchMetricsEnabled)
    if (resultConfiguration != null) __obj.updateDynamic("resultConfiguration")(resultConfiguration)
    __obj.asInstanceOf[Anon_BytesScannedCutoffPerQuery]
  }
}

