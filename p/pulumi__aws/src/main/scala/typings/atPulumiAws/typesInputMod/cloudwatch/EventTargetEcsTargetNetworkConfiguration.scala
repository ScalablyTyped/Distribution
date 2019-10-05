package typings.atPulumiAws.typesInputMod.cloudwatch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetEcsTargetNetworkConfiguration extends js.Object {
  /**
    * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
    */
  var assignPublicIp: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The subnets associated with the task or service.
    */
  var subnets: Input[js.Array[Input[String]]]
}

object EventTargetEcsTargetNetworkConfiguration {
  @scala.inline
  def apply(
    subnets: Input[js.Array[Input[String]]],
    assignPublicIp: Input[Boolean] = null,
    securityGroups: Input[js.Array[Input[String]]] = null
  ): EventTargetEcsTargetNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    if (assignPublicIp != null) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetEcsTargetNetworkConfiguration]
  }
}

