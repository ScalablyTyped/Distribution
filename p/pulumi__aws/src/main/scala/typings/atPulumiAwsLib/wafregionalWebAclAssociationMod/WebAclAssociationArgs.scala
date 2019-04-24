package typings
package atPulumiAwsLib.wafregionalWebAclAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclAssociationArgs extends js.Object {
  /**
    * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
    */
  val resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object WebAclAssociationArgs {
  @scala.inline
  def apply(
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    webAclId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): WebAclAssociationArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], webAclId = webAclId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebAclAssociationArgs]
  }
}

