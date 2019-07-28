package typings.atPulumiAws.ramPrincipalAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalAssociationState extends js.Object {
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
    */
  val principal: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: js.UndefOr[Input[String]] = js.undefined
}

object PrincipalAssociationState {
  @scala.inline
  def apply(principal: Input[String] = null, resourceShareArn: Input[String] = null): PrincipalAssociationState = {
    val __obj = js.Dynamic.literal()
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalAssociationState]
  }
}

