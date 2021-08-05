package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedTemplateLiteralInvocationType[Result] extends StObject {
  
  var sql: String
  
  var `type`: js.Symbol
  
  var values: js.Array[ValueExpressionType]
}
object TaggedTemplateLiteralInvocationType {
  
  inline def apply[Result](sql: String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType[Result] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType[Result]]
  }
  
  extension [Self <: TaggedTemplateLiteralInvocationType[?], Result](x: Self & TaggedTemplateLiteralInvocationType[Result]) {
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[ValueExpressionType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ValueExpressionType*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
