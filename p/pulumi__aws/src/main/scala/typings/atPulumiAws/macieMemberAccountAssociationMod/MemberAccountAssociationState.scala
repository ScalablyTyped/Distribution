package typings.atPulumiAws.macieMemberAccountAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccountAssociationState extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: js.UndefOr[Input[String]] = js.native
}

object MemberAccountAssociationState {
  @scala.inline
  def apply(memberAccountId: Input[String] = null): MemberAccountAssociationState = {
    val __obj = js.Dynamic.literal()
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountAssociationState]
  }
}

