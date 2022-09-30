package typings.reduxImmutable

import typings.immutable.mod.Collection.Indexed
import typings.immutable.mod.Collection.Keyed
import typings.immutable.mod.Record.Factory
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineReducers[S](reducers: ReducersMapObject[S, Any]): Reducer[S, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, AnyAction]]
  inline def combineReducers[S](reducers: ReducersMapObject[S, Any], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, AnyAction]]
  inline def combineReducers[S, T /* <: js.Object */](reducers: ReducersMapObject[S, Any], getDefaultState: Factory[T]): Reducer[S, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, AnyAction]]
  
  inline def combineReducers_SA[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, A]]
  inline def combineReducers_SA[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, A]]
  
  inline def combineReducers_SAT[S, A /* <: Action[Any] */, T](reducers: ReducersMapObject[S, A]): Reducer[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, A]]
  inline def combineReducers_SAT[S, A /* <: Action[Any] */, T](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Keyed[T, S]]): Reducer[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, A]]
  
  inline def combineReducers_ST[S, T /* <: js.Object */](reducers: ReducersMapObject[S, Any]): Reducer[S, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, AnyAction]]
}
