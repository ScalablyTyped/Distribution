package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var default: Domain
  
  var description: Domain
  
  var displayName: Domain
  
  var `enum`: Domain
  
  var example: Domain
  
  var location: Domain
  
  var maxLength: Domain
  
  var minLength: Domain
  
  var name: Domain
  
  var pattern: Domain
  
  var repeat: Domain
  
  var required: Domain
  
  var `type`: Domain
}
object Description {
  
  inline def apply(
    default: Domain,
    description: Domain,
    displayName: Domain,
    `enum`: Domain,
    example: Domain,
    location: Domain,
    maxLength: Domain,
    minLength: Domain,
    name: Domain,
    pattern: Domain,
    repeat: Domain,
    required: Domain,
    `type`: Domain
  ): Description = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Domain): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Domain): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: Domain): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setExample(value: Domain): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Domain): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Domain): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Domain): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Domain): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Domain): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Domain): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: Domain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
