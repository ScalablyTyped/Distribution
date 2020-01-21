package typings.recompose.mod

import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "getContext")
@js.native
object getContext extends js.Object {
  def apply[TContext](contextTypes: ValidationMap[TContext]): InferableComponentEnhancer[TContext] = js.native
}

