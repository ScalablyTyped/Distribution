package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repetition
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.Repetition]
     with Expression {
  var expression: Expression
  var quantifier: Quantifier
}

object Repetition {
  @scala.inline
  def apply(
    expression: Expression,
    quantifier: Quantifier,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Repetition,
    loc: Anon_End = null
  ): Repetition = {
    val __obj = js.Dynamic.literal(expression = expression, quantifier = quantifier)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Repetition]
  }
}

