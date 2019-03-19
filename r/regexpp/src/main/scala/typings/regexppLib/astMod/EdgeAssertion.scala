package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeAssertion
  extends BoundaryAssertion
     with NodeBase {
  var kind: regexppLib.regexppLibStrings.start | regexppLib.regexppLibStrings.end
  @JSName("parent")
  var parent_EdgeAssertion: Alternative | Quantifier
  @JSName("type")
  var type_EdgeAssertion: regexppLib.regexppLibStrings.Assertion
}

object EdgeAssertion {
  @scala.inline
  def apply(
    end: scala.Double,
    kind: regexppLib.regexppLibStrings.start | regexppLib.regexppLibStrings.end,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Assertion
  ): EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end, kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EdgeAssertion]
  }
}

