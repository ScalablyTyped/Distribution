package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationExpression
  extends BaseExpression
     with _Expression {
  
  var args: js.Array[Expression] = js.native
  
  var operator: String = js.native
  
  @JSName("type")
  var type_OperationExpression: operation = js.native
}
object OperationExpression {
  
  @scala.inline
  def apply(args: js.Array[Expression], operator: String, `type`: operation): OperationExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationExpression]
  }
  
  @scala.inline
  implicit class OperationExpressionOps[Self <: OperationExpression] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: Expression*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[Expression]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: operation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
