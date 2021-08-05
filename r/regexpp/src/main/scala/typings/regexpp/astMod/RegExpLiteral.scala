package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral
  extends StObject
     with NodeBase
     with BranchNode {
  
  var flags: Flags
  
  @JSName("parent")
  var parent_RegExpLiteral: Null
  
  var pattern: Pattern
  
  @JSName("type")
  var type_RegExpLiteral: typings.regexpp.regexppStrings.RegExpLiteral
}
object RegExpLiteral {
  
  inline def apply(end: Double, flags: Flags, parent: Null, pattern: Pattern, raw: String, start: Double): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  extension [Self <: RegExpLiteral](x: Self) {
    
    inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.regexpp.regexppStrings.RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
