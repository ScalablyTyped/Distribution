package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextExpressionData[Scope]
  extends StObject
     with BaseExpressionData[Scope]
     with _ExpressionData[Scope] {
  
  var childNodeIndex: Double
}
object TextExpressionData {
  
  inline def apply[Scope](childNodeIndex: Double, evaluate: Scope => Any, `type`: ExpressionType): TextExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextExpressionData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextExpressionData[?], Scope] (val x: Self & TextExpressionData[Scope]) extends AnyVal {
    
    inline def setChildNodeIndex(value: Double): Self = StObject.set(x, "childNodeIndex", value.asInstanceOf[js.Any])
  }
}
