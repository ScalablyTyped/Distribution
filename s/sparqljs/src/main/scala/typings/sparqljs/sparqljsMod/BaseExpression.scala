package typings.sparqljs.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExpression extends js.Object {
  var distinct: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object BaseExpression {
  @scala.inline
  def apply(`type`: String, distinct: js.UndefOr[Boolean] = js.undefined): BaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpression]
  }
}

