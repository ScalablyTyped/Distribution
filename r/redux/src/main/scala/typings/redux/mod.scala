package typings.redux

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.redux.anon.DispatchExt
import typings.redux.anon.`0`
import typings.redux.anon.`1`
import typings.redux.anon.`2`
import typings.redux.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware(): StoreEnhancer[js.Object, js.Object] = js.native
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware[Ext1, S](middleware1: Middleware[Ext1, S, _]): StoreEnhancer[typings.redux.anon.Dispatch[Ext1], js.Object] = js.native
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware[Ext, S](middlewares: (Middleware[_, S, _])*): StoreEnhancer[DispatchExt[Ext], js.Object] = js.native
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware[Ext1, Ext2, S](middleware1: Middleware[Ext1, S, _], middleware2: Middleware[Ext2, S, _]): StoreEnhancer[`0`[Ext1, Ext2], js.Object] = js.native
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware[Ext1, Ext2, Ext3, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _]
  ): StoreEnhancer[`1`[Ext1, Ext2, Ext3], js.Object] = js.native
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware[Ext1, Ext2, Ext3, Ext4, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _]
  ): StoreEnhancer[`2`[Ext1, Ext2, Ext3, Ext4], js.Object] = js.native
  @JSImport("redux", "applyMiddleware")
  @js.native
  def applyMiddleware[Ext1, Ext2, Ext3, Ext4, Ext5, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _],
    middleware5: Middleware[Ext5, S, _]
  ): StoreEnhancer[`3`[Ext1, Ext2, Ext3, Ext4, Ext5], js.Object] = js.native
  
  @JSImport("redux", "bindActionCreators")
  @js.native
  def bindActionCreators[A, M /* <: ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: Dispatch[AnyAction]): M = js.native
  @JSImport("redux", "bindActionCreators")
  @js.native
  def bindActionCreators_AC_ActionCreatorA_C[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = js.native
  @JSImport("redux", "bindActionCreators")
  @js.native
  def bindActionCreators_A_ActionCreatorWildcardB_ActionCreatorWildcard_B[A /* <: ActionCreator[_] */, B /* <: ActionCreator[_] */](actionCreator: A, dispatch: Dispatch[AnyAction]): B = js.native
  @JSImport("redux", "bindActionCreators")
  @js.native
  def bindActionCreators_M_ActionCreatorsMapObjectWildcardN_ActionCreatorsMapObjectWildcard_N[M /* <: ActionCreatorsMapObject[_] */, N /* <: ActionCreatorsMapObject[_] */](actionCreators: M, dispatch: Dispatch[AnyAction]): N = js.native
  
  @JSImport("redux", "combineReducers")
  @js.native
  def combineReducers[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  @JSImport("redux", "combineReducers")
  @js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
  @JSImport("redux", "combineReducers")
  @js.native
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[CombinedState[S], A] = js.native
  
  @JSImport("redux", "compose")
  @js.native
  def compose(): js.Function1[/* a */ js.Any, _] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[F /* <: js.Function */](f: F): F = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, R](f1: js.Function1[/* b */ A, R], f2: Func0[A]): Func0[R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func0[A]): Func0[R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: Func1[T1, A]): Func1[T1, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func0[A]
  ): Func0[R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func1[T1, A]): Func1[T1, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func1[T1, A]
  ): Func1[T1, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func2[T1, T2, A]
  ): Func2[T1, T2, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  @JSImport("redux", "compose")
  @js.native
  def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func3[T1, T2, T3, A]
  ): Func3[T1, T2, T3, R] = js.native
  
  @JSImport("redux", "createStore")
  @js.native
  val createStore: StoreCreator = js.native
  
  @js.native
  trait Action[T] extends StObject {
    
    var `type`: T = js.native
  }
  object Action {
    
    @scala.inline
    def apply[T](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[_], T] (val x: Self with Action[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionCreator[A] = js.Function1[/* repeated */ js.Any, A]
  
  type ActionCreatorsMapObject[A] = StringDictionary[ActionCreator[A]]
  
  type ActionFromReducer[R] = js.Any
  
  type ActionFromReducersMapObject[M] = ActionFromReducer[ReducerFromReducersMapObject[M]]
  
  @js.native
  trait AnyAction
    extends Action[js.Any]
       with // Allows any extra properties to be defined in an action.
  /* extraProps */ StringDictionary[js.Any]
  object AnyAction {
    
    @scala.inline
    def apply(`type`: js.Any): AnyAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyAction]
    }
  }
  
  type CombinedState[S] = typings.redux.anon.CombinedState with S
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.DeepPartial<T[K]> * / object : T[K]}
    */ typings.redux.reduxStrings.DeepPartial with TopLevel[js.Any]
  
  type Dispatch[A /* <: Action[_] */] = js.Function1[/* action */ A, A]
  
  /* compose */
  type Func0[R] = js.Function0[R]
  
  type Func1[T1, R] = js.Function1[/* a1 */ T1, R]
  
  type Func2[T1, T2, R] = js.Function2[/* a1 */ T1, /* a2 */ T2, R]
  
  type Func3[T1, T2, T3, R] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* repeated */ js.Any, R]
  
  type Middleware[DispatchExt, S, D /* <: Dispatch[AnyAction] */] = js.Function1[
    /* api */ MiddlewareAPI[D, S], 
    js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]]
  ]
  
  @js.native
  trait MiddlewareAPI[D /* <: Dispatch[AnyAction] */, S] extends StObject {
    
    var dispatch: D = js.native
    
    def getState(): S = js.native
  }
  object MiddlewareAPI {
    
    @scala.inline
    def apply[D /* <: Dispatch[AnyAction] */, S](dispatch: D, getState: () => S): MiddlewareAPI[D, S] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
      __obj.asInstanceOf[MiddlewareAPI[D, S]]
    }
    
    @scala.inline
    implicit class MiddlewareAPIMutableBuilder[Self <: MiddlewareAPI[_, _], D /* <: Dispatch[AnyAction] */, S] (val x: Self with (MiddlewareAPI[D, S])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: D): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    def apply(): Observable[T] = js.native
    
    /**
      * The minimal observable subscription method.
      * @param {Object} observer Any object that can be used as an observer.
      * The observer object should have a `next` method.
      * @returns {subscription} An object with an `unsubscribe` method that can
      * be used to unsubscribe the observable from the store, and prevent further
      * emission of values from the observable.
      */
    def subscribe(observer: Observer[T]): /* import warning: importer.ImportType#apply Failed type conversion: redux.anon.Unsubscribe[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any = js.native
  }
  
  @js.native
  trait Observer[T] extends StObject {
    
    var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[T](): Observer[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  type PreloadedState[S] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: S[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.PreloadedState<S[K]> * / object : S[K]}
    */ typings.redux.reduxStrings.PreloadedState with TopLevel[js.Any]
  
  type Reducer[S, A /* <: Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  
  type ReducerFromReducersMapObject[M] = js.Any
  
  type ReducersMapObject[S, A /* <: Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: redux.redux.Reducer<S[K], A>}
    */ typings.redux.reduxStrings.ReducersMapObject with TopLevel[S]
  
  type StateFromReducersMapObject[M] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof M ]: M[P] extends redux.redux.Reducer<infer S, any>? any : never}
    */ typings.redux.reduxStrings.StateFromReducersMapObject with TopLevel[M]
  
  @js.native
  trait Store[S, A /* <: Action[_] */] extends StObject {
    
    def apply(): Observable[S] = js.native
    
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
    def dispatch[T /* <: A */](action: T): T = js.native
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
    var dispatch_Original: Dispatch[A] = js.native
    
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
    def replaceReducer(nextReducer: Reducer[S, A]): /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any = js.native
    
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
  
  @js.native
  trait StoreCreator extends StObject {
    
    def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A]): (Store[S with StateExt, A]) with Ext = js.native
    def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], enhancer: StoreEnhancer[Ext, StateExt]): (Store[S with StateExt, A]) with Ext = js.native
    def apply[S, A /* <: Action[_] */, Ext, StateExt](
      reducer: Reducer[S, A],
      preloadedState: js.UndefOr[scala.Nothing],
      enhancer: StoreEnhancer[Ext, js.Object]
    ): (Store[S with StateExt, A]) with Ext = js.native
    def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S]): (Store[S with StateExt, A]) with Ext = js.native
    def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S], enhancer: StoreEnhancer[Ext, js.Object]): (Store[S with StateExt, A]) with Ext = js.native
  }
  
  type StoreEnhancer[Ext, StateExt] = js.Function1[
    /* next */ StoreEnhancerStoreCreator[js.Object, js.Object], 
    StoreEnhancerStoreCreator[Ext, StateExt]
  ]
  
  type StoreEnhancerStoreCreator[Ext, StateExt] = js.Function2[
    /* reducer */ Reducer[js.Any, AnyAction], 
    /* preloadedState */ js.UndefOr[PreloadedState[js.Any]], 
    (Store[js.Any with StateExt, AnyAction]) with Ext
  ]
  
  type Unsubscribe = js.Function0[Unit]
}
