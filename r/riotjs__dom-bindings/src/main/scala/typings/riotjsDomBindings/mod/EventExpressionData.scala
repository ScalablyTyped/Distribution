package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventExpressionData[Scope]
  extends StObject
     with BaseExpressionData[Scope]
     with _ExpressionData[Scope] {
  
  var name: String
}
object EventExpressionData {
  
  inline def apply[Scope](evaluate: Scope => Any, name: String, `type`: ExpressionType): EventExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventExpressionData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventExpressionData[?], Scope] (val x: Self & EventExpressionData[Scope]) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
