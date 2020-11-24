package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetLaunchSpecifications extends js.Object {
  
  /**
    * Configuration block for on demand instances launch specifications
    */
  var onDemandSpecifications: js.UndefOr[js.Array[InstanceFleetLaunchSpecificationsOnDemandSpecification]] = js.native
  
  /**
    * Configuration block for spot instances launch specifications
    */
  var spotSpecifications: js.UndefOr[js.Array[InstanceFleetLaunchSpecificationsSpotSpecification]] = js.native
}
object InstanceFleetLaunchSpecifications {
  
  @scala.inline
  def apply(): InstanceFleetLaunchSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetLaunchSpecifications]
  }
  
  @scala.inline
  implicit class InstanceFleetLaunchSpecificationsOps[Self <: InstanceFleetLaunchSpecifications] (val x: Self) extends AnyVal {
    
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
    def setOnDemandSpecificationsVarargs(value: InstanceFleetLaunchSpecificationsOnDemandSpecification*): Self = this.set("onDemandSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setOnDemandSpecifications(value: js.Array[InstanceFleetLaunchSpecificationsOnDemandSpecification]): Self = this.set("onDemandSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandSpecifications: Self = this.set("onDemandSpecifications", js.undefined)
    
    @scala.inline
    def setSpotSpecificationsVarargs(value: InstanceFleetLaunchSpecificationsSpotSpecification*): Self = this.set("spotSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSpotSpecifications(value: js.Array[InstanceFleetLaunchSpecificationsSpotSpecification]): Self = this.set("spotSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotSpecifications: Self = this.set("spotSpecifications", js.undefined)
  }
}
