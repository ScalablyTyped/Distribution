package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.operation
import org.scalablytyped.runtime.StObject
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
  implicit class OperationExpressionMutableBuilder[Self <: OperationExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: operation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
