package typings.pulumiAws.memberAccountAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccountAssociationArgs extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: Input[String] = js.native
}

object MemberAccountAssociationArgs {
  @scala.inline
  def apply(memberAccountId: Input[String]): MemberAccountAssociationArgs = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountAssociationArgs]
  }
}

