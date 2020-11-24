package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceGroup extends js.Object {
  
  /**
    * String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
    */
  var autoscalingPolicy: js.UndefOr[String] = js.native
  
  /**
    * The bid price for each EC2 Spot instance type as defined by `instanceType`. Expressed in USD. If neither `bidPrice` nor `bidPriceAsPercentageOfOnDemandPrice` is provided, `bidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
    */
  var bidPrice: js.UndefOr[String] = js.native
  
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig] = js.native
  
  /**
    * The ID of the EMR Cluster
    */
  var id: String = js.native
  
  /**
    * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource's `coreInstanceGroup` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have `map public IP on launch` enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `terminationProtection = false` configuration applied before destroying this resource.
    */
  var instanceCount: js.UndefOr[Double] = js.native
  
  /**
    * An EC2 instance type, such as m4.xlarge.
    */
  var instanceType: String = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  var name: js.UndefOr[String] = js.native
}
object ClusterCoreInstanceGroup {
  
  @scala.inline
  def apply(ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig], id: String, instanceType: String): ClusterCoreInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroup]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceGroupOps[Self <: ClusterCoreInstanceGroup] (val x: Self) extends AnyVal {
    
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
    def setEbsConfigsVarargs(value: ClusterCoreInstanceGroupEbsConfig*): Self = this.set("ebsConfigs", js.Array(value :_*))
    
    @scala.inline
    def setEbsConfigs(value: js.Array[ClusterCoreInstanceGroupEbsConfig]): Self = this.set("ebsConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingPolicy(value: String): Self = this.set("autoscalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingPolicy: Self = this.set("autoscalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: String): Self = this.set("bidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("bidPrice", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Double): Self = this.set("instanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("instanceCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
