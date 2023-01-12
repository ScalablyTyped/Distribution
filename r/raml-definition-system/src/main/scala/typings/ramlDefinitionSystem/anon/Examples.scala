package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Examples extends StObject {
  
  var default: NameString
  
  var allowedTargets: NameString
  
  var annotations: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var example: NameString
  
  var examples: NameString
  
  var facets: NameString
  
  var isAnnotation: NameString
  
  var items: NameString
  
  var location: NameString
  
  var locationKind: NameString
  
  var maxItems: NameString
  
  var minItems: NameString
  
  var name: NameString
  
  var required: NameString
  
  var schema: NameString
  
  var structuredItems: Domain
  
  var `type`: NameString
  
  var uniqueItems: NameString
  
  var xml: NameString
}
object Examples {
  
  inline def apply(
    allowedTargets: NameString,
    annotations: NameString,
    default: NameString,
    description: NameString,
    displayName: NameString,
    example: NameString,
    examples: NameString,
    facets: NameString,
    isAnnotation: NameString,
    items: NameString,
    location: NameString,
    locationKind: NameString,
    maxItems: NameString,
    minItems: NameString,
    name: NameString,
    required: NameString,
    schema: NameString,
    structuredItems: Domain,
    `type`: NameString,
    uniqueItems: NameString,
    xml: NameString
  ): Examples = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], isAnnotation = isAnnotation.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationKind = locationKind.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], structuredItems = structuredItems.asInstanceOf[js.Any], uniqueItems = uniqueItems.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Examples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Examples] (val x: Self) extends AnyVal {
    
    inline def setAllowedTargets(value: NameString): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: NameString): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExample(value: NameString): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: NameString): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: NameString): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setIsAnnotation(value: NameString): Self = StObject.set(x, "isAnnotation", value.asInstanceOf[js.Any])
    
    inline def setItems(value: NameString): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: NameString): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationKind(value: NameString): Self = StObject.set(x, "locationKind", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: NameString): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMinItems(value: NameString): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: NameString): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: NameString): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setStructuredItems(value: Domain): Self = StObject.set(x, "structuredItems", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueItems(value: NameString): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setXml(value: NameString): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
