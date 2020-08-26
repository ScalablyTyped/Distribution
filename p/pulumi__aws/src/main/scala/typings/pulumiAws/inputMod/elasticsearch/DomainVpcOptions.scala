package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainVpcOptions extends js.Object {
  var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
    */
  var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
    */
  var subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var vpcId: js.UndefOr[Input[String]] = js.native
}

object DomainVpcOptions {
  @scala.inline
  def apply(): DomainVpcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainVpcOptions]
  }
  @scala.inline
  implicit class DomainVpcOptionsOps[Self <: DomainVpcOptions] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

