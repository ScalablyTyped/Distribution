package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */] extends StObject {
  
  var maxAge: js.UndefOr[
    Double | (js.Function2[
      /* currentLiftedAction */ LiftedAction[S, A, MonitorState], 
      /* previousLiftedState */ js.UndefOr[LiftedState[S, A, MonitorState]], 
      Double
    ])
  ] = js.undefined
  
  var pauseActionType: js.UndefOr[Any] = js.undefined
  
  var shouldCatchErrors: js.UndefOr[Boolean] = js.undefined
  
  var shouldHotReload: js.UndefOr[Boolean] = js.undefined
  
  var shouldIncludeCallstack: js.UndefOr[Boolean] = js.undefined
  
  var shouldRecordChanges: js.UndefOr[Boolean] = js.undefined
  
  var shouldStartLocked: js.UndefOr[Boolean] = js.undefined
  
  var trace: js.UndefOr[Boolean | (js.Function1[/* action */ A, js.UndefOr[String]])] = js.undefined
  
  var traceLimit: js.UndefOr[Double] = js.undefined
}
object Options {
  
  inline def apply[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](): Options[S, A, MonitorState, MonitorAction] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[S, A, MonitorState, MonitorAction]]
  }
  
  extension [Self <: Options[?, ?, ?, ?], S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](x: Self & (Options[S, A, MonitorState, MonitorAction])) {
    
    inline def setMaxAge(
      value: Double | (js.Function2[
          /* currentLiftedAction */ LiftedAction[S, A, MonitorState], 
          /* previousLiftedState */ js.UndefOr[LiftedState[S, A, MonitorState]], 
          Double
        ])
    ): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeFunction2(
      value: (/* currentLiftedAction */ LiftedAction[S, A, MonitorState], /* previousLiftedState */ js.UndefOr[LiftedState[S, A, MonitorState]]) => Double
    ): Self = StObject.set(x, "maxAge", js.Any.fromFunction2(value))
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setPauseActionType(value: Any): Self = StObject.set(x, "pauseActionType", value.asInstanceOf[js.Any])
    
    inline def setPauseActionTypeUndefined: Self = StObject.set(x, "pauseActionType", js.undefined)
    
    inline def setShouldCatchErrors(value: Boolean): Self = StObject.set(x, "shouldCatchErrors", value.asInstanceOf[js.Any])
    
    inline def setShouldCatchErrorsUndefined: Self = StObject.set(x, "shouldCatchErrors", js.undefined)
    
    inline def setShouldHotReload(value: Boolean): Self = StObject.set(x, "shouldHotReload", value.asInstanceOf[js.Any])
    
    inline def setShouldHotReloadUndefined: Self = StObject.set(x, "shouldHotReload", js.undefined)
    
    inline def setShouldIncludeCallstack(value: Boolean): Self = StObject.set(x, "shouldIncludeCallstack", value.asInstanceOf[js.Any])
    
    inline def setShouldIncludeCallstackUndefined: Self = StObject.set(x, "shouldIncludeCallstack", js.undefined)
    
    inline def setShouldRecordChanges(value: Boolean): Self = StObject.set(x, "shouldRecordChanges", value.asInstanceOf[js.Any])
    
    inline def setShouldRecordChangesUndefined: Self = StObject.set(x, "shouldRecordChanges", js.undefined)
    
    inline def setShouldStartLocked(value: Boolean): Self = StObject.set(x, "shouldStartLocked", value.asInstanceOf[js.Any])
    
    inline def setShouldStartLockedUndefined: Self = StObject.set(x, "shouldStartLocked", js.undefined)
    
    inline def setTrace(value: Boolean | (js.Function1[/* action */ A, js.UndefOr[String]])): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceFunction1(value: /* action */ A => js.UndefOr[String]): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setTraceLimit(value: Double): Self = StObject.set(x, "traceLimit", value.asInstanceOf[js.Any])
    
    inline def setTraceLimitUndefined: Self = StObject.set(x, "traceLimit", js.undefined)
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
