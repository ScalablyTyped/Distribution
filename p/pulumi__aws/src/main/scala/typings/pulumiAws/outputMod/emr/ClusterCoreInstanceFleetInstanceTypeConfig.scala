package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCoreInstanceFleetInstanceTypeConfig extends StObject {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by `instanceType`. Expressed in USD. If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instanceType`. Expressed as a number (for example, 20 specifies 20%). If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPriceAsPercentageOfOnDemandPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
    */
  var configurations: js.UndefOr[js.Array[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]] = js.undefined
  
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig]
  
  /**
    * An EC2 instance type, such as m4.xlarge.
    */
  var instanceType: String
  
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
    */
  var weightedCapacity: js.UndefOr[Double] = js.undefined
}
object ClusterCoreInstanceFleetInstanceTypeConfig {
  
  inline def apply(ebsConfigs: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig], instanceType: String): ClusterCoreInstanceFleetInstanceTypeConfig = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleetInstanceTypeConfig]
  }
  
  extension [Self <: ClusterCoreInstanceFleetInstanceTypeConfig](x: Self) {
    
    inline def setBidPrice(value: String): Self = StObject.set(x, "bidPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceAsPercentageOfOnDemandPrice(value: Double): Self = StObject.set(x, "bidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceAsPercentageOfOnDemandPriceUndefined: Self = StObject.set(x, "bidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    inline def setBidPriceUndefined: Self = StObject.set(x, "bidPrice", js.undefined)
    
    inline def setConfigurations(value: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: ClusterCoreInstanceFleetInstanceTypeConfigConfiguration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
    
    inline def setEbsConfigs(value: js.Array[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig]): Self = StObject.set(x, "ebsConfigs", value.asInstanceOf[js.Any])
    
    inline def setEbsConfigsVarargs(value: ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig*): Self = StObject.set(x, "ebsConfigs", js.Array(value :_*))
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacity(value: Double): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
