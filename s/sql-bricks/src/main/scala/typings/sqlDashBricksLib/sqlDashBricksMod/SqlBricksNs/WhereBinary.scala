package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

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
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("quantifier")(quantifier)
    __obj.asInstanceOf[WhereBinary]
  }
}

