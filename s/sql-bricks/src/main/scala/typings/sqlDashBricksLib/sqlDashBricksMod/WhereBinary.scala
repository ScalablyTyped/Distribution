package typings
package sqlDashBricksLib.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereBinary extends _WhereExpression {
  var col: java.lang.String | SelectStatement
  var op: java.lang.String
  var quantifier: java.lang.String
  var `val`: js.Any
}

object WhereBinary {
  @scala.inline
  def apply(
    col: java.lang.String | SelectStatement,
    op: java.lang.String,
    quantifier: java.lang.String,
    `val`: js.Any
  ): WhereBinary = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op, quantifier = quantifier)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[WhereBinary]
  }
}

