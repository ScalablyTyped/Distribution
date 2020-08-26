package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapturingGroup
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative] = js.native
  var name: String | Null = js.native
  @JSName("parent")
  var parent_CapturingGroup: Alternative | Quantifier = js.native
  var references: js.Array[Backreference] = js.native
  @JSName("type")
  var type_CapturingGroup: typings.regexpp.regexppStrings.CapturingGroup = js.native
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
    `type`: typings.regexpp.regexppStrings.CapturingGroup
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturingGroup]
  }
  @scala.inline
  implicit class CapturingGroupOps[Self <: CapturingGroup] (val x: Self) extends AnyVal {
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
    def setAlternativesVarargs(value: Alternative*): Self = this.set("alternatives", js.Array(value :_*))
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencesVarargs(value: Backreference*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[Backreference]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.CapturingGroup): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
  
}

