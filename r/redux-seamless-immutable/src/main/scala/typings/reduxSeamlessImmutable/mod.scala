package typings.reduxSeamlessImmutable

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.seamlessImmutable.mod.Immutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-seamless-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineReducers(reducers: SeamlessReducers): Reducer[Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[Any, AnyAction]]
  
  inline def routerReducer[T /* <: Reducer[Any, AnyAction] */](state: T, action: Action[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("routerReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def stateTransformer[T](state: Immutable[T, js.Object]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("stateTransformer")(state.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type SeamlessReducers = StringDictionary[Reducer[Any, Any]]
}
