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
  
  @scala.inline
  def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  
  @scala.inline
  implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorLoading(value: () => String): Self = StObject.set(x, "errorLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorLoadingUndefined: Self = StObject.set(x, "errorLoading", js.undefined)
    
    @scala.inline
    def setInputTooLong(value: /* arg */ TranslationArg => String): Self = StObject.set(x, "inputTooLong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputTooLongUndefined: Self = StObject.set(x, "inputTooLong", js.undefined)
    
    @scala.inline
    def setInputTooShort(value: /* arg */ TranslationArg => String): Self = StObject.set(x, "inputTooShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputTooShortUndefined: Self = StObject.set(x, "inputTooShort", js.undefined)
    
    @scala.inline
    def setLoadingMore(value: () => String): Self = StObject.set(x, "loadingMore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadingMoreUndefined: Self = StObject.set(x, "loadingMore", js.undefined)
    
    @scala.inline
    def setMaximumSelected(value: /* arg */ TranslationArg => String): Self = StObject.set(x, "maximumSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaximumSelectedUndefined: Self = StObject.set(x, "maximumSelected", js.undefined)
    
    @scala.inline
    def setNoResults(value: () => String): Self = StObject.set(x, "noResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
    
    @scala.inline
    def setSearching(value: () => String): Self = StObject.set(x, "searching", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearchingUndefined: Self = StObject.set(x, "searching", js.undefined)
  }
}
