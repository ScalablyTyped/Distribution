package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesScannedCutoffPerQueryEnforceWorkgroupConfiguration extends js.Object {
  var bytesScannedCutoffPerQuery: js.UndefOr[Input[Double]] = js.undefined
  var enforceWorkgroupConfiguration: js.UndefOr[Input[Boolean]] = js.undefined
  var publishCloudwatchMetricsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  var resultConfiguration: js.UndefOr[Input[Anon_EncryptionConfigurationOutputLocation]] = js.undefined
}

object Anon_BytesScannedCutoffPerQueryEnforceWorkgroupConfiguration {
  @scala.inline
  def apply(
    bytesScannedCutoffPerQuery: Input[Double] = null,
    enforceWorkgroupConfiguration: Input[Boolean] = null,
    publishCloudwatchMetricsEnabled: Input[Boolean] = null,
    resultConfiguration: Input[Anon_EncryptionConfigurationOutputLocation] = null
  ): Anon_BytesScannedCutoffPerQueryEnforceWorkgroupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bytesScannedCutoffPerQuery != null) __obj.updateDynamic("bytesScannedCutoffPerQuery")(bytesScannedCutoffPerQuery.asInstanceOf[js.Any])
    if (enforceWorkgroupConfiguration != null) __obj.updateDynamic("enforceWorkgroupConfiguration")(enforceWorkgroupConfiguration.asInstanceOf[js.Any])
    if (publishCloudwatchMetricsEnabled != null) __obj.updateDynamic("publishCloudwatchMetricsEnabled")(publishCloudwatchMetricsEnabled.asInstanceOf[js.Any])
    if (resultConfiguration != null) __obj.updateDynamic("resultConfiguration")(resultConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BytesScannedCutoffPerQueryEnforceWorkgroupConfiguration]
  }
}

