package typings.pulumiAws.s3outpostsEndpointMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointArgs extends js.Object {
  
  /**
    * Identifier of the Outpost to contain this endpoint.
    */
  val outpostId: Input[String] = js.native
  
  /**
    * Identifier of the EC2 Security Group.
    */
  val securityGroupId: Input[String] = js.native
  
  /**
    * Identifier of the EC2 Subnet.
    */
  val subnetId: Input[String] = js.native
}
object EndpointArgs {
  
  @scala.inline
  def apply(outpostId: Input[String], securityGroupId: Input[String], subnetId: Input[String]): EndpointArgs = {
    val __obj = js.Dynamic.literal(outpostId = outpostId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
  
  @scala.inline
  implicit class EndpointArgsOps[Self <: EndpointArgs] (val x: Self) extends AnyVal {
    
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
    def setOutpostId(value: Input[String]): Self = this.set("outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
  }
}
