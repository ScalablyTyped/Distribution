package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatorSelectionCriteria extends StObject {
  
  /* standard dom */
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.undefined
  
  /* standard dom */
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var residentKey: js.UndefOr[ResidentKeyRequirement] = js.undefined
  
  /* standard dom */
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}
object AuthenticatorSelectionCriteria {
  
  inline def apply(): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticatorSelectionCriteria] (val x: Self) extends AnyVal {
    
    inline def setAuthenticatorAttachment(value: AuthenticatorAttachment): Self = StObject.set(x, "authenticatorAttachment", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorAttachmentUndefined: Self = StObject.set(x, "authenticatorAttachment", js.undefined)
    
    inline def setRequireResidentKey(value: scala.Boolean): Self = StObject.set(x, "requireResidentKey", value.asInstanceOf[js.Any])
    
    inline def setRequireResidentKeyUndefined: Self = StObject.set(x, "requireResidentKey", js.undefined)
    
    inline def setResidentKey(value: ResidentKeyRequirement): Self = StObject.set(x, "residentKey", value.asInstanceOf[js.Any])
    
    inline def setResidentKeyUndefined: Self = StObject.set(x, "residentKey", js.undefined)
    
    inline def setUserVerification(value: UserVerificationRequirement): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    inline def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
