package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereGroup extends _WhereExpression {
  var expressions: js.Array[WhereExpression]
  var op: js.UndefOr[java.lang.String] = js.undefined
}

object WhereGroup {
  @scala.inline
  def apply(expressions: js.Array[WhereExpression], op: java.lang.String = null): WhereGroup = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    if (op != null) __obj.updateDynamic("op")(op)
    __obj.asInstanceOf[WhereGroup]
  }
}

