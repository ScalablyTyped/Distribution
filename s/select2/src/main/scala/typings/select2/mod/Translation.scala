package typings.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Translation extends js.Object {
  
  var errorLoading: js.UndefOr[js.Function0[String]] = js.native
  
  var inputTooLong: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.native
  
  var inputTooShort: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.native
  
  var loadingMore: js.UndefOr[js.Function0[String]] = js.native
  
  var maximumSelected: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.native
  
  var noResults: js.UndefOr[js.Function0[String]] = js.native
  
  var searching: js.UndefOr[js.Function0[String]] = js.native
}
object Translation {
  
  @scala.inline
  def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorLoading(value: () => String): Self = this.set("errorLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteErrorLoading: Self = this.set("errorLoading", js.undefined)
    
    @scala.inline
    def setInputTooLong(value: /* arg */ TranslationArg => String): Self = this.set("inputTooLong", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputTooLong: Self = this.set("inputTooLong", js.undefined)
    
    @scala.inline
    def setInputTooShort(value: /* arg */ TranslationArg => String): Self = this.set("inputTooShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputTooShort: Self = this.set("inputTooShort", js.undefined)
    
    @scala.inline
    def setLoadingMore(value: () => String): Self = this.set("loadingMore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLoadingMore: Self = this.set("loadingMore", js.undefined)
    
    @scala.inline
    def setMaximumSelected(value: /* arg */ TranslationArg => String): Self = this.set("maximumSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMaximumSelected: Self = this.set("maximumSelected", js.undefined)
    
    @scala.inline
    def setNoResults(value: () => String): Self = this.set("noResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNoResults: Self = this.set("noResults", js.undefined)
    
    @scala.inline
    def setSearching(value: () => String): Self = this.set("searching", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSearching: Self = this.set("searching", js.undefined)
  }
}
