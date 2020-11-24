package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleetInstanceTypeConfig extends js.Object {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by `instanceType`. Expressed in USD. If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPrice: js.UndefOr[Input[String]] = js.native
  
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instanceType`. Expressed as a number (for example, 20 specifies 20%). If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPriceAsPercentageOfOnDemandPrice: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
    */
  var configurations: js.UndefOr[Input[js.Array[Input[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]]]] = js.native
  
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.UndefOr[Input[js.Array[Input[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig]]]] = js.native
  
  /**
    * An EC2 instance type, such as m4.xlarge.
    */
  var instanceType: Input[String] = js.native
  
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
    */
  var weightedCapacity: js.UndefOr[Input[Double]] = js.native
}
object ClusterCoreInstanceFleetInstanceTypeConfig {
  
  @scala.inline
  def apply(instanceType: Input[String]): ClusterCoreInstanceFleetInstanceTypeConfig = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleetInstanceTypeConfig]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetInstanceTypeConfigOps[Self <: ClusterCoreInstanceFleetInstanceTypeConfig] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPrice(value: Input[String]): Self = this.set("bidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("bidPrice", js.undefined)
    
    @scala.inline
    def setBidPriceAsPercentageOfOnDemandPrice(value: Input[Double]): Self = this.set("bidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPriceAsPercentageOfOnDemandPrice: Self = this.set("bidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Input[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]*): Self = this.set("configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: Input[js.Array[Input[ClusterCoreInstanceFleetInstanceTypeConfigConfiguration]]]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
    
    @scala.inline
    def setEbsConfigsVarargs(value: Input[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig]*): Self = this.set("ebsConfigs", js.Array(value :_*))
    
    @scala.inline
    def setEbsConfigs(value: Input[js.Array[Input[ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig]]]): Self = this.set("ebsConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsConfigs: Self = this.set("ebsConfigs", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: Input[Double]): Self = this.set("weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("weightedCapacity", js.undefined)
  }
}
