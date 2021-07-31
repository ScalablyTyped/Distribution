package typings.storybookRouter

import typings.reachRouter.mod.History
import typings.reachRouter.mod.LocationContext
import typings.reachRouter.mod.LocationProviderRenderFn
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    @scala.inline
    def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@reach/router.@reach/router.LocationProviderProps> */
  trait ReadonlyLocationProviderP extends StObject {
    
    val children: js.UndefOr[ReactNode | LocationProviderRenderFn] = js.undefined
    
    val history: js.UndefOr[History] = js.undefined
  }
  object ReadonlyLocationProviderP {
    
    @scala.inline
    def apply(): ReadonlyLocationProviderP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyLocationProviderP]
    }
    
    @scala.inline
    implicit class ReadonlyLocationProviderPMutableBuilder[Self <: ReadonlyLocationProviderP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode | LocationProviderRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* context */ LocationContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    }
  }
  
  trait Search extends StObject {
    
    var search: String
  }
  object Search {
    
    @scala.inline
    def apply(search: String): Search = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Search]
    }
    
    @scala.inline
    implicit class SearchMutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
