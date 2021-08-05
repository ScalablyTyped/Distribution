package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialDescriptor extends StObject {
  
  var id: BufferSource
  
  var transports: js.UndefOr[js.Array[AuthenticatorTransport]] = js.undefined
  
  var `type`: PublicKeyCredentialType
}
object PublicKeyCredentialDescriptor {
  
  inline def apply(id: BufferSource, `type`: PublicKeyCredentialType): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
  
  extension [Self <: PublicKeyCredentialDescriptor](x: Self) {
    
    inline def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTransports(value: js.Array[AuthenticatorTransport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: AuthenticatorTransport*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    inline def setType(value: PublicKeyCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
