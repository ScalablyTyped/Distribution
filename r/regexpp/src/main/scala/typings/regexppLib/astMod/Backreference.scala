package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backreference
  extends LeafNode
     with NodeBase
     with QuantifiableElement {
  @JSName("parent")
  var parent_Backreference: Alternative | Quantifier
  var ref: scala.Double | java.lang.String
  var resolved: CapturingGroup
  @JSName("type")
  var type_Backreference: regexppLib.regexppLibStrings.Backreference
}

object Backreference {
  @scala.inline
  def apply(
    end: scala.Double,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    ref: scala.Double | java.lang.String,
    resolved: CapturingGroup,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Backreference
  ): Backreference = {
    val __obj = js.Dynamic.literal(end = end, parent = parent.asInstanceOf[js.Any], raw = raw, ref = ref.asInstanceOf[js.Any], resolved = resolved, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Backreference]
  }
}

