package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleBindingData[Scope]
  extends StObject
     with BaseBindingData[Scope]
     with _BindingData[Scope] {
  
  var expressions: js.Array[ExpressionData[Scope]]
}
object SimpleBindingData {
  
  inline def apply[Scope](expressions: js.Array[ExpressionData[Scope]]): SimpleBindingData[Scope] = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBindingData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleBindingData[?], Scope] (val x: Self & SimpleBindingData[Scope]) extends AnyVal {
    
    inline def setExpressions(value: js.Array[ExpressionData[Scope]]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: ExpressionData[Scope]*): Self = StObject.set(x, "expressions", js.Array(value*))
  }
}
