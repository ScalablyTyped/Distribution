package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainClusterConfig extends StObject {
  
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
    * The number of warm nodes in the cluster. Valid values are between `2` and `150`. `warmCount` can be only and must be set when `warmEnabled` is set to `true`.
    */
  var warmCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to enable warm storage.
    */
  var warmEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warmType` can be only and must be set when `warmEnabled` is set to `true`.
    */
  var warmType: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration block containing zone awareness settings. Documented below.
    */
  var zoneAwarenessConfig: js.UndefOr[DomainClusterConfigZoneAwarenessConfig] = js.undefined
  
  /**
    * Indicates whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
    */
  var zoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}
object DomainClusterConfig {
  
  @scala.inline
  def apply(): DomainClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainClusterConfig]
  }
  
  @scala.inline
  implicit class DomainClusterConfigMutableBuilder[Self <: DomainClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedMasterCount(value: Double): Self = StObject.set(x, "dedicatedMasterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterCountUndefined: Self = StObject.set(x, "dedicatedMasterCount", js.undefined)
    
    @scala.inline
    def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "dedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "dedicatedMasterEnabled", js.undefined)
    
    @scala.inline
    def setDedicatedMasterType(value: String): Self = StObject.set(x, "dedicatedMasterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "dedicatedMasterType", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Double): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setWarmCount(value: Double): Self = StObject.set(x, "warmCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmCountUndefined: Self = StObject.set(x, "warmCount", js.undefined)
    
    @scala.inline
    def setWarmEnabled(value: Boolean): Self = StObject.set(x, "warmEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmEnabledUndefined: Self = StObject.set(x, "warmEnabled", js.undefined)
    
    @scala.inline
    def setWarmType(value: String): Self = StObject.set(x, "warmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmTypeUndefined: Self = StObject.set(x, "warmType", js.undefined)
    
    @scala.inline
    def setZoneAwarenessConfig(value: DomainClusterConfigZoneAwarenessConfig): Self = StObject.set(x, "zoneAwarenessConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "zoneAwarenessConfig", js.undefined)
    
    @scala.inline
    def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "zoneAwarenessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "zoneAwarenessEnabled", js.undefined)
  }
}
