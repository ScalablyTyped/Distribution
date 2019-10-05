package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster.
    */
  var dedicatedMasterCount: Double
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: Boolean
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: String
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: Double
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: String
  /**
    * Configuration block containing zone awareness settings.
    */
  var zoneAwarenessConfigs: js.Array[GetDomainClusterConfigZoneAwarenessConfig]
  /**
    * Indicates whether zone awareness is enabled.
    */
  var zoneAwarenessEnabled: Boolean
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
    val __obj = js.Dynamic.literal(dedicatedMasterCount = dedicatedMasterCount, dedicatedMasterEnabled = dedicatedMasterEnabled, dedicatedMasterType = dedicatedMasterType, instanceCount = instanceCount, instanceType = instanceType, zoneAwarenessConfigs = zoneAwarenessConfigs, zoneAwarenessEnabled = zoneAwarenessEnabled)
  
    __obj.asInstanceOf[GetDomainClusterConfig]
  }
}

