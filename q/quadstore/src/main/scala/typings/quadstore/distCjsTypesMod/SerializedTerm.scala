package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedTerm extends StObject {
  
  var lengths: String
  
  var `type`: String
  
  var value: String
}
object SerializedTerm {
  
  inline def apply(lengths: String, `type`: String, value: String): SerializedTerm = {
    val __obj = js.Dynamic.literal(lengths = lengths.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializedTerm] (val x: Self) extends AnyVal {
    
    inline def setLengths(value: String): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
