package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlRendererOptions extends StObject {
  
  var bg: js.UndefOr[String] = js.undefined
  
  var elements: js.UndefOr[ElementsOptions] = js.undefined
  
  var fg: js.UndefOr[String] = js.undefined
  
  var langId: js.UndefOr[String] = js.undefined
  
  var lineOptions: js.UndefOr[js.Array[LineOption]] = js.undefined
  
  var themeName: js.UndefOr[String] = js.undefined
}
object HtmlRendererOptions {
  
  inline def apply(): HtmlRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setElements(value: ElementsOptions): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    
    inline def setLangId(value: String): Self = StObject.set(x, "langId", value.asInstanceOf[js.Any])
    
    inline def setLangIdUndefined: Self = StObject.set(x, "langId", js.undefined)
    
    inline def setLineOptions(value: js.Array[LineOption]): Self = StObject.set(x, "lineOptions", value.asInstanceOf[js.Any])
    
    inline def setLineOptionsUndefined: Self = StObject.set(x, "lineOptions", js.undefined)
    
    inline def setLineOptionsVarargs(value: LineOption*): Self = StObject.set(x, "lineOptions", js.Array(value*))
    
    inline def setThemeName(value: String): Self = StObject.set(x, "themeName", value.asInstanceOf[js.Any])
    
    inline def setThemeNameUndefined: Self = StObject.set(x, "themeName", js.undefined)
  }
}
