package typings.raml1Parser.spec1Dot0SecurityMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.spec1Dot0CommonMod.Annotable
import typings.raml1Parser.spec1Dot0CommonMod.AnnotationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth10SecuritySettings10
  extends StObject
     with Annotable {
  
  /**
    * The URI of the Resource Owner Authorization endpoint
    * as defined in RFC5849 Section 2.2
    */
  var authorizationUri: String
  
  /**
    * The URI of the Temporary Credential Request endpoint
    * as defined in RFC5849 Section 2.1
    */
  var requestTokenUri: String
  
  /**
    * List of the signature methods used by the server.
    * Available methods: HMAC-SHA1, RSA-SHA1, PLAINTEXT
    */
  var signatures: js.Array[String]
  
  /**
    * The URI of the Token Request endpoint as defined in RFC5849 Section 2.3
    */
  var tokenCredentialsUri: String
}
object OAuth10SecuritySettings10 {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    authorizationUri: String,
    requestTokenUri: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    signatures: js.Array[String],
    tokenCredentialsUri: String
  ): OAuth10SecuritySettings10 = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], authorizationUri = authorizationUri.asInstanceOf[js.Any], requestTokenUri = requestTokenUri.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], tokenCredentialsUri = tokenCredentialsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth10SecuritySettings10]
  }
  
  extension [Self <: OAuth10SecuritySettings10](x: Self) {
    
    inline def setAuthorizationUri(value: String): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUri(value: String): Self = StObject.set(x, "requestTokenUri", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value*))
    
    inline def setTokenCredentialsUri(value: String): Self = StObject.set(x, "tokenCredentialsUri", value.asInstanceOf[js.Any])
  }
}
