package typings.regexpp.astMod

import typings.regexpp.regexppStrings.lookahead
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookaheadAssertion
  extends StObject
     with NodeBase
     with LookaroundAssertion
     with QuantifiableElement {
  
  var alternatives: js.Array[Alternative]
  
  var kind: lookahead
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_LookaheadAssertion: Alternative | Quantifier
  
  @JSName("type")
  var type_LookaheadAssertion: typings.regexpp.regexppStrings.Assertion
}
object LookaheadAssertion {
  
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "lookahead", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[LookaheadAssertion]
  }
  
  @scala.inline
  implicit class LookaheadAssertionMutableBuilder[Self <: LookaheadAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: lookahead): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
