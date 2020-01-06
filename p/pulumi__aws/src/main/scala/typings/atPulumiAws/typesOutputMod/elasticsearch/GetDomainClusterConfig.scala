package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster.
    */
  var dedicatedMasterCount: Double = js.native
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: Boolean = js.native
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: String = js.native
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: Double = js.native
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: String = js.native
  /**
    * Configuration block containing zone awareness settings.
    */
  var zoneAwarenessConfigs: js.Array[GetDomainClusterConfigZoneAwarenessConfig] = js.native
  /**
    * Indicates whether zone awareness is enabled.
    */
  var zoneAwarenessEnabled: Boolean = js.native
}

object GetDomainClusterConfig {
  @scala.inline
  def apply(
    dedicatedMasterCount: Double,
    dedicatedMasterEnabled: Boolean,
    dedicatedMasterType: String,
    instanceCount: Double,
    instanceType: String,
    zoneAwarenessConfigs: js.Array[GetDomainClusterConfigZoneAwarenessConfig],
    zoneAwarenessEnabled: Boolean
  ): GetDomainClusterConfig = {
    val __obj = js.Dynamic.literal(dedicatedMasterCount = dedicatedMasterCount.asInstanceOf[js.Any], dedicatedMasterEnabled = dedicatedMasterEnabled.asInstanceOf[js.Any], dedicatedMasterType = dedicatedMasterType.asInstanceOf[js.Any], instanceCount = instanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], zoneAwarenessConfigs = zoneAwarenessConfigs.asInstanceOf[js.Any], zoneAwarenessEnabled = zoneAwarenessEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainClusterConfig]
  }
}

