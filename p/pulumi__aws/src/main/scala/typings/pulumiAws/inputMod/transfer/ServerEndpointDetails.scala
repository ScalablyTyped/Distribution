package typings.pulumiAws.inputMod.transfer

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var vpcEndpointId: Input[String] = js.native
}

object ServerEndpointDetails {
  @scala.inline
  def apply(vpcEndpointId: Input[String]): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEndpointDetails]
  }
  @scala.inline
  implicit class ServerEndpointDetailsOps[Self <: ServerEndpointDetails] (val x: Self) extends AnyVal {
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
    def setVpcEndpointId(value: Input[String]): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
  }
  
}

