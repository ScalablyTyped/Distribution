package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplatePlacement extends js.Object {
  
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var affinity: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Availability Zone for the instance.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the placement group for the instance.
    */
  var groupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var hostId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var partitionNumber: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Reserved for future use.
    */
  var spreadDomain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). Can be `default`, `dedicated`, or `host`.
    */
  var tenancy: js.UndefOr[Input[String]] = js.native
}
object LaunchTemplatePlacement {
  
  @scala.inline
  def apply(): LaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacement]
  }
  
  @scala.inline
  implicit class LaunchTemplatePlacementOps[Self <: LaunchTemplatePlacement] (val x: Self) extends AnyVal {
    
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
    def setAffinity(value: Input[String]): Self = this.set("affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffinity: Self = this.set("affinity", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: Input[String]): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setHostId(value: Input[String]): Self = this.set("hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostId: Self = this.set("hostId", js.undefined)
    
    @scala.inline
    def setPartitionNumber(value: Input[Double]): Self = this.set("partitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionNumber: Self = this.set("partitionNumber", js.undefined)
    
    @scala.inline
    def setSpreadDomain(value: Input[String]): Self = this.set("spreadDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadDomain: Self = this.set("spreadDomain", js.undefined)
    
    @scala.inline
    def setTenancy(value: Input[String]): Self = this.set("tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancy: Self = this.set("tenancy", js.undefined)
  }
}
