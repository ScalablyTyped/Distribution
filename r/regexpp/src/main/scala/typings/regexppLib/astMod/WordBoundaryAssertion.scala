package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordBoundaryAssertion
  extends BoundaryAssertion
     with NodeBase {
  var kind: regexppLib.regexppLibStrings.word
  var negate: scala.Boolean
  @JSName("parent")
  var parent_WordBoundaryAssertion: Alternative | Quantifier
  @JSName("type")
  var type_WordBoundaryAssertion: regexppLib.regexppLibStrings.Assertion
}

object WordBoundaryAssertion {
  @scala.inline
  def apply(
    end: scala.Double,
    kind: regexppLib.regexppLibStrings.word,
    negate: scala.Boolean,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Assertion
  ): WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WordBoundaryAssertion]
  }
}

