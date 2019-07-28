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
    val __obj = js.Dynamic.literal(element = element, end = end, greedy = greedy, max = max, min = min, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Quantifier]
  }
}

