package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindPattern
  extends StObject
     with Pattern {
  
  var expression: Expression
  
  var `type`: bind
  
  var variable: VariableTerm
}
object BindPattern {
  
  inline def apply(expression: Expression, variable: VariableTerm): BindPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bind")
    __obj.asInstanceOf[BindPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindPattern] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: bind): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariable(value: VariableTerm): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
