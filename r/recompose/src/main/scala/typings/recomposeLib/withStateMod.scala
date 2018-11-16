package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstate
@JSImport("recompose/withState", JSImport.Namespace)
@js.native
object withStateMod extends js.Object {
  def default[TOutter, TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.stateProps[TState, TStateName, TStateUpdaterName], 
    TOutter
  ] = js.native
  def default[TOutter, TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */](
    stateName: TStateName,
    stateUpdaterName: TStateUpdaterName,
    initialState: recomposeLib.recomposeMod.mapper[TOutter, TState]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[
    recomposeLib.recomposeMod.stateProps[TState, TStateName, TStateUpdaterName], 
    TOutter
  ] = js.native
}

