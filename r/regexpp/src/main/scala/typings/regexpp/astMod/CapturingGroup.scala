package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturingGroup
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative]
  var name: String | Null
  @JSName("parent")
  var parent_CapturingGroup: Alternative | Quantifier
  var references: js.Array[Backreference]
  @JSName("type")
  var type_CapturingGroup: typings.regexpp.regexppStrings.CapturingGroup
}

object CapturingGroup {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double,
    `type`: typings.regexpp.regexppStrings.CapturingGroup,
    name: String = null
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, parent = parent.asInstanceOf[js.Any], raw = raw, references = references, start = start)
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CapturingGroup]
  }
}

