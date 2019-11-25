package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative]
  @JSName("parent")
  var parent_Group: Alternative | Quantifier
  @JSName("type")
  var type_Group: typings.regexpp.regexppStrings.Group
}

object Group {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Group
  ): Group = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

