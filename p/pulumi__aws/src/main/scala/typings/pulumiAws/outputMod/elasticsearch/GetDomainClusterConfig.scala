package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainClusterConfig extends StObject {
  
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
    * The number of warm nodes in the cluster.
    */
  var warmCount: Double
  
  /**
    * Indicates warm storage is enabled.
    */
  var warmEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance type for the Elasticsearch cluster's warm nodes.
    */
  var warmType: String
  
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
    warmCount: Double,
    warmType: String,
    zoneAwarenessConfigs: js.Array[GetDomainClusterConfigZoneAwarenessConfig],
    zoneAwarenessEnabled: Boolean
  ): GetDomainClusterConfig = {
    val __obj = js.Dynamic.literal(dedicatedMasterCount = dedicatedMasterCount.asInstanceOf[js.Any], dedicatedMasterEnabled = dedicatedMasterEnabled.asInstanceOf[js.Any], dedicatedMasterType = dedicatedMasterType.asInstanceOf[js.Any], instanceCount = instanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], warmCount = warmCount.asInstanceOf[js.Any], warmType = warmType.asInstanceOf[js.Any], zoneAwarenessConfigs = zoneAwarenessConfigs.asInstanceOf[js.Any], zoneAwarenessEnabled = zoneAwarenessEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainClusterConfig]
  }
  
  @scala.inline
  implicit class GetDomainClusterConfigMutableBuilder[Self <: GetDomainClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedMasterCount(value: Double): Self = StObject.set(x, "dedicatedMasterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "dedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterType(value: String): Self = StObject.set(x, "dedicatedMasterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCount(value: Double): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmCount(value: Double): Self = StObject.set(x, "warmCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmEnabled(value: Boolean): Self = StObject.set(x, "warmEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmEnabledUndefined: Self = StObject.set(x, "warmEnabled", js.undefined)
    
    @scala.inline
    def setWarmType(value: String): Self = StObject.set(x, "warmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAwarenessConfigs(value: js.Array[GetDomainClusterConfigZoneAwarenessConfig]): Self = StObject.set(x, "zoneAwarenessConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAwarenessConfigsVarargs(value: GetDomainClusterConfigZoneAwarenessConfig*): Self = StObject.set(x, "zoneAwarenessConfigs", js.Array(value :_*))
    
    @scala.inline
    def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "zoneAwarenessEnabled", value.asInstanceOf[js.Any])
  }
}
