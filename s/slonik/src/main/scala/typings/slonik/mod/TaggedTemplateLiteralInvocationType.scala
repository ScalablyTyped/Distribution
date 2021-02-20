package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedTemplateLiteralInvocationType[Result] extends StObject {
  
  var sql: String = js.native
  
  var `type`: js.Symbol = js.native
  
  var values: js.Array[ValueExpressionType] = js.native
}
object TaggedTemplateLiteralInvocationType {
  
  @scala.inline
  def apply[Result](sql: String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType[Result] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType[Result]]
  }
  
  @scala.inline
  implicit class TaggedTemplateLiteralInvocationTypeMutableBuilder[Self <: TaggedTemplateLiteralInvocationType[_], Result] (val x: Self with TaggedTemplateLiteralInvocationType[Result]) extends AnyVal {
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[ValueExpressionType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ValueExpressionType*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
