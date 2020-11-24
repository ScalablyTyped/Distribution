package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolDeviceConfiguration extends js.Object {
  
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var challengeRequiredOnNewDevice: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * If true, a device is only remembered on user prompt.
    */
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[Input[Boolean]] = js.native
}
object UserPoolDeviceConfiguration {
  
  @scala.inline
  def apply(): UserPoolDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDeviceConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolDeviceConfigurationOps[Self <: UserPoolDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChallengeRequiredOnNewDevice(value: Input[Boolean]): Self = this.set("challengeRequiredOnNewDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeRequiredOnNewDevice: Self = this.set("challengeRequiredOnNewDevice", js.undefined)
    
    @scala.inline
    def setDeviceOnlyRememberedOnUserPrompt(value: Input[Boolean]): Self = this.set("deviceOnlyRememberedOnUserPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceOnlyRememberedOnUserPrompt: Self = this.set("deviceOnlyRememberedOnUserPrompt", js.undefined)
  }
}
