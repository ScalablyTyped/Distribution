package typings.pulumiAws.wafv2WebAclAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclAssociationArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
    */
  val resourceArn: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
    */
  val webAclArn: Input[String] = js.native
}

object WebAclAssociationArgs {
  @scala.inline
  def apply(resourceArn: Input[String], webAclArn: Input[String]): WebAclAssociationArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], webAclArn = webAclArn.asInstanceOf[js.Any])
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
    def setWebAclArn(value: Input[String]): Self = this.set("webAclArn", value.asInstanceOf[js.Any])
  }
  
}

