package typings
package atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceAllowedPrincipleArgs extends js.Object {
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcEndpointServiceAllowedPrincipleArgs {
  @scala.inline
  def apply(
    principalArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcEndpointServiceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): VpcEndpointServiceAllowedPrincipleArgs = {
    val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any], vpcEndpointServiceId = vpcEndpointServiceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleArgs]
  }
}

