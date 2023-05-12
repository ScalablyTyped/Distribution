package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.`oob otp`
import typings.reactNativeAuth0.reactNativeAuth0Strings.`otp oob`
import typings.reactNativeAuth0.reactNativeAuth0Strings.oob
import typings.reactNativeAuth0.reactNativeAuth0Strings.otp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorChallengeResponse extends StObject {
  
  var bindingMethod: js.UndefOr[String] = js.undefined
  
  var challengeType: js.UndefOr[oob | otp | (`oob otp`) | (`otp oob`)] = js.undefined
  
  var oobCode: js.UndefOr[String] = js.undefined
}
object MultiFactorChallengeResponse {
  
  inline def apply(): MultiFactorChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiFactorChallengeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFactorChallengeResponse] (val x: Self) extends AnyVal {
    
    inline def setBindingMethod(value: String): Self = StObject.set(x, "bindingMethod", value.asInstanceOf[js.Any])
    
    inline def setBindingMethodUndefined: Self = StObject.set(x, "bindingMethod", js.undefined)
    
    inline def setChallengeType(value: oob | otp | (`oob otp`) | (`otp oob`)): Self = StObject.set(x, "challengeType", value.asInstanceOf[js.Any])
    
    inline def setChallengeTypeUndefined: Self = StObject.set(x, "challengeType", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
