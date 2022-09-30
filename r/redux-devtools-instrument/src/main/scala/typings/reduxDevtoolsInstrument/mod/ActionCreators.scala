package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionCreators {
  
  @JSImport("redux-devtools-instrument", "ActionCreators")
  @js.native
  val ^ : js.Any = js.native
  
  inline def commit(): CommitAction = ^.asInstanceOf[js.Dynamic].applyDynamic("commit")().asInstanceOf[CommitAction]
  
  inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: js.Array[A_1]): ImportStateAction[S, A_1, MonitorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any]).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
  inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: js.Array[A_1], noRecompute: Boolean): ImportStateAction[S, A_1, MonitorState] = (^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any], noRecompute.asInstanceOf[js.Any])).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
  inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: LiftedState[S, A_1, MonitorState]): ImportStateAction[S, A_1, MonitorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any]).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
  inline def importState[S, A_1 /* <: Action[Any] */, MonitorState](nextLiftedState: LiftedState[S, A_1, MonitorState], noRecompute: Boolean): ImportStateAction[S, A_1, MonitorState] = (^.asInstanceOf[js.Dynamic].applyDynamic("importState")(nextLiftedState.asInstanceOf[js.Any], noRecompute.asInstanceOf[js.Any])).asInstanceOf[ImportStateAction[S, A_1, MonitorState]]
  
  inline def jumpToAction(actionId: Double): JumpToActionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpToAction")(actionId.asInstanceOf[js.Any]).asInstanceOf[JumpToActionAction]
  
  inline def jumpToState(index: Double): JumpToStateAction = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpToState")(index.asInstanceOf[js.Any]).asInstanceOf[JumpToStateAction]
  
  inline def lockChanges(status: Boolean): LockChangesAction = ^.asInstanceOf[js.Dynamic].applyDynamic("lockChanges")(status.asInstanceOf[js.Any]).asInstanceOf[LockChangesAction]
  
  inline def pauseRecording(status: Boolean): PauseRecordingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseRecording")(status.asInstanceOf[js.Any]).asInstanceOf[PauseRecordingAction]
  
  inline def performAction[A /* <: Action[Any] */](action: A): typings.reduxDevtoolsInstrument.anon.Action[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any]).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: js.Function1[/* action */ A, js.UndefOr[String]]): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: js.Function1[/* action */ A, js.UndefOr[String]], traceLimit: Double): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](
    action: A,
    trace: js.Function1[/* action */ A, js.UndefOr[String]],
    traceLimit: Double,
    toExcludeFromTrace: js.Function
  ): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](
    action: A,
    trace: js.Function1[/* action */ A, js.UndefOr[String]],
    traceLimit: Unit,
    toExcludeFromTrace: js.Function
  ): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Double): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Double, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Unit, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Double): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Double, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  inline def performAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Unit, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("performAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
  
  inline def reorderAction(actionId: Double, beforeActionId: Double): ReorderAction = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderAction")(actionId.asInstanceOf[js.Any], beforeActionId.asInstanceOf[js.Any])).asInstanceOf[ReorderAction]
  
  inline def reset(): ResetAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[ResetAction]
  
  inline def rollback(): RollbackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("rollback")().asInstanceOf[RollbackAction]
  
  inline def setActionsActive(start: Double, end: Double): SetActionsActiveAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setActionsActive")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[SetActionsActiveAction]
  inline def setActionsActive(start: Double, end: Double, active: Boolean): SetActionsActiveAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setActionsActive")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[SetActionsActiveAction]
  
  inline def sweep(): SweepAction = ^.asInstanceOf[js.Dynamic].applyDynamic("sweep")().asInstanceOf[SweepAction]
  
  inline def toggleAction(id: Double): ToggleAction = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleAction")(id.asInstanceOf[js.Any]).asInstanceOf[ToggleAction]
}
