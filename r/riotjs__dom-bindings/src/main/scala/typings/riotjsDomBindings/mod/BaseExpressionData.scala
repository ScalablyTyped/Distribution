package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseExpressionData[Scope] extends StObject {
  
  def evaluate(scope: Scope): Any
  
  var `type`: ExpressionType
}
object BaseExpressionData {
  
  inline def apply[Scope](evaluate: Scope => Any, `type`: ExpressionType): BaseExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData[Scope]]
  }
  
  extension [Self <: BaseExpressionData[?], Scope](x: Self & BaseExpressionData[Scope]) {
    
    inline def setEvaluate(value: Scope => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setType(value: ExpressionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
