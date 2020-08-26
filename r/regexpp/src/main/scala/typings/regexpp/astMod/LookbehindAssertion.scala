package typings.regexpp.astMod

import typings.regexpp.regexppStrings.lookbehind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookbehindAssertion
  extends LookaroundAssertion
     with NodeBase {
  var alternatives: js.Array[Alternative] = js.native
  var kind: lookbehind = js.native
  var negate: Boolean = js.native
  @JSName("parent")
  var parent_LookbehindAssertion: Alternative = js.native
  @JSName("type")
  var type_LookbehindAssertion: typings.regexpp.regexppStrings.Assertion = js.native
}

object LookbehindAssertion {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookbehind,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookbehindAssertion]
  }
  @scala.inline
  implicit class LookbehindAssertionOps[Self <: LookbehindAssertion] (val x: Self) extends AnyVal {
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
    def setKind(value: lookbehind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegate(value: Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Alternative): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Assertion): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

