package typings.reactRedux

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactRedux.esComponentsConnectMod.Connect
import typings.reactRedux.esComponentsContextMod.ReactReduxContextValue
import typings.reactRedux.esComponentsProviderMod.ProviderProps
import typings.reactRedux.esTypesMod.EqualityFn
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esExportsMod {
  
  @JSImport("react-redux/es/exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Provider[A /* <: Action[Any] */](param0: ProviderProps[A, Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-redux/es/exports", "ReactReduxContext")
  @js.native
  val ReactReduxContext: Context[ReactReduxContextValue[Any, AnyAction]] = js.native
  
  @JSImport("react-redux/es/exports", "connect")
  @js.native
  val connect: Connect[Any] = js.native
  
  inline def createDispatchHook[S, A /* <: Action[Any] */](): js.Function0[Dispatch[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatchHook")().asInstanceOf[js.Function0[Dispatch[A]]]
  inline def createDispatchHook[S, A /* <: Action[Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Dispatch[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatchHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Dispatch[A]]]
  
  inline def createSelectorHook(): js.Function2[
    /* selector */ js.Function1[/* state */ Any, Any], 
    /* equalityFn */ js.UndefOr[EqualityFn[Any]], 
    Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorHook")().asInstanceOf[js.Function2[
    /* selector */ js.Function1[/* state */ Any, Any], 
    /* equalityFn */ js.UndefOr[EqualityFn[Any]], 
    Any
  ]]
  inline def createSelectorHook(context: Context[ReactReduxContextValue[Any, AnyAction]]): js.Function2[
    /* selector */ js.Function1[/* state */ Any, Any], 
    /* equalityFn */ js.UndefOr[EqualityFn[Any]], 
    Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* selector */ js.Function1[/* state */ Any, Any], 
    /* equalityFn */ js.UndefOr[EqualityFn[Any]], 
    Any
  ]]
  
  inline def createStoreHook[S, A /* <: Action[Any] */](): js.Function0[Store[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHook")().asInstanceOf[js.Function0[Store[S, A]]]
  inline def createStoreHook[S, A /* <: Action[Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Store[S, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoreHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Store[S, A]]]
  
  inline def shallowEqual(objA: Any, objB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useDispatch[AppDispatch /* <: Dispatch[AnyAction] */](): AppDispatch = ^.asInstanceOf[js.Dynamic].applyDynamic("useDispatch")().asInstanceOf[AppDispatch]
  
  inline def useSelector[TState, Selected](selector: js.Function1[/* state */ TState, Selected]): Selected = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Selected]
  inline def useSelector[TState, Selected](selector: js.Function1[/* state */ TState, Selected], equalityFn: EqualityFn[Selected]): Selected = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelector")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[Selected]
  
  inline def useStore[State, Action /* <: typings.redux.mod.Action[Any] */](): Store[State, Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[Store[State, Action]]
}
