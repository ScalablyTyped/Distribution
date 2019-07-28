package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.`+`
import typings.regexpDashTree.regexpDashTreeStrings.`?`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleQuantifier
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.Quantifier]
     with Quantifier {
  var greedy: Boolean
  var kind: `+` | typings.regexpDashTree.regexpDashTreeStrings.`*` | `?`
}

object SimpleQuantifier {
  @scala.inline
  def apply(
    greedy: Boolean,
    kind: `+` | typings.regexpDashTree.regexpDashTreeStrings.`*` | `?`,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Quantifier,
    loc: Anon_End = null
  ): SimpleQuantifier = {
    val __obj = js.Dynamic.literal(greedy = greedy, kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SimpleQuantifier]
  }
}

