package typings.reduxFirstRouting

import typings.history.mod.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hash[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends StObject {
    
    var hash: H
    
    var pathname: P
    
    var queries: Any
    
    var search: S
  }
  object Hash {
    
    inline def apply[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */](hash: H, pathname: P, queries: Any, search: S): Hash[P, S, H] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash[P, S, H]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hash[?, ?, ?], P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] (val x: Self & (Hash[P, S, H])) extends AnyVal {
      
      inline def setHash(value: H): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: P): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: Any): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: S): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pathname[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends StObject {
    
    var hash: H
    
    var pathname: P
    
    var search: S
  }
  object Pathname {
    
    inline def apply[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */](hash: H, pathname: P, search: S): Pathname[P, S, H] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pathname[P, S, H]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pathname[?, ?, ?], P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] (val x: Self & (Pathname[P, S, H])) extends AnyVal {
      
      inline def setHash(value: H): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: P): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: S): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
