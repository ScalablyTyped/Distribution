package typings
package atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceAllowedPrincipleState extends js.Object {
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcEndpointServiceAllowedPrincipleState {
  @scala.inline
  def apply(
    principalArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcEndpointServiceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpcEndpointServiceAllowedPrincipleState = {
    val __obj = js.Dynamic.literal()
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn.asInstanceOf[js.Any])
    if (vpcEndpointServiceId != null) __obj.updateDynamic("vpcEndpointServiceId")(vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleState]
  }
}

