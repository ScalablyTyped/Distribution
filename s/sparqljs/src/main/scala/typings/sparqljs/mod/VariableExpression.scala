package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableExpression extends StObject {
  
  var expression: Expression
  
  var variable: VariableTerm
}
object VariableExpression {
  
  inline def apply(expression: Expression, variable: VariableTerm): VariableExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableExpression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setVariable(value: VariableTerm): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
