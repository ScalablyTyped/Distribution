package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeStrings.BACKSLASHBACKSLASHB
import typings.regexpDashTree.regexpDashTreeStrings.BACKSLASHBACKSLASHb
import typings.regexpDashTree.regexpDashTreeStrings.DOLLAR
import typings.regexpDashTree.regexpDashTreeStrings.`_backtick^_backtick`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleAssertion
  extends Assertion
     with Base[typings.regexpDashTree.regexpDashTreeStrings.Assertion] {
  var kind: `_backtick^_backtick` | DOLLAR | BACKSLASHBACKSLASHb | BACKSLASHBACKSLASHB
}

object SimpleAssertion {
  @scala.inline
  def apply(
    kind: `_backtick^_backtick` | DOLLAR | BACKSLASHBACKSLASHb | BACKSLASHBACKSLASHB,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.Assertion,
    loc: Anon_End = null
  ): SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SimpleAssertion]
  }
}

