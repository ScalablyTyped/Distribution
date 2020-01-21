package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  var childNodeIndex: Double
}

object TextExpressionData {
  @scala.inline
  def apply(childNodeIndex: Double, evaluate: js.Any => js.Any, `type`: ExpressionType): TextExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextExpressionData]
  }
}

