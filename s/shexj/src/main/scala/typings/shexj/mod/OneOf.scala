package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOf
  extends StObject
     with tripleExprBase
     with tripleExpr {
  
  var expressions: js.Array[tripleExprOrRef]
  
  /**
    * Mandatory type "OneOf".
    */
  var `type`: typings.shexj.shexjStrings.OneOf
}
object OneOf {
  
  inline def apply(expressions: js.Array[tripleExprOrRef]): OneOf = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OneOf")
    __obj.asInstanceOf[OneOf]
  }
  
  extension [Self <: OneOf](x: Self) {
    
    inline def setExpressions(value: js.Array[tripleExprOrRef]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: tripleExprOrRef*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: typings.shexj.shexjStrings.OneOf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
