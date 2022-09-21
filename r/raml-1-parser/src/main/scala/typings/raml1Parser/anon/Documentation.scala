package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Documentation extends StObject {
  
  var RAMLVersion: Domain
  
  var annotationTypes: NameString
  
  var annotations: NameString
  
  var baseUri: NameString
  
  var baseUriParameters: NameString
  
  var description: NameString
  
  var documentation: NameString
  
  var mediaType: NameString
  
  var protocols: NameString
  
  var resourceTypes: NameString
  
  var resources: NameString
  
  var schemas: NameString
  
  var securedBy: NameString
  
  var securitySchemes: NameString
  
  var title: NameString
  
  var traits: NameString
  
  var types: NameString
  
  var uses: NameString
  
  var version: NameString
}
object Documentation {
  
  inline def apply(
    RAMLVersion: Domain,
    annotationTypes: NameString,
    annotations: NameString,
    baseUri: NameString,
    baseUriParameters: NameString,
    description: NameString,
    documentation: NameString,
    mediaType: NameString,
    protocols: NameString,
    resourceTypes: NameString,
    resources: NameString,
    schemas: NameString,
    securedBy: NameString,
    securitySchemes: NameString,
    title: NameString,
    traits: NameString,
    types: NameString,
    uses: NameString,
    version: NameString
  ): Documentation = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.asInstanceOf[js.Any], annotationTypes = annotationTypes.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], baseUriParameters = baseUriParameters.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], securitySchemes = securitySchemes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentation]
  }
  
  extension [Self <: Documentation](x: Self) {
    
    inline def setAnnotationTypes(value: NameString): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setBaseUri(value: NameString): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriParameters(value: NameString): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: NameString): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: NameString): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: NameString): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setRAMLVersion(value: Domain): Self = StObject.set(x, "RAMLVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: NameString): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResources(value: NameString): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: NameString): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: NameString): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemes(value: NameString): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: NameString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTraits(value: NameString): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: NameString): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUses(value: NameString): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: NameString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
