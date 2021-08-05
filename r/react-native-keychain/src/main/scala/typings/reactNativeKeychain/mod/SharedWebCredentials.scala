package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWebCredentials
  extends StObject
     with UserCredentials {
  
  var server: String
}
object SharedWebCredentials {
  
  inline def apply(password: String, server: String, service: String, storage: String, username: String): SharedWebCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWebCredentials]
  }
  
  extension [Self <: SharedWebCredentials](x: Self) {
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
