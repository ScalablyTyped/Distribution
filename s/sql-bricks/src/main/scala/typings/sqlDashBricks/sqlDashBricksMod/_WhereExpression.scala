package typings.sqlDashBricks.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WhereExpression extends js.Object

object _WhereExpression {
  @scala.inline
  def WhereGroup(expressions: js.Array[WhereExpression], op: String = null): _WhereExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WhereExpression]
  }
  @scala.inline
  def WhereBinary(col: String | SelectStatement, op: String, quantifier: String, `val`: js.Any): _WhereExpression = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WhereExpression]
  }
}

