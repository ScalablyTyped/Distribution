package typings.regexpp.astMod

import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeAssertion
  extends StObject
     with NodeBase
     with BoundaryAssertion {
  
  var kind: start | end
  
  @JSName("parent")
  var parent_EdgeAssertion: Alternative | Quantifier
  
  @JSName("type")
  var type_EdgeAssertion: typings.regexpp.regexppStrings.Assertion
}
object EdgeAssertion {
  
  @scala.inline
  def apply(end: Double, kind: start | end, parent: Alternative | Quantifier, raw: String, start: Double): EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[EdgeAssertion]
  }
  
  @scala.inline
  implicit class EdgeAssertionMutableBuilder[Self <: EdgeAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: start | end): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
