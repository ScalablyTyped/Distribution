package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterPattern extends Pattern {
  
  var expression: Expression = js.native
  
  var `type`: filter = js.native
}
object FilterPattern {
  
  @scala.inline
  def apply(expression: Expression, `type`: filter): FilterPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPattern]
  }
  
  @scala.inline
  implicit class FilterPatternMutableBuilder[Self <: FilterPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: filter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
