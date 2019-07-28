package typings.recompose

import typings.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typings.recompose.recomposeMod.mapper
import typings.recompose.recomposeMod.reducer
import typings.recompose.recomposeMod.reducerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withreducer
@JSImport("recompose/withReducer", JSImport.Namespace)
@js.native
object withReducerMod extends js.Object {
  def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  def default[TOutter, TState, TAction, TStateName /* <: String */, TDispatchName /* <: String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
}

