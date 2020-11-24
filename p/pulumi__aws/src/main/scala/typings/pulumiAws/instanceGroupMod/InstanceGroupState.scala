package typings.pulumiAws.instanceGroupMod

import typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupState extends js.Object {
  
  /**
    * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
    */
  val autoscalingPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
    */
  val bidPrice: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
    */
  val configurationsJson: js.UndefOr[Input[String]] = js.native
  
  /**
    * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: js.UndefOr[Input[js.Array[Input[InstanceGroupEbsConfig]]]] = js.native
  
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * target number of instances for the instance group. defaults to 0.
    */
  val instanceCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  val runningInstanceCount: js.UndefOr[Input[Double]] = js.native
  
  val status: js.UndefOr[Input[String]] = js.native
}
object InstanceGroupState {
  
  @scala.inline
  def apply(): InstanceGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupState]
  }
  
  @scala.inline
  implicit class InstanceGroupStateOps[Self <: InstanceGroupState] (val x: Self) extends AnyVal {
    
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
    def setAutoscalingPolicy(value: Input[String]): Self = this.set("autoscalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingPolicy: Self = this.set("autoscalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: Input[String]): Self = this.set("bidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("bidPrice", js.undefined)
    
    @scala.inline
    def setClusterId(value: Input[String]): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    
    @scala.inline
    def setConfigurationsJson(value: Input[String]): Self = this.set("configurationsJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationsJson: Self = this.set("configurationsJson", js.undefined)
    
    @scala.inline
    def setEbsConfigsVarargs(value: Input[InstanceGroupEbsConfig]*): Self = this.set("ebsConfigs", js.Array(value :_*))
    
    @scala.inline
    def setEbsConfigs(value: Input[js.Array[Input[InstanceGroupEbsConfig]]]): Self = this.set("ebsConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsConfigs: Self = this.set("ebsConfigs", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Input[Double]): Self = this.set("instanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("instanceCount", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRunningInstanceCount(value: Input[Double]): Self = this.set("runningInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningInstanceCount: Self = this.set("runningInstanceCount", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
