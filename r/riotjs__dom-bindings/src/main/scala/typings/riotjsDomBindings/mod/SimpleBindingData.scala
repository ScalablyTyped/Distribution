package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleBindingData
  extends BaseBindingData
     with BindingData {
  
  var expressions: js.Array[ExpressionData] = js.native
}
object SimpleBindingData {
  
  @scala.inline
  def apply(expressions: js.Array[ExpressionData]): SimpleBindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBindingData]
  }
  
  @scala.inline
  implicit class SimpleBindingDataMutableBuilder[Self <: SimpleBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[ExpressionData]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: ExpressionData*): Self = StObject.set(x, "expressions", js.Array(value :_*))
  }
}
