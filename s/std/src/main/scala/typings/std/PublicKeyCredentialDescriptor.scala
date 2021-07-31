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
  
  @scala.inline
  def apply(id: BufferSource, `type`: PublicKeyCredentialType): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialDescriptorMutableBuilder[Self <: PublicKeyCredentialDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransports(value: js.Array[AuthenticatorTransport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: AuthenticatorTransport*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    @scala.inline
    def setType(value: PublicKeyCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
