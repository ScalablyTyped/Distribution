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
  def apply(): VpcEndpointServiceAllowedPrincipleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleState]
  }
  @scala.inline
  implicit class VpcEndpointServiceAllowedPrincipleStateOps[Self <: VpcEndpointServiceAllowedPrincipleState] (val x: Self) extends AnyVal {
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
    def setPrincipalArn(value: Input[String]): Self = this.set("principalArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalArn: Self = this.set("principalArn", js.undefined)
    @scala.inline
    def setVpcEndpointServiceId(value: Input[String]): Self = this.set("vpcEndpointServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointServiceId: Self = this.set("vpcEndpointServiceId", js.undefined)
  }
  
}

