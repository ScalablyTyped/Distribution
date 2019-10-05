package typings.recompose.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "withState")
@js.native
object withState extends js.Object {
  def apply[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def apply[TOutter, TState, TStateName /* <: String */, TStateUpdaterName /* <: String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
}

