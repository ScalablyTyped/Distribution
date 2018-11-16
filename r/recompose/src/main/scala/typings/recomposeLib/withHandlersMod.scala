package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
@JSImport("recompose/withHandlers", JSImport.Namespace)
@js.native
object withHandlersMod extends js.Object {
  def default[TOutter, THandlers](handlerCreators: recomposeLib.recomposeMod.HandleCreators[TOutter, THandlers]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def default[TOutter, THandlers](handlerCreators: recomposeLib.recomposeMod.HandleCreatorsFactory[TOutter, THandlers]): recomposeLib.recomposeMod.InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
}

