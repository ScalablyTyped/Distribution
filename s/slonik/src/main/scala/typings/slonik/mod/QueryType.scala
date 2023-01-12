package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryType extends StObject {
  
  var sql: String
  
  var values: js.UndefOr[js.Array[PrimitiveValueExpressionType]] = js.undefined
}
object QueryType {
  
  inline def apply(sql: String): QueryType = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryType] (val x: Self) extends AnyVal {
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[PrimitiveValueExpressionType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: PrimitiveValueExpressionType*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
