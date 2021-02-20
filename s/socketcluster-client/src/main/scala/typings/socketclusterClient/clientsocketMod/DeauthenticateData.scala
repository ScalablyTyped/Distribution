package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeauthenticateData extends StObject {
  
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
  implicit class DeauthenticateDataMutableBuilder[Self <: DeauthenticateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldAuthToken(value: AuthToken): Self = StObject.set(x, "oldAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldAuthTokenNull: Self = StObject.set(x, "oldAuthToken", null)
    
    @scala.inline
    def setOldSignedAuthToken(value: SignedAuthToken): Self = StObject.set(x, "oldSignedAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSignedAuthTokenNull: Self = StObject.set(x, "oldSignedAuthToken", null)
  }
}
