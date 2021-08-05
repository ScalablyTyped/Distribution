package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ExpressionData extends StObject
object _ExpressionData {
  
  inline def AttributeExpressionData(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): typings.riotjsDomBindings.mod.AttributeExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.AttributeExpressionData]
  }
  
  inline def EventExpressionData(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): typings.riotjsDomBindings.mod.EventExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.EventExpressionData]
  }
  
  inline def TextExpressionData(childNodeIndex: Double, evaluate: js.Any => js.Any, `type`: ExpressionType): typings.riotjsDomBindings.mod.TextExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.TextExpressionData]
  }
}
