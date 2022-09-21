package typings.qiniuJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationString extends StObject {
  
  var Authorization: String
}
object AuthorizationString {
  
  inline def apply(Authorization: String): AuthorizationString = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationString]
  }
  
  extension [Self <: AuthorizationString](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
  }
}
