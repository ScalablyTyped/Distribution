package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseExpressionData extends StObject {
  
  def evaluate(scope: js.Any): js.Any
  
  var `type`: ExpressionType
}
object BaseExpressionData {
  
  @scala.inline
  def apply(evaluate: js.Any => js.Any, `type`: ExpressionType): BaseExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData]
  }
  
  @scala.inline
  implicit class BaseExpressionDataMutableBuilder[Self <: BaseExpressionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluate(value: js.Any => js.Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: ExpressionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
