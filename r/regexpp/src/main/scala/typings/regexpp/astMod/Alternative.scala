package typings.regexpp.astMod

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
  var type_Alternative: typings.regexpp.regexppStrings.Alternative
}

object Alternative {
  @scala.inline
  def apply(
    elements: js.Array[Element],
    end: Double,
    parent: Pattern | Group | CapturingGroup | LookaroundAssertion,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Alternative
  ): Alternative = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternative]
  }
}

