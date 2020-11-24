package typings.pulumiAws.webAclAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclAssociationArgs extends js.Object {
  
  /**
    * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
    */
  val resourceArn: Input[String] = js.native
  
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: Input[String] = js.native
}
object WebAclAssociationArgs {
  
  @scala.inline
  def apply(resourceArn: Input[String], webAclId: Input[String]): WebAclAssociationArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], webAclId = webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclAssociationArgs]
  }
  
  @scala.inline
  implicit class WebAclAssociationArgsOps[Self <: WebAclAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAclId(value: Input[String]): Self = this.set("webAclId", value.asInstanceOf[js.Any])
  }
}
