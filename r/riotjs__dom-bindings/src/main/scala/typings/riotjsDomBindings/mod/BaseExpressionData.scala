package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseExpressionData extends js.Object {
  
  def evaluate(scope: js.Any): js.Any = js.native
  
  var `type`: ExpressionType = js.native
}
object BaseExpressionData {
  
  @scala.inline
  def apply(evaluate: js.Any => js.Any, `type`: ExpressionType): BaseExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData]
  }
  
  @scala.inline
  implicit class BaseExpressionDataOps[Self <: BaseExpressionData] (val x: Self) extends AnyVal {
    
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
    def setEvaluate(value: js.Any => js.Any): Self = this.set("evaluate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: ExpressionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
