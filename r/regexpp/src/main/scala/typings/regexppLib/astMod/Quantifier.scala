package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quantifier
  extends BranchNode
     with NodeBase
     with Element {
  var element: QuantifiableElement
  var greedy: scala.Boolean
  var max: scala.Double
  var min: scala.Double
  @JSName("parent")
  var parent_Quantifier: Alternative
  @JSName("type")
  var type_Quantifier: regexppLib.regexppLibStrings.Quantifier
}

object Quantifier {
  @scala.inline
  def apply(
    element: QuantifiableElement,
    end: scala.Double,
    greedy: scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    parent: Alternative,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Quantifier
  ): Quantifier = {
    val __obj = js.Dynamic.literal(element = element, end = end, greedy = greedy, max = max, min = min, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Quantifier]
  }
}

