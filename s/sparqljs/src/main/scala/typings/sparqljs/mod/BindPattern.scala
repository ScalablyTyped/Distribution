package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindPattern extends Pattern {
  
  var expression: Expression = js.native
  
  var `type`: bind = js.native
  
  var variable: VariableTerm = js.native
}
object BindPattern {
  
  @scala.inline
  def apply(expression: Expression, `type`: bind, variable: VariableTerm): BindPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindPattern]
  }
  
  @scala.inline
  implicit class BindPatternMutableBuilder[Self <: BindPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bind): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: VariableTerm): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
