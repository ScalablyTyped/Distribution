package typings.reduxFirstRouting

import typings.history.mod.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hash[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends StObject {
    
    var hash: H = js.native
    
    var pathname: P = js.native
    
    var queries: js.Any = js.native
    
    var search: S = js.native
  }
  object Hash {
    
    @scala.inline
    def apply[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */](hash: H, pathname: P, queries: js.Any, search: S): Hash[P, S, H] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash[P, S, H]]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash[_, _, _], P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] (val x: Self with (Hash[P, S, H])) extends AnyVal {
      
      @scala.inline
      def setHash(value: H): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: P): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueries(value: js.Any): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: S): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pathname[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends StObject {
    
    var hash: H = js.native
    
    var pathname: P = js.native
    
    var search: S = js.native
  }
  object Pathname {
    
    @scala.inline
    def apply[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */](hash: H, pathname: P, search: S): Pathname[P, S, H] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pathname[P, S, H]]
    }
    
    @scala.inline
    implicit class PathnameMutableBuilder[Self <: Pathname[_, _, _], P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] (val x: Self with (Pathname[P, S, H])) extends AnyVal {
      
      @scala.inline
      def setHash(value: H): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: P): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: S): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
