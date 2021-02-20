package typings.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.anon.PartialRequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin[T] extends StObject {
  
  var defaultOptions: js.UndefOr[PartialRequiredOptions] = js.native
  
  var languages: js.UndefOr[js.Array[SupportLanguage]] = js.native
  
  var options: js.UndefOr[SupportOptions] = js.native
  
  var parsers: js.UndefOr[StringDictionary[Parser[T]]] = js.native
  
  var printers: js.UndefOr[StringDictionary[Printer[T]]] = js.native
}
object Plugin {
  
  @scala.inline
  def apply[T](): Plugin[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin[T]]
  }
  
  @scala.inline
  implicit class PluginMutableBuilder[Self <: Plugin[_], T] (val x: Self with Plugin[T]) extends AnyVal {
    
    @scala.inline
    def setDefaultOptions(value: PartialRequiredOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    @scala.inline
    def setLanguages(value: js.Array[SupportLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: SupportLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: SupportOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParsers(value: StringDictionary[Parser[T]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
    
    @scala.inline
    def setPrinters(value: StringDictionary[Printer[T]]): Self = StObject.set(x, "printers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintersUndefined: Self = StObject.set(x, "printers", js.undefined)
  }
}
