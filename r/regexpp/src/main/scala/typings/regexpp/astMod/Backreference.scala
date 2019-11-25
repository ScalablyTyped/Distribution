package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backreference
  extends LeafNode
     with NodeBase
     with QuantifiableElement {
  @JSName("parent")
  var parent_Backreference: Alternative | Quantifier
  var ref: Double | String
  var resolved: CapturingGroup
  @JSName("type")
  var type_Backreference: typings.regexpp.regexppStrings.Backreference
}

object Backreference {
  @scala.inline
  def apply(
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    ref: Double | String,
    resolved: CapturingGroup,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Backreference
  ): Backreference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backreference]
  }
}

