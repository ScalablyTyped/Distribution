package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster
    */
  var dedicatedMasterCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: js.UndefOr[Input[String]] = js.native
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The number of warm nodes in the cluster. Valid values are between `2` and `150`. `warmCount` can be only and must be set when `warmEnabled` is set to `true`.
    */
  var warmCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates whether to enable warm storage.
    */
  var warmEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warmType` can be only and must be set when `warmEnabled` is set to `true`.
    */
  var warmType: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing zone awareness settings. Documented below.
    */
  var zoneAwarenessConfig: js.UndefOr[Input[DomainClusterConfigZoneAwarenessConfig]] = js.native
  /**
    * Indicates whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
    */
  var zoneAwarenessEnabled: js.UndefOr[Input[Boolean]] = js.native
}

object DomainClusterConfig {
  @scala.inline
  def apply(): DomainClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainClusterConfig]
  }
  @scala.inline
  implicit class DomainClusterConfigOps[Self <: DomainClusterConfig] (val x: Self) extends AnyVal {
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
    def setDedicatedMasterCount(value: Input[Double]): Self = this.set("dedicatedMasterCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedMasterCount: Self = this.set("dedicatedMasterCount", js.undefined)
    @scala.inline
    def setDedicatedMasterEnabled(value: Input[Boolean]): Self = this.set("dedicatedMasterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedMasterEnabled: Self = this.set("dedicatedMasterEnabled", js.undefined)
    @scala.inline
    def setDedicatedMasterType(value: Input[String]): Self = this.set("dedicatedMasterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedMasterType: Self = this.set("dedicatedMasterType", js.undefined)
    @scala.inline
    def setInstanceCount(value: Input[Double]): Self = this.set("instanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("instanceCount", js.undefined)
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setWarmCount(value: Input[Double]): Self = this.set("warmCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmCount: Self = this.set("warmCount", js.undefined)
    @scala.inline
    def setWarmEnabled(value: Input[Boolean]): Self = this.set("warmEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmEnabled: Self = this.set("warmEnabled", js.undefined)
    @scala.inline
    def setWarmType(value: Input[String]): Self = this.set("warmType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmType: Self = this.set("warmType", js.undefined)
    @scala.inline
    def setZoneAwarenessConfig(value: Input[DomainClusterConfigZoneAwarenessConfig]): Self = this.set("zoneAwarenessConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneAwarenessConfig: Self = this.set("zoneAwarenessConfig", js.undefined)
    @scala.inline
    def setZoneAwarenessEnabled(value: Input[Boolean]): Self = this.set("zoneAwarenessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneAwarenessEnabled: Self = this.set("zoneAwarenessEnabled", js.undefined)
  }
  
}

