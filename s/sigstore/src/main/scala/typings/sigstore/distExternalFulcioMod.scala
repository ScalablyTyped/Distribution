package typings.sigstore

import typings.sigstore.anon.Chain
import typings.sigstore.anon.OidcIdentityToken
import typings.sigstore.anon.ProofOfPossession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExternalFulcioMod {
  
  @JSImport("sigstore/dist/external/fulcio", "Fulcio")
  @js.native
  open class Fulcio protected () extends StObject {
    def this(options: FulcioOptions) = this()
    
    /* private */ var baseUrl: Any = js.native
    
    def createSigningCertificate(request: SigningCertificateRequest): js.Promise[SigningCertificateResponse] = js.native
    
    /* private */ var fetch: Any = js.native
  }
  
  trait FulcioOptions extends StObject {
    
    var baseURL: String
  }
  object FulcioOptions {
    
    inline def apply(baseURL: String): FulcioOptions = {
      val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[FulcioOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FulcioOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait SigningCertificateRequest extends StObject {
    
    var credentials: OidcIdentityToken
    
    var publicKeyRequest: ProofOfPossession
  }
  object SigningCertificateRequest {
    
    inline def apply(credentials: OidcIdentityToken, publicKeyRequest: ProofOfPossession): SigningCertificateRequest = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], publicKeyRequest = publicKeyRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigningCertificateRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SigningCertificateRequest] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: OidcIdentityToken): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyRequest(value: ProofOfPossession): Self = StObject.set(x, "publicKeyRequest", value.asInstanceOf[js.Any])
    }
  }
  
  trait SigningCertificateResponse extends StObject {
    
    var signedCertificateEmbeddedSct: Chain
  }
  object SigningCertificateResponse {
    
    inline def apply(signedCertificateEmbeddedSct: Chain): SigningCertificateResponse = {
      val __obj = js.Dynamic.literal(signedCertificateEmbeddedSct = signedCertificateEmbeddedSct.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigningCertificateResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SigningCertificateResponse] (val x: Self) extends AnyVal {
      
      inline def setSignedCertificateEmbeddedSct(value: Chain): Self = StObject.set(x, "signedCertificateEmbeddedSct", value.asInstanceOf[js.Any])
    }
  }
}
