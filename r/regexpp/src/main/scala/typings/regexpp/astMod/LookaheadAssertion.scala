package typings.regexpp.astMod

import typings.regexpp.regexppStrings.lookahead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookaheadAssertion
  extends LookaroundAssertion
     with NodeBase
     with QuantifiableElement {
  
  var alternatives: js.Array[Alternative] = js.native
  
  var kind: lookahead = js.native
  
  var negate: Boolean = js.native
  
  @JSName("parent")
  var parent_LookaheadAssertion: Alternative | Quantifier = js.native
  
  @JSName("type")
  var type_LookaheadAssertion: typings.regexpp.regexppStrings.Assertion = js.native
}
object LookaheadAssertion {
  
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookahead,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookaheadAssertion]
  }
  
  @scala.inline
  implicit class LookaheadAssertionOps[Self <: LookaheadAssertion] (val x: Self) extends AnyVal {
    
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
    def setKind(value: lookahead): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegate(value: Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Assertion): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
