package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryType extends StObject {
  
  var sql: String = js.native
  
  var values: js.UndefOr[js.Array[PrimitiveValueExpressionType]] = js.native
}
object QueryType {
  
  @scala.inline
  def apply(sql: String): QueryType = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit class QueryTypeMutableBuilder[Self <: QueryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[PrimitiveValueExpressionType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: PrimitiveValueExpressionType*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
