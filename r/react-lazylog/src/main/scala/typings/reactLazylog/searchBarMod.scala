package typings.reactLazylog

import typings.react.mod.Component
import typings.reactLazylog.anon.PartialSearchBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarMod {
  
  @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
  @js.native
  class default ()
    extends Component[SearchBarProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/SearchBar", "default.defaultProps")
    @js.native
    def defaultProps: PartialSearchBarProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialSearchBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type SearchBar = Component[SearchBarProps, js.Object, js.Any]
  
  trait SearchBarProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var filterActive: js.UndefOr[Boolean] = js.undefined
    
    var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.undefined
    
    var resultsCount: js.UndefOr[Double] = js.undefined
  }
  object SearchBarProps {
    
    @scala.inline
    def apply(): SearchBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarProps]
    }
    
    @scala.inline
    implicit class SearchBarPropsMutableBuilder[Self <: SearchBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFilterActive(value: Boolean): Self = StObject.set(x, "filterActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterActiveUndefined: Self = StObject.set(x, "filterActive", js.undefined)
      
      @scala.inline
      def setOnClearSearch(value: () => Unit): Self = StObject.set(x, "onClearSearch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearSearchUndefined: Self = StObject.set(x, "onClearSearch", js.undefined)
      
      @scala.inline
      def setOnFilterLinesWithMatches(value: /* isFiltered */ Boolean => Unit): Self = StObject.set(x, "onFilterLinesWithMatches", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterLinesWithMatchesUndefined: Self = StObject.set(x, "onFilterLinesWithMatches", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* keyword */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setResultsCount(value: Double): Self = StObject.set(x, "resultsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsCountUndefined: Self = StObject.set(x, "resultsCount", js.undefined)
    }
  }
}
