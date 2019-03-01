package typings
package atPulumiAwsLib.macieMemberAccountAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAccountAssociationArgs extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object MemberAccountAssociationArgs {
  @scala.inline
  def apply(memberAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]): MemberAccountAssociationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountAssociationArgs]
  }
}

