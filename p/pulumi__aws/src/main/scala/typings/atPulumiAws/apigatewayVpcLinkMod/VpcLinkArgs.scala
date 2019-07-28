package typings.atPulumiAws.apigatewayVpcLinkMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcLinkArgs extends js.Object {
  /**
    * The description of the VPC link.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name used to label and identify the VPC link.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArn: Input[String]
}

object VpcLinkArgs {
  @scala.inline
  def apply(targetArn: Input[String], description: Input[String] = null, name: Input[String] = null): VpcLinkArgs = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcLinkArgs]
  }
}

