package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import typings.redux.mod.PreloadedState
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import typings.reduxDevtoolsInstrument.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
inline def default[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](monitorReducer: Unit, options: Options[OptionsS, OptionsA, MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
inline def default[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](monitorReducer: Reducer[MonitorState, MonitorAction]): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(monitorReducer.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]
inline def default[OptionsS, OptionsA /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](
  monitorReducer: Reducer[MonitorState, MonitorAction],
  options: Options[OptionsS, OptionsA, MonitorState, MonitorAction]
): StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[InstrumentExt[Any, Any, MonitorState], js.Object]]

inline def liftAction[A /* <: Action[Any] */](action: A): typings.reduxDevtoolsInstrument.anon.Action[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any]).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: js.Function1[/* action */ A, js.UndefOr[String]]): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: js.Function1[/* action */ A, js.UndefOr[String]], traceLimit: Double): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](
  action: A,
  trace: js.Function1[/* action */ A, js.UndefOr[String]],
  traceLimit: Double,
  toExcludeFromTrace: js.Function
): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](
  action: A,
  trace: js.Function1[/* action */ A, js.UndefOr[String]],
  traceLimit: Unit,
  toExcludeFromTrace: js.Function
): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Boolean): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Double): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Double, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Boolean, traceLimit: Unit, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Double): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Double, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]
inline def liftAction[A /* <: Action[Any] */](action: A, trace: Unit, traceLimit: Unit, toExcludeFromTrace: js.Function): typings.reduxDevtoolsInstrument.anon.Action[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftAction")(action.asInstanceOf[js.Any], trace.asInstanceOf[js.Any], traceLimit.asInstanceOf[js.Any], toExcludeFromTrace.asInstanceOf[js.Any])).asInstanceOf[typings.reduxDevtoolsInstrument.anon.Action[A]]

inline def liftReducerWith[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](
  reducer: Reducer[S, A],
  initialCommittedState: Unit,
  monitorReducer: Reducer[MonitorState, MonitorAction],
  options: Options[S, A, MonitorState, MonitorAction]
): Reducer[LiftedState[S, A, MonitorState], LiftedAction[S, A, MonitorState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftReducerWith")(reducer.asInstanceOf[js.Any], initialCommittedState.asInstanceOf[js.Any], monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reducer[LiftedState[S, A, MonitorState], LiftedAction[S, A, MonitorState]]]
inline def liftReducerWith[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */](
  reducer: Reducer[S, A],
  initialCommittedState: PreloadedState[S],
  monitorReducer: Reducer[MonitorState, MonitorAction],
  options: Options[S, A, MonitorState, MonitorAction]
): Reducer[LiftedState[S, A, MonitorState], LiftedAction[S, A, MonitorState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftReducerWith")(reducer.asInstanceOf[js.Any], initialCommittedState.asInstanceOf[js.Any], monitorReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reducer[LiftedState[S, A, MonitorState], LiftedAction[S, A, MonitorState]]]

inline def unliftState[S, A /* <: Action[Any] */, MonitorState, NextStateExt](liftedState: (LiftedState[S, A, MonitorState]) & NextStateExt): S & NextStateExt = ^.asInstanceOf[js.Dynamic].applyDynamic("unliftState")(liftedState.asInstanceOf[js.Any]).asInstanceOf[S & NextStateExt]

inline def unliftStore[S, A /* <: Action[Any] */, MonitorState, MonitorAction /* <: Action[Any] */, NextExt, NextStateExt](
  liftedStore: (Store[(LiftedState[S, A, MonitorState]) & NextStateExt, LiftedAction[S, A, MonitorState]]) & NextExt,
  liftReducer: js.Function1[/* r */ Reducer[S, A], LiftedReducer[S, A, MonitorState]],
  options: Options[S, A, MonitorState, MonitorAction]
): (Store[S & NextStateExt, A]) & NextExt & (typings.reduxDevtoolsInstrument.anon.LiftedStore[S, A, MonitorState, NextStateExt]) = (^.asInstanceOf[js.Dynamic].applyDynamic("unliftStore")(liftedStore.asInstanceOf[js.Any], liftReducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Store[S & NextStateExt, A]) & NextExt & (typings.reduxDevtoolsInstrument.anon.LiftedStore[S, A, MonitorState, NextStateExt])]

type LiftedReducer[S, A /* <: Action[Any] */, MonitorState] = Reducer[LiftedState[S, A, MonitorState], LiftedAction[S, A, MonitorState]]

type LiftedStore[S, A /* <: Action[Any] */, MonitorState] = Store[LiftedState[S, A, MonitorState], LiftedAction[S, A, MonitorState]]
