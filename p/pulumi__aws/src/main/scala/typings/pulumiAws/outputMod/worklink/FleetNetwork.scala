package typings.pulumiAws.outputMod.worklink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetNetwork extends js.Object {
  /**
    * A list of security group IDs associated with access to the provided subnets.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The VPC ID with connectivity to associated websites.
    */
  var vpcId: String = js.native
}

object FleetNetwork {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FleetNetwork = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetNetwork]
  }
  @scala.inline
  implicit class FleetNetworkOps[Self <: FleetNetwork] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
  
}

