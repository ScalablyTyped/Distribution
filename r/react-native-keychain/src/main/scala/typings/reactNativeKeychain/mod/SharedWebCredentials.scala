package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWebCredentials extends UserCredentials {
  
  var server: String = js.native
}
object SharedWebCredentials {
  
  @scala.inline
  def apply(password: String, server: String, service: String, storage: String, username: String): SharedWebCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWebCredentials]
  }
  
  @scala.inline
  implicit class SharedWebCredentialsMutableBuilder[Self <: SharedWebCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
