package typings.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Alternative]
     with Expression {
  
  var expressions: js.Array[Expression]
}
object Alternative {
  
  inline def apply(expressions: js.Array[Expression]): Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Alternative")
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
