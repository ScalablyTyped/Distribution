package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableExpression extends StObject {
  
  var expression: Expression = js.native
  
  var variable: VariableTerm = js.native
}
object VariableExpression {
  
  @scala.inline
  def apply(expression: Expression, variable: VariableTerm): VariableExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableExpression]
  }
  
  @scala.inline
  implicit class VariableExpressionMutableBuilder[Self <: VariableExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: VariableTerm): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
