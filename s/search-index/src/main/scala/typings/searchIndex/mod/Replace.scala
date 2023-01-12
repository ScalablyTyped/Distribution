package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replace extends StObject {
  
  var fields: js.Array[String]
  
  var values: ReplaceValues
}
object Replace {
  
  inline def apply(fields: js.Array[String], values: ReplaceValues): Replace = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setValues(value: ReplaceValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
