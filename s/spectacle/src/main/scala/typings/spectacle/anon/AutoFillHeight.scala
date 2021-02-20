package typings.spectacle.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFillHeight extends StObject {
  
  var autoFillHeight: Boolean = js.native
  
  var children: ReactNode = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var highlightEnd: js.UndefOr[Double] = js.native
  
  var highlightStart: js.UndefOr[Double] = js.native
  
  var indentSize: js.UndefOr[Double] = js.native
  
  var language: String = js.native
  
  var theme: js.UndefOr[Plain] = js.native
}
object AutoFillHeight {
  
  @scala.inline
  def apply(autoFillHeight: Boolean, language: String): AutoFillHeight = {
    val __obj = js.Dynamic.literal(autoFillHeight = autoFillHeight.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillHeight]
  }
  
  @scala.inline
  implicit class AutoFillHeightMutableBuilder[Self <: AutoFillHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFillHeight(value: Boolean): Self = StObject.set(x, "autoFillHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setHighlightEnd(value: Double): Self = StObject.set(x, "highlightEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightEndUndefined: Self = StObject.set(x, "highlightEnd", js.undefined)
    
    @scala.inline
    def setHighlightStart(value: Double): Self = StObject.set(x, "highlightStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStartUndefined: Self = StObject.set(x, "highlightStart", js.undefined)
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Plain): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
