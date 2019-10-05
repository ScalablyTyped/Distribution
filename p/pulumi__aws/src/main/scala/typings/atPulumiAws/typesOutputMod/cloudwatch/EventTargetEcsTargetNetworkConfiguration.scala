package typings.atPulumiAws.typesOutputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetEcsTargetNetworkConfiguration extends js.Object {
  /**
    * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.undefined
  /**
    * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
    */
  var securityGroups: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The subnets associated with the task or service.
    */
  var subnets: js.Array[String]
}

object EventTargetEcsTargetNetworkConfiguration {
  @scala.inline
  def apply(
    subnets: js.Array[String],
    assignPublicIp: js.UndefOr[Boolean] = js.undefined,
    securityGroups: js.Array[String] = null
  ): EventTargetEcsTargetNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets)
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.asInstanceOf[EventTargetEcsTargetNetworkConfiguration]
  }
}

