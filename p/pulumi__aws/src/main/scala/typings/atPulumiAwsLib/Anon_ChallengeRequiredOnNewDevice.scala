package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChallengeRequiredOnNewDevice extends js.Object {
  var challengeRequiredOnNewDevice: js.UndefOr[scala.Boolean] = js.undefined
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ChallengeRequiredOnNewDevice {
  @scala.inline
  def apply(
    challengeRequiredOnNewDevice: js.UndefOr[scala.Boolean] = js.undefined,
    deviceOnlyRememberedOnUserPrompt: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ChallengeRequiredOnNewDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(challengeRequiredOnNewDevice)) __obj.updateDynamic("challengeRequiredOnNewDevice")(challengeRequiredOnNewDevice)
    if (!js.isUndefined(deviceOnlyRememberedOnUserPrompt)) __obj.updateDynamic("deviceOnlyRememberedOnUserPrompt")(deviceOnlyRememberedOnUserPrompt)
    __obj.asInstanceOf[Anon_ChallengeRequiredOnNewDevice]
  }
}

