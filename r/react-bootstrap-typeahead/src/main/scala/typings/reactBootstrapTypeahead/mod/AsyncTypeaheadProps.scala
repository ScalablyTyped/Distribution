package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncTypeaheadProps[T /* <: TypeaheadModel */] extends TypeaheadProps[T] {
  
  /*     Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[Double] = js.native
  
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: Boolean = js.native
  
  /* Callback to perform when the search is executed. */
  def onSearch(query: String): Unit = js.native
  
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[ReactNode] = js.native
  
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[ReactNode] = js.native
  
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[Boolean] = js.native
}
object AsyncTypeaheadProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](isLoading: Boolean, onSearch: String => Unit, options: js.Array[T]): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], onSearch = js.Any.fromFunction1(onSearch), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
  
  @scala.inline
  implicit class AsyncTypeaheadPropsOps[Self <: AsyncTypeaheadProps[_], T /* <: TypeaheadModel */] (val x: Self with AsyncTypeaheadProps[T]) extends AnyVal {
    
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
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearch(value: String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setPromptText(value: ReactNode): Self = this.set("promptText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptText: Self = this.set("promptText", js.undefined)
    
    @scala.inline
    def setSearchText(value: ReactNode): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    
    @scala.inline
    def setUseCache(value: Boolean): Self = this.set("useCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCache: Self = this.set("useCache", js.undefined)
  }
}
