package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedTargets extends StObject {
  
  var default: NameString
  
  var allowedTargets: NameString
  
  var annotations: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var example: NameString
  
  var examples: NameString
  
  var facets: NameString
  
  var fixedFacets: Domain
  
  var isAnnotation: NameString
  
  var location: NameString
  
  var locationKind: NameString
  
  var name: NameString
  
  var parametrizedProperties: Domain
  
  var required: NameString
  
  var schema: NameString
  
  var structuredType: Domain
  
  var `type`: NameString
  
  var xml: NameString
}
object AllowedTargets {
  
  inline def apply(
    allowedTargets: NameString,
    annotations: NameString,
    default: NameString,
    description: NameString,
    displayName: NameString,
    example: NameString,
    examples: NameString,
    facets: NameString,
    fixedFacets: Domain,
    isAnnotation: NameString,
    location: NameString,
    locationKind: NameString,
    name: NameString,
    parametrizedProperties: Domain,
    required: NameString,
    schema: NameString,
    structuredType: Domain,
    `type`: NameString,
    xml: NameString
  ): AllowedTargets = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], fixedFacets = fixedFacets.asInstanceOf[js.Any], isAnnotation = isAnnotation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationKind = locationKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], structuredType = structuredType.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedTargets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedTargets] (val x: Self) extends AnyVal {
    
    inline def setAllowedTargets(value: NameString): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: NameString): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExample(value: NameString): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: NameString): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: NameString): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFixedFacets(value: Domain): Self = StObject.set(x, "fixedFacets", value.asInstanceOf[js.Any])
    
    inline def setIsAnnotation(value: NameString): Self = StObject.set(x, "isAnnotation", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: NameString): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationKind(value: NameString): Self = StObject.set(x, "locationKind", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: Domain): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: NameString): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: NameString): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setStructuredType(value: Domain): Self = StObject.set(x, "structuredType", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXml(value: NameString): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
