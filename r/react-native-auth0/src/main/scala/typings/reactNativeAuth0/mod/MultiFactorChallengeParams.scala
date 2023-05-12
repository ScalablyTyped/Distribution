package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.`oob otp`
import typings.reactNativeAuth0.reactNativeAuth0Strings.`otp oob`
import typings.reactNativeAuth0.reactNativeAuth0Strings.oob
import typings.reactNativeAuth0.reactNativeAuth0Strings.otp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorChallengeParams extends StObject {
  
  var authenticatorId: js.UndefOr[String] = js.undefined
  
  var challengeType: js.UndefOr[oob | otp | (`oob otp`) | (`otp oob`)] = js.undefined
  
  var mfaToken: String
}
object MultiFactorChallengeParams {
  
  inline def apply(mfaToken: String): MultiFactorChallengeParams = {
    val __obj = js.Dynamic.literal(mfaToken = mfaToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorChallengeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFactorChallengeParams] (val x: Self) extends AnyVal {
    
    inline def setAuthenticatorId(value: String): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorIdUndefined: Self = StObject.set(x, "authenticatorId", js.undefined)
    
    inline def setChallengeType(value: oob | otp | (`oob otp`) | (`otp oob`)): Self = StObject.set(x, "challengeType", value.asInstanceOf[js.Any])
    
    inline def setChallengeTypeUndefined: Self = StObject.set(x, "challengeType", js.undefined)
    
    inline def setMfaToken(value: String): Self = StObject.set(x, "mfaToken", value.asInstanceOf[js.Any])
  }
}
