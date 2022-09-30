package typings.reactRouterRedux

import typings.history.mod.Hash
import typings.history.mod.Key
import typings.history.mod.Location
import typings.history.mod.Pathname
import typings.history.mod.Search
import typings.reactRouterRedux.mod.RouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait History extends StObject {
    
    var history: typings.history.mod.History
    
    var location: Location
    
    var `match`: IsExact
  }
  object History {
    
    inline def apply(history: typings.history.mod.History, location: Location, `match`: IsExact): History = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    extension [Self <: History](x: Self) {
      
      inline def setHistory(value: typings.history.mod.History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: IsExact): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsExact extends StObject {
    
    var isExact: Boolean
    
    var params: Any
    
    var path: String
    
    var url: String
  }
  object IsExact {
    
    inline def apply(isExact: Boolean, params: Any, path: String, url: String): IsExact = {
      val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsExact]
    }
    
    extension [Self <: IsExact](x: Self) {
      
      inline def setIsExact(value: Boolean): Self = StObject.set(x, "isExact", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined history.history.Location & {  props :{  match :{  path :string,   url :string,   params :any,   isExact :boolean},   location :history.history.Location,   history :history.history.History} | undefined} */
  trait Locationpropsmatchpathstr extends StObject {
    
    /**
      * A URL fragment identifier, beginning with a #.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.hash
      */
    var hash: Hash
    
    /**
      * A unique string associated with this location. May be used to safely store
      * and retrieve data in some other storage API, like `localStorage`.
      *
      * Note: This value is always "default" on the initial location.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.key
      */
    var key: Key
    
    /**
      * A URL pathname, beginning with a /.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.pathname
      */
    var pathname: Pathname
    
    var props: js.UndefOr[History] = js.undefined
    
    /**
      * A URL search string, beginning with a ?.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.search
      */
    var search: Search
    
    /**
      * A value of arbitrary data associated with this location.
      *
      * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.state
      */
    var state: Any
  }
  object Locationpropsmatchpathstr {
    
    inline def apply(hash: Hash, key: Key, pathname: Pathname, search: Search, state: Any): Locationpropsmatchpathstr = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locationpropsmatchpathstr]
    }
    
    extension [Self <: Locationpropsmatchpathstr](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setProps(value: History): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Router extends StObject {
    
    var router: RouterState
  }
  object Router {
    
    inline def apply(router: RouterState): Router = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[Router]
    }
    
    extension [Self <: Router](x: Self) {
      
      inline def setRouter(value: RouterState): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
