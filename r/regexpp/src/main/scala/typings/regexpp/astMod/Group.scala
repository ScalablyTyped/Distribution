package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with NodeBase
     with BranchNode
     with QuantifiableElement {
  
  var alternatives: js.Array[Alternative]
  
  @JSName("parent")
  var parent_Group: Alternative | Quantifier
  
  @JSName("type")
  var type_Group: typings.regexpp.regexppStrings.Group
}
object Group {
  
  inline def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): Group = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.regexpp.regexppStrings.Group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
