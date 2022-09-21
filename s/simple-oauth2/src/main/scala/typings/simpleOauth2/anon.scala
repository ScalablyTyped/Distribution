package typings.simpleOauth2

import typings.simpleOauth2.simpleOauth2Strings.body
import typings.simpleOauth2.simpleOauth2Strings.form
import typings.simpleOauth2.simpleOauth2Strings.header
import typings.simpleOauth2.simpleOauth2Strings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthorizationMethod extends StObject {
    
    /**
      * Indicates the method used to send the client.id/client.secret authorization params at the token request.
      * If set to body, the bodyFormat option will be used to format the credentials.
      * Defaults to header
      */
    var authorizationMethod: js.UndefOr[header | body] = js.undefined
    
    /** Format of data sent in the request body. Defaults to form. */
    var bodyFormat: js.UndefOr[json | form] = js.undefined
  }
  object AuthorizationMethod {
    
    inline def apply(): AuthorizationMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationMethod]
    }
    
    extension [Self <: AuthorizationMethod](x: Self) {
      
      inline def setAuthorizationMethod(value: header | body): Self = StObject.set(x, "authorizationMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationMethodUndefined: Self = StObject.set(x, "authorizationMethod", js.undefined)
      
      inline def setBodyFormat(value: json | form): Self = StObject.set(x, "bodyFormat", value.asInstanceOf[js.Any])
      
      inline def setBodyFormatUndefined: Self = StObject.set(x, "bodyFormat", js.undefined)
    }
  }
  
  trait AuthorizeHost extends StObject {
    
    /** String used to set the host to request an "authorization code". Default to the value set on auth.tokenHost. */
    var authorizeHost: js.UndefOr[String] = js.undefined
    
    /** String path to request an authorization code. Default to /oauth/authorize. */
    var authorizePath: js.UndefOr[String] = js.undefined
    
    /** String path to revoke an access token. Default to /oauth/revoke. */
    var revokePath: js.UndefOr[String] = js.undefined
    
    /** String used to set the host to request the tokens to. Required. */
    var tokenHost: String
    
    /** String path to request an access token. Default to /oauth/token. */
    var tokenPath: js.UndefOr[String] = js.undefined
  }
  object AuthorizeHost {
    
    inline def apply(tokenHost: String): AuthorizeHost = {
      val __obj = js.Dynamic.literal(tokenHost = tokenHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizeHost]
    }
    
    extension [Self <: AuthorizeHost](x: Self) {
      
      inline def setAuthorizeHost(value: String): Self = StObject.set(x, "authorizeHost", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeHostUndefined: Self = StObject.set(x, "authorizeHost", js.undefined)
      
      inline def setAuthorizePath(value: String): Self = StObject.set(x, "authorizePath", value.asInstanceOf[js.Any])
      
      inline def setAuthorizePathUndefined: Self = StObject.set(x, "authorizePath", js.undefined)
      
      inline def setRevokePath(value: String): Self = StObject.set(x, "revokePath", value.asInstanceOf[js.Any])
      
      inline def setRevokePathUndefined: Self = StObject.set(x, "revokePath", js.undefined)
      
      inline def setTokenHost(value: String): Self = StObject.set(x, "tokenHost", value.asInstanceOf[js.Any])
      
      inline def setTokenPath(value: String): Self = StObject.set(x, "tokenPath", value.asInstanceOf[js.Any])
      
      inline def setTokenPathUndefined: Self = StObject.set(x, "tokenPath", js.undefined)
    }
  }
  
  trait Id[ClientIdName /* <: String */] extends StObject {
    
    /** Service registered client id. Required. */
    var id: String
    
    /** Parameter name used to send the client id. Default to client_id. */
    var idParamName: js.UndefOr[ClientIdName] = js.undefined
    
    /** Service registered client secret. Required. */
    var secret: String
    
    /** Parameter name used to send the client secret. Default to client_secret. */
    var secretParamName: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply[ClientIdName /* <: String */](id: String, secret: String): Id[ClientIdName] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id[ClientIdName]]
    }
    
    extension [Self <: Id[?], ClientIdName /* <: String */](x: Self & Id[ClientIdName]) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdParamName(value: ClientIdName): Self = StObject.set(x, "idParamName", value.asInstanceOf[js.Any])
      
      inline def setIdParamNameUndefined: Self = StObject.set(x, "idParamName", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretParamName(value: String): Self = StObject.set(x, "secretParamName", value.asInstanceOf[js.Any])
      
      inline def setSecretParamNameUndefined: Self = StObject.set(x, "secretParamName", js.undefined)
    }
  }
  
  trait Redirecturi extends StObject {
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Redirecturi {
    
    inline def apply(): Redirecturi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirecturi]
    }
    
    extension [Self <: Redirecturi](x: Self) {
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
