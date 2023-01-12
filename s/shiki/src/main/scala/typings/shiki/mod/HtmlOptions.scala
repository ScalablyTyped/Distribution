package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlOptions extends StObject {
  
  var lang: js.UndefOr[StringLiteralUnion[Lang, String]] = js.undefined
  
  var lineOptions: js.UndefOr[js.Array[LineOption]] = js.undefined
  
  var theme: js.UndefOr[StringLiteralUnion[Theme, String]] = js.undefined
}
object HtmlOptions {
  
  inline def apply(): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlOptions] (val x: Self) extends AnyVal {
    
    inline def setLang(value: StringLiteralUnion[Lang, String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLineOptions(value: js.Array[LineOption]): Self = StObject.set(x, "lineOptions", value.asInstanceOf[js.Any])
    
    inline def setLineOptionsUndefined: Self = StObject.set(x, "lineOptions", js.undefined)
    
    inline def setLineOptionsVarargs(value: LineOption*): Self = StObject.set(x, "lineOptions", js.Array(value*))
    
    inline def setTheme(value: StringLiteralUnion[Theme, String]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
