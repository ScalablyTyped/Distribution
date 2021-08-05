package typings.regexpp.astMod

import typings.regexpp.regexppStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyCharacterSet
  extends StObject
     with NodeBase
     with CharacterSet {
  
  var kind: any
  
  @JSName("parent")
  var parent_AnyCharacterSet: Alternative | Quantifier
  
  @JSName("type")
  var type_AnyCharacterSet: typings.regexpp.regexppStrings.CharacterSet
}
object AnyCharacterSet {
  
  inline def apply(end: Double, parent: Alternative | Quantifier, raw: String, start: Double): AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "any", parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[AnyCharacterSet]
  }
  
  extension [Self <: AnyCharacterSet](x: Self) {
    
    inline def setKind(value: any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.regexpp.regexppStrings.CharacterSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
