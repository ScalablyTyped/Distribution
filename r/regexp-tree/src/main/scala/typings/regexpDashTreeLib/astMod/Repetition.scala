package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repetition
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.Repetition]
     with Expression {
  var expression: Expression
  var quantifier: Quantifier
}

object Repetition {
  @scala.inline
  def apply(
    expression: Expression,
    quantifier: Quantifier,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Repetition,
    loc: regexpDashTreeLib.Anon_End = null
  ): Repetition = {
    val __obj = js.Dynamic.literal(expression = expression, quantifier = quantifier)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Repetition]
  }
}

