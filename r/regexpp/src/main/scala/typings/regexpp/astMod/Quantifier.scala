package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quantifier
  extends BranchNode
     with NodeBase
     with Element {
  var element: QuantifiableElement
  var greedy: Boolean
  var max: Double
  var min: Double
  @JSName("parent")
  var parent_Quantifier: Alternative
  @JSName("type")
  var type_Quantifier: typings.regexpp.regexppStrings.Quantifier
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
}

