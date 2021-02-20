package typings.reactRouterRedux

import typings.history.mod.Hash
import typings.history.mod.Location
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import typings.reactRouterRedux.mod.RouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait History extends StObject {
    
    var history: typings.history.mod.History[LocationState] = js.native
    
    var location: Location[LocationState] = js.native
    
    var `match`: IsExact = js.native
  }
  object History {
    
    @scala.inline
    def apply(
      history: typings.history.mod.History[LocationState],
      location: Location[LocationState],
      `match`: IsExact
    ): History = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    @scala.inline
    implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: typings.history.mod.History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: IsExact): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsExact extends StObject {
    
    var isExact: Boolean = js.native
    
    var params: js.Any = js.native
    
    var path: String = js.native
    
    var url: String = js.native
  }
  object IsExact {
    
    @scala.inline
    def apply(isExact: Boolean, params: js.Any, path: String, url: String): IsExact = {
      val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsExact]
    }
    
    @scala.inline
    implicit class IsExactMutableBuilder[Self <: IsExact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExact(value: Boolean): Self = StObject.set(x, "isExact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined history.history.Location<history.history.LocationState> & {  props :{  match :{  path :string,   url :string,   params :any,   isExact :boolean},   location :history.history.Location<history.history.LocationState>,   history :history.history.History<history.history.LocationState>} | undefined} */
  @js.native
  trait LocationLocationStateprop extends StObject {
    
    var hash: Hash = js.native
    
    var key: js.UndefOr[LocationKey] = js.native
    
    var pathname: Pathname = js.native
    
    var props: js.UndefOr[History] = js.native
    
    var search: Search = js.native
    
    var state: LocationState = js.native
  }
  object LocationLocationStateprop {
    
    @scala.inline
    def apply(hash: Hash, pathname: Pathname, search: Search, state: LocationState): LocationLocationStateprop = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationLocationStateprop]
    }
    
    @scala.inline
    implicit class LocationLocationStatepropMutableBuilder[Self <: LocationLocationStateprop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: LocationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: History): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: LocationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router extends StObject {
    
    var router: RouterState = js.native
  }
  object Router {
    
    @scala.inline
    def apply(router: RouterState): Router = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[Router]
    }
    
    @scala.inline
    implicit class RouterMutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouter(value: RouterState): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
