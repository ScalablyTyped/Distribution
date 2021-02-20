package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quantifier
  extends BranchNode
     with NodeBase
     with Element {
  
  var element: QuantifiableElement = js.native
  
  var greedy: Boolean = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  @JSName("parent")
  var parent_Quantifier: Alternative = js.native
  
  @JSName("type")
  var type_Quantifier: typings.regexpp.regexppStrings.Quantifier = js.native
}
object Quantifier {
  
  @scala.inline
  def apply(
    element: QuantifiableElement,
    end: Double,
    greedy: Boolean,
    max: Double,
    min: Double,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Quantifier
  ): Quantifier = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quantifier]
  }
  
  @scala.inline
  implicit class QuantifierMutableBuilder[Self <: Quantifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: QuantifiableElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Quantifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
