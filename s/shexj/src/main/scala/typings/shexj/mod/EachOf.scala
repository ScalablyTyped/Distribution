package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachOf
  extends StObject
     with tripleExprBase
     with tripleExpr {
  
  var expressions: js.Array[tripleExprOrRef]
  
  /**
    * Mandatory type "EachOf".
    */
  var `type`: typings.shexj.shexjStrings.EachOf
}
object EachOf {
  
  inline def apply(expressions: js.Array[tripleExprOrRef]): EachOf = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EachOf")
    __obj.asInstanceOf[EachOf]
  }
  
  extension [Self <: EachOf](x: Self) {
    
    inline def setExpressions(value: js.Array[tripleExprOrRef]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: tripleExprOrRef*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: typings.shexj.shexjStrings.EachOf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
