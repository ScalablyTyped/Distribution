package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValue extends StObject {
  
  var FIELD: String
  
  var VALUE: String
}
object FieldValue {
  
  inline def apply(FIELD: String, VALUE: String): FieldValue = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldValue] (val x: Self) extends AnyVal {
    
    inline def setFIELD(value: String): Self = StObject.set(x, "FIELD", value.asInstanceOf[js.Any])
    
    inline def setVALUE(value: String): Self = StObject.set(x, "VALUE", value.asInstanceOf[js.Any])
  }
}
