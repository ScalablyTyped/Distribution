package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChallengeRequiredOnNewDeviceDeviceOnlyRememberedOnUserPrompt extends js.Object {
  var challengeRequiredOnNewDevice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_ChallengeRequiredOnNewDeviceDeviceOnlyRememberedOnUserPrompt {
  @scala.inline
  def apply(
    challengeRequiredOnNewDevice: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    deviceOnlyRememberedOnUserPrompt: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_ChallengeRequiredOnNewDeviceDeviceOnlyRememberedOnUserPrompt = {
    val __obj = js.Dynamic.literal()
    if (challengeRequiredOnNewDevice != null) __obj.updateDynamic("challengeRequiredOnNewDevice")(challengeRequiredOnNewDevice.asInstanceOf[js.Any])
    if (deviceOnlyRememberedOnUserPrompt != null) __obj.updateDynamic("deviceOnlyRememberedOnUserPrompt")(deviceOnlyRememberedOnUserPrompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChallengeRequiredOnNewDeviceDeviceOnlyRememberedOnUserPrompt]
  }
}

