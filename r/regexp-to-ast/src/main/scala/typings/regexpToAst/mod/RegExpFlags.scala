package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import typings.regexpToAst.regexpToAstStrings.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpFlags
  extends StObject
     with IRegExpAST {
  
  var global: Boolean
  
  var ignoreCase: Boolean
  
  var multiLine: Boolean
  
  var sticky: Boolean
  
  @JSName("type")
  var type_RegExpFlags: Flags
  
  var unicode: Boolean
}
object RegExpFlags {
  
  inline def apply(
    global: Boolean,
    ignoreCase: Boolean,
    loc: Begin,
    multiLine: Boolean,
    sticky: Boolean,
    unicode: Boolean
  ): RegExpFlags = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Flags")
    __obj.asInstanceOf[RegExpFlags]
  }
  
  extension [Self <: RegExpFlags](x: Self) {
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setType(value: Flags): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
  }
}
