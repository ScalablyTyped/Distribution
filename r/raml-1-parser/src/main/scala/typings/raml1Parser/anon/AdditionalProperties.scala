package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalProperties extends StObject {
  
  var default: NameString
  
  var additionalProperties: NameString
  
  var allowedTargets: NameString
  
  var annotations: NameString
  
  var description: NameString
  
  var discriminator: NameString
  
  var discriminatorValue: NameString
  
  var displayName: NameString
  
  var `enum`: NameString
  
  var example: NameString
  
  var examples: NameString
  
  var facets: NameString
  
  var isAnnotation: NameString
  
  var location: NameString
  
  var locationKind: NameString
  
  var maxProperties: NameString
  
  var minProperties: NameString
  
  var name: NameString
  
  var properties: NameString
  
  var required: NameString
  
  var schema: NameString
  
  var `type`: NameString
  
  var xml: NameString
}
object AdditionalProperties {
  
  inline def apply(
    additionalProperties: NameString,
    allowedTargets: NameString,
    annotations: NameString,
    default: NameString,
    description: NameString,
    discriminator: NameString,
    discriminatorValue: NameString,
    displayName: NameString,
    `enum`: NameString,
    example: NameString,
    examples: NameString,
    facets: NameString,
    isAnnotation: NameString,
    location: NameString,
    locationKind: NameString,
    maxProperties: NameString,
    minProperties: NameString,
    name: NameString,
    properties: NameString,
    required: NameString,
    schema: NameString,
    `type`: NameString,
    xml: NameString
  ): AdditionalProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], allowedTargets = allowedTargets.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], discriminatorValue = discriminatorValue.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], isAnnotation = isAnnotation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationKind = locationKind.asInstanceOf[js.Any], maxProperties = maxProperties.asInstanceOf[js.Any], minProperties = minProperties.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalProperties]
  }
  
  extension [Self <: AdditionalProperties](x: Self) {
    
    inline def setAdditionalProperties(value: NameString): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargets(value: NameString): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: NameString): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDiscriminator(value: NameString): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorValue(value: NameString): Self = StObject.set(x, "discriminatorValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: NameString): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setExample(value: NameString): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: NameString): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: NameString): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setIsAnnotation(value: NameString): Self = StObject.set(x, "isAnnotation", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: NameString): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationKind(value: NameString): Self = StObject.set(x, "locationKind", value.asInstanceOf[js.Any])
    
    inline def setMaxProperties(value: NameString): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMinProperties(value: NameString): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: NameString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: NameString): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: NameString): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXml(value: NameString): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
