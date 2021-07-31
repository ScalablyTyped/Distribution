package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatorSelectionCriteria extends StObject {
  
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.undefined
  
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined
  
  var residentKey: js.UndefOr[ResidentKeyRequirement] = js.undefined
  
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}
object AuthenticatorSelectionCriteria {
  
  @scala.inline
  def apply(): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
  
  @scala.inline
  implicit class AuthenticatorSelectionCriteriaMutableBuilder[Self <: AuthenticatorSelectionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorAttachment(value: AuthenticatorAttachment): Self = StObject.set(x, "authenticatorAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticatorAttachmentUndefined: Self = StObject.set(x, "authenticatorAttachment", js.undefined)
    
    @scala.inline
    def setRequireResidentKey(value: scala.Boolean): Self = StObject.set(x, "requireResidentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireResidentKeyUndefined: Self = StObject.set(x, "requireResidentKey", js.undefined)
    
    @scala.inline
    def setResidentKey(value: ResidentKeyRequirement): Self = StObject.set(x, "residentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidentKeyUndefined: Self = StObject.set(x, "residentKey", js.undefined)
    
    @scala.inline
    def setUserVerification(value: UserVerificationRequirement): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
