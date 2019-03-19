package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disjunction
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.Disjunction]
     with Expression {
  var expressions: js.Array[Expression | scala.Null]
}

object Disjunction {
  @scala.inline
  def apply(
    expressions: js.Array[Expression | scala.Null],
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Disjunction,
    loc: regexpDashTreeLib.Anon_End = null
  ): Disjunction = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Disjunction]
  }
}

