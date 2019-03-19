package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleAssertion
  extends Assertion
     with Base[regexpDashTreeLib.regexpDashTreeLibStrings.Assertion] {
  var kind: regexpDashTreeLib.regexpDashTreeLibStrings.`_backtick^_backtick` | regexpDashTreeLib.regexpDashTreeLibStrings.DOLLAR | regexpDashTreeLib.regexpDashTreeLibStrings.BACKSLASHBACKSLASHb | regexpDashTreeLib.regexpDashTreeLibStrings.BACKSLASHBACKSLASHB
}

object SimpleAssertion {
  @scala.inline
  def apply(
    kind: regexpDashTreeLib.regexpDashTreeLibStrings.`_backtick^_backtick` | regexpDashTreeLib.regexpDashTreeLibStrings.DOLLAR | regexpDashTreeLib.regexpDashTreeLibStrings.BACKSLASHBACKSLASHb | regexpDashTreeLib.regexpDashTreeLibStrings.BACKSLASHBACKSLASHB,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.Assertion,
    loc: regexpDashTreeLib.Anon_End = null
  ): SimpleAssertion = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SimpleAssertion]
  }
}

