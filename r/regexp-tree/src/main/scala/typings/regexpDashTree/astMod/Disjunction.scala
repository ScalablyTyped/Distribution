package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disjunction
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.Disjunction]
     with Expression {
  var expressions: js.Array[Expression | Null]
}

object Disjunction {
  @scala.inline
  def apply(
    expressions: js.Array[Expression | Null],
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Disjunction,
    loc: Anon_End = null
  ): Disjunction = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Disjunction]
  }
}

