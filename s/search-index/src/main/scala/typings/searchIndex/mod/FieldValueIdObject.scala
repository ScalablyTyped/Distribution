package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValueIdObject
  extends StObject
     with FieldValueObject {
  
  var _id: js.Array[String]
}
object FieldValueIdObject {
  
  inline def apply(FIELD: Field, VALUE: String | RangeValueObject, _id: js.Array[String]): FieldValueIdObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValueIdObject]
  }
  
  extension [Self <: FieldValueIdObject](x: Self) {
    
    inline def set_id(value: js.Array[String]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idVarargs(value: String*): Self = StObject.set(x, "_id", js.Array(value*))
  }
}
