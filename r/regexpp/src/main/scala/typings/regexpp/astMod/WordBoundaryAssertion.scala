package typings.regexpp.astMod

import typings.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordBoundaryAssertion
  extends StObject
     with NodeBase
     with BoundaryAssertion {
  
  var kind: word
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_WordBoundaryAssertion: Alternative | Quantifier
  
  @JSName("type")
  var type_WordBoundaryAssertion: typings.regexpp.regexppStrings.Assertion
}
object WordBoundaryAssertion {
  
  @scala.inline
  def apply(end: Double, negate: Boolean, parent: Alternative | Quantifier, raw: String, start: Double): WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "word", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[WordBoundaryAssertion]
  }
  
  @scala.inline
  implicit class WordBoundaryAssertionMutableBuilder[Self <: WordBoundaryAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: word): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
