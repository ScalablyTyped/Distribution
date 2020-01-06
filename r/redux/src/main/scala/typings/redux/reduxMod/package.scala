package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.redux.Anon_CombinedState

  type ActionCreator[A] = js.Function1[/* repeated */ js.Any, A]
  type ActionCreatorsMapObject[A] = StringDictionary[ActionCreator[A]]
  type ActionFromReducer[R] = js.Any
  type ActionFromReducersMapObject[M] = ActionFromReducer[ReducerFromReducersMapObject[M]]
  type CombinedState[S] = Anon_CombinedState with S
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.DeepPartial<T[K]> * / object : T[K]}
    */ typings.redux.reduxStrings.DeepPartial with js.Any
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
  type PreloadedState[S] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: S[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.PreloadedState<S[K]> * / object : S[K]}
    */ typings.redux.reduxStrings.PreloadedState with js.Any
  type Reducer[S, A /* <: Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  type ReducerFromReducersMapObject[M] = js.Any
  type ReducersMapObject[S, A /* <: Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: redux.redux.Reducer<S[K], A>}
    */ typings.redux.reduxStrings.ReducersMapObject with S
  type StateFromReducersMapObject[M] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof M ]: M[P] extends redux.redux.Reducer<infer S, any>? any : never}
    */ typings.redux.reduxStrings.StateFromReducersMapObject with M
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
