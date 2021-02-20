package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  
  var name: String = js.native
}
object AttributeExpressionData {
  
  @scala.inline
  def apply(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): AttributeExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeExpressionData]
  }
  
  @scala.inline
  implicit class AttributeExpressionDataMutableBuilder[Self <: AttributeExpressionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
