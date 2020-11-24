package typings.pulumiAws.availabilityZoneGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZoneGroupState extends js.Object {
  
  /**
    * Name of the Availability Zone Group.
    */
  val groupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
    */
  val optInStatus: js.UndefOr[Input[String]] = js.native
}
object AvailabilityZoneGroupState {
  
  @scala.inline
  def apply(): AvailabilityZoneGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneGroupState]
  }
  
  @scala.inline
  implicit class AvailabilityZoneGroupStateOps[Self <: AvailabilityZoneGroupState] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: Input[String]): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setOptInStatus(value: Input[String]): Self = this.set("optInStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptInStatus: Self = this.set("optInStatus", js.undefined)
  }
}
