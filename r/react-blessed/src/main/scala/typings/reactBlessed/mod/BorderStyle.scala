package typings.reactBlessed.mod

import typings.reactBlessed.reactBlessedStrings.bg
import typings.reactBlessed.reactBlessedStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* BLESSED-REACT LOCALLY DEFINED PROPS **************************************/
// @types/blessed defines 'styles' as 'any' but 'blessed' can only can only
// take certain values. define them here.
trait BorderStyle extends StObject {
  
  var bg: js.UndefOr[String] = js.undefined
  
  var bold: js.UndefOr[Boolean] = js.undefined
  
  var ch: js.UndefOr[String] = js.undefined
  
  var fg: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[line | bg] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
}
object BorderStyle {
  
  inline def apply(): BorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyle]
  }
  
  extension [Self <: BorderStyle](x: Self) {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
    
    inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    
    inline def setType(value: line | bg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
