package typings.reduxDevtools

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.redux.mod.StoreEnhancer
import typings.reduxDevtools.anon.Instantiable
import typings.reduxDevtools.createDevToolsMod.Monitor
import typings.reduxDevtoolsInstrument.mod.CommitAction
import typings.reduxDevtoolsInstrument.mod.ImportStateAction
import typings.reduxDevtoolsInstrument.mod.InstrumentExt
import typings.reduxDevtoolsInstrument.mod.JumpToActionAction
import typings.reduxDevtoolsInstrument.mod.JumpToStateAction
import typings.reduxDevtoolsInstrument.mod.LiftedState
import typings.reduxDevtoolsInstrument.mod.LockChangesAction
import typings.reduxDevtoolsInstrument.mod.Options
import typings.reduxDevtoolsInstrument.mod.PauseRecordingAction
import typings.reduxDevtoolsInstrument.mod.ReorderAction
import typings.reduxDevtoolsInstrument.mod.ResetAction
import typings.reduxDevtoolsInstrument.mod.RollbackAction
import typings.reduxDevtoolsInstrument.mod.SetActionsActiveAction
import typings.reduxDevtoolsInstrument.mod.SweepAction
import typings.reduxDevtoolsInstrument.mod.ToggleAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ActionCreators {
    
    @JSImport("redux-devtools", "ActionCreators")
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
  
  object ActionTypes {
    
    @JSImport("redux-devtools", "ActionTypes.COMMIT")
    @js.native
    val COMMIT: typings.reduxDevtools.reduxDevtoolsStrings.COMMIT = js.native
    
    @JSImport("redux-devtools", "ActionTypes.IMPORT_STATE")
    @js.native
    val IMPORT_STATE: typings.reduxDevtools.reduxDevtoolsStrings.IMPORT_STATE = js.native
    
    @JSImport("redux-devtools", "ActionTypes.JUMP_TO_ACTION")
    @js.native
    val JUMP_TO_ACTION: typings.reduxDevtools.reduxDevtoolsStrings.JUMP_TO_ACTION = js.native
    
    @JSImport("redux-devtools", "ActionTypes.JUMP_TO_STATE")
    @js.native
    val JUMP_TO_STATE: typings.reduxDevtools.reduxDevtoolsStrings.JUMP_TO_STATE = js.native
    
    @JSImport("redux-devtools", "ActionTypes.LOCK_CHANGES")
    @js.native
    val LOCK_CHANGES: typings.reduxDevtools.reduxDevtoolsStrings.LOCK_CHANGES = js.native
    
    @JSImport("redux-devtools", "ActionTypes.PAUSE_RECORDING")
    @js.native
    val PAUSE_RECORDING: typings.reduxDevtools.reduxDevtoolsStrings.PAUSE_RECORDING = js.native
    
    @JSImport("redux-devtools", "ActionTypes.PERFORM_ACTION")
    @js.native
    val PERFORM_ACTION: typings.reduxDevtools.reduxDevtoolsStrings.PERFORM_ACTION = js.native
    
    @JSImport("redux-devtools", "ActionTypes.REORDER_ACTION")
    @js.native
    val REORDER_ACTION: typings.reduxDevtools.reduxDevtoolsStrings.REORDER_ACTION = js.native
    
    @JSImport("redux-devtools", "ActionTypes.RESET")
    @js.native
    val RESET: typings.reduxDevtools.reduxDevtoolsStrings.RESET = js.native
    
    @JSImport("redux-devtools", "ActionTypes.ROLLBACK")
    @js.native
    val ROLLBACK: typings.reduxDevtools.reduxDevtoolsStrings.ROLLBACK = js.native
    
    @JSImport("redux-devtools", "ActionTypes.SET_ACTIONS_ACTIVE")
    @js.native
    val SET_ACTIONS_ACTIVE: typings.reduxDevtools.reduxDevtoolsStrings.SET_ACTIONS_ACTIVE = js.native
    
    @JSImport("redux-devtools", "ActionTypes.SWEEP")
    @js.native
    val SWEEP: typings.reduxDevtools.reduxDevtoolsStrings.SWEEP = js.native
    
    @JSImport("redux-devtools", "ActionTypes.TOGGLE_ACTION")
    @js.native
    val TOGGLE_ACTION: typings.reduxDevtools.reduxDevtoolsStrings.TOGGLE_ACTION = js.native
  }
  
  inline def createDevTools[S, A /* <: Action[Any] */, MonitorProps /* <: LiftedState[S, A, MonitorState] */, MonitorState, MonitorAction /* <: Action[Any] */](children: Monitor[S, A, MonitorProps, MonitorState, MonitorAction]): Instantiable[S, A, MonitorState, MonitorAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDevTools")(children.asInstanceOf[js.Any]).asInstanceOf[Instantiable[S, A, MonitorState, MonitorAction]]
  
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("instrument")().asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](monitorReducer: Unit, options: Options[OptionsS, OptionsA, MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](monitorReducer: Reducer[MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(monitorReducer.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  inline def instrument[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](
    monitorReducer: Reducer[MonitorState, MonitorAction],
    options: Options[OptionsS, OptionsA, MonitorState, MonitorAction]
  ): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
  
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistState")().asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: String): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: String, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](
    sessionId: String,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: String, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Null, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](
    sessionId: Null,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Null, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Unit, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](
    sessionId: Unit,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def persistState[S, A /* <: Action[Any] */, MonitorState](sessionId: Unit, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistState")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
}
