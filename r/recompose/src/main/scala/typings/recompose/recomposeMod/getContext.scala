package typings.recompose.recomposeMod

import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "getContext")
@js.native
object getContext extends js.Object {
  def apply[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = js.native
}

