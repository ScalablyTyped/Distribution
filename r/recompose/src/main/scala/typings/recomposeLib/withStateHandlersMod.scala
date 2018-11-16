package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
@JSImport("recompose/withStateHandlers", JSImport.Namespace)
@js.native
object withStateHandlersMod extends js.Object {
  def default[TState, TUpdaters /* <: recomposeLib.recomposeMod.StateHandlerMap[TState] */, TOutter](
    createProps: TState,
    stateUpdaters: recomposeLib.recomposeMod.StateUpdaters[TOutter, TState, TUpdaters]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def default[TState, TUpdaters /* <: recomposeLib.recomposeMod.StateHandlerMap[TState] */, TOutter](
    createProps: recomposeLib.recomposeMod.mapper[TOutter, TState],
    stateUpdaters: recomposeLib.recomposeMod.StateUpdaters[TOutter, TState, TUpdaters]
  ): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
}

