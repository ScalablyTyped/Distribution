package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialEntity extends StObject {
  
  var name: java.lang.String
}
object PublicKeyCredentialEntity {
  
  inline def apply(name: java.lang.String): PublicKeyCredentialEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialEntity]
  }
  
  extension [Self <: PublicKeyCredentialEntity](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
