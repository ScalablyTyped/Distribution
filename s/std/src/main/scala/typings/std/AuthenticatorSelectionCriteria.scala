package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatorSelectionCriteria extends js.Object {
  
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.native
  
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.native
  
  var residentKey: js.UndefOr[ResidentKeyRequirement] = js.native
  
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.native
}
object AuthenticatorSelectionCriteria {
  
  @scala.inline
  def apply(): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
  
  @scala.inline
  implicit class AuthenticatorSelectionCriteriaOps[Self <: AuthenticatorSelectionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticatorAttachment(value: AuthenticatorAttachment): Self = this.set("authenticatorAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticatorAttachment: Self = this.set("authenticatorAttachment", js.undefined)
    
    @scala.inline
    def setRequireResidentKey(value: scala.Boolean): Self = this.set("requireResidentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireResidentKey: Self = this.set("requireResidentKey", js.undefined)
    
    @scala.inline
    def setResidentKey(value: ResidentKeyRequirement): Self = this.set("residentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResidentKey: Self = this.set("residentKey", js.undefined)
    
    @scala.inline
    def setUserVerification(value: UserVerificationRequirement): Self = this.set("userVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVerification: Self = this.set("userVerification", js.undefined)
  }
}
