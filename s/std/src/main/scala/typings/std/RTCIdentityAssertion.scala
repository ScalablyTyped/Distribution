package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIdentityAssertion extends StObject {
  
  var idp: java.lang.String
  
  var name: java.lang.String
}
object RTCIdentityAssertion {
  
  inline def apply(idp: java.lang.String, name: java.lang.String): RTCIdentityAssertion = {
    val __obj = js.Dynamic.literal(idp = idp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityAssertion]
  }
  
  extension [Self <: RTCIdentityAssertion](x: Self) {
    
    inline def setIdp(value: java.lang.String): Self = StObject.set(x, "idp", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
