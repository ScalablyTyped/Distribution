package typings.recompose

import typings.react.reactMod.ValidationMap
import typings.recompose.recomposeMod.InferableComponentEnhancer
import typings.recompose.recomposeMod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
@JSImport("recompose/withContext", JSImport.Namespace)
@js.native
object withContextMod extends js.Object {
  def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
}

