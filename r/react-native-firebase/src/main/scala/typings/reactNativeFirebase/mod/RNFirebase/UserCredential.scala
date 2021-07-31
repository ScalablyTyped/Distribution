package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCredential extends StObject {
  
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo] = js.undefined
  
  var user: User
}
object UserCredential {
  
  @scala.inline
  def apply(user: User): UserCredential = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredential]
  }
  
  @scala.inline
  implicit class UserCredentialMutableBuilder[Self <: UserCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalUserInfo(value: AdditionalUserInfo): Self = StObject.set(x, "additionalUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalUserInfoUndefined: Self = StObject.set(x, "additionalUserInfo", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
