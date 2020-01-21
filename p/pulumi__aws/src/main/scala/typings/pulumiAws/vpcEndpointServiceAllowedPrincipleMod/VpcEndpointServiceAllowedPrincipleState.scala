package typings.pulumiAws.vpcEndpointServiceAllowedPrincipleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointServiceAllowedPrincipleState extends js.Object {
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointServiceAllowedPrincipleState {
  @scala.inline
  def apply(principalArn: Input[String] = null, vpcEndpointServiceId: Input[String] = null): VpcEndpointServiceAllowedPrincipleState = {
    val __obj = js.Dynamic.literal()
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn.asInstanceOf[js.Any])
    if (vpcEndpointServiceId != null) __obj.updateDynamic("vpcEndpointServiceId")(vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleState]
  }
}

