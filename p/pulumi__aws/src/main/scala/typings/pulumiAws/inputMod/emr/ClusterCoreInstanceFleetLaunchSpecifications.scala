package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleetLaunchSpecifications extends js.Object {
  
  /**
    * Configuration block for on demand instances launch specifications
    */
  var onDemandSpecifications: js.UndefOr[
    Input[
      js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification]]
    ]
  ] = js.native
  
  /**
    * Configuration block for spot instances launch specifications
    */
  var spotSpecifications: js.UndefOr[
    Input[js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]]]
  ] = js.native
}
object ClusterCoreInstanceFleetLaunchSpecifications {
  
  @scala.inline
  def apply(): ClusterCoreInstanceFleetLaunchSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCoreInstanceFleetLaunchSpecifications]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetLaunchSpecificationsOps[Self <: ClusterCoreInstanceFleetLaunchSpecifications] (val x: Self) extends AnyVal {
    
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
    def setOnDemandSpecificationsVarargs(value: Input[ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification]*): Self = this.set("onDemandSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setOnDemandSpecifications(
      value: Input[
          js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification]]
        ]
    ): Self = this.set("onDemandSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandSpecifications: Self = this.set("onDemandSpecifications", js.undefined)
    
    @scala.inline
    def setSpotSpecificationsVarargs(value: Input[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]*): Self = this.set("spotSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSpotSpecifications(value: Input[js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]]]): Self = this.set("spotSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotSpecifications: Self = this.set("spotSpecifications", js.undefined)
  }
}
