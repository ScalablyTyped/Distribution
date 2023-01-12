package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: Domain
  
  var value: Domain
}
object Key {
  
  inline def apply(key: Domain, value: Domain): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Domain): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Domain): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
