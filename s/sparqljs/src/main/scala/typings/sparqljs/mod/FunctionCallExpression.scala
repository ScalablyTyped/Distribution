package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.functionCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionCallExpression
  extends BaseExpression
     with _Expression {
  
  var args: js.Array[Expression] = js.native
  
  var function: String = js.native
  
  @JSName("type")
  var type_FunctionCallExpression: functionCall = js.native
}
object FunctionCallExpression {
  
  @scala.inline
  def apply(args: js.Array[Expression], function: String, `type`: functionCall): FunctionCallExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCallExpression]
  }
  
  @scala.inline
  implicit class FunctionCallExpressionMutableBuilder[Self <: FunctionCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: functionCall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
