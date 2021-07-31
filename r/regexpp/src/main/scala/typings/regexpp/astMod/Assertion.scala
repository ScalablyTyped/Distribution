package typings.regexpp.astMod

import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpp.astMod.BoundaryAssertion
  - typings.regexpp.astMod.LookaroundAssertion
*/
trait Assertion
  extends StObject
     with Element
object Assertion {
  
  @scala.inline
  def EdgeAssertion(end: Double, kind: start | end, parent: Alternative | Quantifier, raw: String, start: Double): typings.regexpp.astMod.EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpp.astMod.EdgeAssertion]
  }
  
  @scala.inline
  def LookaheadAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): typings.regexpp.astMod.LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "lookahead", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpp.astMod.LookaheadAssertion]
  }
  
  @scala.inline
  def LookbehindAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double
  ): typings.regexpp.astMod.LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "lookbehind", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpp.astMod.LookbehindAssertion]
  }
  
  @scala.inline
  def WordBoundaryAssertion(end: Double, negate: Boolean, parent: Alternative | Quantifier, raw: String, start: Double): typings.regexpp.astMod.WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "word", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[typings.regexpp.astMod.WordBoundaryAssertion]
  }
}
