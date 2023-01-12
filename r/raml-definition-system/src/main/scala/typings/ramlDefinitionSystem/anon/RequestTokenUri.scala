package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTokenUri extends StObject {
  
  var annotations: NameString
  
  var authorizationUri: NameString
  
  var requestTokenUri: NameString
  
  var signatures: NameString
  
  var tokenCredentialsUri: NameString
}
object RequestTokenUri {
  
  inline def apply(
    annotations: NameString,
    authorizationUri: NameString,
    requestTokenUri: NameString,
    signatures: NameString,
    tokenCredentialsUri: NameString
  ): RequestTokenUri = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], authorizationUri = authorizationUri.asInstanceOf[js.Any], requestTokenUri = requestTokenUri.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], tokenCredentialsUri = tokenCredentialsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTokenUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestTokenUri] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUri(value: NameString): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUri(value: NameString): Self = StObject.set(x, "requestTokenUri", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: NameString): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setTokenCredentialsUri(value: NameString): Self = StObject.set(x, "tokenCredentialsUri", value.asInstanceOf[js.Any])
  }
}
