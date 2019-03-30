package typings
package atPulumiAwsLib.guarddutyInviteAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteAccepterState extends js.Object {
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object InviteAccepterState {
  @scala.inline
  def apply(
    detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): InviteAccepterState = {
    val __obj = js.Dynamic.literal()
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (masterAccountId != null) __obj.updateDynamic("masterAccountId")(masterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAccepterState]
  }
}

