package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeQuantifier
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.Quantifier]
     with Quantifier {
  var from: scala.Double
  var greedy: scala.Boolean
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.Range
  var to: js.UndefOr[scala.Double] = js.undefined
}

object RangeQuantifier {
  @scala.inline
  def apply(
    from: scala.Double,
    greedy: scala.Boolean,
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.Range,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Quantifier,
    loc: regexpDashTreeLib.Anon_End = null,
    to: scala.Int | scala.Double = null
  ): RangeQuantifier = {
    val __obj = js.Dynamic.literal(from = from, greedy = greedy, kind = kind)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeQuantifier]
  }
}

