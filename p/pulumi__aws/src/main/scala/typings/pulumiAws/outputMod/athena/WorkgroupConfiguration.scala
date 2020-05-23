package typings.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupConfiguration extends js.Object {
  /**
    * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
    */
  var bytesScannedCutoffPerQuery: js.UndefOr[Double] = js.native
  /**
    * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
    */
  var enforceWorkgroupConfiguration: js.UndefOr[Boolean] = js.native
  /**
    * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
    */
  var publishCloudwatchMetricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Configuration block with result settings. Documented below.
    */
  var resultConfiguration: js.UndefOr[WorkgroupConfigurationResultConfiguration] = js.native
}

object WorkgroupConfiguration {
  @scala.inline
  def apply(
    bytesScannedCutoffPerQuery: js.UndefOr[Double] = js.undefined,
    enforceWorkgroupConfiguration: js.UndefOr[Boolean] = js.undefined,
    publishCloudwatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
    resultConfiguration: WorkgroupConfigurationResultConfiguration = null
  ): WorkgroupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesScannedCutoffPerQuery)) __obj.updateDynamic("bytesScannedCutoffPerQuery")(bytesScannedCutoffPerQuery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceWorkgroupConfiguration)) __obj.updateDynamic("enforceWorkgroupConfiguration")(enforceWorkgroupConfiguration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publishCloudwatchMetricsEnabled)) __obj.updateDynamic("publishCloudwatchMetricsEnabled")(publishCloudwatchMetricsEnabled.get.asInstanceOf[js.Any])
    if (resultConfiguration != null) __obj.updateDynamic("resultConfiguration")(resultConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkgroupConfiguration]
  }
}

