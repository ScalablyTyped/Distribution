package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolDeviceConfiguration extends StObject {
  
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var challengeRequiredOnNewDevice: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * If true, a device is only remembered on user prompt.
    */
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[Input[Boolean]] = js.undefined
}
object UserPoolDeviceConfiguration {
  
  inline def apply(): UserPoolDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDeviceConfiguration]
  }
  
  extension [Self <: UserPoolDeviceConfiguration](x: Self) {
    
    inline def setChallengeRequiredOnNewDevice(value: Input[Boolean]): Self = StObject.set(x, "challengeRequiredOnNewDevice", value.asInstanceOf[js.Any])
    
    inline def setChallengeRequiredOnNewDeviceUndefined: Self = StObject.set(x, "challengeRequiredOnNewDevice", js.undefined)
    
    inline def setDeviceOnlyRememberedOnUserPrompt(value: Input[Boolean]): Self = StObject.set(x, "deviceOnlyRememberedOnUserPrompt", value.asInstanceOf[js.Any])
    
    inline def setDeviceOnlyRememberedOnUserPromptUndefined: Self = StObject.set(x, "deviceOnlyRememberedOnUserPrompt", js.undefined)
  }
}
