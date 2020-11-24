package typings.pulumiAws.availabilityZoneGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZoneGroupArgs extends js.Object {
  
  /**
    * Name of the Availability Zone Group.
    */
  val groupName: Input[String] = js.native
  
  /**
    * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
    */
  val optInStatus: Input[String] = js.native
}
object AvailabilityZoneGroupArgs {
  
  @scala.inline
  def apply(groupName: Input[String], optInStatus: Input[String]): AvailabilityZoneGroupArgs = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZoneGroupArgs]
  }
  
  @scala.inline
  implicit class AvailabilityZoneGroupArgsOps[Self <: AvailabilityZoneGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setOptInStatus(value: Input[String]): Self = this.set("optInStatus", value.asInstanceOf[js.Any])
  }
}
