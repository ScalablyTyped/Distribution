package typings.reduxFirstRouting

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.mod.Hash
import typings.history.mod.History
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
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
  
  @scala.inline
  def createBrowserHistory[S](): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[History[S]]
  @scala.inline
  def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[History[S]]
  
  @scala.inline
  def go[T /* <: Double */](index: T): goAction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(index.asInstanceOf[js.Any]).asInstanceOf[goAction[T]]
  
  @scala.inline
  def goBack(): goBackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[goBackAction]
  
  @scala.inline
  def goForward(): goForwardAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[goForwardAction]
  
  @scala.inline
  def locationChange[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](_underscore: typings.reduxFirstRouting.anon.Pathname[P, S, H]): locationChangeAction[P, S, H] = ^.asInstanceOf[js.Dynamic].applyDynamic("locationChange")(_underscore.asInstanceOf[js.Any]).asInstanceOf[locationChangeAction[P, S, H]]
  
  @scala.inline
  def push(href: String): pushAction[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any]).asInstanceOf[pushAction[String]]
  @scala.inline
  def push(href: LocationDescriptorObject[LocationState]): pushAction[LocationDescriptorObject[LocationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any]).asInstanceOf[pushAction[LocationDescriptorObject[LocationState]]]
  
  @scala.inline
  def replace(href: String): replaceAction[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any]).asInstanceOf[replaceAction[String]]
  @scala.inline
  def replace(href: LocationDescriptorObject[LocationState]): replaceAction[LocationDescriptorObject[LocationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any]).asInstanceOf[replaceAction[LocationDescriptorObject[LocationState]]]
  
  @scala.inline
  def routerMiddleware(history: History[LocationState]): Middleware[js.Any, State, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("routerMiddleware")(history.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Any, State, Dispatch[AnyAction]]]
  
  @JSImport("redux-first-routing", "routerReducer")
  @js.native
  val routerReducer: Reducer[State, AnyAction] = js.native
  
  @scala.inline
  def startListener(history: History[LocationState], store: Store[js.Any, AnyAction]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startListener")(history.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait State extends StObject {
    
    var hash: Hash
    
    var pathname: Pathname
    
    var queries: js.Any
    
    var search: Search
  }
  object State {
    
    @scala.inline
    def apply(hash: Hash, pathname: Pathname, queries: js.Any, search: Search): State = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueries(value: js.Any): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait goAction[T /* <: Double */]
    extends StObject
       with Action[ROUTERSlashGO] {
    
    var payload: T
  }
  object goAction {
    
    @scala.inline
    def apply[T /* <: Double */](payload: T): goAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/GO")
      __obj.asInstanceOf[goAction[T]]
    }
    
    @scala.inline
    implicit class goActionMutableBuilder[Self <: goAction[?], T /* <: Double */] (val x: Self & goAction[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type goBackAction = Action[ROUTERSlashGO_BACK]
  
  type goForwardAction = Action[ROUTERSlashGO_FORWARD]
  
  trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */]
    extends StObject
       with Action[ROUTERSlashLOCATION_CHANGE] {
    
    var payload: typings.reduxFirstRouting.anon.Hash[P, S, H]
  }
  object locationChangeAction {
    
    @scala.inline
    def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: typings.reduxFirstRouting.anon.Hash[P, S, H]): locationChangeAction[P, S, H] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/LOCATION_CHANGE")
      __obj.asInstanceOf[locationChangeAction[P, S, H]]
    }
    
    @scala.inline
    implicit class locationChangeActionMutableBuilder[Self <: locationChangeAction[?, ?, ?], P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] (val x: Self & (locationChangeAction[P, S, H])) extends AnyVal {
      
      @scala.inline
      def setPayload(value: typings.reduxFirstRouting.anon.Hash[P, S, H]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait pushAction[T /* <: Path | LocationDescriptorObject[LocationState] */]
    extends StObject
       with Action[ROUTERSlashPUSH] {
    
    var payload: T
  }
  object pushAction {
    
    @scala.inline
    def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T): pushAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/PUSH")
      __obj.asInstanceOf[pushAction[T]]
    }
    
    @scala.inline
    implicit class pushActionMutableBuilder[Self <: pushAction[?], T /* <: Path | LocationDescriptorObject[LocationState] */] (val x: Self & pushAction[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait replaceAction[T /* <: Path | LocationDescriptorObject[LocationState] */]
    extends StObject
       with Action[ROUTERSlashREPLACE] {
    
    var payload: T
  }
  object replaceAction {
    
    @scala.inline
    def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T): replaceAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ROUTER/REPLACE")
      __obj.asInstanceOf[replaceAction[T]]
    }
    
    @scala.inline
    implicit class replaceActionMutableBuilder[Self <: replaceAction[?], T /* <: Path | LocationDescriptorObject[LocationState] */] (val x: Self & replaceAction[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
