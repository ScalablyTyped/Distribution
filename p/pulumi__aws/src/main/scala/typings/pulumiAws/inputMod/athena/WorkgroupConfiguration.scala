package typings.pulumiAws.inputMod.athena

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupConfiguration extends js.Object {
  /**
    * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
    */
  var bytesScannedCutoffPerQuery: js.UndefOr[Input[Double]] = js.native
  /**
    * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
    */
  var enforceWorkgroupConfiguration: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
    */
  var publishCloudwatchMetricsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Configuration block with result settings. Documented below.
    */
  var resultConfiguration: js.UndefOr[Input[WorkgroupConfigurationResultConfiguration]] = js.native
}

object WorkgroupConfiguration {
  @scala.inline
  def apply(): WorkgroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkgroupConfiguration]
  }
  @scala.inline
  implicit class WorkgroupConfigurationOps[Self <: WorkgroupConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesScannedCutoffPerQuery(value: Input[Double]): Self = this.set("bytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesScannedCutoffPerQuery: Self = this.set("bytesScannedCutoffPerQuery", js.undefined)
    @scala.inline
    def setEnforceWorkgroupConfiguration(value: Input[Boolean]): Self = this.set("enforceWorkgroupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceWorkgroupConfiguration: Self = this.set("enforceWorkgroupConfiguration", js.undefined)
    @scala.inline
    def setPublishCloudwatchMetricsEnabled(value: Input[Boolean]): Self = this.set("publishCloudwatchMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishCloudwatchMetricsEnabled: Self = this.set("publishCloudwatchMetricsEnabled", js.undefined)
    @scala.inline
    def setResultConfiguration(value: Input[WorkgroupConfigurationResultConfiguration]): Self = this.set("resultConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultConfiguration: Self = this.set("resultConfiguration", js.undefined)
  }
  
}

