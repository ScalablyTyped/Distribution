package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleBindingData
  extends StObject
     with BaseBindingData
     with BindingData {
  
  var expressions: js.Array[ExpressionData]
}
object SimpleBindingData {
  
  inline def apply(expressions: js.Array[ExpressionData]): SimpleBindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBindingData]
  }
  
  extension [Self <: SimpleBindingData](x: Self) {
    
    inline def setExpressions(value: js.Array[ExpressionData]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: ExpressionData*): Self = StObject.set(x, "expressions", js.Array(value :_*))
  }
}
