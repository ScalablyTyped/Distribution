package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeNumbers.`true`
import typings.regexpDashTree.regexpDashTreeStrings.Lookahead
import typings.regexpDashTree.regexpDashTreeStrings.Lookbehind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookaroundAssertion
  extends Assertion
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Assertion] {
  var assertion: Expression | Null
  var kind: Lookahead | Lookbehind
  var negative: js.UndefOr[`true`] = js.undefined
}

object LookaroundAssertion {
  @scala.inline
  def apply(
    kind: Lookahead | Lookbehind,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Assertion,
    assertion: Expression = null,
    loc: Anon_End = null,
    negative: `true` = null
  ): LookaroundAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (assertion != null) __obj.updateDynamic("assertion")(assertion)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    __obj.asInstanceOf[LookaroundAssertion]
  }
}

