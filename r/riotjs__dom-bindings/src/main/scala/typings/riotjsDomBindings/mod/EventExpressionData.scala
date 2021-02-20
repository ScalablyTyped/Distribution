package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  
  var name: String = js.native
}
object EventExpressionData {
  
  @scala.inline
  def apply(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): EventExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventExpressionData]
  }
  
  @scala.inline
  implicit class EventExpressionDataMutableBuilder[Self <: EventExpressionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
