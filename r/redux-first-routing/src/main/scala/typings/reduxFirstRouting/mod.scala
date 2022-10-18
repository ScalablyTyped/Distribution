package typings.reduxFirstRouting

import typings.history.mod.Hash
import typings.history.mod.History
import typings.history.mod.Path
import typings.history.mod.Pathname
import typings.history.mod.Search
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashGO
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashGO_BACK
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashGO_FORWARD
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashLOCATION_CHANGE
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashPUSH
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashREPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-first-routing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-first-routing", "GO")
  @js.native
  val GO_ : ROUTERSlashGO = js.native
  
  @JSImport("redux-first-routing", "GO_BACK")
  @js.native
  val GO_BACK: ROUTERSlashGO_BACK = js.native
  
  @JSImport("redux-first-routing", "GO_FORWARD")
  @js.native
  val GO_FORWARD: ROUTERSlashGO_FORWARD = js.native
  
  @JSImport("redux-first-routing", "LOCATION_CHANGE")
  @js.native
  val LOCATION_CHANGE: ROUTERSlashLOCATION_CHANGE = js.native
  
  @JSImport("redux-first-routing", "PUSH")
  @js.native
  val PUSH_ : ROUTERSlashPUSH = js.native
  
  @JSImport("redux-first-routing", "REPLACE")
  @js.native
  val REPLACE_ : ROUTERSlashREPLACE = js.native
  
  inline def go[T /* <: Double */](index: T): goAction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(index.asInstanceOf[js.Any]).asInstanceOf[goAction[T]]
  
  inline def goBack(): goBackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[goBackAction]
  
  inline def goForward(): goForwardAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[goForwardAction]
  
  inline def locationChange[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](_underscore: typings.reduxFirstRouting.anon.Hash[P, S, H]): locationChangeAction[P, S, H] = ^.asInstanceOf[js.Dynamic].applyDynamic("locationChange")(_underscore.asInstanceOf[js.Any]).asInstanceOf[locationChangeAction[P, S, H]]
  
  inline def push[T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */](href: T): pushAction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any]).asInstanceOf[pushAction[T]]
  
  inline def replace[T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */](href: T): replaceAction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any]).asInstanceOf[replaceAction[T]]
  
  inline def routerMiddleware(history: History): Middleware[Any, State, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("routerMiddleware")(history.asInstanceOf[js.Any]).asInstanceOf[Middleware[Any, State, Dispatch[AnyAction]]]
  
  @JSImport("redux-first-routing", "routerReducer")
  @js.native
  val routerReducer: Reducer[State, AnyAction] = js.native
  
  inline def startListener(history: History, store: Store[Any, AnyAction]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startListener")(history.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait State extends StObject {
    
    var hash: Hash
    
    var pathname: Pathname
    
    var queries: Any
    
    var search: Search
  }
  object State {
    
    inline def apply(hash: Hash, pathname: Pathname, queries: Any, search: Search): State = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: Any): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait goAction[T /* <: Double */]
    extends StObject
       with Action[ROUTERSlashGO] {
    
    var payload: T
  }
  object goAction {
    
    inline def apply[T /* <: Double */](payload: T): goAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/GO")
      __obj.asInstanceOf[goAction[T]]
    }
    
    extension [Self <: goAction[?], T /* <: Double */](x: Self & goAction[T]) {
      
      inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type goBackAction = Action[ROUTERSlashGO_BACK]
  
  type goForwardAction = Action[ROUTERSlashGO_FORWARD]
  
  trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */]
    extends StObject
       with Action[ROUTERSlashLOCATION_CHANGE] {
    
    var payload: typings.reduxFirstRouting.anon.Pathname[P, S, H]
  }
  object locationChangeAction {
    
    inline def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: typings.reduxFirstRouting.anon.Pathname[P, S, H]): locationChangeAction[P, S, H] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/LOCATION_CHANGE")
      __obj.asInstanceOf[locationChangeAction[P, S, H]]
    }
    
    extension [Self <: locationChangeAction[?, ?, ?], P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](x: Self & (locationChangeAction[P, S, H])) {
      
      inline def setPayload(value: typings.reduxFirstRouting.anon.Pathname[P, S, H]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait pushAction[T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */]
    extends StObject
       with Action[ROUTERSlashPUSH] {
    
    var payload: T
  }
  object pushAction {
    
    inline def apply[T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */](payload: T): pushAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/PUSH")
      __obj.asInstanceOf[pushAction[T]]
    }
    
    extension [Self <: pushAction[?], T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */](x: Self & pushAction[T]) {
      
      inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait replaceAction[T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */]
    extends StObject
       with Action[ROUTERSlashREPLACE] {
    
    var payload: T
  }
  object replaceAction {
    
    inline def apply[T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */](payload: T): replaceAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/REPLACE")
      __obj.asInstanceOf[replaceAction[T]]
    }
    
    extension [Self <: replaceAction[?], T /* <: Path | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ Any) */](x: Self & replaceAction[T]) {
      
      inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
