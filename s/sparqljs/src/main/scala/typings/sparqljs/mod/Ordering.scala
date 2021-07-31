package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ordering extends StObject {
  
  var descending: js.UndefOr[Boolean] = js.undefined
  
  var expression: Expression
}
object Ordering {
  
  @scala.inline
  def apply(expression: Expression): Ordering = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ordering]
  }
  
  @scala.inline
  implicit class OrderingMutableBuilder[Self <: Ordering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
