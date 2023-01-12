package typings.socketclusterServer.serverMod

import typings.jsonwebtoken.mod.Jwt
import typings.jsonwebtoken.mod.Secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ag-auth.ag-auth.^, 'verifyToken' | 'signToken'> */
trait AuthEngineType extends StObject {
  
  def signToken(token: String, key: Secret): js.Promise[js.UndefOr[String]]
  @JSName("signToken")
  var signToken_Original: js.Function2[/* token */ String, /* key */ Secret, js.Promise[js.UndefOr[String]]]
  
  def verifyToken(signedToken: String, key: Secret): js.Promise[Jwt]
  @JSName("verifyToken")
  var verifyToken_Original: js.Function2[/* signedToken */ String, /* key */ Secret, js.Promise[Jwt]]
}
object AuthEngineType {
  
  inline def apply(
    signToken: (/* token */ String, /* key */ Secret) => js.Promise[js.UndefOr[String]],
    verifyToken: (/* signedToken */ String, /* key */ Secret) => js.Promise[Jwt]
  ): AuthEngineType = {
    val __obj = js.Dynamic.literal(signToken = js.Any.fromFunction2(signToken), verifyToken = js.Any.fromFunction2(verifyToken))
    __obj.asInstanceOf[AuthEngineType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthEngineType] (val x: Self) extends AnyVal {
    
    inline def setSignToken(value: (/* token */ String, /* key */ Secret) => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "signToken", js.Any.fromFunction2(value))
    
    inline def setVerifyToken(value: (/* signedToken */ String, /* key */ Secret) => js.Promise[Jwt]): Self = StObject.set(x, "verifyToken", js.Any.fromFunction2(value))
  }
}
