package typings.pulumiAws.principalAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalAssociationArgs extends js.Object {
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
    */
  val principal: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: Input[String] = js.native
}

object PrincipalAssociationArgs {
  @scala.inline
  def apply(principal: Input[String], resourceShareArn: Input[String]): PrincipalAssociationArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalAssociationArgs]
  }
  @scala.inline
  implicit class PrincipalAssociationArgsOps[Self <: PrincipalAssociationArgs] (val x: Self) extends AnyVal {
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
    def setPrincipal(value: Input[String]): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceShareArn(value: Input[String]): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
  }
  
}

