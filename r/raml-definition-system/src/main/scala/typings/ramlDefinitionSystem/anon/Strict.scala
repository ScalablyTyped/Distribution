package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strict extends StObject {
  
  var annotations: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var name: NameString
  
  var strict: NameString
  
  var structuredValue: Domain
  
  var value: NameString
}
object Strict {
  
  inline def apply(
    annotations: NameString,
    description: NameString,
    displayName: NameString,
    name: NameString,
    strict: NameString,
    structuredValue: Domain,
    value: NameString
  ): Strict = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], structuredValue = structuredValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Strict] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: NameString): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStructuredValue(value: Domain): Self = StObject.set(x, "structuredValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NameString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
