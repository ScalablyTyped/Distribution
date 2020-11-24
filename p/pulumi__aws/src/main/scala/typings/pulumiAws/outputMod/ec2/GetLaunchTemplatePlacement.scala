package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplatePlacement extends js.Object {
  
  var affinity: String = js.native
  
  var availabilityZone: String = js.native
  
  var groupName: String = js.native
  
  var hostId: String = js.native
  
  var partitionNumber: Double = js.native
  
  var spreadDomain: String = js.native
  
  var tenancy: String = js.native
}
object GetLaunchTemplatePlacement {
  
  @scala.inline
  def apply(
    affinity: String,
    availabilityZone: String,
    groupName: String,
    hostId: String,
    partitionNumber: Double,
    spreadDomain: String,
    tenancy: String
  ): GetLaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], partitionNumber = partitionNumber.asInstanceOf[js.Any], spreadDomain = spreadDomain.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplatePlacement]
  }
  
  @scala.inline
  implicit class GetLaunchTemplatePlacementOps[Self <: GetLaunchTemplatePlacement] (val x: Self) extends AnyVal {
    
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
    def setAffinity(value: String): Self = this.set("affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostId(value: String): Self = this.set("hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionNumber(value: Double): Self = this.set("partitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadDomain(value: String): Self = this.set("spreadDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancy(value: String): Self = this.set("tenancy", value.asInstanceOf[js.Any])
  }
}
