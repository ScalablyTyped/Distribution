package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import typings.regexpToAst.regexpToAstStrings.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpPattern
  extends StObject
     with IRegExpAST {
  
  var flags: RegExpFlags
  
  @JSName("type")
  var type_RegExpPattern: Pattern
  
  var value: Disjunction
}
object RegExpPattern {
  
  inline def apply(flags: RegExpFlags, loc: Begin, value: Disjunction): RegExpPattern = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Pattern")
    __obj.asInstanceOf[RegExpPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegExpPattern] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: RegExpFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setType(value: Pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Disjunction): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
