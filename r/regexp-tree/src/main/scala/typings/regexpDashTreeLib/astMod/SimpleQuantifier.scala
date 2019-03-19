package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleQuantifier
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.Quantifier]
     with Quantifier {
  var greedy: scala.Boolean
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.`+` | regexpDashTreeLib.regexpDashTreeLibStrings.`*` | regexpDashTreeLib.regexpDashTreeLibStrings.`?`
}

object SimpleQuantifier {
  @scala.inline
  def apply(
    greedy: scala.Boolean,
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.`+` | regexpDashTreeLib.regexpDashTreeLibStrings.`*` | regexpDashTreeLib.regexpDashTreeLibStrings.`?`,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Quantifier,
    loc: regexpDashTreeLib.Anon_End = null
  ): SimpleQuantifier = {
    val __obj = js.Dynamic.literal(greedy = greedy, kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SimpleQuantifier]
  }
}

