package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster
    */
  var dedicatedMasterCount: js.UndefOr[Double] = js.native
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: js.UndefOr[String] = js.native
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: js.UndefOr[Double] = js.native
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * Configuration block containing zone awareness settings. Documented below.
    */
  var zoneAwarenessConfig: js.UndefOr[DomainClusterConfigZoneAwarenessConfig] = js.native
  /**
    * Indicates whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
    */
  var zoneAwarenessEnabled: js.UndefOr[Boolean] = js.native
}

object DomainClusterConfig {
  @scala.inline
  def apply(
    dedicatedMasterCount: js.UndefOr[Double] = js.undefined,
    dedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
    dedicatedMasterType: String = null,
    instanceCount: js.UndefOr[Double] = js.undefined,
    instanceType: String = null,
    zoneAwarenessConfig: DomainClusterConfigZoneAwarenessConfig = null,
    zoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
  ): DomainClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dedicatedMasterCount)) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dedicatedMasterEnabled)) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled.get.asInstanceOf[js.Any])
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType.asInstanceOf[js.Any])
    if (!js.isUndefined(instanceCount)) __obj.updateDynamic("instanceCount")(instanceCount.get.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (zoneAwarenessConfig != null) __obj.updateDynamic("zoneAwarenessConfig")(zoneAwarenessConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(zoneAwarenessEnabled)) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainClusterConfig]
  }
}

