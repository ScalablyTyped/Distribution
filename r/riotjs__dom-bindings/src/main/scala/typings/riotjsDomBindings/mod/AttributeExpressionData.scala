package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  var name: String
}

object AttributeExpressionData {
  @scala.inline
  def apply(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): AttributeExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeExpressionData]
  }
}

