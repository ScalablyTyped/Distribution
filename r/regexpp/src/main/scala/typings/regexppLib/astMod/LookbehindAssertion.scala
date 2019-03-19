package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookbehindAssertion
  extends LookaroundAssertion
     with NodeBase {
  var alternatives: js.Array[Alternative]
  var kind: regexppLib.regexppLibStrings.lookbehind
  var negate: scala.Boolean
  @JSName("parent")
  var parent_LookbehindAssertion: Alternative
  @JSName("type")
  var type_LookbehindAssertion: regexppLib.regexppLibStrings.Assertion
}

object LookbehindAssertion {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: scala.Double,
    kind: regexppLib.regexppLibStrings.lookbehind,
    negate: scala.Boolean,
    parent: Alternative,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Assertion
  ): LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, kind = kind, negate = negate, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LookbehindAssertion]
  }
}

