package typings.recompose

import typings.recompose.recomposeMod.HandleCreators
import typings.recompose.recomposeMod.HandleCreatorsFactory
import typings.recompose.recomposeMod.InferableComponentEnhancerWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
@JSImport("recompose/withHandlers", JSImport.Namespace)
@js.native
object withHandlersMod extends js.Object {
  def default[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def default[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
}

