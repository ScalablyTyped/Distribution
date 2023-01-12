package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPattern
  extends StObject
     with Pattern {
  
  var expression: Expression
  
  var `type`: filter
}
object FilterPattern {
  
  inline def apply(expression: Expression): FilterPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.asInstanceOf[FilterPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterPattern] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: filter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
