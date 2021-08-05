package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolSoftwareTokenMfaConfiguration extends StObject {
  
  /**
    * Boolean whether to enable software token Multi-Factor (MFA) tokens, such as Time-based One-Time Password (TOTP). To disable software token MFA when `smsConfiguration` is not present, the `mfaConfiguration` argument must be set to `OFF` and the `softwareTokenMfaConfiguration` configuration block must be fully removed.
    */
  var enabled: Input[Boolean]
}
object UserPoolSoftwareTokenMfaConfiguration {
  
  inline def apply(enabled: Input[Boolean]): UserPoolSoftwareTokenMfaConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSoftwareTokenMfaConfiguration]
  }
  
  extension [Self <: UserPoolSoftwareTokenMfaConfiguration](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
