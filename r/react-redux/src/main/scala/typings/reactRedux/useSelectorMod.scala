package typings.reactRedux

import typings.react.mod.Context
import typings.reactRedux.contextMod.ReactReduxContextValue
import typings.reactRedux.typesMod.EqualityFn
import typings.reactRedux.useSyncExternalStoreMod.uSESWS
import typings.redux.mod.AnyAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectorMod {
  
  @JSImport("react-redux/es/hooks/useSelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def initializeUseSelector(fn: uSESWS): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeUseSelector")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useSelector[TState, Selected](selector: js.Function1[/* state */ TState, Selected]): Selected = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Selected]
  inline def useSelector[TState, Selected](selector: js.Function1[/* state */ TState, Selected], equalityFn: EqualityFn[Selected]): Selected = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelector")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[Selected]
}
