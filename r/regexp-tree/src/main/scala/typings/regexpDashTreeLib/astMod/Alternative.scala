package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.Alternative]
     with Expression {
  var expressions: js.Array[Expression]
}

object Alternative {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Alternative,
    loc: regexpDashTreeLib.Anon_End = null
  ): Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Alternative]
  }
}

