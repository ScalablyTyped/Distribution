package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeauthenticateData extends js.Object {
  
  var oldAuthToken: AuthToken | Null = js.native
  
  var oldSignedAuthToken: SignedAuthToken | Null = js.native
}
object DeauthenticateData {
  
  @scala.inline
  def apply(): DeauthenticateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeauthenticateData]
  }
  
  @scala.inline
  implicit class DeauthenticateDataOps[Self <: DeauthenticateData] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setOldAuthTokenNull: Self = this.set("oldAuthToken", null)
    
    @scala.inline
    def setOldSignedAuthToken(value: SignedAuthToken): Self = this.set("oldSignedAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSignedAuthTokenNull: Self = this.set("oldSignedAuthToken", null)
  }
}
