package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import typings.shakacodeRecompose.mod.mapper
import typings.shakacodeRecompose.mod.reducer
import typings.shakacodeRecompose.mod.reducerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#withreducer
object withReducerMod {
  
  @JSImport("@shakacode/recompose/withReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stateName.asInstanceOf[js.Any], dispatchName.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter]]
  inline def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stateName.asInstanceOf[js.Any], dispatchName.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter]]
}
