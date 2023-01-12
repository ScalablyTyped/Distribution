package typings.redux

import org.scalablytyped.runtime.StringDictionary
import typings.redux.anon.DispatchExt
import typings.redux.anon.`0`
import typings.redux.anon.`1`
import typings.redux.anon.`2`
import typings.redux.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyMiddleware(): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")().asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def applyMiddleware[Ext1, S](middleware1: Middleware[Ext1, S, Any]): StoreEnhancer[typings.redux.anon.Dispatch[Ext1], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(middleware1.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[typings.redux.anon.Dispatch[Ext1], js.Object]]
  inline def applyMiddleware[Ext, S](middlewares: (Middleware[Any, S, Any])*): StoreEnhancer[DispatchExt[Ext], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(middlewares.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StoreEnhancer[DispatchExt[Ext], js.Object]]
  inline def applyMiddleware[Ext1, Ext2, S](middleware1: Middleware[Ext1, S, Any], middleware2: Middleware[Ext2, S, Any]): StoreEnhancer[`0`[Ext1, Ext2], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[`0`[Ext1, Ext2], js.Object]]
  inline def applyMiddleware[Ext1, Ext2, Ext3, S](
    middleware1: Middleware[Ext1, S, Any],
    middleware2: Middleware[Ext2, S, Any],
    middleware3: Middleware[Ext3, S, Any]
  ): StoreEnhancer[`1`[Ext1, Ext2, Ext3], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[`1`[Ext1, Ext2, Ext3], js.Object]]
  inline def applyMiddleware[Ext1, Ext2, Ext3, Ext4, S](
    middleware1: Middleware[Ext1, S, Any],
    middleware2: Middleware[Ext2, S, Any],
    middleware3: Middleware[Ext3, S, Any],
    middleware4: Middleware[Ext4, S, Any]
  ): StoreEnhancer[`2`[Ext1, Ext2, Ext3, Ext4], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[`2`[Ext1, Ext2, Ext3, Ext4], js.Object]]
  inline def applyMiddleware[Ext1, Ext2, Ext3, Ext4, Ext5, S](
    middleware1: Middleware[Ext1, S, Any],
    middleware2: Middleware[Ext2, S, Any],
    middleware3: Middleware[Ext3, S, Any],
    middleware4: Middleware[Ext4, S, Any],
    middleware5: Middleware[Ext5, S, Any]
  ): StoreEnhancer[`3`[Ext1, Ext2, Ext3, Ext4, Ext5], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMiddleware")(middleware1.asInstanceOf[js.Any], middleware2.asInstanceOf[js.Any], middleware3.asInstanceOf[js.Any], middleware4.asInstanceOf[js.Any], middleware5.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[`3`[Ext1, Ext2, Ext3, Ext4, Ext5], js.Object]]
  
  inline def bindActionCreators[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreators")(actionCreator.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def bindActionCreators_AB_B[A /* <: ActionCreator[Any] */, B /* <: ActionCreator[Any] */](actionCreator: A, dispatch: Dispatch[AnyAction]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreators")(actionCreator.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[B]
  
  inline def bindActionCreators_AM_M[A, M /* <: ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: Dispatch[AnyAction]): M = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreators")(actionCreators.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[M]
  
  inline def bindActionCreators_MN_N[M /* <: ActionCreatorsMapObject[Any] */, N /* <: ActionCreatorsMapObject[Any] */](actionCreators: M, dispatch: Dispatch[AnyAction]): N = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreators")(actionCreators.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[N]
  
  inline def combineReducers[M /* <: ReducersMapObject[Any, Any] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]]]
  inline def combineReducers[S](reducers: ReducersMapObject[S, Any]): Reducer[CombinedState[S], AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[S], AnyAction]]
  
  inline def combineReducers_SA[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A]): Reducer[CombinedState[S], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[CombinedState[S], A]]
  
  inline def compose(): js.Function1[/* a */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function1[/* a */ Any, Any]]
  inline def compose[R](f1: js.Function1[/* b */ Any, R], funcs: js.Function*): js.Function1[/* repeated */ Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(scala.List(f1.asInstanceOf[js.Any]).`++`(funcs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* repeated */ Any, R]]
  inline def compose[F /* <: js.Function */](f: F): F = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f.asInstanceOf[js.Any]).asInstanceOf[F]
  inline def compose[R](funcs: js.Function*): js.Function1[/* repeated */ Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, R]]
  inline def compose[A, R](f1: js.Function1[/* b */ A, R], f2: Func0[A]): Func0[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Func0[R]]
  inline def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func0[A]): Func0[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any])).asInstanceOf[Func0[R]]
  inline def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: Func1[T1, A]): Func1[T1, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Func1[T1, R]]
  inline def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func0[A]
  ): Func0[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any])).asInstanceOf[Func0[R]]
  inline def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func1[T1, A]): Func1[T1, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any])).asInstanceOf[Func1[T1, R]]
  inline def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: Func2[T1, T2, A]): Func2[T1, T2, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Func2[T1, T2, R]]
  inline def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func1[T1, A]
  ): Func1[T1, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any])).asInstanceOf[Func1[T1, R]]
  inline def compose[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func2[T1, T2, A]): Func2[T1, T2, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any])).asInstanceOf[Func2[T1, T2, R]]
  inline def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Func3[T1, T2, T3, R]]
  inline def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func2[T1, T2, A]
  ): Func2[T1, T2, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any])).asInstanceOf[Func2[T1, T2, R]]
  inline def compose[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any])).asInstanceOf[Func3[T1, T2, T3, R]]
  inline def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func3[T1, T2, T3, A]
  ): Func3[T1, T2, T3, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any])).asInstanceOf[Func3[T1, T2, T3, R]]
  
  inline def createStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A]): (Store[S & StateExt, A]) & Ext = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(reducer.asInstanceOf[js.Any]).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def createStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], enhancer: StoreEnhancer[Ext, StateExt]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(reducer.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def createStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: Unit, enhancer: StoreEnhancer[Ext, js.Object]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(reducer.asInstanceOf[js.Any], preloadedState.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def createStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(reducer.asInstanceOf[js.Any], preloadedState.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def createStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S], enhancer: StoreEnhancer[Ext, js.Object]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(reducer.asInstanceOf[js.Any], preloadedState.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  
  inline def legacyCreateStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A]): (Store[S & StateExt, A]) & Ext = ^.asInstanceOf[js.Dynamic].applyDynamic("legacy_createStore")(reducer.asInstanceOf[js.Any]).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def legacyCreateStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], enhancer: StoreEnhancer[Ext, StateExt]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy_createStore")(reducer.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def legacyCreateStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: Unit, enhancer: StoreEnhancer[Ext, js.Object]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy_createStore")(reducer.asInstanceOf[js.Any], preloadedState.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def legacyCreateStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy_createStore")(reducer.asInstanceOf[js.Any], preloadedState.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  inline def legacyCreateStore[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S], enhancer: StoreEnhancer[Ext, js.Object]): (Store[S & StateExt, A]) & Ext = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy_createStore")(reducer.asInstanceOf[js.Any], preloadedState.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[(Store[S & StateExt, A]) & Ext]
  
  trait Action[T] extends StObject {
    
    var `type`: T
  }
  object Action {
    
    inline def apply[T](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action[?], T] (val x: Self & Action[T]) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionCreator[A] = js.Function1[/* repeated */ Any, A]
  
  type ActionCreatorsMapObject[A] = StringDictionary[ActionCreator[A]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    R extends redux.redux.Reducer<any, infer A> ? A : never
    }}}
    */
  @js.native
  trait ActionFromReducer[R] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    M extends redux.redux.ReducersMapObject<any, any> ? redux.redux.ActionFromReducer<redux.redux.ReducerFromReducersMapObject<M>> : never
    }}}
    */
  @js.native
  trait ActionFromReducersMapObject[M] extends StObject
  
  trait AnyAction
    extends StObject
       with Action[Any]
       with // Allows any extra properties to be defined in an action.
  /* extraProps */ StringDictionary[Any]
  object AnyAction {
    
    inline def apply(`type`: Any): AnyAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyAction]
    }
  }
  
  type CombinedState[S] = EmptyObject & S
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? T[K] extends object? redux.redux.DeepPartial<T[K]> : T[K]}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  type Dispatch[A /* <: Action[Any] */] = js.Function1[/* action */ A, A]
  
  /**
    * State base type for reducers created with `combineReducers()`.
    *
    * This type allows the `createStore()` method to infer which levels of the
    * preloaded state can be partial.
    *
    * Because Typescript is really duck-typed, a type needs to have some
    * identifying property to differentiate it from other types with matching
    * prototypes for type checking purposes. That's why this type has the
    * `$CombinedState` symbol property. Without the property, this type would
    * match any object. The symbol doesn't really exist because it's an internal
    * (i.e. not exported), and internally we never check its value. Since it's a
    * symbol property, it's not expected to be unumerable, and the value is
    * typed as always undefined, so its never expected to have a meaningful
    * value anyway. It just makes this type distinquishable from plain `{}`.
    */
  @js.native
  trait EmptyObject extends StObject
  
  /* compose */
  type Func0[R] = js.Function0[R]
  
  type Func1[T1, R] = js.Function1[/* a1 */ T1, R]
  
  type Func2[T1, T2, R] = js.Function2[/* a1 */ T1, /* a2 */ T2, R]
  
  @js.native
  trait Func3[T1, T2, T3, R] extends StObject {
    
    def apply(a1: T1, a2: T2, a3: T3, args: Any*): R = js.native
  }
  
  type Middleware[DispatchExt, S, D /* <: Dispatch[AnyAction] */] = js.Function1[
    /* api */ MiddlewareAPI[D, S], 
    js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ Any, Any]]
  ]
  
  trait MiddlewareAPI[D /* <: Dispatch[AnyAction] */, S] extends StObject {
    
    var dispatch: D
    
    def getState(): S
  }
  object MiddlewareAPI {
    
    inline def apply[D /* <: Dispatch[AnyAction] */, S](dispatch: D, getState: () => S): MiddlewareAPI[D, S] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
      __obj.asInstanceOf[MiddlewareAPI[D, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiddlewareAPI[?, ?], D /* <: Dispatch[AnyAction] */, S] (val x: Self & (MiddlewareAPI[D, S])) extends AnyVal {
      
      inline def setDispatch(value: D): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    /**
      * The minimal observable subscription method.
      * @param {Object} observer Any object that can be used as an observer.
      * The observer object should have a `next` method.
      * @returns {subscription} An object with an `unsubscribe` method that can
      * be used to unsubscribe the observable from the store, and prevent further
      * emission of values from the observable.
      */
    def subscribe(observer: Observer[T]): typings.redux.anon.Unsubscribe = js.native
  }
  
  trait Observer[T] extends StObject {
    
    var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object Observer {
    
    inline def apply[T](): Observer[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      inline def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.Required<S> extends redux.redux.EmptyObject ? S extends redux.redux.CombinedState<infer S1> ? {[ K in keyof S1 ]:? S1[K] extends object? redux.redux.PreloadedState<S1[K]> : S1[K]} : S : {[ K in keyof S ]: S[K] extends string | number | boolean | symbol? S[K] : redux.redux.PreloadedState<S[K]>}
    }}}
    */
  type PreloadedState[S] = S
  
  type Reducer[S, A /* <: Action[Any] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    M extends {[ P in keyof M ]: infer R} ? R extends redux.redux.Reducer<any, any> ? R : never : never
    }}}
    */
  @js.native
  trait ReducerFromReducersMapObject[M] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof S ]: redux.redux.Reducer<S[K], A>}
    }}}
    */
  @js.native
  trait ReducersMapObject[S, A /* <: Action[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    M extends redux.redux.ReducersMapObject<any, any> ? {[ P in keyof M ]: M[P] extends redux.redux.Reducer<infer S, any>? S : never} : never
    }}}
    */
  @js.native
  trait StateFromReducersMapObject[M] extends StObject
  
  @js.native
  trait Store[S, A /* <: Action[Any] */] extends StObject {
    
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
    def replaceReducer(nextReducer: Reducer[S, A]): Unit = js.native
    
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
    
    def apply[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A]): (Store[S & StateExt, A]) & Ext = js.native
    def apply[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], enhancer: StoreEnhancer[Ext, StateExt]): (Store[S & StateExt, A]) & Ext = js.native
    def apply[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: Unit, enhancer: StoreEnhancer[Ext, js.Object]): (Store[S & StateExt, A]) & Ext = js.native
    def apply[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S]): (Store[S & StateExt, A]) & Ext = js.native
    def apply[S, A /* <: Action[Any] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: PreloadedState[S], enhancer: StoreEnhancer[Ext, js.Object]): (Store[S & StateExt, A]) & Ext = js.native
  }
  
  type StoreEnhancer[Ext, StateExt] = js.Function1[
    /* next */ StoreEnhancerStoreCreator[js.Object, js.Object], 
    StoreEnhancerStoreCreator[Ext, StateExt]
  ]
  
  type StoreEnhancerStoreCreator[Ext, StateExt] = js.Function2[
    /* reducer */ Reducer[Any, AnyAction], 
    /* preloadedState */ js.UndefOr[PreloadedState[Any]], 
    (Store[Any & StateExt, AnyAction]) & Ext
  ]
  
  type Unsubscribe = js.Function0[Unit]
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
