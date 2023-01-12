package typings.ramlDefinitionSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueRequirement extends StObject {
  
  var name: String
  
  var value: String
}
object ValueRequirement {
  
  inline def apply(name: String, value: String): ValueRequirement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueRequirement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueRequirement] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
