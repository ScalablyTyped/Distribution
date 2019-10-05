package typings.recompose.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "lifecycle")
@js.native
object lifecycle extends js.Object {
  def apply[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance): InferableComponentEnhancer[js.Object] = js.native
}

