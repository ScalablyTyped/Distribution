package typings.reactInstantsearchDom

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactInstantsearchDom.mod.RelevantSortComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ButtonTextComponent extends StObject {
    
    var buttonTextComponent: js.UndefOr[FunctionComponent[RelevantSortComponentProps]] = js.undefined
    
    var textComponent: js.UndefOr[FunctionComponent[RelevantSortComponentProps]] = js.undefined
  }
  object ButtonTextComponent {
    
    inline def apply(): ButtonTextComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonTextComponent]
    }
    
    extension [Self <: ButtonTextComponent](x: Self) {
      
      inline def setButtonTextComponent(value: FunctionComponent[RelevantSortComponentProps]): Self = StObject.set(x, "buttonTextComponent", value.asInstanceOf[js.Any])
      
      inline def setButtonTextComponentUndefined: Self = StObject.set(x, "buttonTextComponent", js.undefined)
      
      inline def setTextComponent(value: FunctionComponent[RelevantSortComponentProps]): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    }
  }
  
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
  
  /* Inlined std.Pick<react-instantsearch-core.react-instantsearch-core.InstantSearchProps, 'widgetsCollector' | 'searchClient' | 'indexName'> */
  trait PickInstantSearchPropswid extends StObject {
    
    var indexName: String
    
    var searchClient: Any
    
    var widgetsCollector: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object PickInstantSearchPropswid {
    
    inline def apply(indexName: String, searchClient: Any): PickInstantSearchPropswid = {
      val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickInstantSearchPropswid]
    }
    
    extension [Self <: PickInstantSearchPropswid](x: Self) {
      
      inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
      
      inline def setSearchClient(value: Any): Self = StObject.set(x, "searchClient", value.asInstanceOf[js.Any])
      
      inline def setWidgetsCollector(value: /* repeated */ Any => Any): Self = StObject.set(x, "widgetsCollector", js.Any.fromFunction1(value))
      
      inline def setWidgetsCollectorUndefined: Self = StObject.set(x, "widgetsCollector", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-core.react-instantsearch-core.IndexProps> */
  trait ReadonlyIndexProps extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val indexId: js.UndefOr[String] = js.undefined
    
    val indexName: String
  }
  object ReadonlyIndexProps {
    
    inline def apply(indexName: String): ReadonlyIndexProps = {
      val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyIndexProps]
    }
    
    extension [Self <: ReadonlyIndexProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
      
      inline def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
      
      inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-core.react-instantsearch-core.InstantSearchProps> */
  trait ReadonlyInstantSearchProp extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val createURL: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    val indexName: String
    
    val onSearchParameters: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    val onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    val refresh: js.UndefOr[Boolean] = js.undefined
    
    val resultsState: js.UndefOr[Any] = js.undefined
    
    val searchClient: Any
    
    val searchState: js.UndefOr[Any] = js.undefined
    
    val stalledSearchDelay: js.UndefOr[Double] = js.undefined
    
    val widgetsCollector: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object ReadonlyInstantSearchProp {
    
    inline def apply(indexName: String, searchClient: Any): ReadonlyInstantSearchProp = {
      val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyInstantSearchProp]
    }
    
    extension [Self <: ReadonlyInstantSearchProp](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
      
      inline def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
      
      inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
      
      inline def setOnSearchParameters(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSearchParameters", js.Any.fromFunction1(value))
      
      inline def setOnSearchParametersUndefined: Self = StObject.set(x, "onSearchParameters", js.undefined)
      
      inline def setOnSearchStateChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSearchStateChange", js.Any.fromFunction1(value))
      
      inline def setOnSearchStateChangeUndefined: Self = StObject.set(x, "onSearchStateChange", js.undefined)
      
      inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setResultsState(value: Any): Self = StObject.set(x, "resultsState", value.asInstanceOf[js.Any])
      
      inline def setResultsStateUndefined: Self = StObject.set(x, "resultsState", js.undefined)
      
      inline def setSearchClient(value: Any): Self = StObject.set(x, "searchClient", value.asInstanceOf[js.Any])
      
      inline def setSearchState(value: Any): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
      
      inline def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
      
      inline def setStalledSearchDelay(value: Double): Self = StObject.set(x, "stalledSearchDelay", value.asInstanceOf[js.Any])
      
      inline def setStalledSearchDelayUndefined: Self = StObject.set(x, "stalledSearchDelay", js.undefined)
      
      inline def setWidgetsCollector(value: /* repeated */ Any => Any): Self = StObject.set(x, "widgetsCollector", js.Any.fromFunction1(value))
      
      inline def setWidgetsCollectorUndefined: Self = StObject.set(x, "widgetsCollector", js.undefined)
    }
  }
  
  trait SeeAllOption extends StObject {
    
    var seeAllOption: js.UndefOr[String] = js.undefined
  }
  object SeeAllOption {
    
    inline def apply(): SeeAllOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeeAllOption]
    }
    
    extension [Self <: SeeAllOption](x: Self) {
      
      inline def setSeeAllOption(value: String): Self = StObject.set(x, "seeAllOption", value.asInstanceOf[js.Any])
      
      inline def setSeeAllOptionUndefined: Self = StObject.set(x, "seeAllOption", js.undefined)
    }
  }
  
  trait Translations extends StObject {
    
    var translations: js.UndefOr[
        StringDictionary[
          js.Function4[
            /* n */ Double, 
            /* ms */ Double, 
            /* nSortedHits */ Double, 
            /* areHitsSorted */ Boolean, 
            String
          ]
        ]
      ] = js.undefined
  }
  object Translations {
    
    inline def apply(): Translations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Translations]
    }
    
    extension [Self <: Translations](x: Self) {
      
      inline def setTranslations(
        value: StringDictionary[
              js.Function4[
                /* n */ Double, 
                /* ms */ Double, 
                /* nSortedHits */ Double, 
                /* areHitsSorted */ Boolean, 
                String
              ]
            ]
      ): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
