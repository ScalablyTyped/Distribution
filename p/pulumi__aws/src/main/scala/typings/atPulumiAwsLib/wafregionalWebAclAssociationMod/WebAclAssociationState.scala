package typings
package atPulumiAwsLib.wafregionalWebAclAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclAssociationState extends js.Object {
  /**
    * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
    */
  val resourceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object WebAclAssociationState {
  @scala.inline
  def apply(
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    webAclId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): WebAclAssociationState = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (webAclId != null) __obj.updateDynamic("webAclId")(webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclAssociationState]
  }
}

