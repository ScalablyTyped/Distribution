package typings.regexpp.astMod

import typings.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordBoundaryAssertion
  extends BoundaryAssertion
     with NodeBase {
  
  var kind: word = js.native
  
  var negate: Boolean = js.native
  
  @JSName("parent")
  var parent_WordBoundaryAssertion: Alternative | Quantifier = js.native
  
  @JSName("type")
  var type_WordBoundaryAssertion: typings.regexpp.regexppStrings.Assertion = js.native
}
object WordBoundaryAssertion {
  
  @scala.inline
  def apply(
    end: Double,
    kind: word,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
