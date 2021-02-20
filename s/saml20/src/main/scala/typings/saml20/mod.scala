package typings.saml20

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("saml20", "parse")
  @js.native
  def parse(rawAssertion: String, cb: ParseCallback): Unit = js.native
  
  @JSImport("saml20", "validate")
  @js.native
  def validate(rawAssertion: String, options: ValidationOptions, cb: ParseCallback): Unit = js.native
  
  type ParseCallback = js.Function3[/* err */ Error | Null, /* profile */ Profile, /* version */ String, Unit]
  
  @js.native
  trait Profile extends StObject {
    
    var audience: js.UndefOr[String] = js.native
    
    var claims: js.Any = js.native
    
    var issuer: String = js.native
    
    var sessionIndex: js.UndefOr[String] = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(claims: js.Any, issuer: String): Profile = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setClaims(value: js.Any): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIndexUndefined: Self = StObject.set(x, "sessionIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.saml20.mod.ValidationOptionsWithKey
    - typings.saml20.mod.ValidationOptionsWithPrint
  */
  trait ValidationOptions extends StObject
  object ValidationOptions {
    
    @scala.inline
    def ValidationOptionsWithKey(publicKey: String): typings.saml20.mod.ValidationOptionsWithKey = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.saml20.mod.ValidationOptionsWithKey]
    }
    
    @scala.inline
    def ValidationOptionsWithPrint(thumbprint: String): typings.saml20.mod.ValidationOptionsWithPrint = {
      val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.saml20.mod.ValidationOptionsWithPrint]
    }
  }
  
  @js.native
  trait ValidationOptionsWithKey extends ValidationOptions {
    
    var audience: js.UndefOr[js.Any] = js.native
    
    var bypassExpiration: js.UndefOr[Boolean] = js.native
    
    var publicKey: String = js.native
  }
  object ValidationOptionsWithKey {
    
    @scala.inline
    def apply(publicKey: String): ValidationOptionsWithKey = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationOptionsWithKey]
    }
    
    @scala.inline
    implicit class ValidationOptionsWithKeyMutableBuilder[Self <: ValidationOptionsWithKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: js.Any): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setBypassExpiration(value: Boolean): Self = StObject.set(x, "bypassExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassExpirationUndefined: Self = StObject.set(x, "bypassExpiration", js.undefined)
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationOptionsWithPrint extends ValidationOptions {
    
    var audience: js.UndefOr[js.Any] = js.native
    
    var bypassExpiration: js.UndefOr[Boolean] = js.native
    
    var thumbprint: String = js.native
  }
  object ValidationOptionsWithPrint {
    
    @scala.inline
    def apply(thumbprint: String): ValidationOptionsWithPrint = {
      val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationOptionsWithPrint]
    }
    
    @scala.inline
    implicit class ValidationOptionsWithPrintMutableBuilder[Self <: ValidationOptionsWithPrint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: js.Any): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setBypassExpiration(value: Boolean): Self = StObject.set(x, "bypassExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassExpirationUndefined: Self = StObject.set(x, "bypassExpiration", js.undefined)
      
      @scala.inline
      def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    }
  }
}
