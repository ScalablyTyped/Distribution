package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySqlTokenType
  extends StObject
     with _SqlTokenType {
  
  var memberType: TypeNameIdentifierType | SqlTokenType
  
  var `type`: js.Symbol
  
  var values: js.Array[ValueExpressionType]
}
object ArraySqlTokenType {
  
  inline def apply(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySqlTokenType]
  }
  
  extension [Self <: ArraySqlTokenType](x: Self) {
    
    inline def setMemberType(value: TypeNameIdentifierType | SqlTokenType): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[ValueExpressionType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ValueExpressionType*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
