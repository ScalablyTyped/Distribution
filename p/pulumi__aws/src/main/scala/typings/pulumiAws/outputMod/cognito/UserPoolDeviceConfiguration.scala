package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolDeviceConfiguration extends StObject {
  
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
  def apply(): UserPoolDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDeviceConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolDeviceConfigurationMutableBuilder[Self <: UserPoolDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeRequiredOnNewDevice(value: Boolean): Self = StObject.set(x, "challengeRequiredOnNewDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeRequiredOnNewDeviceUndefined: Self = StObject.set(x, "challengeRequiredOnNewDevice", js.undefined)
    
    @scala.inline
    def setDeviceOnlyRememberedOnUserPrompt(value: Boolean): Self = StObject.set(x, "deviceOnlyRememberedOnUserPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOnlyRememberedOnUserPromptUndefined: Self = StObject.set(x, "deviceOnlyRememberedOnUserPrompt", js.undefined)
  }
}
