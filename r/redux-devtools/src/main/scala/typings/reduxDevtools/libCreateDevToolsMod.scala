package typings.reduxDevtools

import typings.react.mod.ReactElement
import typings.redux.mod.Action
import typings.reduxDevtools.anon.Instantiable
import typings.reduxDevtoolsInstrument.mod.EnhancedStore
import typings.reduxDevtoolsInstrument.mod.LiftedState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateDevToolsMod {
  
  @JSImport("redux-devtools/lib/createDevTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */, MonitorProps /* <: LiftedState[S, A, MonitorState] */, MonitorState, MonitorAction /* <: Action[Any] */](children: Monitor[S, A, MonitorProps, MonitorState, MonitorAction]): Instantiable[S, A, MonitorState, MonitorAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any]).asInstanceOf[Instantiable[S, A, MonitorState, MonitorAction]]
  
  type Monitor[S, A /* <: Action[Any] */, MonitorProps /* <: LiftedState[S, A, MonitorState] */, MonitorState, MonitorAction /* <: Action[Any] */] = ReactElement
  
  trait Props[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */] extends StObject {
    
    var store: js.UndefOr[EnhancedStore[S, A, MonitorState]] = js.undefined
  }
  object Props {
    
    inline def apply[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](): Props[S, A, MonitorState, MonitorAction] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[S, A, MonitorState, MonitorAction]]
    }
    
    extension [Self <: Props[?, ?, ?, ?], S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](x: Self & (Props[S, A, MonitorState, MonitorAction])) {
      
      inline def setStore(value: EnhancedStore[S, A, MonitorState]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
