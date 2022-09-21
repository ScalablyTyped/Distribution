package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValueObject
  extends StObject
     with _Token {
  
  var FIELD: Field
  
  var VALUE: String | RangeValueObject
}
object FieldValueObject {
  
  inline def apply(FIELD: Field, VALUE: String | RangeValueObject): FieldValueObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValueObject]
  }
  
  extension [Self <: FieldValueObject](x: Self) {
    
    inline def setFIELD(value: Field): Self = StObject.set(x, "FIELD", value.asInstanceOf[js.Any])
    
    inline def setFIELDVarargs(value: String*): Self = StObject.set(x, "FIELD", js.Array(value*))
    
    inline def setVALUE(value: String | RangeValueObject): Self = StObject.set(x, "VALUE", value.asInstanceOf[js.Any])
  }
}
