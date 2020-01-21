package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExpressionData extends js.Object

object _ExpressionData {
  @scala.inline
  def AttributeExpressionData(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): _ExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpressionData]
  }
  @scala.inline
  def EventExpressionData(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): _ExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpressionData]
  }
  @scala.inline
  def TextExpressionData(childNodeIndex: Double, evaluate: js.Any => js.Any, `type`: ExpressionType): _ExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpressionData]
  }
}

