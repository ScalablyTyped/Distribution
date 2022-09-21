package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlFragmentType extends StObject {
  
  var parameters: js.Array[PrimitiveValueExpressionType]
  
  var sql: String
}
object SqlFragmentType {
  
  inline def apply(parameters: js.Array[PrimitiveValueExpressionType], sql: String): SqlFragmentType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFragmentType]
  }
  
  extension [Self <: SqlFragmentType](x: Self) {
    
    inline def setParameters(value: js.Array[PrimitiveValueExpressionType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: PrimitiveValueExpressionType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
  }
}
