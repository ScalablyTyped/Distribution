package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backreference
  extends LeafNode
     with NodeBase
     with QuantifiableElement {
  @JSName("parent")
  var parent_Backreference: Alternative | Quantifier = js.native
  var ref: Double | String = js.native
  var resolved: CapturingGroup = js.native
  @JSName("type")
  var type_Backreference: typings.regexpp.regexppStrings.Backreference = js.native
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
  @scala.inline
  implicit class BackreferenceOps[Self <: Backreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: Double | String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved(value: CapturingGroup): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Backreference): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

