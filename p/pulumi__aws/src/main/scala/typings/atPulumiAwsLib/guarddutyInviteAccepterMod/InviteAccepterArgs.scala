package typings
package atPulumiAwsLib.guarddutyInviteAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteAccepterArgs extends js.Object {
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object InviteAccepterArgs {
  @scala.inline
  def apply(
    detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    masterAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): InviteAccepterArgs = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], masterAccountId = masterAccountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InviteAccepterArgs]
  }
}

