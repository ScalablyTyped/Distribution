package typings
package atPulumiAwsLib.macieMemberAccountAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAccountAssociationState extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object MemberAccountAssociationState {
  @scala.inline
  def apply(memberAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): MemberAccountAssociationState = {
    val __obj = js.Dynamic.literal()
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountAssociationState]
  }
}

