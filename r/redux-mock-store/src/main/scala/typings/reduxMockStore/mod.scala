package typings.reduxMockStore

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Observable
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create Mock Store returns a function that will create a mock store from a state
    * with the same set of set of middleware applied.
    *
    * @param middlewares The list of middleware to be applied.
    * @template S The type of state to be held by the store.
    * @template DispatchExts The additional Dispatch signatures for the middlewares applied.
    */
  @JSImport("redux-mock-store", JSImport.Default)
  @js.native
  def default[S, DispatchExts](): MockStoreCreator[S, DispatchExts] = js.native
  @JSImport("redux-mock-store", JSImport.Default)
  @js.native
  def default[S, DispatchExts](middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): MockStoreCreator[S, DispatchExts] = js.native
  
  type MockGetState[S] = js.Function1[/* actions */ js.Array[AnyAction], S]
  
  @js.native
  trait MockStore[S, A /* <: Action[_] */] extends Store[S, A] {
    
    def clearActions(): Unit = js.native
    
    def getActions(): js.Array[_] = js.native
  }
  
  type MockStoreCreator[S, DispatchExts] = js.Function1[/* state */ js.UndefOr[S | MockGetState[S]], MockStoreEnhanced[S, DispatchExts]]
  
  /* Inlined redux-mock-store.redux-mock-store.MockStore<S, redux.redux.AnyAction> & {  dispatch :DispatchExts} */
  @js.native
  trait MockStoreEnhanced[S, DispatchExts] extends StObject {
    
    def apply(): Observable[S] = js.native
    
    def clearActions(): Unit = js.native
    
    /**
      * Dispatches an action. It is the only way to trigger a state change.
      *
      * The `reducer` function, used to create the store, will be called with the
      * current state tree and the given `action`. Its return value will be
      * considered the **next** state of the tree, and the change listeners will
      * be notified.
      *
      * The base implementation only supports plain object actions. If you want
      * to dispatch a Promise, an Observable, a thunk, or something else, you
      * need to wrap your store creating function into the corresponding
      * middleware. For example, see the documentation for the `redux-thunk`
      * package. Even the middleware will eventually dispatch plain object
      * actions using this method.
      *
      * @param action A plain object representing “what changed”. It is a good
      *   idea to keep actions serializable so you can record and replay user
      *   sessions, or use the time travelling `redux-devtools`. An action must
      *   have a `type` property which may not be `undefined`. It is a good idea
      *   to use string constants for action types.
      *
      * @returns For convenience, the same action object you dispatched.
      *
      * Note that, if you use a custom middleware, it may wrap `dispatch()` to
      * return something else (for example, a Promise you can await).
      */
    def dispatch[T /* <: AnyAction */](action: T): T = js.native
    /**
      * Dispatches an action. It is the only way to trigger a state change.
      *
      * The `reducer` function, used to create the store, will be called with the
      * current state tree and the given `action`. Its return value will be
      * considered the **next** state of the tree, and the change listeners will
      * be notified.
      *
      * The base implementation only supports plain object actions. If you want
      * to dispatch a Promise, an Observable, a thunk, or something else, you
      * need to wrap your store creating function into the corresponding
      * middleware. For example, see the documentation for the `redux-thunk`
      * package. Even the middleware will eventually dispatch plain object
      * actions using this method.
      *
      * @param action A plain object representing “what changed”. It is a good
      *   idea to keep actions serializable so you can record and replay user
      *   sessions, or use the time travelling `redux-devtools`. An action must
      *   have a `type` property which may not be `undefined`. It is a good idea
      *   to use string constants for action types.
      *
      * @returns For convenience, the same action object you dispatched.
      *
      * Note that, if you use a custom middleware, it may wrap `dispatch()` to
      * return something else (for example, a Promise you can await).
      */
    @JSName("dispatch")
    var dispatch_Original: Dispatch[AnyAction] with DispatchExts = js.native
    
    def getActions(): js.Array[_] = js.native
    
    /**
      * Reads the state tree managed by the store.
      *
      * @returns The current state tree of your application.
      */
    def getState(): S = js.native
    
    /**
      * Replaces the reducer currently used by the store to calculate the state.
      *
      * You might need this if your app implements code splitting and you want to
      * load some of the reducers dynamically. You might also need this if you
      * implement a hot reloading mechanism for Redux.
      *
      * @param nextReducer The reducer for the store to use instead.
      */
    def replaceReducer(nextReducer: Reducer[S, AnyAction]): /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any = js.native
    
    /**
      * Adds a change listener. It will be called any time an action is
      * dispatched, and some part of the state tree may potentially have changed.
      * You may then call `getState()` to read the current state tree inside the
      * callback.
      *
      * You may call `dispatch()` from a change listener, with the following
      * caveats:
      *
      * 1. The subscriptions are snapshotted just before every `dispatch()` call.
      * If you subscribe or unsubscribe while the listeners are being invoked,
      * this will not have any effect on the `dispatch()` that is currently in
      * progress. However, the next `dispatch()` call, whether nested or not,
      * will use a more recent snapshot of the subscription list.
      *
      * 2. The listener should not expect to see all states changes, as the state
      * might have been updated multiple times during a nested `dispatch()` before
      * the listener is called. It is, however, guaranteed that all subscribers
      * registered before the `dispatch()` started will be called with the latest
      * state by the time it exits.
      *
      * @param listener A callback to be invoked on every dispatch.
      * @returns A function to remove this change listener.
      */
    def subscribe(listener: js.Function0[Unit]): Unsubscribe = js.native
  }
}
