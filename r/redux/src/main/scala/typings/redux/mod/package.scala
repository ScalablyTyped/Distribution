package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionCreator[A] = js.Function1[/* repeated */ js.Any, A]
  
  type ActionCreatorsMapObject[A] = org.scalablytyped.runtime.StringDictionary[typings.redux.mod.ActionCreator[A]]
  
  type ActionFromReducer[R] = js.Any
  
  type ActionFromReducersMapObject[M] = typings.redux.mod.ActionFromReducer[typings.redux.mod.ReducerFromReducersMapObject[M]]
  
  type CombinedState[S] = typings.redux.anon.CombinedState with S
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.DeepPartial<T[K]> * / object : T[K]}
    */ typings.redux.reduxStrings.DeepPartial with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Dispatch[A /* <: typings.redux.mod.Action[_] */] = js.Function1[/* action */ A, A]
  
  /* compose */
  type Func0[R] = js.Function0[R]
  
  type Func1[T1, R] = js.Function1[/* a1 */ T1, R]
  
  type Func2[T1, T2, R] = js.Function2[/* a1 */ T1, /* a2 */ T2, R]
  
  type Func3[T1, T2, T3, R] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* repeated */ js.Any, R]
  
  type Middleware[DispatchExt, S, D /* <: typings.redux.mod.Dispatch[typings.redux.mod.AnyAction] */] = js.Function1[
    /* api */ typings.redux.mod.MiddlewareAPI[D, S], 
    js.Function1[
      /* next */ typings.redux.mod.Dispatch[typings.redux.mod.AnyAction], 
      js.Function1[/* action */ js.Any, js.Any]
    ]
  ]
  
  type PreloadedState[S] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: S[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.PreloadedState<S[K]> * / object : S[K]}
    */ typings.redux.reduxStrings.PreloadedState with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Reducer[S, A /* <: typings.redux.mod.Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  
  type ReducerFromReducersMapObject[M] = js.Any
  
  type ReducersMapObject[S, A /* <: typings.redux.mod.Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: redux.redux.Reducer<S[K], A>}
    */ typings.redux.reduxStrings.ReducersMapObject with org.scalablytyped.runtime.TopLevel[S]
  
  type StateFromReducersMapObject[M] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof M ]: M[P] extends redux.redux.Reducer<infer S, any>? any : never}
    */ typings.redux.reduxStrings.StateFromReducersMapObject with org.scalablytyped.runtime.TopLevel[M]
  
  type StoreEnhancer[Ext, StateExt] = js.Function1[
    /* next */ typings.redux.mod.StoreEnhancerStoreCreator[js.Object, js.Object], 
    typings.redux.mod.StoreEnhancerStoreCreator[Ext, StateExt]
  ]
  
  type StoreEnhancerStoreCreator[Ext, StateExt] = js.Function2[
    /* reducer */ typings.redux.mod.Reducer[js.Any, typings.redux.mod.AnyAction], 
    /* preloadedState */ js.UndefOr[typings.redux.mod.PreloadedState[js.Any]], 
    (typings.redux.mod.Store[js.Any with StateExt, typings.redux.mod.AnyAction]) with Ext
  ]
  
  type Unsubscribe = js.Function0[scala.Unit]
}
