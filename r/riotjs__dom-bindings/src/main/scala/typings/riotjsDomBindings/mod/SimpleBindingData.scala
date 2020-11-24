package typings.riotjsDomBindings.mod

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
  implicit class SimpleBindingDataOps[Self <: SimpleBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpressionsVarargs(value: ExpressionData*): Self = this.set("expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[ExpressionData]): Self = this.set("expressions", value.asInstanceOf[js.Any])
  }
}
