package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`if-break`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfBreak_
  extends StObject
     with DocCommand {
  
  var breakContents: Doc
  
  var flatContents: Doc
  
  var `type`: `if-break`
}
object IfBreak_ {
  
  inline def apply(breakContents: Doc, flatContents: Doc): IfBreak_ = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("if-break")
    __obj.asInstanceOf[IfBreak_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfBreak_] (val x: Self) extends AnyVal {
    
    inline def setBreakContents(value: Doc): Self = StObject.set(x, "breakContents", value.asInstanceOf[js.Any])
    
    inline def setBreakContentsVarargs(value: Any*): Self = StObject.set(x, "breakContents", js.Array(value*))
    
    inline def setFlatContents(value: Doc): Self = StObject.set(x, "flatContents", value.asInstanceOf[js.Any])
    
    inline def setFlatContentsVarargs(value: Any*): Self = StObject.set(x, "flatContents", js.Array(value*))
    
    inline def setType(value: `if-break`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
