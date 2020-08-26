package typings.pulumiAws.webAclAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclAssociationState extends js.Object {
  /**
    * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: js.UndefOr[Input[String]] = js.native
}

object WebAclAssociationState {
  @scala.inline
  def apply(): WebAclAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclAssociationState]
  }
  @scala.inline
  implicit class WebAclAssociationStateOps[Self <: WebAclAssociationState] (val x: Self) extends AnyVal {
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
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
    @scala.inline
    def setWebAclId(value: Input[String]): Self = this.set("webAclId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebAclId: Self = this.set("webAclId", js.undefined)
  }
  
}

