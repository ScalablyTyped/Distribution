package typings.raml1Parser

import typings.raml1Parser.anon.Scopes
import typings.raml1Parser.anon.TokenCredentialsUri
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8CommonMod.HasSource
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8MethodsMod.MethodBase08
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8MethodsMod.TemplateReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatSpec0Dot8SecurityMod {
  
  trait AbstractSecurityScheme08
    extends StObject
       with HasSource {
    
    var describedBy: js.UndefOr[SecuritySchemePart08] = js.undefined
    
    /**
      * The description attribute MAY be used to describe a security schemes property.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the security scheme
      */
    var name: String
    
    /**
      * The settings attribute MAY be used to provide security scheme-specific
      * information. The required attributes vary depending on the type of
      * security scheme is being declared. It describes the minimum set of
      * properties which any processing application MUST provide and validate
      * if it chooses to implement the security scheme. Processing applications
      * MAY choose to recognize other properties for things such as token
      * lifetime, preferred cryptographic algorithms, and more.
      */
    var settings: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The securitySchemes property MUST be used to specify an API's security
      * mechanisms, including the required settings and the authentication
      * methods that the API supports. one authentication method is allowed
      * if the API supports them.
      */
    var `type`: String
  }
  object AbstractSecurityScheme08 {
    
    inline def apply(name: String, `type`: String): AbstractSecurityScheme08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractSecurityScheme08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractSecurityScheme08] (val x: Self) extends AnyVal {
      
      inline def setDescribedBy(value: SecuritySchemePart08): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BasicSecurityScheme08 = AbstractSecurityScheme08
  
  type CustomSecurityScheme08 = AbstractSecurityScheme08
  
  type DigestSecurityScheme08 = AbstractSecurityScheme08
  
  trait OAuth1SecurityScheme08
    extends StObject
       with AbstractSecurityScheme08 {
    
    @JSName("settings")
    var settings_OAuth1SecurityScheme08: TokenCredentialsUri
  }
  object OAuth1SecurityScheme08 {
    
    inline def apply(name: String, settings: TokenCredentialsUri, `type`: String): OAuth1SecurityScheme08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth1SecurityScheme08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth1SecurityScheme08] (val x: Self) extends AnyVal {
      
      inline def setSettings(value: TokenCredentialsUri): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait OAuth2SecurityScheme08
    extends StObject
       with AbstractSecurityScheme08 {
    
    @JSName("settings")
    var settings_OAuth2SecurityScheme08: Scopes
  }
  object OAuth2SecurityScheme08 {
    
    inline def apply(name: String, settings: Scopes, `type`: String): OAuth2SecurityScheme08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2SecurityScheme08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth2SecurityScheme08] (val x: Self) extends AnyVal {
      
      inline def setSettings(value: Scopes): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecuritySchemePart08
    extends StObject
       with MethodBase08 {
    
    /**
      * Instantiation of applyed traits
      */
    var is: js.UndefOr[js.Array[TemplateReference]] = js.undefined
  }
  object SecuritySchemePart08 {
    
    inline def apply(protocols: js.Array[String]): SecuritySchemePart08 = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecuritySchemePart08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecuritySchemePart08] (val x: Self) extends AnyVal {
      
      inline def setIs(value: js.Array[TemplateReference]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TemplateReference*): Self = StObject.set(x, "is", js.Array(value*))
    }
  }
}
