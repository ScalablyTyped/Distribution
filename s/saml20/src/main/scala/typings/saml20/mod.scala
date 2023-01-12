package typings.saml20

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("saml20", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(rawAssertion: String, cb: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawAssertion.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validate(rawAssertion: String, options: ValidationOptions, cb: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(rawAssertion.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ParseCallback = js.Function3[/* err */ js.Error | Null, /* profile */ Profile, /* version */ String, Unit]
  
  trait Profile extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
    
    var claims: Any
    
    var issuer: String
    
    var sessionIndex: js.UndefOr[String] = js.undefined
  }
  object Profile {
    
    inline def apply(claims: Any, issuer: String): Profile = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setClaims(value: Any): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
      
      inline def setSessionIndexUndefined: Self = StObject.set(x, "sessionIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.saml20.mod.ValidationOptionsWithKey
    - typings.saml20.mod.ValidationOptionsWithPrint
  */
  trait ValidationOptions extends StObject
  object ValidationOptions {
    
    inline def ValidationOptionsWithKey(publicKey: String): typings.saml20.mod.ValidationOptionsWithKey = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.saml20.mod.ValidationOptionsWithKey]
    }
    
    inline def ValidationOptionsWithPrint(thumbprint: String): typings.saml20.mod.ValidationOptionsWithPrint = {
      val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.saml20.mod.ValidationOptionsWithPrint]
    }
  }
  
  trait ValidationOptionsWithKey
    extends StObject
       with ValidationOptions {
    
    var audience: js.UndefOr[Any] = js.undefined
    
    var bypassExpiration: js.UndefOr[Boolean] = js.undefined
    
    var publicKey: String
  }
  object ValidationOptionsWithKey {
    
    inline def apply(publicKey: String): ValidationOptionsWithKey = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationOptionsWithKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationOptionsWithKey] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: Any): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setBypassExpiration(value: Boolean): Self = StObject.set(x, "bypassExpiration", value.asInstanceOf[js.Any])
      
      inline def setBypassExpirationUndefined: Self = StObject.set(x, "bypassExpiration", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationOptionsWithPrint
    extends StObject
       with ValidationOptions {
    
    var audience: js.UndefOr[Any] = js.undefined
    
    var bypassExpiration: js.UndefOr[Boolean] = js.undefined
    
    var thumbprint: String
  }
  object ValidationOptionsWithPrint {
    
    inline def apply(thumbprint: String): ValidationOptionsWithPrint = {
      val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationOptionsWithPrint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationOptionsWithPrint] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: Any): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setBypassExpiration(value: Boolean): Self = StObject.set(x, "bypassExpiration", value.asInstanceOf[js.Any])
      
      inline def setBypassExpirationUndefined: Self = StObject.set(x, "bypassExpiration", js.undefined)
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    }
  }
}
