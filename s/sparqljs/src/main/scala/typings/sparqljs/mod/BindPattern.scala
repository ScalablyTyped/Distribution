package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bind
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
  implicit class BindPatternOps[Self <: BindPattern] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bind): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: VariableTerm): Self = this.set("variable", value.asInstanceOf[js.Any])
  }
}
