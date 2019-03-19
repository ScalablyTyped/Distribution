package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturingGroup
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative]
  var name: java.lang.String | scala.Null
  @JSName("parent")
  var parent_CapturingGroup: Alternative | Quantifier
  var references: js.Array[Backreference]
  @JSName("type")
  var type_CapturingGroup: regexppLib.regexppLibStrings.CapturingGroup
}

object CapturingGroup {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: scala.Double,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    references: js.Array[Backreference],
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.CapturingGroup,
    name: java.lang.String = null
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, parent = parent.asInstanceOf[js.Any], raw = raw, references = references, start = start)
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CapturingGroup]
  }
}

