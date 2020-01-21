package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereGroup extends _WhereExpression {
  var expressions: js.Array[WhereExpression]
  var op: js.UndefOr[String] = js.undefined
}

object WhereGroup {
  @scala.inline
  def apply(expressions: js.Array[WhereExpression], op: String = null): WhereGroup = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereGroup]
  }
}

