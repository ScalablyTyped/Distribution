package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reduxDevtoolsInstrument.mod.PerformAction[A]
  - typings.reduxDevtoolsInstrument.mod.ResetAction
  - typings.reduxDevtoolsInstrument.mod.RollbackAction
  - typings.reduxDevtoolsInstrument.mod.CommitAction
  - typings.reduxDevtoolsInstrument.mod.SweepAction
  - typings.reduxDevtoolsInstrument.mod.ToggleAction
  - typings.reduxDevtoolsInstrument.mod.SetActionsActiveAction
  - typings.reduxDevtoolsInstrument.mod.ReorderAction
  - typings.reduxDevtoolsInstrument.mod.JumpToStateAction
  - typings.reduxDevtoolsInstrument.mod.JumpToActionAction
  - typings.reduxDevtoolsInstrument.mod.ImportStateAction[S, A, MonitorState]
  - typings.reduxDevtoolsInstrument.mod.LockChangesAction
  - typings.reduxDevtoolsInstrument.mod.PauseRecordingAction
*/
trait LiftedAction[S, A /* <: Action[Any] */, MonitorState] extends StObject
object LiftedAction {
  
  inline def CommitAction(timestamp: Double): typings.reduxDevtoolsInstrument.mod.CommitAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("COMMIT")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.CommitAction]
  }
  
  inline def ImportStateAction[S, A /* <: Action[Any] */, MonitorState](nextLiftedState: (LiftedState[S, A, MonitorState]) | js.Array[A]): typings.reduxDevtoolsInstrument.mod.ImportStateAction[S, A, MonitorState] = {
    val __obj = js.Dynamic.literal(nextLiftedState = nextLiftedState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IMPORT_STATE")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.ImportStateAction[S, A, MonitorState]]
  }
  
  inline def JumpToActionAction(actionId: Double): typings.reduxDevtoolsInstrument.mod.JumpToActionAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JUMP_TO_ACTION")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.JumpToActionAction]
  }
  
  inline def JumpToStateAction(index: Double): typings.reduxDevtoolsInstrument.mod.JumpToStateAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JUMP_TO_STATE")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.JumpToStateAction]
  }
  
  inline def LockChangesAction(status: Boolean): typings.reduxDevtoolsInstrument.mod.LockChangesAction = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LOCK_CHANGES")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.LockChangesAction]
  }
  
  inline def PauseRecordingAction(status: Boolean): typings.reduxDevtoolsInstrument.mod.PauseRecordingAction = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PAUSE_RECORDING")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.PauseRecordingAction]
  }
  
  inline def PerformAction[A /* <: Action[Any] */](action: A, timestamp: Double): typings.reduxDevtoolsInstrument.mod.PerformAction[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PERFORM_ACTION")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.PerformAction[A]]
  }
  
  inline def ReorderAction(actionId: Double, beforeActionId: Double): typings.reduxDevtoolsInstrument.mod.ReorderAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], beforeActionId = beforeActionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REORDER_ACTION")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.ReorderAction]
  }
  
  inline def ResetAction(timestamp: Double): typings.reduxDevtoolsInstrument.mod.ResetAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.ResetAction]
  }
  
  inline def RollbackAction(timestamp: Double): typings.reduxDevtoolsInstrument.mod.RollbackAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ROLLBACK")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.RollbackAction]
  }
  
  inline def SetActionsActiveAction(active: Boolean, end: Double, start: Double): typings.reduxDevtoolsInstrument.mod.SetActionsActiveAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_ACTIONS_ACTIVE")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.SetActionsActiveAction]
  }
  
  inline def SweepAction(): typings.reduxDevtoolsInstrument.mod.SweepAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SWEEP")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.SweepAction]
  }
  
  inline def ToggleAction(id: Double): typings.reduxDevtoolsInstrument.mod.ToggleAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TOGGLE_ACTION")
    __obj.asInstanceOf[typings.reduxDevtoolsInstrument.mod.ToggleAction]
  }
}
