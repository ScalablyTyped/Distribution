package typings.pulumiAws.webAclAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

