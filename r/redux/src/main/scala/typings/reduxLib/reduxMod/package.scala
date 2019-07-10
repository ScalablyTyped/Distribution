package typings
package reduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  type ActionCreator[A] = js.Function1[/* repeated */ js.Any, A]
  type ActionCreatorsMapObject[A] = org.scalablytyped.runtime.StringDictionary[ActionCreator[A]]
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] extends object? object : T[K]}
    */ reduxLib.reduxLibStrings.DeepPartial with js.Any
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
  type Reducer[S, A /* <: Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  type ReducersMapObject[S, A /* <: Action[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof S ]: redux.redux.Reducer<S[K], A>}
    */ reduxLib.reduxLibStrings.ReducersMapObject with S
  type StoreEnhancer[Ext, StateExt] = js.Function1[
    /* next */ StoreEnhancerStoreCreator[js.Object, js.Object], 
    StoreEnhancerStoreCreator[Ext, StateExt]
  ]
  type StoreEnhancerStoreCreator[Ext, StateExt] = js.Function2[
    /* reducer */ Reducer[js.Any, Action[js.Any]], 
    /* preloadedState */ js.UndefOr[DeepPartial[js.Any]], 
    (Store[js.Any with StateExt, Action[_]]) with Ext
  ]
  type Unsubscribe = js.Function0[scala.Unit]
}
