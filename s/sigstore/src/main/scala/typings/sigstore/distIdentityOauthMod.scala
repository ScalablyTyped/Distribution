package typings.sigstore

import typings.sigstore.distIdentityIssuerMod.Issuer
import typings.sigstore.distIdentityProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIdentityOauthMod {
  
  @JSImport("sigstore/dist/identity/oauth", "OAuthProvider")
  @js.native
  open class OAuthProvider protected ()
    extends StObject
       with Provider {
    def this(options: OAuthProviderOptions) = this()
    
    /* private */ var clientID: Any = js.native
    
    /* private */ var clientSecret: Any = js.native
    
    /* private */ var codeVerifier: Any = js.native
    
    /* private */ var getAuthRequestParams: Any = js.native
    
    /* private */ var getAuthRequestURL: Any = js.native
    
    /* private */ var getBasicAuthHeaderValue: Any = js.native
    
    /* private */ var getCodeChallenge: Any = js.native
    
    /* private */ var getIDToken: Any = js.native
    
    /* CompleteClass */
    override def getToken(): js.Promise[String] = js.native
    
    /* private */ var initiateAuthRequest: Any = js.native
    
    /* private */ var issuer: Any = js.native
    
    /* private */ var openURL: Any = js.native
    
    /* private */ var redirectURI: Any = js.native
    
    /* private */ var state: Any = js.native
  }
  
  trait OAuthProviderOptions extends StObject {
    
    var clientID: String
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var issuer: Issuer
    
    var redirectURL: js.UndefOr[String] = js.undefined
  }
  object OAuthProviderOptions {
    
    inline def apply(clientID: String, issuer: Issuer): OAuthProviderOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuthProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setIssuer(value: Issuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
      
      inline def setRedirectURLUndefined: Self = StObject.set(x, "redirectURL", js.undefined)
    }
  }
}
