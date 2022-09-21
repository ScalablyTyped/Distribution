package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterClass
  extends StObject
     with NodeBase
     with BranchNode
     with QuantifiableElement {
  
  var elements: js.Array[CharacterClassElement]
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_CharacterClass: Alternative | Quantifier
  
  @JSName("type")
  var type_CharacterClass: typings.regexpp.regexppStrings.CharacterClass
}
object CharacterClass {
  
  inline def apply(
    elements: js.Array[CharacterClassElement],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double
  ): CharacterClass = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClass")
    __obj.asInstanceOf[CharacterClass]
  }
  
  extension [Self <: CharacterClass](x: Self) {
    
    inline def setElements(value: js.Array[CharacterClassElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: CharacterClassElement*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.regexpp.regexppStrings.CharacterClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
