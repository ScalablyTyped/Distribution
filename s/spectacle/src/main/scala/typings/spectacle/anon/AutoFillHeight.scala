package typings.spectacle.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFillHeight extends StObject {
  
  var autoFillHeight: Boolean
  
  var children: ReactNode
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var highlightEnd: js.UndefOr[Double] = js.undefined
  
  var highlightStart: js.UndefOr[Double] = js.undefined
  
  var indentSize: js.UndefOr[Double] = js.undefined
  
  var language: String
  
  var theme: js.UndefOr[Plain] = js.undefined
}
object AutoFillHeight {
  
  inline def apply(autoFillHeight: Boolean, language: String): AutoFillHeight = {
    val __obj = js.Dynamic.literal(autoFillHeight = autoFillHeight.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillHeight]
  }
  
  extension [Self <: AutoFillHeight](x: Self) {
    
    inline def setAutoFillHeight(value: Boolean): Self = StObject.set(x, "autoFillHeight", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHighlightEnd(value: Double): Self = StObject.set(x, "highlightEnd", value.asInstanceOf[js.Any])
    
    inline def setHighlightEndUndefined: Self = StObject.set(x, "highlightEnd", js.undefined)
    
    inline def setHighlightStart(value: Double): Self = StObject.set(x, "highlightStart", value.asInstanceOf[js.Any])
    
    inline def setHighlightStartUndefined: Self = StObject.set(x, "highlightStart", js.undefined)
    
    inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Plain): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
