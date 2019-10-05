package typings.atPulumiAws.typesOutputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkgroupConfiguration extends js.Object {
  /**
    * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
    */
  var bytesScannedCutoffPerQuery: js.UndefOr[Double] = js.undefined
  /**
    * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
    */
  var enforceWorkgroupConfiguration: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
    */
  var publishCloudwatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Configuration block with result settings. Documented below.
    */
  var resultConfiguration: js.UndefOr[WorkgroupConfigurationResultConfiguration] = js.undefined
}

object WorkgroupConfiguration {
  @scala.inline
  def apply(
    bytesScannedCutoffPerQuery: Int | Double = null,
    enforceWorkgroupConfiguration: js.UndefOr[Boolean] = js.undefined,
    publishCloudwatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
    resultConfiguration: WorkgroupConfigurationResultConfiguration = null
  ): WorkgroupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bytesScannedCutoffPerQuery != null) __obj.updateDynamic("bytesScannedCutoffPerQuery")(bytesScannedCutoffPerQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceWorkgroupConfiguration)) __obj.updateDynamic("enforceWorkgroupConfiguration")(enforceWorkgroupConfiguration)
    if (!js.isUndefined(publishCloudwatchMetricsEnabled)) __obj.updateDynamic("publishCloudwatchMetricsEnabled")(publishCloudwatchMetricsEnabled)
    if (resultConfiguration != null) __obj.updateDynamic("resultConfiguration")(resultConfiguration)
    __obj.asInstanceOf[WorkgroupConfiguration]
  }
}

