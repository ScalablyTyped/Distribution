package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProps[T] extends StObject {
  
  var defaultSearch: js.UndefOr[String] = js.undefined
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /* custom search method, return true if matched and false if not */
  var onColumnMatch: js.UndefOr[js.Function1[/* searchProps */ Column[T], Boolean]] = js.undefined
  
  var onSearch: js.UndefOr[js.Function1[/* searchText */ String, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
}
object SearchProps {
  
  inline def apply[T](): SearchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProps[T]]
  }
  
  extension [Self <: SearchProps[?], T](x: Self & SearchProps[T]) {
    
    inline def setDefaultSearch(value: String): Self = StObject.set(x, "defaultSearch", value.asInstanceOf[js.Any])
    
    inline def setDefaultSearchUndefined: Self = StObject.set(x, "defaultSearch", js.undefined)
    
    inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnColumnMatch(value: /* searchProps */ Column[T] => Boolean): Self = StObject.set(x, "onColumnMatch", js.Any.fromFunction1(value))
    
    inline def setOnColumnMatchUndefined: Self = StObject.set(x, "onColumnMatch", js.undefined)
    
    inline def setOnSearch(value: /* searchText */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
    
    inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
