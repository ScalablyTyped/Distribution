package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quantifier
  extends BranchNode
     with NodeBase
     with Element {
  var element: QuantifiableElement = js.native
  var greedy: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  @JSName("parent")
  var parent_Quantifier: Alternative = js.native
  @JSName("type")
  var type_Quantifier: typings.regexpp.regexppStrings.Quantifier = js.native
}

object Quantifier {
  @scala.inline
  def apply(
    element: QuantifiableElement,
    end: Double,
    greedy: Boolean,
    max: Double,
    min: Double,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Quantifier
  ): Quantifier = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quantifier]
  }
  @scala.inline
  implicit class QuantifierOps[Self <: Quantifier] (val x: Self) extends AnyVal {
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
    def setElement(value: QuantifiableElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Alternative): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Quantifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

