package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseExpressionData extends StObject {
  
  def evaluate(scope: js.Any): js.Any
  
  var `type`: ExpressionType
}
object BaseExpressionData {
  
  inline def apply(evaluate: js.Any => js.Any, `type`: ExpressionType): BaseExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData]
  }
  
  extension [Self <: BaseExpressionData](x: Self) {
    
    inline def setEvaluate(value: js.Any => js.Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setType(value: ExpressionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
