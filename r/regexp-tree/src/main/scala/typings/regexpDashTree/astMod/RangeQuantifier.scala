package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeQuantifier
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.Quantifier]
     with Quantifier {
  var from: Double
  var greedy: Boolean
  var kind: Range
  var to: js.UndefOr[Double] = js.undefined
}

object RangeQuantifier {
  @scala.inline
  def apply(
    from: Double,
    greedy: Boolean,
    kind: Range,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Quantifier,
    loc: Anon_End = null,
    to: Int | Double = null
  ): RangeQuantifier = {
    val __obj = js.Dynamic.literal(from = from, greedy = greedy, kind = kind)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeQuantifier]
  }
}

