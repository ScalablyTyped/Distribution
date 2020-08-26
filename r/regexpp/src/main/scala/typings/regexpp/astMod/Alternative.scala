package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alternative
  extends BranchNode
     with NodeBase {
  var elements: js.Array[Element] = js.native
  @JSName("parent")
  var parent_Alternative: Pattern | Group | CapturingGroup | LookaroundAssertion = js.native
  @JSName("type")
  var type_Alternative: typings.regexpp.regexppStrings.Alternative = js.native
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
  @scala.inline
  implicit class AlternativeOps[Self <: Alternative] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: Element*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[Element]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Pattern | Group | CapturingGroup | LookaroundAssertion): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Alternative): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

