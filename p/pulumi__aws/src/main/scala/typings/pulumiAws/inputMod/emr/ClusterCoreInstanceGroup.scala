package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCoreInstanceGroup extends StObject {
  
  /**
    * String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
    */
  var autoscalingPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The bid price for each EC2 Spot instance type as defined by `instanceType`. Expressed in USD. If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPrice: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.UndefOr[Input[js.Array[Input[ClusterCoreInstanceGroupEbsConfig]]]] = js.undefined
  
  /**
    * The ID of the EMR Cluster
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource's `coreInstanceGroup` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have `map public IP on launch` enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `terminationProtection = false` configuration applied before destroying this resource.
    */
  var instanceCount: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * An EC2 instance type, such as m4.xlarge.
    */
  var instanceType: Input[String]
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object ClusterCoreInstanceGroup {
  
  @scala.inline
  def apply(instanceType: Input[String]): ClusterCoreInstanceGroup = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroup]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceGroupMutableBuilder[Self <: ClusterCoreInstanceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingPolicy(value: Input[String]): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: Input[String]): Self = StObject.set(x, "bidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "bidPrice", js.undefined)
    
    @scala.inline
    def setEbsConfigs(value: Input[js.Array[Input[ClusterCoreInstanceGroupEbsConfig]]]): Self = StObject.set(x, "ebsConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsConfigsUndefined: Self = StObject.set(x, "ebsConfigs", js.undefined)
    
    @scala.inline
    def setEbsConfigsVarargs(value: Input[ClusterCoreInstanceGroupEbsConfig]*): Self = StObject.set(x, "ebsConfigs", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Input[Double]): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
