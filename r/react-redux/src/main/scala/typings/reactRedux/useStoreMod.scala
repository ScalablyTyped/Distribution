package typings.reactRedux

import typings.react.mod.Context
import typings.reactRedux.contextMod.ReactReduxContextValue
import typings.redux.mod.Action
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStoreMod {
  
  @JSImport("react-redux/es/hooks/useStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStoreHook[S, A /* <: Action[Any] */](): js.Function0[Store[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHook")().asInstanceOf[js.Function0[Store[S, A]]]
  inline def createStoreHook[S, A /* <: Action[Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Store[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Store[S, A]]]
  
  inline def useStore[State, Action /* <: typings.redux.mod.Action[Any] */](): Store[State, Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[Store[State, Action]]
}
