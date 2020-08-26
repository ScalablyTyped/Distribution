package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPhysicalConnectionRequirements extends js.Object {
  /**
    * The availability zone of the connection. This field is redundant and implied by `subnetId`, but is currently an api requirement.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The security group ID list used by the connection.
    */
  var securityGroupIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The subnet ID used by the connection.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
}

object ConnectionPhysicalConnectionRequirements {
  @scala.inline
  def apply(): ConnectionPhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionPhysicalConnectionRequirements]
  }
  @scala.inline
  implicit class ConnectionPhysicalConnectionRequirementsOps[Self <: ConnectionPhysicalConnectionRequirements] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setSecurityGroupIdListsVarargs(value: Input[String]*): Self = this.set("securityGroupIdLists", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIdLists(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIdLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIdLists: Self = this.set("securityGroupIdLists", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
  
}

