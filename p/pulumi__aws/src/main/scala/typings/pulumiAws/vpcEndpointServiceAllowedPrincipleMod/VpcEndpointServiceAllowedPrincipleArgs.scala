package typings.pulumiAws.vpcEndpointServiceAllowedPrincipleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointServiceAllowedPrincipleArgs extends js.Object {
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: Input[String] = js.native
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: Input[String] = js.native
}

object VpcEndpointServiceAllowedPrincipleArgs {
  @scala.inline
  def apply(principalArn: Input[String], vpcEndpointServiceId: Input[String]): VpcEndpointServiceAllowedPrincipleArgs = {
    val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any], vpcEndpointServiceId = vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleArgs]
  }
}

