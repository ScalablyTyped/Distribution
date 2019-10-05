package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster
    */
  var dedicatedMasterCount: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: js.UndefOr[String] = js.undefined
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: js.UndefOr[Double] = js.undefined
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: js.UndefOr[String] = js.undefined
  /**
    * Configuration block containing zone awareness settings. Documented below.
    */
  var zoneAwarenessConfig: js.UndefOr[DomainClusterConfigZoneAwarenessConfig] = js.undefined
  /**
    * Indicates whether zone awareness is enabled. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
    */
  var zoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}

object DomainClusterConfig {
  @scala.inline
  def apply(
    dedicatedMasterCount: Int | Double = null,
    dedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
    dedicatedMasterType: String = null,
    instanceCount: Int | Double = null,
    instanceType: String = null,
    zoneAwarenessConfig: DomainClusterConfigZoneAwarenessConfig = null,
    zoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
  ): DomainClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (dedicatedMasterCount != null) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.asInstanceOf[js.Any])
    if (!js.isUndefined(dedicatedMasterEnabled)) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled)
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (zoneAwarenessConfig != null) __obj.updateDynamic("zoneAwarenessConfig")(zoneAwarenessConfig)
    if (!js.isUndefined(zoneAwarenessEnabled)) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled)
    __obj.asInstanceOf[DomainClusterConfig]
  }
}

