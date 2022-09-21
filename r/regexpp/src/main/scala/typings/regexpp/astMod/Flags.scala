package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags
  extends StObject
     with NodeBase
     with LeafNode {
  
  var dotAll: Boolean
  
  var global: Boolean
  
  var hasIndices: Boolean
  
  var ignoreCase: Boolean
  
  var multiline: Boolean
  
  @JSName("parent")
  var parent_Flags: RegExpLiteral | Null
  
  var sticky: Boolean
  
  @JSName("type")
  var type_Flags: typings.regexpp.regexppStrings.Flags
  
  var unicode: Boolean
}
object Flags {
  
  inline def apply(
    dotAll: Boolean,
    end: Double,
    global: Boolean,
    hasIndices: Boolean,
    ignoreCase: Boolean,
    multiline: Boolean,
    raw: String,
    start: Double,
    sticky: Boolean,
    unicode: Boolean
  ): Flags = {
    val __obj = js.Dynamic.literal(dotAll = dotAll.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], hasIndices = hasIndices.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")("Flags")
    __obj.asInstanceOf[Flags]
  }
  
  extension [Self <: Flags](x: Self) {
    
    inline def setDotAll(value: Boolean): Self = StObject.set(x, "dotAll", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setHasIndices(value: Boolean): Self = StObject.set(x, "hasIndices", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setParent(value: RegExpLiteral): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.regexpp.regexppStrings.Flags): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
  }
}
