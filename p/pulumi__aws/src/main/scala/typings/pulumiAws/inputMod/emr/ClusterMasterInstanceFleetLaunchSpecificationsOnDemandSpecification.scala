package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification extends js.Object {
  
  /**
    * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
    */
  var allocationStrategy: Input[String] = js.native
}
object ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification {
  
  @scala.inline
  def apply(allocationStrategy: Input[String]): ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification = {
    val __obj = js.Dynamic.literal(allocationStrategy = allocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification]
  }
  
  @scala.inline
  implicit class ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationOps[Self <: ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification] (val x: Self) extends AnyVal {
    
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
    def setAllocationStrategy(value: Input[String]): Self = this.set("allocationStrategy", value.asInstanceOf[js.Any])
  }
}
