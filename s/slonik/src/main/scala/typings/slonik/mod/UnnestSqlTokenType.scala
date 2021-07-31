package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnnestSqlTokenType
  extends StObject
     with _SqlTokenType {
  
  var columnTypes: js.Array[String]
  
  var tuples: js.Array[js.Array[ValueExpressionType]]
  
  var `type`: js.Symbol
}
object UnnestSqlTokenType {
  
  @scala.inline
  def apply(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnnestSqlTokenType]
  }
  
  @scala.inline
  implicit class UnnestSqlTokenTypeMutableBuilder[Self <: UnnestSqlTokenType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnTypes(value: js.Array[String]): Self = StObject.set(x, "columnTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTypesVarargs(value: String*): Self = StObject.set(x, "columnTypes", js.Array(value :_*))
    
    @scala.inline
    def setTuples(value: js.Array[js.Array[ValueExpressionType]]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuplesVarargs(value: js.Array[ValueExpressionType]*): Self = StObject.set(x, "tuples", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
