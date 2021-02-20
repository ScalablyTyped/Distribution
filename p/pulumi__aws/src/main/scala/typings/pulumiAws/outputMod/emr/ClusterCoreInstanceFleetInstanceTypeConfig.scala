package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleetInstanceTypeConfig extends StObject {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by `instanceType`. Expressed in USD. If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPrice: js.UndefOr[String] = js.native
  
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instanceType`. Expressed as a number (for example, 20 specifies 20%). If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPriceAsPercentageOfOnDemandPrice: js.UndefOr[Double] = js.native
  
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
    */
  var configurations: js.UndefOr[js.Array[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]] = js.native
  
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig] = js.native
  
  /**
    * An EC2 instance type, such as m4.xlarge.
    */
  var instanceType: String = js.native
  
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
    */
  var weightedCapacity: js.UndefOr[Double] = js.native
}
object ClusterCoreInstanceFleetInstanceTypeConfig {
  
  @scala.inline
  def apply(ebsConfigs: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig], instanceType: String): ClusterCoreInstanceFleetInstanceTypeConfig = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleetInstanceTypeConfig]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetInstanceTypeConfigMutableBuilder[Self <: ClusterCoreInstanceFleetInstanceTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidPrice(value: String): Self = StObject.set(x, "bidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceAsPercentageOfOnDemandPrice(value: Double): Self = StObject.set(x, "bidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceAsPercentageOfOnDemandPriceUndefined: Self = StObject.set(x, "bidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "bidPrice", js.undefined)
    
    @scala.inline
    def setConfigurations(value: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: ClusterCoreInstanceFleetInstanceTypeConfigConfiguration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
    
    @scala.inline
    def setEbsConfigs(value: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig]): Self = StObject.set(x, "ebsConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsConfigsVarargs(value: ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig*): Self = StObject.set(x, "ebsConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacity(value: Double): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
