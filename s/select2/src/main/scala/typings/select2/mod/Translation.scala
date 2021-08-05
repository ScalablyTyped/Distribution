package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Translation extends StObject {
  
  var errorLoading: js.UndefOr[js.Function0[String]] = js.undefined
  
  var inputTooLong: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.undefined
  
  var inputTooShort: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.undefined
  
  var loadingMore: js.UndefOr[js.Function0[String]] = js.undefined
  
  var maximumSelected: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.undefined
  
  var noResults: js.UndefOr[js.Function0[String]] = js.undefined
  
  var searching: js.UndefOr[js.Function0[String]] = js.undefined
}
object Translation {
  
  inline def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  
  extension [Self <: Translation](x: Self) {
    
    inline def setErrorLoading(value: () => String): Self = StObject.set(x, "errorLoading", js.Any.fromFunction0(value))
    
    inline def setErrorLoadingUndefined: Self = StObject.set(x, "errorLoading", js.undefined)
    
    inline def setInputTooLong(value: /* arg */ TranslationArg => String): Self = StObject.set(x, "inputTooLong", js.Any.fromFunction1(value))
    
    inline def setInputTooLongUndefined: Self = StObject.set(x, "inputTooLong", js.undefined)
    
    inline def setInputTooShort(value: /* arg */ TranslationArg => String): Self = StObject.set(x, "inputTooShort", js.Any.fromFunction1(value))
    
    inline def setInputTooShortUndefined: Self = StObject.set(x, "inputTooShort", js.undefined)
    
    inline def setLoadingMore(value: () => String): Self = StObject.set(x, "loadingMore", js.Any.fromFunction0(value))
    
    inline def setLoadingMoreUndefined: Self = StObject.set(x, "loadingMore", js.undefined)
    
    inline def setMaximumSelected(value: /* arg */ TranslationArg => String): Self = StObject.set(x, "maximumSelected", js.Any.fromFunction1(value))
    
    inline def setMaximumSelectedUndefined: Self = StObject.set(x, "maximumSelected", js.undefined)
    
    inline def setNoResults(value: () => String): Self = StObject.set(x, "noResults", js.Any.fromFunction0(value))
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
    
    inline def setSearching(value: () => String): Self = StObject.set(x, "searching", js.Any.fromFunction0(value))
    
    inline def setSearchingUndefined: Self = StObject.set(x, "searching", js.undefined)
  }
}
