package typings.atPulumiAws.typesInputMod.elasticsearch

import typings.atPulumiPulumi.outputMod.Input
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
    * Configuration block containing zone awareness settings. Documented below.
    */
  var zoneAwarenessConfig: js.UndefOr[Input[DomainClusterConfigZoneAwarenessConfig]] = js.native
  /**
    * Indicates whether zone awareness is enabled. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
    */
  var zoneAwarenessEnabled: js.UndefOr[Input[Boolean]] = js.native
}

object DomainClusterConfig {
  @scala.inline
  def apply(
    dedicatedMasterCount: Input[Double] = null,
    dedicatedMasterEnabled: Input[Boolean] = null,
    dedicatedMasterType: Input[String] = null,
    instanceCount: Input[Double] = null,
    instanceType: Input[String] = null,
    zoneAwarenessConfig: Input[DomainClusterConfigZoneAwarenessConfig] = null,
    zoneAwarenessEnabled: Input[Boolean] = null
  ): DomainClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (dedicatedMasterCount != null) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.asInstanceOf[js.Any])
    if (dedicatedMasterEnabled != null) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled.asInstanceOf[js.Any])
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (zoneAwarenessConfig != null) __obj.updateDynamic("zoneAwarenessConfig")(zoneAwarenessConfig.asInstanceOf[js.Any])
    if (zoneAwarenessEnabled != null) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainClusterConfig]
  }
}

