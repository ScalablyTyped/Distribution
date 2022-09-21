package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: Domain
  
  var description: Domain
  
  var displayName: Domain
  
  var example: Domain
  
  var location: Domain
  
  var name: Domain
  
  var parametrizedProperties: NameString
  
  var repeat: Domain
  
  var required: Domain
  
  var `type`: Domain
}
object Default {
  
  inline def apply(
    default: Domain,
    description: Domain,
    displayName: Domain,
    example: Domain,
    location: Domain,
    name: Domain,
    parametrizedProperties: NameString,
    repeat: Domain,
    required: Domain,
    `type`: Domain
  ): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(value: Domain): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Domain): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExample(value: Domain): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Domain): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: NameString): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Domain): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Domain): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: Domain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
