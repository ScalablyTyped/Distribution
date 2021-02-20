package typings.reactInstantsearchDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hit[T] extends StObject {
    
    var hit: typings.reactInstantsearchCore.mod.Hit[T] = js.native
  }
  object Hit {
    
    @scala.inline
    def apply[T](hit: typings.reactInstantsearchCore.mod.Hit[T]): Hit[T] = {
      val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hit[T]]
    }
    
    @scala.inline
    implicit class HitMutableBuilder[Self <: Hit[_], T] (val x: Self with Hit[T]) extends AnyVal {
      
      @scala.inline
      def setHit(value: typings.reactInstantsearchCore.mod.Hit[T]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-core.react-instantsearch-core.InstantSearchProps> */
  @js.native
  trait ReadonlyInstantSearchProp extends StObject {
    
    val createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    val indexName: String = js.native
    
    val onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    val onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    val refresh: js.UndefOr[Boolean] = js.native
    
    val resultsState: js.UndefOr[js.Any] = js.native
    
    val searchClient: js.Any = js.native
    
    val searchState: js.UndefOr[js.Any] = js.native
    
    val stalledSearchDelay: js.UndefOr[Double] = js.native
  }
  object ReadonlyInstantSearchProp {
    
    @scala.inline
    def apply(indexName: String, searchClient: js.Any): ReadonlyInstantSearchProp = {
      val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyInstantSearchProp]
    }
    
    @scala.inline
    implicit class ReadonlyInstantSearchPropMutableBuilder[Self <: ReadonlyInstantSearchProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateURL(value: /* repeated */ js.Any => _): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSearchParameters(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onSearchParameters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchParametersUndefined: Self = StObject.set(x, "onSearchParameters", js.undefined)
      
      @scala.inline
      def setOnSearchStateChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onSearchStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchStateChangeUndefined: Self = StObject.set(x, "onSearchStateChange", js.undefined)
      
      @scala.inline
      def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      @scala.inline
      def setResultsState(value: js.Any): Self = StObject.set(x, "resultsState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsStateUndefined: Self = StObject.set(x, "resultsState", js.undefined)
      
      @scala.inline
      def setSearchClient(value: js.Any): Self = StObject.set(x, "searchClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchState(value: js.Any): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
      
      @scala.inline
      def setStalledSearchDelay(value: Double): Self = StObject.set(x, "stalledSearchDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStalledSearchDelayUndefined: Self = StObject.set(x, "stalledSearchDelay", js.undefined)
    }
  }
  
  @js.native
  trait Translations extends StObject {
    
    var translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.native
  }
  object Translations {
    
    @scala.inline
    def apply(): Translations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translations]
    }
    
    @scala.inline
    implicit class TranslationsMutableBuilder[Self <: Translations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslations(value: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
