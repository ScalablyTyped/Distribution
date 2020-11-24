package typings.socketclusterClient.anon

import typings.socketclusterClient.authMod.AuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldAuthToken extends js.Object {
  
  var oldAuthToken: AuthToken = js.native
}
object OldAuthToken {
  
  @scala.inline
  def apply(oldAuthToken: AuthToken): OldAuthToken = {
    val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldAuthToken]
  }
  
  @scala.inline
  implicit class OldAuthTokenOps[Self <: OldAuthToken] (val x: Self) extends AnyVal {
    
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
    def setOldAuthToken(value: AuthToken): Self = this.set("oldAuthToken", value.asInstanceOf[js.Any])
  }
}
