package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookaroundAssertion
  extends Assertion
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Assertion] {
  var assertion: Expression | scala.Null
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.Lookahead | regexpDashTreeLib.regexpDashTreeLibStrings.Lookbehind
  var negative: js.UndefOr[regexpDashTreeLib.regexpDashTreeLibNumbers.`true`] = js.undefined
}

object LookaroundAssertion {
  @scala.inline
  def apply(
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.Lookahead | regexpDashTreeLib.regexpDashTreeLibStrings.Lookbehind,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Assertion,
    assertion: Expression = null,
    loc: regexpDashTreeLib.Anon_End = null,
    negative: regexpDashTreeLib.regexpDashTreeLibNumbers.`true` = null
  ): LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (assertion != null) __obj.updateDynamic("assertion")(assertion)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    __obj.asInstanceOf[LookaroundAssertion]
  }
}

