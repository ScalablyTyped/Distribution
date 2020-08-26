package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNetworkConfiguration extends js.Object {
  /**
    * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
    */
  var assignPublicIp: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The subnets associated with the task or service.
    */
  var subnets: Input[js.Array[Input[String]]] = js.native
}

object ServiceNetworkConfiguration {
  @scala.inline
  def apply(subnets: Input[js.Array[Input[String]]]): ServiceNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNetworkConfiguration]
  }
  @scala.inline
  implicit class ServiceNetworkConfigurationOps[Self <: ServiceNetworkConfiguration] (val x: Self) extends AnyVal {
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
    def setSubnetsVarargs(value: Input[String]*): Self = this.set("subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: Input[js.Array[Input[String]]]): Self = this.set("subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignPublicIp(value: Input[Boolean]): Self = this.set("assignPublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignPublicIp: Self = this.set("assignPublicIp", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
  }
  
}

