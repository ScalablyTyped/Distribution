package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var default: NameString
  
  var allowedTargets: NameString
  
  var annotations: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var `enum`: NameString
  
  var example: NameString
  
  var examples: NameString
  
  var facets: NameString
  
  var format: NameString
  
  var isAnnotation: NameString
  
  var location: NameString
  
  var locationKind: NameString
  
  var maximum: NameString
  
  var minimum: NameString
  
  var multipleOf: NameString
  
  var name: NameString
  
  var required: NameString
  
  var schema: NameString
  
  var `type`: NameString
  
  var xml: NameString
}
object Format {
  
  inline def apply(
    allowedTargets: NameString,
    annotations: NameString,
    default: NameString,
    description: NameString,
    displayName: NameString,
    `enum`: NameString,
    example: NameString,
    examples: NameString,
    facets: NameString,
    format: NameString,
    isAnnotation: NameString,
    location: NameString,
    locationKind: NameString,
    maximum: NameString,
    minimum: NameString,
    multipleOf: NameString,
    name: NameString,
    required: NameString,
    schema: NameString,
    `type`: NameString,
    xml: NameString
  ): Format = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isAnnotation = isAnnotation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationKind = locationKind.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], multipleOf = multipleOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setAllowedTargets(value: NameString): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: NameString): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: NameString): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setExample(value: NameString): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: NameString): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: NameString): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: NameString): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIsAnnotation(value: NameString): Self = StObject.set(x, "isAnnotation", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: NameString): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationKind(value: NameString): Self = StObject.set(x, "locationKind", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: NameString): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: NameString): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMultipleOf(value: NameString): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: NameString): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: NameString): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXml(value: NameString): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
