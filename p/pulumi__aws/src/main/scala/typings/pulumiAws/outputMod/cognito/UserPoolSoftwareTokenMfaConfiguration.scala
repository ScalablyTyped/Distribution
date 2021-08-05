package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolSoftwareTokenMfaConfiguration extends StObject {
  
  /**
    * Boolean whether to enable software token Multi-Factor (MFA) tokens, such as Time-based One-Time Password (TOTP). To disable software token MFA when `smsConfiguration` is not present, the `mfaConfiguration` argument must be set to `OFF` and the `softwareTokenMfaConfiguration` configuration block must be fully removed.
    */
  var enabled: Boolean
}
object UserPoolSoftwareTokenMfaConfiguration {
  
  inline def apply(enabled: Boolean): UserPoolSoftwareTokenMfaConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSoftwareTokenMfaConfiguration]
  }
  
  extension [Self <: UserPoolSoftwareTokenMfaConfiguration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
