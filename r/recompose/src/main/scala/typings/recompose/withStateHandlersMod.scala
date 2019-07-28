package typings.recompose

import typings.recompose.recomposeMod.InferableComponentEnhancerWithProps
import typings.recompose.recomposeMod.StateHandlerMap
import typings.recompose.recomposeMod.StateUpdaters
import typings.recompose.recomposeMod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
@JSImport("recompose/withStateHandlers", JSImport.Namespace)
@js.native
object withStateHandlersMod extends js.Object {
  def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def default[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
}

