package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var annotations: NameString
  
  var key: NameString
  
  var value: NameString
}
object Value {
  
  inline def apply(annotations: NameString, key: NameString, value: NameString): Value = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setKey(value: NameString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NameString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
