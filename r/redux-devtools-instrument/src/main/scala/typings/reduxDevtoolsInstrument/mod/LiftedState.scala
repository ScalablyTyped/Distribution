package typings.reduxDevtoolsInstrument.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.redux.mod.Action
import typings.reduxDevtoolsInstrument.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiftedState[S, A /* <: Action[Any] */, MonitorState] extends StObject {
  
  var actionsById: NumberDictionary[PerformAction[A]]
  
  var committedState: S
  
  var computedStates: js.Array[Error[S]]
  
  var currentStateIndex: Double
  
  var isLocked: Boolean
  
  var isPaused: Boolean
  
  var monitorState: MonitorState
  
  var nextActionId: Double
  
  var skippedActionIds: js.Array[Double]
  
  var stagedActionIds: js.Array[Double]
}
object LiftedState {
  
  inline def apply[S, A /* <: Action[Any] */, MonitorState](
    actionsById: NumberDictionary[PerformAction[A]],
    committedState: S,
    computedStates: js.Array[Error[S]],
    currentStateIndex: Double,
    isLocked: Boolean,
    isPaused: Boolean,
    monitorState: MonitorState,
    nextActionId: Double,
    skippedActionIds: js.Array[Double],
    stagedActionIds: js.Array[Double]
  ): LiftedState[S, A, MonitorState] = {
    val __obj = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], committedState = committedState.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], monitorState = monitorState.asInstanceOf[js.Any], nextActionId = nextActionId.asInstanceOf[js.Any], skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftedState[S, A, MonitorState]]
  }
  
  extension [Self <: LiftedState[?, ?, ?], S, A /* <: Action[Any] */, MonitorState](x: Self & (LiftedState[S, A, MonitorState])) {
    
    inline def setActionsById(value: NumberDictionary[PerformAction[A]]): Self = StObject.set(x, "actionsById", value.asInstanceOf[js.Any])
    
    inline def setCommittedState(value: S): Self = StObject.set(x, "committedState", value.asInstanceOf[js.Any])
    
    inline def setComputedStates(value: js.Array[Error[S]]): Self = StObject.set(x, "computedStates", value.asInstanceOf[js.Any])
    
    inline def setComputedStatesVarargs(value: Error[S]*): Self = StObject.set(x, "computedStates", js.Array(value*))
    
    inline def setCurrentStateIndex(value: Double): Self = StObject.set(x, "currentStateIndex", value.asInstanceOf[js.Any])
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setMonitorState(value: MonitorState): Self = StObject.set(x, "monitorState", value.asInstanceOf[js.Any])
    
    inline def setNextActionId(value: Double): Self = StObject.set(x, "nextActionId", value.asInstanceOf[js.Any])
    
    inline def setSkippedActionIds(value: js.Array[Double]): Self = StObject.set(x, "skippedActionIds", value.asInstanceOf[js.Any])
    
    inline def setSkippedActionIdsVarargs(value: Double*): Self = StObject.set(x, "skippedActionIds", js.Array(value*))
    
    inline def setStagedActionIds(value: js.Array[Double]): Self = StObject.set(x, "stagedActionIds", value.asInstanceOf[js.Any])
    
    inline def setStagedActionIdsVarargs(value: Double*): Self = StObject.set(x, "stagedActionIds", js.Array(value*))
  }
}
