package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative
  extends BranchNode
     with NodeBase {
  var elements: js.Array[Element]
  @JSName("parent")
  var parent_Alternative: Pattern | Group | CapturingGroup | LookaroundAssertion
  @JSName("type")
  var type_Alternative: regexppLib.regexppLibStrings.Alternative
}

object Alternative {
  @scala.inline
  def apply(
    elements: js.Array[Element],
    end: scala.Double,
    parent: Pattern | Group | CapturingGroup | LookaroundAssertion,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Alternative
  ): Alternative = {
    val __obj = js.Dynamic.literal(elements = elements, end = end, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Alternative]
  }
}

