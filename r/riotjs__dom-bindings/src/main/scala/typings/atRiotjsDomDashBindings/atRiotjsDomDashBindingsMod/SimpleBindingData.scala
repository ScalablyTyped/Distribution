package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleBindingData
  extends BaseBindingData
     with BindingData {
  var expressions: js.Array[ExpressionData]
}

object SimpleBindingData {
  @scala.inline
  def apply(
    expressions: js.Array[ExpressionData],
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): SimpleBindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBindingData]
  }
}

