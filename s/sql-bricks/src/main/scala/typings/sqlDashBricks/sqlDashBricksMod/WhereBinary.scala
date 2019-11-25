package typings.sqlDashBricks.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereBinary extends _WhereExpression {
  var col: String | SelectStatement
  var op: String
  var quantifier: String
  var `val`: js.Any
}

object WhereBinary {
  @scala.inline
  def apply(col: String | SelectStatement, op: String, quantifier: String, `val`: js.Any): WhereBinary = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereBinary]
  }
}

