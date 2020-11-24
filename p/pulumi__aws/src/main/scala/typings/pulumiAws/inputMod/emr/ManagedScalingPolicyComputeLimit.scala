package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedScalingPolicyComputeLimit extends js.Object {
  
  /**
    * The upper boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  var maximumCapacityUnits: Input[Double] = js.native
  
  /**
    * The upper boundary of EC2 units for core node type in a cluster. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
    */
  var maximumCoreCapacityUnits: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The upper boundary of On-Demand EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot instances.
    */
  var maximumOndemandCapacityUnits: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The lower boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  var minimumCapacityUnits: Input[Double] = js.native
  
  /**
    * The unit type used for specifying a managed scaling policy. Valid Values: `InstanceFleetUnits` | `Instances` | `VCPU`
    */
  var unitType: Input[String] = js.native
}
object ManagedScalingPolicyComputeLimit {
  
  @scala.inline
  def apply(maximumCapacityUnits: Input[Double], minimumCapacityUnits: Input[Double], unitType: Input[String]): ManagedScalingPolicyComputeLimit = {
    val __obj = js.Dynamic.literal(maximumCapacityUnits = maximumCapacityUnits.asInstanceOf[js.Any], minimumCapacityUnits = minimumCapacityUnits.asInstanceOf[js.Any], unitType = unitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedScalingPolicyComputeLimit]
  }
  
  @scala.inline
  implicit class ManagedScalingPolicyComputeLimitOps[Self <: ManagedScalingPolicyComputeLimit] (val x: Self) extends AnyVal {
    
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
    def setMaximumCapacityUnits(value: Input[Double]): Self = this.set("maximumCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCapacityUnits(value: Input[Double]): Self = this.set("minimumCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitType(value: Input[String]): Self = this.set("unitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumCoreCapacityUnits(value: Input[Double]): Self = this.set("maximumCoreCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumCoreCapacityUnits: Self = this.set("maximumCoreCapacityUnits", js.undefined)
    
    @scala.inline
    def setMaximumOndemandCapacityUnits(value: Input[Double]): Self = this.set("maximumOndemandCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumOndemandCapacityUnits: Self = this.set("maximumOndemandCapacityUnits", js.undefined)
  }
}
