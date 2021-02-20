package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternative
  extends BranchNode
     with NodeBase {
  
  var elements: js.Array[Element] = js.native
  
  @JSName("parent")
  var parent_Alternative: Pattern | Group | CapturingGroup | LookaroundAssertion = js.native
  
  @JSName("type")
  var type_Alternative: typings.regexpp.regexppStrings.Alternative = js.native
}
object Alternative {
  
  @scala.inline
  def apply(
    elements: js.Array[Element],
    end: Double,
    parent: Pattern | Group | CapturingGroup | LookaroundAssertion,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Alternative
  ): Alternative = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit class AlternativeMutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Pattern | Group | CapturingGroup | LookaroundAssertion): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Alternative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
