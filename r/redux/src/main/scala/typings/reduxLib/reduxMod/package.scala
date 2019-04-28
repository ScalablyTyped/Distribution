package typings
package reduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxMod {
  type ActionCreator[A] = js.Function1[/* repeated */ js.Any, A]
  type ActionCreatorsMapObject[A] = org.scalablytyped.runtime.StringDictionary[ActionCreator[A]]
  type Dispatch[A /* <: Action[_] */] = js.Function1[/* action */ A, A]
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
