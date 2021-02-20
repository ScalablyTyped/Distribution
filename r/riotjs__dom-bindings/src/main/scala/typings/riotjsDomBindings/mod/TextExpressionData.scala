package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  
  var childNodeIndex: Double = js.native
}
object TextExpressionData {
  
  @scala.inline
  def apply(childNodeIndex: Double, evaluate: js.Any => js.Any, `type`: ExpressionType): TextExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextExpressionData]
  }
  
  @scala.inline
  implicit class TextExpressionDataMutableBuilder[Self <: TextExpressionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildNodeIndex(value: Double): Self = StObject.set(x, "childNodeIndex", value.asInstanceOf[js.Any])
  }
}
