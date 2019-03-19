package typings
package regexppLib.astMod

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
  var type_Group: regexppLib.regexppLibStrings.Group
}

object Group {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: scala.Double,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Group
  ): Group = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Group]
  }
}

