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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("redux-first-routing", "createBrowserHistory")
  @js.native
  def createBrowserHistory[S](): History[S] = js.native
  @JSImport("redux-first-routing", "createBrowserHistory")
  @js.native
  def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  
  @JSImport("redux-first-routing", "go")
  @js.native
  def go[T /* <: Double */](index: T): goAction[T] = js.native
  
  @JSImport("redux-first-routing", "goBack")
  @js.native
  def goBack(): goBackAction = js.native
  
  @JSImport("redux-first-routing", "goForward")
  @js.native
  def goForward(): goForwardAction = js.native
  
  @JSImport("redux-first-routing", "locationChange")
  @js.native
  def locationChange[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](_underscore: typings.reduxFirstRouting.anon.Pathname[P, S, H]): locationChangeAction[P, S, H] = js.native
  
  @JSImport("redux-first-routing", "push")
  @js.native
  def push(href: String): pushAction[String] = js.native
  @JSImport("redux-first-routing", "push")
  @js.native
  def push(href: LocationDescriptorObject[LocationState]): pushAction[LocationDescriptorObject[LocationState]] = js.native
  
  @JSImport("redux-first-routing", "replace")
  @js.native
  def replace(href: String): replaceAction[String] = js.native
  @JSImport("redux-first-routing", "replace")
  @js.native
  def replace(href: LocationDescriptorObject[LocationState]): replaceAction[LocationDescriptorObject[LocationState]] = js.native
  
  @JSImport("redux-first-routing", "routerMiddleware")
  @js.native
  def routerMiddleware(history: History[LocationState]): Middleware[_, State, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-first-routing", "routerReducer")
  @js.native
  val routerReducer: Reducer[State, AnyAction] = js.native
  
  @JSImport("redux-first-routing", "startListener")
  @js.native
  def startListener(history: History[LocationState], store: Store[_, AnyAction]): Unit = js.native
  
  @js.native
  trait State extends StObject {
    
    var hash: Hash = js.native
    
    var pathname: Pathname = js.native
    
    var queries: js.Any = js.native
    
    var search: Search = js.native
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
  
  @js.native
  trait goAction[T /* <: Double */] extends Action[ROUTERSlashGO] {
    
    var payload: T = js.native
  }
  object goAction {
    
    @scala.inline
    def apply[T /* <: Double */](payload: T, `type`: ROUTERSlashGO): goAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[goAction[T]]
    }
    
    @scala.inline
    implicit class goActionMutableBuilder[Self <: goAction[_], T /* <: Double */] (val x: Self with goAction[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type goBackAction = Action[ROUTERSlashGO_BACK]
  
  type goForwardAction = Action[ROUTERSlashGO_FORWARD]
  
  @js.native
  trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
    
    var payload: typings.reduxFirstRouting.anon.Hash[P, S, H] = js.native
  }
  object locationChangeAction {
    
    @scala.inline
    def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: typings.reduxFirstRouting.anon.Hash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[locationChangeAction[P, S, H]]
    }
    
    @scala.inline
    implicit class locationChangeActionMutableBuilder[Self <: locationChangeAction[_, _, _], P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] (val x: Self with (locationChangeAction[P, S, H])) extends AnyVal {
      
      @scala.inline
      def setPayload(value: typings.reduxFirstRouting.anon.Hash[P, S, H]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait pushAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashPUSH] {
    
    var payload: T = js.native
  }
  object pushAction {
    
    @scala.inline
    def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T, `type`: ROUTERSlashPUSH): pushAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[pushAction[T]]
    }
    
    @scala.inline
    implicit class pushActionMutableBuilder[Self <: pushAction[_], T /* <: Path | LocationDescriptorObject[LocationState] */] (val x: Self with pushAction[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait replaceAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashREPLACE] {
    
    var payload: T = js.native
  }
  object replaceAction {
    
    @scala.inline
    def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T, `type`: ROUTERSlashREPLACE): replaceAction[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[replaceAction[T]]
    }
    
    @scala.inline
    implicit class replaceActionMutableBuilder[Self <: replaceAction[_], T /* <: Path | LocationDescriptorObject[LocationState] */] (val x: Self with replaceAction[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
