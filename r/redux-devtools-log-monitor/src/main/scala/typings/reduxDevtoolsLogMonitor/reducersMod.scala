package typings.reduxDevtoolsLogMonitor

import typings.redux.mod.Action
import typings.reduxDevtoolsLogMonitor.actionsMod.LogMonitorAction
import typings.reduxDevtoolsLogMonitor.anon.PartialLogMonitorState
import typings.reduxDevtoolsLogMonitor.logMonitorMod.LogMonitorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducersMod {
  
  @JSImport("redux-devtools-log-monitor/lib/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */](props: LogMonitorProps[S, A], state: Unit, action: LogMonitorAction): LogMonitorState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[LogMonitorState]
  inline def default[S, A /* <: Action[Any] */](props: LogMonitorProps[S, A], state: PartialLogMonitorState, action: LogMonitorAction): LogMonitorState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[LogMonitorState]
  
  trait LogMonitorState extends StObject {
    
    var consecutiveToggleStartId: js.UndefOr[Double | Null] = js.undefined
    
    var initialScrollTop: Double
  }
  object LogMonitorState {
    
    inline def apply(initialScrollTop: Double): LogMonitorState = {
      val __obj = js.Dynamic.literal(initialScrollTop = initialScrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMonitorState]
    }
    
    extension [Self <: LogMonitorState](x: Self) {
      
      inline def setConsecutiveToggleStartId(value: Double): Self = StObject.set(x, "consecutiveToggleStartId", value.asInstanceOf[js.Any])
      
      inline def setConsecutiveToggleStartIdNull: Self = StObject.set(x, "consecutiveToggleStartId", null)
      
      inline def setConsecutiveToggleStartIdUndefined: Self = StObject.set(x, "consecutiveToggleStartId", js.undefined)
      
      inline def setInitialScrollTop(value: Double): Self = StObject.set(x, "initialScrollTop", value.asInstanceOf[js.Any])
    }
  }
}
