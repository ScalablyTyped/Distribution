package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncTypeaheadProps[T /* <: TypeaheadModel */]
  extends StObject
     with TypeaheadProps[T] {
  
  /*     Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[Double] = js.undefined
  
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: Boolean
  
  /* Callback to perform when the search is executed. */
  def onSearch(query: String): Unit
  
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[ReactNode] = js.undefined
  
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[ReactNode] = js.undefined
  
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[Boolean] = js.undefined
}
object AsyncTypeaheadProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](isLoading: Boolean, onSearch: String => Unit, options: js.Array[T]): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], onSearch = js.Any.fromFunction1(onSearch), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
  
  @scala.inline
  implicit class AsyncTypeaheadPropsMutableBuilder[Self <: AsyncTypeaheadProps[?], T /* <: TypeaheadModel */] (val x: Self & AsyncTypeaheadProps[T]) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearch(value: String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPromptText(value: ReactNode): Self = StObject.set(x, "promptText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptTextUndefined: Self = StObject.set(x, "promptText", js.undefined)
    
    @scala.inline
    def setSearchText(value: ReactNode): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
  }
}
