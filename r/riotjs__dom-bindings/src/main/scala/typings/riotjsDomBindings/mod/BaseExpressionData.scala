package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExpressionData extends js.Object {
  var `type`: ExpressionType
  def evaluate(scope: js.Any): js.Any
}

object BaseExpressionData {
  @scala.inline
  def apply(evaluate: js.Any => js.Any, `type`: ExpressionType): BaseExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData]
  }
}

