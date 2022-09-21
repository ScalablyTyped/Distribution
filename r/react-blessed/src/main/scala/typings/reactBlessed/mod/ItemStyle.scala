package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemStyle extends StObject {
  
  var bg: js.UndefOr[String] = js.undefined
  
  var blink: js.UndefOr[Boolean] = js.undefined
  
  var bold: js.UndefOr[Boolean] = js.undefined
  
  var fg: js.UndefOr[String] = js.undefined
  
  var inverse: js.UndefOr[Boolean] = js.undefined
  
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
}
object ItemStyle {
  
  inline def apply(): ItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyle]
  }
  
  extension [Self <: ItemStyle](x: Self) {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
    
    inline def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    
    inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
