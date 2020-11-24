package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCredential extends js.Object {
  
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo] = js.native
  
  var user: User = js.native
}
object UserCredential {
  
  @scala.inline
  def apply(user: User): UserCredential = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredential]
  }
  
  @scala.inline
  implicit class UserCredentialOps[Self <: UserCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalUserInfo(value: AdditionalUserInfo): Self = this.set("additionalUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalUserInfo: Self = this.set("additionalUserInfo", js.undefined)
  }
}
