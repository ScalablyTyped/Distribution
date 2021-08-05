package typings.reactInstantsearchDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hit[T] extends StObject {
    
    var hit: typings.reactInstantsearchCore.mod.Hit[T]
  }
  object Hit {
    
    inline def apply[T](hit: typings.reactInstantsearchCore.mod.Hit[T]): Hit[T] = {
      val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hit[T]]
    }
    
    extension [Self <: Hit[?], T](x: Self & Hit[T]) {
      
      inline def setHit(value: typings.reactInstantsearchCore.mod.Hit[T]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-core.react-instantsearch-core.InstantSearchProps> */
  trait ReadonlyInstantSearchProp extends StObject {
    
    val createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    val indexName: String
    
    val onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    val onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    val refresh: js.UndefOr[Boolean] = js.undefined
    
    val resultsState: js.UndefOr[js.Any] = js.undefined
    
    val searchClient: js.Any
    
    val searchState: js.UndefOr[js.Any] = js.undefined
    
    val stalledSearchDelay: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyInstantSearchProp {
    
    inline def apply(indexName: String, searchClient: js.Any): ReadonlyInstantSearchProp = {
      val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyInstantSearchProp]
    }
    
    extension [Self <: ReadonlyInstantSearchProp](x: Self) {
      
      inline def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
      
      inline def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
      
      inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
      
      inline def setOnSearchParameters(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onSearchParameters", js.Any.fromFunction1(value))
      
      inline def setOnSearchParametersUndefined: Self = StObject.set(x, "onSearchParameters", js.undefined)
      
      inline def setOnSearchStateChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onSearchStateChange", js.Any.fromFunction1(value))
      
      inline def setOnSearchStateChangeUndefined: Self = StObject.set(x, "onSearchStateChange", js.undefined)
      
      inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setResultsState(value: js.Any): Self = StObject.set(x, "resultsState", value.asInstanceOf[js.Any])
      
      inline def setResultsStateUndefined: Self = StObject.set(x, "resultsState", js.undefined)
      
      inline def setSearchClient(value: js.Any): Self = StObject.set(x, "searchClient", value.asInstanceOf[js.Any])
      
      inline def setSearchState(value: js.Any): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
      
      inline def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
      
      inline def setStalledSearchDelay(value: Double): Self = StObject.set(x, "stalledSearchDelay", value.asInstanceOf[js.Any])
      
      inline def setStalledSearchDelayUndefined: Self = StObject.set(x, "stalledSearchDelay", js.undefined)
    }
  }
  
  trait Translations extends StObject {
    
    var translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.undefined
  }
  object Translations {
    
    inline def apply(): Translations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translations]
    }
    
    extension [Self <: Translations](x: Self) {
      
      inline def setTranslations(value: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
