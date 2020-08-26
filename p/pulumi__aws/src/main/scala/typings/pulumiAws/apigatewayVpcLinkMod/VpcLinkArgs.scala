package typings.pulumiAws.apigatewayVpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcLinkArgs extends js.Object {
  /**
    * The description of the VPC link.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name used to label and identify the VPC link.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArn: Input[String] = js.native
}

object VpcLinkArgs {
  @scala.inline
  def apply(targetArn: Input[String]): VpcLinkArgs = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcLinkArgs]
  }
  @scala.inline
  implicit class VpcLinkArgsOps[Self <: VpcLinkArgs] (val x: Self) extends AnyVal {
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
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

