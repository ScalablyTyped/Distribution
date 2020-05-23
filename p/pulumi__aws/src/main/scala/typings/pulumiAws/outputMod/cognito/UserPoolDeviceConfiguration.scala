package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDeviceConfiguration extends js.Object {
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var challengeRequiredOnNewDevice: js.UndefOr[Boolean] = js.native
  /**
    * If true, a device is only remembered on user prompt.
    */
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[Boolean] = js.native
}

object UserPoolDeviceConfiguration {
  @scala.inline
  def apply(
    challengeRequiredOnNewDevice: js.UndefOr[Boolean] = js.undefined,
    deviceOnlyRememberedOnUserPrompt: js.UndefOr[Boolean] = js.undefined
  ): UserPoolDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(challengeRequiredOnNewDevice)) __obj.updateDynamic("challengeRequiredOnNewDevice")(challengeRequiredOnNewDevice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceOnlyRememberedOnUserPrompt)) __obj.updateDynamic("deviceOnlyRememberedOnUserPrompt")(deviceOnlyRememberedOnUserPrompt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDeviceConfiguration]
  }
}

