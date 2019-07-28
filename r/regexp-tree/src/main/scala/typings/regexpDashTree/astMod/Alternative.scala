package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.Alternative]
     with Expression {
  var expressions: js.Array[Expression]
}

object Alternative {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Alternative,
    loc: Anon_End = null
  ): Alternative = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Alternative]
  }
}

