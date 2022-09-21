package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUri extends StObject {
  
  var RAMLVersion: NameString
  
  var baseUri: Domain
  
  var baseUriParameters: Domain
  
  var documentation: Domain
  
  var mediaType: Domain
  
  var protocols: Domain
  
  var resourceTypes: Domain
  
  var resources: Domain
  
  var schemas: Domain
  
  var securedBy: Domain
  
  var securitySchemes: Domain
  
  var title: Domain
  
  var traits: Domain
  
  var uriParameters: Domain
  
  var version: Domain
}
object BaseUri {
  
  inline def apply(
    RAMLVersion: NameString,
    baseUri: Domain,
    baseUriParameters: Domain,
    documentation: Domain,
    mediaType: Domain,
    protocols: Domain,
    resourceTypes: Domain,
    resources: Domain,
    schemas: Domain,
    securedBy: Domain,
    securitySchemes: Domain,
    title: Domain,
    traits: Domain,
    uriParameters: Domain,
    version: Domain
  ): BaseUri = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], baseUriParameters = baseUriParameters.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], securitySchemes = securitySchemes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUri]
  }
  
  extension [Self <: BaseUri](x: Self) {
    
    inline def setBaseUri(value: Domain): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriParameters(value: Domain): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: Domain): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: Domain): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: Domain): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setRAMLVersion(value: NameString): Self = StObject.set(x, "RAMLVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: Domain): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Domain): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: Domain): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: Domain): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemes(value: Domain): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Domain): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTraits(value: Domain): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: Domain): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Domain): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
