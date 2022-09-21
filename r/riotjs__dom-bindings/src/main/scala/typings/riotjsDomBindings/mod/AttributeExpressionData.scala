package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeExpressionData[Scope]
  extends StObject
     with BaseExpressionData[Scope]
     with _ExpressionData[Scope] {
  
  var name: String
}
object AttributeExpressionData {
  
  inline def apply[Scope](evaluate: Scope => Any, name: String, `type`: ExpressionType): AttributeExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeExpressionData[Scope]]
  }
  
  extension [Self <: AttributeExpressionData[?], Scope](x: Self & AttributeExpressionData[Scope]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
