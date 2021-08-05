package typings.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.anon.PartialRequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin[T] extends StObject {
  
  var defaultOptions: js.UndefOr[PartialRequiredOptions] = js.undefined
  
  var languages: js.UndefOr[js.Array[SupportLanguage]] = js.undefined
  
  var options: js.UndefOr[SupportOptions] = js.undefined
  
  var parsers: js.UndefOr[StringDictionary[Parser[T]]] = js.undefined
  
  var printers: js.UndefOr[StringDictionary[Printer[T]]] = js.undefined
}
object Plugin {
  
  inline def apply[T](): Plugin[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin[T]]
  }
  
  extension [Self <: Plugin[?], T](x: Self & Plugin[T]) {
    
    inline def setDefaultOptions(value: PartialRequiredOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    inline def setLanguages(value: js.Array[SupportLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: SupportLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    inline def setOptions(value: SupportOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParsers(value: StringDictionary[Parser[T]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    
    inline def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
    
    inline def setPrinters(value: StringDictionary[Printer[T]]): Self = StObject.set(x, "printers", value.asInstanceOf[js.Any])
    
    inline def setPrintersUndefined: Self = StObject.set(x, "printers", js.undefined)
  }
}
