package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withreducer
@JSImport("recompose/withReducer", JSImport.Namespace)
@js.native
object withReducerMod extends js.Object {
  def default[TOutter, TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: recomposeLib.recomposeMod.reducer[TState, TAction],
    initialState: TState
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.reducerProps[TState, TAction, TStateName, TDispatchName], 
    TOutter
  ] = js.native
  def default[TOutter, TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: recomposeLib.recomposeMod.reducer[TState, TAction],
    initialState: recomposeLib.recomposeMod.mapper[TOutter, TState]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.reducerProps[TState, TAction, TStateName, TDispatchName], 
    TOutter
  ] = js.native
}

